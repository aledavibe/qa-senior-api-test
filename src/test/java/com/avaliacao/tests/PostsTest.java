package com.avaliacao.tests;

import com.avaliacao.base.BaseTest;
import com.avaliacao.model.Post;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

public class PostsTest extends BaseTest {

    @Test
    @DisplayName("Cenário 1: GET /posts - Validar estrutura e lista de 100 posts")
    public void validarListaDePosts() {
        List<Post> posts = given()
                .spec(requestSpec)
            .when()
                .get("/posts")
            .then()
                .statusCode(200)
                .extract()
                .body()
                .jsonPath().getList(".", Post.class);

        assertEquals(100, posts.size(), "A lista deve conter exatamente 100 posts");

        Post primeiroPost = posts.get(0);
        assertNotNull(primeiroPost.getId());
        assertNotNull(primeiroPost.getUserId());
        assertNotNull(primeiroPost.getTitle());
        assertNotNull(primeiroPost.getBody());
    }

    @Test
    @DisplayName("Cenário 2: GET /posts/{id} - Validar dados do post 1")
    public void validarPostEspecifico() {
        Post post = given()
                .spec(requestSpec)
                .pathParam("id", 1)
            .when()
                .get("/posts/{id}")
            .then()
                .statusCode(200)
                .extract()
                .as(Post.class);

        assertEquals(1, post.getId());
        assertNotNull(post.getUserId(), "UserId não deve ser nulo");
        assertNotNull(post.getTitle(), "Title não deve ser nulo");
    }

    @Test
    @DisplayName("Cenário 3: Validação de Contrato JSON")
    public void validarContratoJson() {
        given()
                .spec(requestSpec)
                .pathParam("id", 1)
            .when()
                .get("/posts/{id}")
            .then()
                .statusCode(200)
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/post-schema.json"));
    }
}
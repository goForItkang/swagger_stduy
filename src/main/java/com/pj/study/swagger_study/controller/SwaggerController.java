package com.pj.study.swagger_study.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Tag(name = "TestAPI",description = "테스트 controller")
public class SwaggerController {
    @GetMapping("/hello")
    @Operation(summary = "Hello api",description = "간단한 인사합니다")
    public HttpEntity<String> helloGet() {
        return new HttpEntity<>("hello");
    }
    @PostMapping("/hello")
    @Operation(summary = "Hello api",description = "이거는 post")
    public HttpEntity<String> helloPost() {
        return new HttpEntity<>("hello");
    }
    @PostMapping("/hello/{id}")
    @Operation(summary = "summary",description = "id넘겨줘")
    public HttpEntity<String> helloPostId(@PathVariable("id") Long id) {
        return new HttpEntity<>("id");
    }
    @DeleteMapping("/hello")
    @Operation(summary = "summaryDelete",description = "이거는 delete")
    public HttpEntity<String> deleteMapping(@RequestParam Long id) {
        return new HttpEntity<>("hello");
    }

}

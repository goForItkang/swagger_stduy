package com.pj.study.swagger_study.controller;

import com.pj.study.swagger_study.dto.UserDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Tag(name = "UserApi",description = "user controller")
public class UserController {
    @GetMapping("/user")
    @Operation(summary = "user",description = "userMapping")
    public ResponseEntity<String> userIndex(){
        return ResponseEntity.ok("Hello World");
    }
    @GetMapping("/user/{id}")
    @Operation(summary = "userId",description = "마이페이지")
    public ResponseEntity<UserDTO> userDto(@PathVariable Long id){
        UserDTO userDTO = new UserDTO();
        return ResponseEntity.ok(userDTO);
    }
}

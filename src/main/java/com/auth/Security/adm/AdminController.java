package com.auth.Security.adm;

import com.auth.Security.auth.AuthenticationService;
import com.auth.Security.auth.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
@RequiredArgsConstructor
public class AdminController {
    private final AuthenticationService authenticationService;
    @GetMapping("/users")
    public ResponseEntity<List<UserResponse>> getUsers(){
        return  ResponseEntity.ok(authenticationService.getUsers());
    }
    @PostMapping
    public String post() {
        return "POST:: admin controller";
    }
    @PutMapping
    public String put() {
        return "PUT:: admin controller";
    }
    @DeleteMapping
    public String delete() {
        return "DELETE:: admin controller";
    }
}

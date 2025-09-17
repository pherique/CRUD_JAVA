package crud_java_teste.agregadorDeInvestimentos.controller;

import crud_java_teste.agregadorDeInvestimentos.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import crud_java_teste.agregadorDeInvestimentos.entity.User;

import java.net.URI;


@RestController
@RequestMapping("/v1/users")
public class UserController {

    private UserService userService;
    private CreateUserDto createUserDto;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody CreateUserDto createUserDto){
       var userId = userService.createUser(createUserDto);
        return ResponseEntity.created(URI.create("/v1/users/" + userId.toString())).build();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserByID(@PathVariable("userId") String userId){
       var userIdResponse = userService.createUser(createUserDto);
        return ResponseEntity.created(URI.create("/v1/users/" + userIdResponse.toString())).build();
    }
}

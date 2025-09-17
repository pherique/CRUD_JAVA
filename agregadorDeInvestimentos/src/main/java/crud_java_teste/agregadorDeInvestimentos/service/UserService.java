package crud_java_teste.agregadorDeInvestimentos.service;

import crud_java_teste.agregadorDeInvestimentos.entity.User;
import crud_java_teste.agregadorDeInvestimentos.controller.CreateUserDto;
import crud_java_teste.agregadorDeInvestimentos.repository.USerRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
public class UserService {

    private USerRepository userRepository;

    public UserService(USerRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UUID createUser(CreateUserDto createUserDto) {

        //DTO -> Entity

        Object updateTimestamp = null;
        var entity = new User(
                UUID.randomUUID(),
                createUserDto.username(),
                createUserDto.email(),
                createUserDto.password(),
                Instant.now(),
                Instant.now()
                );


        var userSaved = userRepository.save(entity);

        return userSaved.getUserID();

    }



}

package com.app.onewebsocketapp.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    //Later I will implement the methods that occur to me, such as doing an update, a rename, etc.
    public void saveUser (User user){
        user.setStatus(Status.ONLINE);
        repository.save(user);
    }
    public void disconnectUser (User user){
        var storedUser = repository.findById(user.getNickName())
                .orElse(null);
        if (storedUser != null){
            storedUser.setStatus(Status.OFFLINE);
        }
    }
    public List<User> findConnectedUsers(){
        return repository.findAllByStatus(Status.ONLINE);
    }
}

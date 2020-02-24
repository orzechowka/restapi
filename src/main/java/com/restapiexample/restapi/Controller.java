package com.restapiexample.restapi;

import static com.restapiexample.restapi.UserHelper.getFakeUser;
import static com.restapiexample.restapi.UserHelper.getRealUser;
import static com.restapiexample.restapi.UserHelper.getUser;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    @GetMapping("/random")
    public String getAllUsers() {
        return RandomStringUtils.random(10, true, false);
    }


    @GetMapping("/realUser")
    public String realUser() {
        return getRealUser();
    }

    @GetMapping("/fakeUser")
    public String fakeUser() {
        return getFakeUser();
    }

    @GetMapping("/user")
    public String user() {
        return getUser();
    }
}

package com.restapiexample.restapi;

import static com.restapiexample.restapi.UserHelper.getFakeUser;
import static com.restapiexample.restapi.UserHelper.getRandomUser;
import static com.restapiexample.restapi.UserHelper.getRealUser;
import static com.restapiexample.restapi.UserHelper.getUser;
import static org.junit.Assert.*;

import org.junit.Test;

public class UserHelperTest {

    @Test
    public void getRealUserTest() {
        String realUser = getRealUser();
        assertEquals("Real user", realUser);
    }

    @Test
    public void getFakeUserTest() {
        String realUser = getFakeUser();
        assertEquals("Fake user", realUser);
    }

    @Test
    public void getUserTest() {
        String user = getUser();
        assertEquals("User", user);
    }

    @Test
    public void getRandomUserTest() {
        String user = getRandomUser();
        assertEquals("Random User", user);
    }
}

package com.emilie.thLibraryClient.Services;

import com.emilie.thLibraryClient.Entities.User;

public interface UserService {

    com.emilie.thLibraryClient.model.Entities.user.User getUserById(Long id);

    User getSignupForm();


}


package com.emilie.thLibraryClient.Services;

import com.emilie.thLibraryClient.Entities.User;
import com.emilie.thLibraryClient.Proxy.FeignProxy;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{


    private final FeignProxy feignProxy;

    public UserServiceImpl(FeignProxy feignProxy) {
        this.feignProxy=feignProxy;
    }

    @Override
    public com.emilie.thLibraryClient.model.Entities.user.User getUserById (Long id){
        return this.feignProxy.getUserById(id);
    }

    @Override
    public User getSignupForm() {
        return null;
    }


}


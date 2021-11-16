package user;

import facebook.FacebookUser;

import java.util.Date;

public class MyFacebookUser implements User{
    private FacebookUser facebookUser;

    public MyFacebookUser(FacebookUser facebookUser){
        this.facebookUser = facebookUser;
    }

    @Override
    public String getUserMail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getUserCountry();
    }

    @Override
    public Date getLastActiveTime() {
        return facebookUser.getUserActiveTime();
    }


}

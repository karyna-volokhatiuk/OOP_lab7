package user;

import twitter.TwitterUser;

import java.util.Date;

public class MyTwitterUser implements User{
    private TwitterUser twitterUser;

    public MyTwitterUser(TwitterUser twitterUser){
        this.twitterUser = twitterUser;
    }

    @Override
    public String getUserMail() {
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }

    @Override
    public Date getLastActiveTime() {
        return twitterUser.getLastActiveTime();
    }


}

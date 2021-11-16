package sender;

import user.User;


public class MessageSender {
    public void send(String text, User user, String country) {
        long currentTime = System.currentTimeMillis();
        long activeTimeMillis = user.getLastActiveTime().getTime();
        if (currentTime - activeTimeMillis < 3600000) {
            if (user.getCountry() == country) {
                System.out.println("Message for user: " + text);
            }
        }
    }
}

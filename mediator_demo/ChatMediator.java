package c_czynnosciowe.mediator_demo;

public interface ChatMediator {

    void addUser(User user);
    void sendMessage(String msg, User user);
}


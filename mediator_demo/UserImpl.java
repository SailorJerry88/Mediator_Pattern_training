package c_czynnosciowe.mediator_demo;

public class UserImpl extends User {

    public UserImpl(ChatMediator base, String name) {
        super(base, name);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println(this.name + " : SENDING MESSAGE= " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {

    }
}

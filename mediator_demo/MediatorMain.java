package c_czynnosciowe.mediator_demo;

public class MediatorMain {

    public static void main(String[] args) {

        ChatMediator baseControl = new ChatMediatorImpl();
        User user1 = new UserImpl(baseControl, "Pilot 1st");
        User user2 = new UserImpl(baseControl, "Pilot 2nd");
        User user3 = new UserImpl(baseControl, "Pilot 3th");
        User user4 = new UserImpl(baseControl, "Pilot 4th");
        baseControl.addUser(user1);
        baseControl.addUser(user2);
        baseControl.addUser(user3);
        baseControl.addUser(user4);

        user1.sendMessage("Landing, Over...");
        user2.sendMessage("Huston!!......................................... Never Mind");
        user3.sendMessage("I'm hungry");
        user4.sendMessage("Landing, Over");

        PlaneMediator fuelControl = new PlaneMediatorImpl();
        Plane plane1 = new PlaneImpl(fuelControl,"Plane 1st");




    }

}

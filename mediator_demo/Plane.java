package c_czynnosciowe.mediator_demo;

public abstract class Plane {
    ServiceMediator mediator1;
    String name1;

    public Plane(ServiceMediator mediator1,String name1){
        this.mediator1 = mediator1;
        this.name1 = name1;
    }

    public abstract void raportFuel(String rcf);
    public abstract void receiveFuel(String rcf);

}

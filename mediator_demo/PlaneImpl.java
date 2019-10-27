package c_czynnosciowe.mediator_demo;

public class PlaneImpl extends Plane {

    public PlaneImpl(ServiceMediator fuelCntr, String name1) {
        super(fuelCntr, name1);
    }

    @Override
    public void raportFuel(String fuel) {
        System.out.println(this.name1 + " : SENDING MESSAGE= " + rcf);
        mediator1.raportFuel(rcf, this);

    }

    @Override
    public void receiveFuel(String rcf) {

    }
}

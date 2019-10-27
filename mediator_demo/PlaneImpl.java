package c_czynnosciowe.mediator_demo;

public class PlaneImpl extends Plane {

    public PlaneImpl(ServiceMediator fuelRap, String name1) {super(fuelRap, name1);
    }
    @Override
    public void raportFuel(String rcf) {
        System.out.println(this.name1 + " : RAPORTING= " + rcf);
        mediator1.raportFuel(rcf, this);
    }

    @Override
    public void receiveFuel(String rcf) {

    }
}



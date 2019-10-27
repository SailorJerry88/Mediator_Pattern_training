package c_czynnosciowe.mediator_demo;

public class PlaneImpl extends Plane {

    public PlaneImpl(PlaneMediator medi, String name) {
        super(medi, name);
    }

    @Override
    public void raportFuel(String fuel) {
        System.out.println(this.name1 + " : SENDING MESSAGE= " + rcf);
        mediator1.sendMessage(rcf, this);

    }

    @Override
    public void receiveFuel(String msg) {

    }
}

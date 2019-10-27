package c_czynnosciowe.mediator_demo;

import java.util.ArrayList;
import java.util.List;

public class ServiceMediatorImpl implements ServiceMediator{
    private List<Plane> planes;

    ServiceMediatorImpl(){this.planes = new ArrayList<>(); }

    @Override
    public void addPlane(Plane plane) {
        this.planes.add(plane);
    }

    @Override
    public void fuelRaport(String fuel, Plane plane) {
        for (Plane p : this.planes){
            if (p != planes){
                p.receiveFuel(fuel);
            }
        }
    }


}

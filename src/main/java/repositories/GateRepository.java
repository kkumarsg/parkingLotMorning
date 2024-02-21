package repositories;

import exceptions.GateNotFoundException;
import models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {

    // It should be able to do crud operations on gate.

    Map<Long, Gate> gates = new HashMap<>();

    public Gate findGateById(Long id) throws GateNotFoundException {
        if(gates.containsKey(id)){
            return gates.get(id);
        }
        throw new GateNotFoundException();
    }
}

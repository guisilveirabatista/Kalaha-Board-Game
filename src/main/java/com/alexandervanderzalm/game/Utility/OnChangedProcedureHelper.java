package com.alexandervanderzalm.game.Utility;

import com.alexandervanderzalm.game.Utility.FunctionalInterfaces.Procedure;

import java.util.ArrayList;
import java.util.List;

public class OnChangedProcedureHelper implements ITriggerProcedureOnChange {

    private List<Procedure> onChangedProcedures = new ArrayList<Procedure>();

    @Override
    public void TriggerOnChangedProcedures() {
        onChangedProcedures.forEach((p) -> p.Process());
    }

    @Override
    public void AddProcedure(Procedure p) {
        onChangedProcedures.add(p);
    }

    @Override
    public void RemoveProcedure(Procedure p) {
        onChangedProcedures.remove(p);
    }
}

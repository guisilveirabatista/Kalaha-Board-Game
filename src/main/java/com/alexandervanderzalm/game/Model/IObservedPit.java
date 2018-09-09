package com.alexandervanderzalm.game.Model;

import com.alexandervanderzalm.game.Utility.IProcedureCollection;

public interface IObservedPit<T> extends IPit<T>{
    IProcedureCollection OnChanged();
}

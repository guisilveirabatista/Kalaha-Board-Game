package com.alexandervanderzalm.game.Utility;

import com.alexandervanderzalm.game.Utility.FunctionalInterfaces.Method;

import org.junit.Test;
import org.springframework.util.Assert;

public class MethodCollectionTest {

    Integer counter = 0;
    @Test
    public void removeMethod_AddAndRemove_NoMethodDone() {
        // Setup
        Method<Integer> m = (a) -> counter += a;
        IMethodCollection<Integer> c = new MethodCollection<>();
        counter = 0;

        c.Add(m);
        c.Remove(m);
        c.Process(1); // Shouldn't actually process p

        Assert.isTrue(counter == 0, "Counter should be 0 after no method");
    }

    @Test
    public void addethod_AddAndProcess_Processed() {
        // Setup
        Method<Integer> m = (a) -> counter += a;
        IMethodCollection<Integer> c = new MethodCollection<>();
        counter = 0;

        c.Add(m);
        c.Process(1); // Shouldn't actually process p

        Assert.isTrue(counter == 1, "Counter should be 1 after the processed method");
    }
}
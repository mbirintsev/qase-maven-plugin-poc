package io.qase.plugin;

import io.qase.api.annotation.CaseId;
import org.junit.jupiter.api.Test;

public class SomeTest {

    @Test
    @CaseId(1)
    public void case1() {
        System.out.println("Case 1");
    }

    @Test
    @CaseId(2)
    public void case2() {
        System.out.println("Case 2");
    }

    @Test
    @CaseId(3)
    public void case3() {
        System.out.println("Case 3");
    }

    @Test
    @CaseId(4)
    public void case4() {
        System.out.println("Case 4");
    }
}

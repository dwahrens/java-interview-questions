package com.dwahrens.interview;

import com.dwahrens.interview.utils.ListFactory;
import com.dwahrens.interview.utils.ListTestHarness;
import org.junit.Test;

public class AddMethodTest {
    private ListFactory factory = new ListFactory() {
        @Override
        public List createList() {
            return new ArrayList();
        }
    };

    @Test public void testAddMethod() throws Exception {
        ListTestHarness harness = new ListTestHarness( factory );
        harness.testAddMethod();
    }
}

package com.dwahrens.interview;

import com.dwahrens.interview.List;
import com.dwahrens.interview.utils.ListFactory;
import com.dwahrens.interview.utils.ListTestHarness;

import org.junit.Test;

public class RemoveMethodTest {
    private ListFactory factory = new ListFactory() {
        @Override
        public List createList() {
            return new LinkedList();
        }
    };

    @Test public void testRemoveMethod() throws Exception {
        ListTestHarness harness = new ListTestHarness( factory );
        harness.testRemoveMethod();
    }
}

package org.telegram.ui;

import java.util.Iterator;
public final class x91 implements org.telegram.ui.ActionBar.q1 {
    public final z91 f53897a;

    public x91(z91 z91Var) {
        this.f53897a = z91Var;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ca1 ca1Var = this.f53897a.f54556a;
        Iterator it = ca1Var.f46755e.iterator();
        while (it.hasNext()) {
            ca1.Z(ca1Var, ((Integer) it.next()).intValue());
        }
        ca1Var.f46755e.clear();
        ca1Var.a0();
    }
}

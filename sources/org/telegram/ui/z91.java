package org.telegram.ui;

import java.util.Iterator;
public final class z91 implements org.telegram.ui.ActionBar.r1 {
    public final ba1 f54463a;

    public z91(ba1 ba1Var) {
        this.f54463a = ba1Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ea1 ea1Var = this.f54463a.f45794a;
        Iterator it = ea1Var.f47148e.iterator();
        while (it.hasNext()) {
            ea1.Z(ea1Var, ((Integer) it.next()).intValue());
        }
        ea1Var.f47148e.clear();
        ea1Var.a0();
    }
}

package org.telegram.ui;

import java.util.Iterator;
public final class z91 implements org.telegram.ui.ActionBar.q1 {
    public final ba1 f54474a;

    public z91(ba1 ba1Var) {
        this.f54474a = ba1Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ea1 ea1Var = this.f54474a.f45778a;
        Iterator it = ea1Var.f47190e.iterator();
        while (it.hasNext()) {
            ea1.Z(ea1Var, ((Integer) it.next()).intValue());
        }
        ea1Var.f47190e.clear();
        ea1Var.a0();
    }
}

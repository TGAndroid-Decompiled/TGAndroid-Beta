package org.telegram.ui;

import java.util.Iterator;
public final class z91 implements org.telegram.ui.ActionBar.q1 {
    public final ba1 f54507a;

    public z91(ba1 ba1Var) {
        this.f54507a = ba1Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ea1 ea1Var = this.f54507a.f45826a;
        Iterator it = ea1Var.f47217e.iterator();
        while (it.hasNext()) {
            ea1.Z(ea1Var, ((Integer) it.next()).intValue());
        }
        ea1Var.f47217e.clear();
        ea1Var.a0();
    }
}

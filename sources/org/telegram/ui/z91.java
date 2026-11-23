package org.telegram.ui;

import java.util.Iterator;
public final class z91 implements org.telegram.ui.ActionBar.q1 {
    public final ba1 f54511a;

    public z91(ba1 ba1Var) {
        this.f54511a = ba1Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ea1 ea1Var = this.f54511a.f45830a;
        Iterator it = ea1Var.f47221e.iterator();
        while (it.hasNext()) {
            ea1.Z(ea1Var, ((Integer) it.next()).intValue());
        }
        ea1Var.f47221e.clear();
        ea1Var.a0();
    }
}

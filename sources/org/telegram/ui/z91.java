package org.telegram.ui;

import java.util.Iterator;
public final class z91 implements org.telegram.ui.ActionBar.r1 {
    public final ba1 f52478a;

    public z91(ba1 ba1Var) {
        this.f52478a = ba1Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ea1 ea1Var = this.f52478a.f43946a;
        Iterator it = ea1Var.f45350e.iterator();
        while (it.hasNext()) {
            ea1.Z(ea1Var, ((Integer) it.next()).intValue());
        }
        ea1Var.f45350e.clear();
        ea1Var.a0();
    }
}

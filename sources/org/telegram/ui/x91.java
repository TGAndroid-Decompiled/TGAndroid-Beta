package org.telegram.ui;

import java.util.Iterator;
public final class x91 implements org.telegram.ui.ActionBar.r1 {
    public final z91 f51802a;

    public x91(z91 z91Var) {
        this.f51802a = z91Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ca1 ca1Var = this.f51802a.f52493a;
        Iterator it = ca1Var.f44737e.iterator();
        while (it.hasNext()) {
            ca1.Z(ca1Var, ((Integer) it.next()).intValue());
        }
        ca1Var.f44737e.clear();
        ca1Var.a0();
    }
}

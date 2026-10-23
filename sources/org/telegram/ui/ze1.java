package org.telegram.ui;

import java.util.Iterator;
public final class ze1 implements org.telegram.ui.ActionBar.z1 {
    public final bf1 f44130a;

    public ze1(bf1 bf1Var) {
        this.f44130a = bf1Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ef1 ef1Var = this.f44130a.f36074a;
        Iterator it = ef1Var.e.iterator();
        while (it.hasNext()) {
            ef1.U(ef1Var, ((Integer) it.next()).intValue());
        }
        ef1Var.e.clear();
        ef1Var.V();
    }
}

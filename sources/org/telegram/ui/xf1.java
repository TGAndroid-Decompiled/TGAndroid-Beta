package org.telegram.ui;

import java.util.Iterator;
public final class xf1 implements org.telegram.ui.ActionBar.z1 {
    public final zf1 f39916a;

    public xf1(zf1 zf1Var) {
        this.f39916a = zf1Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        cg1 cg1Var = this.f39916a.f40466a;
        Iterator it = cg1Var.e.iterator();
        while (it.hasNext()) {
            cg1.U(cg1Var, ((Integer) it.next()).intValue());
        }
        cg1Var.e.clear();
        cg1Var.V();
    }
}

package org.telegram.ui;

import java.util.Iterator;
public final class xf1 implements org.telegram.ui.ActionBar.a2 {
    public final zf1 f39266a;

    public xf1(zf1 zf1Var) {
        this.f39266a = zf1Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        cg1 cg1Var = this.f39266a.f40121a;
        Iterator it = cg1Var.e.iterator();
        while (it.hasNext()) {
            cg1.U(cg1Var, ((Integer) it.next()).intValue());
        }
        cg1Var.e.clear();
        cg1Var.V();
    }
}

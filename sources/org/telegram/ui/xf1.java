package org.telegram.ui;

import java.util.Iterator;
public final class xf1 implements org.telegram.ui.ActionBar.a2 {
    public final zf1 f42938a;

    public xf1(zf1 zf1Var) {
        this.f42938a = zf1Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        cg1 cg1Var = this.f42938a.f43771a;
        Iterator it = cg1Var.f35455e.iterator();
        while (it.hasNext()) {
            cg1.S(cg1Var, ((Integer) it.next()).intValue());
        }
        cg1Var.f35455e.clear();
        cg1Var.T();
    }
}

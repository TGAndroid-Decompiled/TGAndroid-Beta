package org.telegram.ui;

import java.util.Iterator;
public final class tf1 implements org.telegram.ui.ActionBar.c2 {
    public final vf1 f41533a;

    public tf1(vf1 vf1Var) {
        this.f41533a = vf1Var;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        yf1 yf1Var = this.f41533a.f42107a;
        Iterator it = yf1Var.f43618e.iterator();
        while (it.hasNext()) {
            yf1.U(yf1Var, ((Integer) it.next()).intValue());
        }
        yf1Var.f43618e.clear();
        yf1Var.V();
    }
}

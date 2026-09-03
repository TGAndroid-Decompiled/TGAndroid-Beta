package org.telegram.ui;

import java.util.Iterator;
public final class tf1 implements org.telegram.ui.ActionBar.c2 {
    public final vf1 f38509a;

    public tf1(vf1 vf1Var) {
        this.f38509a = vf1Var;
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        yf1 yf1Var = this.f38509a.f39087a;
        Iterator it = yf1Var.e.iterator();
        while (it.hasNext()) {
            yf1.U(yf1Var, ((Integer) it.next()).intValue());
        }
        yf1Var.e.clear();
        yf1Var.V();
    }
}

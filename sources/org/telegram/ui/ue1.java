package org.telegram.ui;

import java.util.Iterator;
public final class ue1 implements org.telegram.ui.ActionBar.a2 {
    public final we1 f41946a;

    public ue1(we1 we1Var) {
        this.f41946a = we1Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ze1 ze1Var = this.f41946a.f42499a;
        Iterator it = ze1Var.e.iterator();
        while (it.hasNext()) {
            ze1.U(ze1Var, ((Integer) it.next()).intValue());
        }
        ze1Var.e.clear();
        ze1Var.V();
    }
}

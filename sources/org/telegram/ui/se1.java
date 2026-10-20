package org.telegram.ui;

import java.util.Iterator;
public final class se1 implements org.telegram.ui.ActionBar.a2 {
    public final ue1 f41452a;

    public se1(ue1 ue1Var) {
        this.f41452a = ue1Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        xe1 xe1Var = this.f41452a.f41946a;
        Iterator it = xe1Var.e.iterator();
        while (it.hasNext()) {
            xe1.U(xe1Var, ((Integer) it.next()).intValue());
        }
        xe1Var.e.clear();
        xe1Var.V();
    }
}

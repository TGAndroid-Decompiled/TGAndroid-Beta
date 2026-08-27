package org.telegram.ui;

import java.util.Iterator;

public final class xe1 implements org.telegram.ui.ActionBar.a2 {

    public final ze1 f44436a;

    public xe1(ze1 ze1Var) {
        this.f44436a = ze1Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        cf1 cf1Var = this.f44436a.f45155a;
        Iterator it = cf1Var.f37080e.iterator();
        while (it.hasNext()) {
            cf1.U(cf1Var, ((Integer) it.next()).intValue());
        }
        cf1Var.f37080e.clear();
        cf1Var.V();
    }
}

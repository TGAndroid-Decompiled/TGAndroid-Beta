package org.telegram.ui;

import java.util.Iterator;
public final class zf1 implements org.telegram.ui.ActionBar.a2 {
    public final bg1 f43770a;

    public zf1(bg1 bg1Var) {
        this.f43770a = bg1Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        eg1 eg1Var = this.f43770a.f35085a;
        Iterator it = eg1Var.f36023e.iterator();
        while (it.hasNext()) {
            eg1.S(eg1Var, ((Integer) it.next()).intValue());
        }
        eg1Var.f36023e.clear();
        eg1Var.T();
    }
}

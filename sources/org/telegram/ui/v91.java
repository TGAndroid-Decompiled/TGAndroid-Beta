package org.telegram.ui;

import java.util.Iterator;
public final class v91 implements org.telegram.ui.ActionBar.q1 {
    public final x91 f52177a;

    public v91(x91 x91Var) {
        this.f52177a = x91Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        aa1 aa1Var = this.f52177a.f53133a;
        Iterator it = aa1Var.f44983e.iterator();
        while (it.hasNext()) {
            aa1.Z(aa1Var, ((Integer) it.next()).intValue());
        }
        aa1Var.f44983e.clear();
        aa1Var.a0();
    }
}

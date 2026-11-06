package org.telegram.ui;

import java.util.Iterator;
public final class w91 implements org.telegram.ui.ActionBar.r1 {
    public final y91 f51032a;

    public w91(y91 y91Var) {
        this.f51032a = y91Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ba1 ba1Var = this.f51032a.f52157a;
        Iterator it = ba1Var.f44224e.iterator();
        while (it.hasNext()) {
            ba1.Z(ba1Var, ((Integer) it.next()).intValue());
        }
        ba1Var.f44224e.clear();
        ba1Var.a0();
    }
}

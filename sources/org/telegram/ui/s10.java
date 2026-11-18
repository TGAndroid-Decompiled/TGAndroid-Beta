package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class s10 implements Runnable {
    public final f40 f51848a;

    public s10(f40 f40Var) {
        this.f51848a = f40Var;
    }

    @Override
    public final void run() {
        int i7;
        f40 f40Var = this.f51848a;
        org.telegram.ui.ActionBar.n5 n5Var = f40Var.P1;
        m30 m30Var = f40Var.Q1;
        if (m30Var != null && !f40Var.J) {
            org.telegram.messenger.t3 t3Var = f40Var.V2;
            if (t3Var != null) {
                i7 = t3Var.f26937b.schedule_date;
            } else {
                i7 = f40Var.f47479j4;
            }
            if (i7 != 0) {
                int currentTime = i7 - ConnectionsManager.getInstance(f40Var.f47498o1.f23221a).getCurrentTime();
                if (currentTime >= 86400) {
                    m30Var.l(org.telegram.messenger.gd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]), false);
                } else {
                    m30Var.l(org.telegram.messenger.g0.j0(Math.abs(currentTime)), false);
                    if (currentTime < 0 && n5Var.getTag() == null) {
                        n5Var.setTag(1);
                        n5Var.l(org.telegram.messenger.gd.M0(2131743204, null), false);
                    }
                }
                f40Var.R1.l(org.telegram.messenger.gd.W(3, i7, true), false);
                org.telegram.messenger.g0.h3(f40Var.f47534v4, 1000L);
            }
        }
    }
}

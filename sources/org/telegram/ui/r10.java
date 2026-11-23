package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class r10 implements Runnable {
    public final e40 f51589a;

    public r10(e40 e40Var) {
        this.f51589a = e40Var;
    }

    @Override
    public final void run() {
        int i7;
        e40 e40Var = this.f51589a;
        org.telegram.ui.ActionBar.n5 n5Var = e40Var.P1;
        l30 l30Var = e40Var.Q1;
        if (l30Var != null && !e40Var.J) {
            org.telegram.messenger.t3 t3Var = e40Var.V2;
            if (t3Var != null) {
                i7 = t3Var.f27034b.schedule_date;
            } else {
                i7 = e40Var.f47357j4;
            }
            if (i7 != 0) {
                int currentTime = i7 - ConnectionsManager.getInstance(e40Var.f47376o1.f23343a).getCurrentTime();
                if (currentTime >= 86400) {
                    l30Var.l(org.telegram.messenger.gd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]), false);
                } else {
                    l30Var.l(org.telegram.messenger.g0.j0(Math.abs(currentTime)), false);
                    if (currentTime < 0 && n5Var.getTag() == null) {
                        n5Var.setTag(1);
                        n5Var.l(org.telegram.messenger.gd.N0(2131743191, null), false);
                    }
                }
                e40Var.R1.l(org.telegram.messenger.gd.W(3, i7, true), false);
                org.telegram.messenger.g0.h3(e40Var.f47412v4, 1000L);
            }
        }
    }
}

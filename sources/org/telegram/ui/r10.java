package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class r10 implements Runnable {
    public final e40 f49247a;

    public r10(e40 e40Var) {
        this.f49247a = e40Var;
    }

    @Override
    public final void run() {
        int i7;
        e40 e40Var = this.f49247a;
        org.telegram.ui.ActionBar.l5 l5Var = e40Var.L1;
        l30 l30Var = e40Var.M1;
        if (l30Var != null && !e40Var.I) {
            org.telegram.messenger.r3 r3Var = e40Var.R2;
            if (r3Var != null) {
                i7 = r3Var.f25222b.schedule_date;
            } else {
                i7 = e40Var.f45194b4;
            }
            if (i7 != 0) {
                int currentTime = i7 - ConnectionsManager.getInstance(e40Var.f45228k1.f21765a).getCurrentTime();
                if (currentTime >= 86400) {
                    l30Var.l(org.telegram.messenger.id.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]), false);
                } else {
                    l30Var.l(org.telegram.messenger.g0.j0(Math.abs(currentTime)), false);
                    if (currentTime < 0 && l5Var.getTag() == null) {
                        l5Var.setTag(1);
                        l5Var.l(org.telegram.messenger.id.M0(2131743441, null), false);
                    }
                }
                e40Var.N1.l(org.telegram.messenger.id.W(3, i7, true), false);
                org.telegram.messenger.g0.i3(e40Var.f45244n4, 1000L);
            }
        }
    }
}

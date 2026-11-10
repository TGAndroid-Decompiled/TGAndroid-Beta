package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class t10 implements Runnable {
    public final f40 f50013a;

    public t10(f40 f40Var) {
        this.f50013a = f40Var;
    }

    @Override
    public final void run() {
        int i7;
        f40 f40Var = this.f50013a;
        org.telegram.ui.ActionBar.m5 m5Var = f40Var.O1;
        m30 m30Var = f40Var.P1;
        if (m30Var != null && !f40Var.I) {
            org.telegram.messenger.r3 r3Var = f40Var.U2;
            if (r3Var != null) {
                i7 = r3Var.f25226b.schedule_date;
            } else {
                i7 = f40Var.f45521e4;
            }
            if (i7 != 0) {
                int currentTime = i7 - ConnectionsManager.getInstance(f40Var.n1.f21770a).getCurrentTime();
                if (currentTime >= 86400) {
                    m30Var.l(org.telegram.messenger.id.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]), false);
                } else {
                    m30Var.l(org.telegram.messenger.g0.j0(Math.abs(currentTime)), false);
                    if (currentTime < 0 && m5Var.getTag() == null) {
                        m5Var.setTag(1);
                        m5Var.l(org.telegram.messenger.id.M0(2131743441, null), false);
                    }
                }
                f40Var.Q1.l(org.telegram.messenger.id.W(3, i7, true), false);
                org.telegram.messenger.g0.i3(f40Var.f45571q4, 1000L);
            }
        }
    }
}

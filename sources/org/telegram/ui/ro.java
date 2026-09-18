package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class ro implements Runnable {
    public final int f37288a;
    public final long f37289b;
    public final long f37290c;
    public final org.telegram.ui.ActionBar.o2 d;

    public ro(org.telegram.ui.ActionBar.o2 o2Var, long j3, long j10, int i10) {
        this.f37288a = i10;
        this.d = o2Var;
        this.f37289b = j3;
        this.f37290c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.x51 x51Var;
        switch (this.f37288a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f37289b, this.f37290c, new b5((wo) this.d, 4));
                return;
            default:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) this.d;
                z1Var.h = this.f37289b;
                z1Var.f39025n = this.f37290c;
                org.telegram.ui.Components.z51 z51Var = z1Var.f22336a;
                if (z51Var != null && (x51Var = z51Var.Y2) != null && z51Var.G) {
                    x51Var.N(true);
                    return;
                }
                return;
        }
    }
}

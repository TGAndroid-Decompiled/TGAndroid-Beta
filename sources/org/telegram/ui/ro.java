package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class ro implements Runnable {
    public final int f37182a;
    public final long f37183b;
    public final long f37184c;
    public final org.telegram.ui.ActionBar.n2 d;

    public ro(org.telegram.ui.ActionBar.n2 n2Var, long j3, long j10, int i10) {
        this.f37182a = i10;
        this.d = n2Var;
        this.f37183b = j3;
        this.f37184c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.w51 w51Var;
        switch (this.f37182a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f37183b, this.f37184c, new b5((wo) this.d, 4));
                return;
            default:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) this.d;
                z1Var.f39180f = this.f37183b;
                z1Var.h = this.f37184c;
                org.telegram.ui.Components.y51 y51Var = z1Var.f30482a;
                if (y51Var != null && (w51Var = y51Var.Y2) != null && y51Var.G) {
                    w51Var.N(true);
                    return;
                }
                return;
        }
    }
}

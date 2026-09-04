package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class so implements Runnable {
    public final int f40489a;
    public final long f40490b;
    public final long f40491c;
    public final org.telegram.ui.ActionBar.n2 d;

    public so(org.telegram.ui.ActionBar.n2 n2Var, long j3, long j10, int i10) {
        this.f40489a = i10;
        this.d = n2Var;
        this.f40490b = j3;
        this.f40491c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.v51 v51Var;
        switch (this.f40489a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f40490b, this.f40491c, new b5((xo) this.d, 4));
                return;
            default:
                org.telegram.ui.web.a2 a2Var = (org.telegram.ui.web.a2) this.d;
                a2Var.f42002f = this.f40490b;
                a2Var.h = this.f40491c;
                org.telegram.ui.Components.x51 x51Var = a2Var.f32849a;
                if (x51Var != null && (v51Var = x51Var.Y2) != null && x51Var.G) {
                    v51Var.N(true);
                    return;
                }
                return;
        }
    }
}

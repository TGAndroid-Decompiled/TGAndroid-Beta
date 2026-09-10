package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class so implements Runnable {
    public final int f36732a;
    public final long f36733b;
    public final long f36734c;
    public final org.telegram.ui.ActionBar.p2 d;

    public so(org.telegram.ui.ActionBar.p2 p2Var, long j3, long j10, int i10) {
        this.f36732a = i10;
        this.d = p2Var;
        this.f36733b = j3;
        this.f36734c = j10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.j61 j61Var;
        switch (this.f36732a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f36733b, this.f36734c, new b5((yo) this.d, 4));
                return;
            default:
                org.telegram.ui.web.b2 b2Var = (org.telegram.ui.web.b2) this.d;
                b2Var.f37869f = this.f36733b;
                b2Var.h = this.f36734c;
                org.telegram.ui.Components.l61 l61Var = b2Var.f25171a;
                if (l61Var != null && (j61Var = l61Var.Y2) != null && l61Var.G) {
                    j61Var.N(true);
                    return;
                }
                return;
        }
    }
}

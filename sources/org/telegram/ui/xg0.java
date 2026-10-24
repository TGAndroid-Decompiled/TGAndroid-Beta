package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xg0 implements Runnable {
    public final int f43604a;
    public final lh0 f43605b;
    public final TLRPC.TL_chatInviteExported f43606c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f43607f;

    public xg0(lh0 lh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f43604a = i10;
        this.f43605b = lh0Var;
        this.f43606c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f43607f = z10;
    }

    @Override
    public final void run() {
        switch (this.f43604a) {
            case 0:
                lh0 lh0Var = this.f43605b;
                lh0Var.getNotificationCenter().doOnIdle(new xg0(lh0Var, this.f43606c, this.d, this.e, this.f43607f, 1));
                return;
            default:
                lh0.U(this.f43605b, this.f43606c, this.d, this.e, this.f43607f);
                return;
        }
    }
}

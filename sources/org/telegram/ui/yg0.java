package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yg0 implements Runnable {
    public final int f46014a;
    public final lh0 f46015b;
    public final TLRPC.TL_chatInviteExported f46016c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f46017f;

    public yg0(lh0 lh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f46014a = i10;
        this.f46015b = lh0Var;
        this.f46016c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f46017f = z10;
    }

    @Override
    public final void run() {
        switch (this.f46014a) {
            case 0:
                lh0 lh0Var = this.f46015b;
                lh0Var.getNotificationCenter().doOnIdle(new yg0(lh0Var, this.f46016c, this.d, this.e, this.f46017f, 1));
                return;
            default:
                lh0.V(this.f46015b, this.f46016c, this.d, this.e, this.f46017f);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ug0 implements Runnable {
    public final int f43258a;
    public final hh0 f43259b;
    public final TLRPC.TL_chatInviteExported f43260c;
    public final TLRPC.TL_error d;
    public final TLObject f43261e;
    public final boolean f43262f;

    public ug0(hh0 hh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f43258a = i10;
        this.f43259b = hh0Var;
        this.f43260c = tL_chatInviteExported;
        this.d = tL_error;
        this.f43261e = tLObject;
        this.f43262f = z10;
    }

    @Override
    public final void run() {
        switch (this.f43258a) {
            case 0:
                hh0 hh0Var = this.f43259b;
                hh0Var.getNotificationCenter().doOnIdle(new ug0(hh0Var, this.f43260c, this.d, this.f43261e, this.f43262f, 1));
                return;
            default:
                hh0.U(this.f43259b, this.f43260c, this.d, this.f43261e, this.f43262f);
                return;
        }
    }
}

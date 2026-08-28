package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ug0 implements Runnable {
    public final int f43252a;
    public final hh0 f43253b;
    public final TLRPC.TL_chatInviteExported f43254c;
    public final TLRPC.TL_error d;
    public final TLObject f43255e;
    public final boolean f43256f;

    public ug0(hh0 hh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i9) {
        this.f43252a = i9;
        this.f43253b = hh0Var;
        this.f43254c = tL_chatInviteExported;
        this.d = tL_error;
        this.f43255e = tLObject;
        this.f43256f = z10;
    }

    @Override
    public final void run() {
        switch (this.f43252a) {
            case 0:
                hh0 hh0Var = this.f43253b;
                hh0Var.getNotificationCenter().doOnIdle(new ug0(hh0Var, this.f43254c, this.d, this.f43255e, this.f43256f, 1));
                return;
            default:
                hh0.T(this.f43253b, this.f43254c, this.d, this.f43255e, this.f43256f);
                return;
        }
    }
}

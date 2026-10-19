package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tg0 implements Runnable {
    public final int f41665a;
    public final hh0 f41666b;
    public final TLRPC.TL_chatInviteExported f41667c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f41668f;

    public tg0(hh0 hh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f41665a = i10;
        this.f41666b = hh0Var;
        this.f41667c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f41668f = z10;
    }

    @Override
    public final void run() {
        switch (this.f41665a) {
            case 0:
                hh0 hh0Var = this.f41666b;
                hh0Var.getNotificationCenter().doOnIdle(new tg0(hh0Var, this.f41667c, this.d, this.e, this.f41668f, 1));
                return;
            default:
                hh0.U(this.f41666b, this.f41667c, this.d, this.e, this.f41668f);
                return;
        }
    }
}

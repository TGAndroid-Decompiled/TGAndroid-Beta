package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ug0 implements Runnable {
    public final int f41964a;
    public final ih0 f41965b;
    public final TLRPC.TL_chatInviteExported f41966c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f41967f;

    public ug0(ih0 ih0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f41964a = i10;
        this.f41965b = ih0Var;
        this.f41966c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f41967f = z10;
    }

    @Override
    public final void run() {
        switch (this.f41964a) {
            case 0:
                ih0 ih0Var = this.f41965b;
                ih0Var.getNotificationCenter().doOnIdle(new ug0(ih0Var, this.f41966c, this.d, this.e, this.f41967f, 1));
                return;
            default:
                ih0.U(this.f41965b, this.f41966c, this.d, this.e, this.f41967f);
                return;
        }
    }
}

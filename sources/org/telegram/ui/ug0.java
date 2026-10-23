package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ug0 implements Runnable {
    public final int f41965a;
    public final ih0 f41966b;
    public final TLRPC.TL_chatInviteExported f41967c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f41968f;

    public ug0(ih0 ih0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f41965a = i10;
        this.f41966b = ih0Var;
        this.f41967c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f41968f = z10;
    }

    @Override
    public final void run() {
        switch (this.f41965a) {
            case 0:
                ih0 ih0Var = this.f41966b;
                ih0Var.getNotificationCenter().doOnIdle(new ug0(ih0Var, this.f41967c, this.d, this.e, this.f41968f, 1));
                return;
            default:
                ih0.U(this.f41966b, this.f41967c, this.d, this.e, this.f41968f);
                return;
        }
    }
}

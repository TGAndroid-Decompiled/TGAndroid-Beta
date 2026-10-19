package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ug0 implements Runnable {
    public final int f41955a;
    public final ih0 f41956b;
    public final TLRPC.TL_chatInviteExported f41957c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f41958f;

    public ug0(ih0 ih0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f41955a = i10;
        this.f41956b = ih0Var;
        this.f41957c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f41958f = z10;
    }

    @Override
    public final void run() {
        switch (this.f41955a) {
            case 0:
                ih0 ih0Var = this.f41956b;
                ih0Var.getNotificationCenter().doOnIdle(new ug0(ih0Var, this.f41957c, this.d, this.e, this.f41958f, 1));
                return;
            default:
                ih0.U(this.f41956b, this.f41957c, this.d, this.e, this.f41958f);
                return;
        }
    }
}

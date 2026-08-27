package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class xg0 implements Runnable {

    public final int f44444a;

    public final kh0 f44445b;

    public final TLRPC.TL_chatInviteExported f44446c;
    public final TLRPC.TL_error d;

    public final TLObject f44447e;

    public final boolean f44448f;

    public xg0(kh0 kh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f44444a = i10;
        this.f44445b = kh0Var;
        this.f44446c = tL_chatInviteExported;
        this.d = tL_error;
        this.f44447e = tLObject;
        this.f44448f = z10;
    }

    @Override
    public final void run() {
        switch (this.f44444a) {
            case 0:
                kh0 kh0Var = this.f44445b;
                kh0Var.getNotificationCenter().doOnIdle(new xg0(kh0Var, this.f44446c, this.d, this.f44447e, this.f44448f, 1));
                break;
            default:
                kh0.U(this.f44445b, this.f44446c, this.d, this.f44447e, this.f44448f);
                break;
        }
    }
}

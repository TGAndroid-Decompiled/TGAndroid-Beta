package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yg0 implements Runnable {
    public final int f43851a;
    public final mh0 f43852b;
    public final TLRPC.TL_chatInviteExported f43853c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f43854f;

    public yg0(mh0 mh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f43851a = i10;
        this.f43852b = mh0Var;
        this.f43853c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f43854f = z10;
    }

    @Override
    public final void run() {
        switch (this.f43851a) {
            case 0:
                mh0 mh0Var = this.f43852b;
                mh0Var.getNotificationCenter().doOnIdle(new yg0(mh0Var, this.f43853c, this.d, this.e, this.f43854f, 1));
                return;
            default:
                mh0.U(this.f43852b, this.f43853c, this.d, this.e, this.f43854f);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wg0 implements Runnable {
    public final int f45485a;
    public final jh0 f45486b;
    public final TLRPC.TL_chatInviteExported f45487c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f45488f;

    public wg0(jh0 jh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f45485a = i10;
        this.f45486b = jh0Var;
        this.f45487c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f45488f = z10;
    }

    @Override
    public final void run() {
        switch (this.f45485a) {
            case 0:
                jh0 jh0Var = this.f45486b;
                jh0Var.getNotificationCenter().doOnIdle(new wg0(jh0Var, this.f45487c, this.d, this.e, this.f45488f, 1));
                return;
            default:
                jh0.V(this.f45486b, this.f45487c, this.d, this.e, this.f45488f);
                return;
        }
    }
}

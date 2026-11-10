package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class te0 implements Runnable {
    public final int f50255a;
    public final ff0 f50256b;
    public final TLRPC.TL_chatInviteExported f50257c;
    public final TLRPC.TL_error d;
    public final TLObject f50258e;
    public final boolean f50259f;

    public te0(ff0 ff0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z9, int i7) {
        this.f50255a = i7;
        this.f50256b = ff0Var;
        this.f50257c = tL_chatInviteExported;
        this.d = tL_error;
        this.f50258e = tLObject;
        this.f50259f = z9;
    }

    @Override
    public final void run() {
        switch (this.f50255a) {
            case 0:
                ff0 ff0Var = this.f50256b;
                ff0Var.getNotificationCenter().d(new te0(ff0Var, this.f50257c, this.d, this.f50258e, this.f50259f, 1));
                return;
            default:
                ff0.Z(this.f50256b, this.f50257c, this.d, this.f50258e, this.f50259f);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class te0 implements Runnable {
    public final int f52321a;
    public final ff0 f52322b;
    public final TLRPC.TL_chatInviteExported f52323c;
    public final TLRPC.TL_error d;
    public final TLObject f52324e;
    public final boolean f52325f;

    public te0(ff0 ff0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i7) {
        this.f52321a = i7;
        this.f52322b = ff0Var;
        this.f52323c = tL_chatInviteExported;
        this.d = tL_error;
        this.f52324e = tLObject;
        this.f52325f = z10;
    }

    @Override
    public final void run() {
        switch (this.f52321a) {
            case 0:
                ff0 ff0Var = this.f52322b;
                ff0Var.getNotificationCenter().d(new te0(ff0Var, this.f52323c, this.d, this.f52324e, this.f52325f, 1));
                return;
            default:
                ff0.Z(this.f52322b, this.f52323c, this.d, this.f52324e, this.f52325f);
                return;
        }
    }
}

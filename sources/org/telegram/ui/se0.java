package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class se0 implements Runnable {
    public final int f51984a;
    public final ff0 f51985b;
    public final TLRPC.TL_chatInviteExported f51986c;
    public final TLRPC.TL_error d;
    public final TLObject f51987e;
    public final boolean f51988f;

    public se0(ff0 ff0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i7) {
        this.f51984a = i7;
        this.f51985b = ff0Var;
        this.f51986c = tL_chatInviteExported;
        this.d = tL_error;
        this.f51987e = tLObject;
        this.f51988f = z10;
    }

    @Override
    public final void run() {
        switch (this.f51984a) {
            case 0:
                ff0 ff0Var = this.f51985b;
                ff0Var.getNotificationCenter().d(new se0(ff0Var, this.f51986c, this.d, this.f51987e, this.f51988f, 1));
                return;
            default:
                ff0.Z(this.f51985b, this.f51986c, this.d, this.f51987e, this.f51988f);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class te0 implements Runnable {
    public final int f52317a;
    public final ff0 f52318b;
    public final TLRPC.TL_chatInviteExported f52319c;
    public final TLRPC.TL_error d;
    public final TLObject f52320e;
    public final boolean f52321f;

    public te0(ff0 ff0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i7) {
        this.f52317a = i7;
        this.f52318b = ff0Var;
        this.f52319c = tL_chatInviteExported;
        this.d = tL_error;
        this.f52320e = tLObject;
        this.f52321f = z10;
    }

    @Override
    public final void run() {
        switch (this.f52317a) {
            case 0:
                ff0 ff0Var = this.f52318b;
                ff0Var.getNotificationCenter().d(new te0(ff0Var, this.f52319c, this.d, this.f52320e, this.f52321f, 1));
                return;
            default:
                ff0.Z(this.f52318b, this.f52319c, this.d, this.f52320e, this.f52321f);
                return;
        }
    }
}

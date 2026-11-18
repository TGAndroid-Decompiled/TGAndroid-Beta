package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class te0 implements Runnable {
    public final int f52267a;
    public final gf0 f52268b;
    public final TLRPC.TL_chatInviteExported f52269c;
    public final TLRPC.TL_error d;
    public final TLObject f52270e;
    public final boolean f52271f;

    public te0(gf0 gf0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i7) {
        this.f52267a = i7;
        this.f52268b = gf0Var;
        this.f52269c = tL_chatInviteExported;
        this.d = tL_error;
        this.f52270e = tLObject;
        this.f52271f = z10;
    }

    @Override
    public final void run() {
        switch (this.f52267a) {
            case 0:
                gf0 gf0Var = this.f52268b;
                gf0Var.getNotificationCenter().d(new te0(gf0Var, this.f52269c, this.d, this.f52270e, this.f52271f, 1));
                return;
            default:
                gf0.Z(this.f52268b, this.f52269c, this.d, this.f52270e, this.f52271f);
                return;
        }
    }
}

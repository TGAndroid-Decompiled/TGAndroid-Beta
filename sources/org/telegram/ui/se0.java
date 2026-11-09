package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class se0 implements Runnable {
    public final int f49891a;
    public final ef0 f49892b;
    public final TLRPC.TL_chatInviteExported f49893c;
    public final TLRPC.TL_error d;
    public final TLObject f49894e;
    public final boolean f49895f;

    public se0(ef0 ef0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z9, int i7) {
        this.f49891a = i7;
        this.f49892b = ef0Var;
        this.f49893c = tL_chatInviteExported;
        this.d = tL_error;
        this.f49894e = tLObject;
        this.f49895f = z9;
    }

    @Override
    public final void run() {
        switch (this.f49891a) {
            case 0:
                ef0 ef0Var = this.f49892b;
                ef0Var.getNotificationCenter().d(new se0(ef0Var, this.f49893c, this.d, this.f49894e, this.f49895f, 1));
                return;
            default:
                ef0.Z(this.f49892b, this.f49893c, this.d, this.f49894e, this.f49895f);
                return;
        }
    }
}

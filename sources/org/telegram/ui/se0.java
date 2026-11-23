package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class se0 implements Runnable {
    public final int f52072a;
    public final ef0 f52073b;
    public final TLRPC.TL_chatInviteExported f52074c;
    public final TLRPC.TL_error d;
    public final TLObject f52075e;
    public final boolean f52076f;

    public se0(ef0 ef0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i7) {
        this.f52072a = i7;
        this.f52073b = ef0Var;
        this.f52074c = tL_chatInviteExported;
        this.d = tL_error;
        this.f52075e = tLObject;
        this.f52076f = z10;
    }

    @Override
    public final void run() {
        switch (this.f52072a) {
            case 0:
                ef0 ef0Var = this.f52073b;
                ef0Var.getNotificationCenter().d(new se0(ef0Var, this.f52074c, this.d, this.f52075e, this.f52076f, 1));
                return;
            default:
                ef0.Z(this.f52073b, this.f52074c, this.d, this.f52075e, this.f52076f);
                return;
        }
    }
}

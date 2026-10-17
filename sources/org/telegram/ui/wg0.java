package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wg0 implements Runnable {
    public final int f42839a;
    public final kh0 f42840b;
    public final TLRPC.TL_chatInviteExported f42841c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f42842f;

    public wg0(kh0 kh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f42839a = i10;
        this.f42840b = kh0Var;
        this.f42841c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f42842f = z10;
    }

    @Override
    public final void run() {
        switch (this.f42839a) {
            case 0:
                kh0 kh0Var = this.f42840b;
                kh0Var.getNotificationCenter().doOnIdle(new wg0(kh0Var, this.f42841c, this.d, this.e, this.f42842f, 1));
                return;
            default:
                kh0.U(this.f42840b, this.f42841c, this.d, this.e, this.f42842f);
                return;
        }
    }
}

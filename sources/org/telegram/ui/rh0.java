package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rh0 implements Runnable {
    public final int f39800a;
    public final ei0 f39801b;
    public final TLRPC.TL_chatInviteExported f39802c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f39803f;

    public rh0(ei0 ei0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f39800a = i10;
        this.f39801b = ei0Var;
        this.f39802c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f39803f = z10;
    }

    @Override
    public final void run() {
        switch (this.f39800a) {
            case 0:
                ei0 ei0Var = this.f39801b;
                ei0Var.getNotificationCenter().doOnIdle(new rh0(ei0Var, this.f39802c, this.d, this.e, this.f39803f, 1));
                return;
            default:
                ei0.U(this.f39801b, this.f39802c, this.d, this.e, this.f39803f);
                return;
        }
    }
}

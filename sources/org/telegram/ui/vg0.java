package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vg0 implements Runnable {
    public final int f42178a;
    public final jh0 f42179b;
    public final TLRPC.TL_chatInviteExported f42180c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f42181f;

    public vg0(jh0 jh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f42178a = i10;
        this.f42179b = jh0Var;
        this.f42180c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f42181f = z10;
    }

    @Override
    public final void run() {
        switch (this.f42178a) {
            case 0:
                jh0 jh0Var = this.f42179b;
                jh0Var.getNotificationCenter().doOnIdle(new vg0(jh0Var, this.f42180c, this.d, this.e, this.f42181f, 1));
                return;
            default:
                jh0.U(this.f42179b, this.f42180c, this.d, this.e, this.f42181f);
                return;
        }
    }
}

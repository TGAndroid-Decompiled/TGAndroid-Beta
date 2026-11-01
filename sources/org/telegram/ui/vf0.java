package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vf0 implements Runnable {
    public final int f42521a;
    public final ig0 f42522b;
    public final TLRPC.TL_chatInviteExported f42523c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f42524f;

    public vf0(ig0 ig0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f42521a = i10;
        this.f42522b = ig0Var;
        this.f42523c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f42524f = z10;
    }

    @Override
    public final void run() {
        switch (this.f42521a) {
            case 0:
                ig0 ig0Var = this.f42522b;
                ig0Var.getNotificationCenter().d(new vf0(ig0Var, this.f42523c, this.d, this.e, this.f42524f, 1));
                return;
            default:
                ig0.Z(this.f42522b, this.f42523c, this.d, this.e, this.f42524f);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class se0 implements Runnable {
    public final int f52002a;
    public final ff0 f52003b;
    public final TLRPC.TL_chatInviteExported f52004c;
    public final TLRPC.TL_error d;
    public final TLObject f52005e;
    public final boolean f52006f;

    public se0(ff0 ff0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i7) {
        this.f52002a = i7;
        this.f52003b = ff0Var;
        this.f52004c = tL_chatInviteExported;
        this.d = tL_error;
        this.f52005e = tLObject;
        this.f52006f = z10;
    }

    @Override
    public final void run() {
        switch (this.f52002a) {
            case 0:
                ff0 ff0Var = this.f52003b;
                ff0Var.getNotificationCenter().d(new se0(ff0Var, this.f52004c, this.d, this.f52005e, this.f52006f, 1));
                return;
            default:
                ff0.Z(this.f52003b, this.f52004c, this.d, this.f52005e, this.f52006f);
                return;
        }
    }
}

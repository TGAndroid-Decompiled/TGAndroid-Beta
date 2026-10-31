package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xf0 implements Runnable {
    public final int f43572a;
    public final kg0 f43573b;
    public final TLRPC.TL_chatInviteExported f43574c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f43575f;

    public xf0(kg0 kg0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f43572a = i10;
        this.f43573b = kg0Var;
        this.f43574c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f43575f = z10;
    }

    @Override
    public final void run() {
        switch (this.f43572a) {
            case 0:
                kg0 kg0Var = this.f43573b;
                kg0Var.getNotificationCenter().d(new xf0(kg0Var, this.f43574c, this.d, this.e, this.f43575f, 1));
                return;
            default:
                kg0.Y(this.f43573b, this.f43574c, this.d, this.e, this.f43575f);
                return;
        }
    }
}

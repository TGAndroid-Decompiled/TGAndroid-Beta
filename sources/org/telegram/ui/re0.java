package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class re0 implements Runnable {
    public final int f49482a;
    public final cf0 f49483b;
    public final TLRPC.TL_error f49484c;
    public final TLObject d;

    public re0(cf0 cf0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f49482a = i7;
        this.f49483b = cf0Var;
        this.f49484c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f49482a) {
            case 0:
                cf0 cf0Var = this.f49483b;
                cf0Var.getNotificationCenter().d(new re0(cf0Var, this.f49484c, this.d, 1));
                return;
            default:
                cf0.a0(this.f49483b, this.f49484c, this.d);
                return;
        }
    }
}

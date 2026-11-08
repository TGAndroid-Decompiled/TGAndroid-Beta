package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class re0 implements Runnable {
    public final int f49480a;
    public final cf0 f49481b;
    public final TLRPC.TL_error f49482c;
    public final TLObject d;

    public re0(cf0 cf0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f49480a = i7;
        this.f49481b = cf0Var;
        this.f49482c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f49480a) {
            case 0:
                cf0 cf0Var = this.f49481b;
                cf0Var.getNotificationCenter().d(new re0(cf0Var, this.f49482c, this.d, 1));
                return;
            default:
                cf0.a0(this.f49481b, this.f49482c, this.d);
                return;
        }
    }
}

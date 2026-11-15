package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class re0 implements Runnable {
    public final int f50938a;
    public final cf0 f50939b;
    public final TLRPC.TL_error f50940c;
    public final TLObject d;

    public re0(cf0 cf0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f50938a = i7;
        this.f50939b = cf0Var;
        this.f50940c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f50938a) {
            case 0:
                cf0 cf0Var = this.f50939b;
                cf0Var.getNotificationCenter().d(new re0(cf0Var, this.f50940c, this.d, 1));
                return;
            default:
                cf0.a0(this.f50939b, this.f50940c, this.d);
                return;
        }
    }
}

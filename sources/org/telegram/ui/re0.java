package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class re0 implements Runnable {
    public final int f49501a;
    public final cf0 f49502b;
    public final TLRPC.TL_error f49503c;
    public final TLObject d;

    public re0(cf0 cf0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f49501a = i7;
        this.f49502b = cf0Var;
        this.f49503c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f49501a) {
            case 0:
                cf0 cf0Var = this.f49502b;
                cf0Var.getNotificationCenter().d(new re0(cf0Var, this.f49503c, this.d, 1));
                return;
            default:
                cf0.a0(this.f49502b, this.f49503c, this.d);
                return;
        }
    }
}

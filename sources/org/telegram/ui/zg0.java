package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zg0 implements Runnable {
    public final int f44140a;
    public final mh0 f44141b;
    public final TLRPC.TL_error f44142c;
    public final TLObject d;

    public zg0(mh0 mh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f44140a = i10;
        this.f44141b = mh0Var;
        this.f44142c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f44140a) {
            case 0:
                mh0 mh0Var = this.f44141b;
                mh0Var.getNotificationCenter().doOnIdle(new zg0(mh0Var, this.f44142c, this.d, 1));
                return;
            default:
                mh0.V(this.f44141b, this.f44142c, this.d);
                return;
        }
    }
}

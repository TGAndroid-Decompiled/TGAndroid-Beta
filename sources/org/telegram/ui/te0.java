package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class te0 implements Runnable {
    public final int f52377a;
    public final ef0 f52378b;
    public final TLRPC.TL_error f52379c;
    public final TLObject d;

    public te0(ef0 ef0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f52377a = i7;
        this.f52378b = ef0Var;
        this.f52379c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f52377a) {
            case 0:
                ef0 ef0Var = this.f52378b;
                ef0Var.getNotificationCenter().d(new te0(ef0Var, this.f52379c, this.d, 1));
                return;
            default:
                ef0.a0(this.f52378b, this.f52379c, this.d);
                return;
        }
    }
}

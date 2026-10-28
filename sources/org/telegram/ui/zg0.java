package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zg0 implements Runnable {
    public final int f46269a;
    public final lh0 f46270b;
    public final TLRPC.TL_error f46271c;
    public final TLObject d;

    public zg0(lh0 lh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f46269a = i10;
        this.f46270b = lh0Var;
        this.f46271c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f46269a) {
            case 0:
                lh0 lh0Var = this.f46270b;
                lh0Var.getNotificationCenter().doOnIdle(new zg0(lh0Var, this.f46271c, this.d, 1));
                return;
            default:
                lh0.W(this.f46270b, this.f46271c, this.d);
                return;
        }
    }
}

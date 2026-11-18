package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ue0 implements Runnable {
    public final int f52542a;
    public final gf0 f52543b;
    public final TLRPC.TL_error f52544c;
    public final TLObject d;

    public ue0(gf0 gf0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f52542a = i7;
        this.f52543b = gf0Var;
        this.f52544c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f52542a) {
            case 0:
                gf0 gf0Var = this.f52543b;
                gf0Var.getNotificationCenter().d(new ue0(gf0Var, this.f52544c, this.d, 1));
                return;
            default:
                gf0.a0(this.f52543b, this.f52544c, this.d);
                return;
        }
    }
}

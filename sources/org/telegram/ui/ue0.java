package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ue0 implements Runnable {
    public final int f50484a;
    public final ff0 f50485b;
    public final TLRPC.TL_error f50486c;
    public final TLObject d;

    public ue0(ff0 ff0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f50484a = i7;
        this.f50485b = ff0Var;
        this.f50486c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f50484a) {
            case 0:
                ff0 ff0Var = this.f50485b;
                ff0Var.getNotificationCenter().d(new ue0(ff0Var, this.f50486c, this.d, 1));
                return;
            default:
                ff0.a0(this.f50485b, this.f50486c, this.d);
                return;
        }
    }
}

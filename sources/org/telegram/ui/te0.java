package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class te0 implements Runnable {
    public final int f50172a;
    public final ef0 f50173b;
    public final TLRPC.TL_error f50174c;
    public final TLObject d;

    public te0(ef0 ef0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f50172a = i7;
        this.f50173b = ef0Var;
        this.f50174c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f50172a) {
            case 0:
                ef0 ef0Var = this.f50173b;
                ef0Var.getNotificationCenter().d(new te0(ef0Var, this.f50174c, this.d, 1));
                return;
            default:
                ef0.a0(this.f50173b, this.f50174c, this.d);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ue0 implements Runnable {
    public final int f52556a;
    public final ff0 f52557b;
    public final TLRPC.TL_error f52558c;
    public final TLObject d;

    public ue0(ff0 ff0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f52556a = i7;
        this.f52557b = ff0Var;
        this.f52558c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f52556a) {
            case 0:
                ff0 ff0Var = this.f52557b;
                ff0Var.getNotificationCenter().d(new ue0(ff0Var, this.f52558c, this.d, 1));
                return;
            default:
                ff0.a0(this.f52557b, this.f52558c, this.d);
                return;
        }
    }
}

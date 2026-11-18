package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class te0 implements Runnable {
    public final int f52273a;
    public final ff0 f52274b;
    public final TLRPC.TL_error f52275c;
    public final TLObject d;

    public te0(ff0 ff0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f52273a = i7;
        this.f52274b = ff0Var;
        this.f52275c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f52273a) {
            case 0:
                ff0 ff0Var = this.f52274b;
                ff0Var.getNotificationCenter().d(new te0(ff0Var, this.f52275c, this.d, 1));
                return;
            default:
                ff0.a0(this.f52274b, this.f52275c, this.d);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class te0 implements Runnable {
    public final int f52267a;
    public final ff0 f52268b;
    public final TLRPC.TL_error f52269c;
    public final TLObject d;

    public te0(ff0 ff0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f52267a = i7;
        this.f52268b = ff0Var;
        this.f52269c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f52267a) {
            case 0:
                ff0 ff0Var = this.f52268b;
                ff0Var.getNotificationCenter().d(new te0(ff0Var, this.f52269c, this.d, 1));
                return;
            default:
                ff0.a0(this.f52268b, this.f52269c, this.d);
                return;
        }
    }
}

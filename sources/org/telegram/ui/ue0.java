package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ue0 implements Runnable {
    public final int f52560a;
    public final ff0 f52561b;
    public final TLRPC.TL_error f52562c;
    public final TLObject d;

    public ue0(ff0 ff0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f52560a = i7;
        this.f52561b = ff0Var;
        this.f52562c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f52560a) {
            case 0:
                ff0 ff0Var = this.f52561b;
                ff0Var.getNotificationCenter().d(new ue0(ff0Var, this.f52562c, this.d, 1));
                return;
            default:
                ff0.a0(this.f52561b, this.f52562c, this.d);
                return;
        }
    }
}

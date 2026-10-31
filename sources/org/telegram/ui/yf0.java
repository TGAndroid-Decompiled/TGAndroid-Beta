package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yf0 implements Runnable {
    public final int f43829a;
    public final kg0 f43830b;
    public final TLRPC.TL_error f43831c;
    public final TLObject d;

    public yf0(kg0 kg0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f43829a = i10;
        this.f43830b = kg0Var;
        this.f43831c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f43829a) {
            case 0:
                kg0 kg0Var = this.f43830b;
                kg0Var.getNotificationCenter().d(new yf0(kg0Var, this.f43831c, this.d, 1));
                return;
            default:
                kg0.Z(this.f43830b, this.f43831c, this.d);
                return;
        }
    }
}

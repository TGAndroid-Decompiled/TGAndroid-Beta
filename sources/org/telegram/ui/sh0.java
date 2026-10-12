package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sh0 implements Runnable {
    public final int f40143a;
    public final ei0 f40144b;
    public final TLRPC.TL_error f40145c;
    public final TLObject d;

    public sh0(ei0 ei0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f40143a = i10;
        this.f40144b = ei0Var;
        this.f40145c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f40143a) {
            case 0:
                ei0 ei0Var = this.f40144b;
                ei0Var.getNotificationCenter().doOnIdle(new sh0(ei0Var, this.f40145c, this.d, 1));
                return;
            default:
                ei0.V(this.f40144b, this.f40145c, this.d);
                return;
        }
    }
}

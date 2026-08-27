package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class yg0 implements Runnable {

    public final int f44816a;

    public final kh0 f44817b;

    public final TLRPC.TL_error f44818c;
    public final TLObject d;

    public yg0(kh0 kh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f44816a = i10;
        this.f44817b = kh0Var;
        this.f44818c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f44816a) {
            case 0:
                kh0 kh0Var = this.f44817b;
                kh0Var.getNotificationCenter().doOnIdle(new yg0(kh0Var, this.f44818c, this.d, 1));
                break;
            default:
                kh0.V(this.f44817b, this.f44818c, this.d);
                break;
        }
    }
}

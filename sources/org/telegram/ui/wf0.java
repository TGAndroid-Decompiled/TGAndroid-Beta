package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wf0 implements Runnable {
    public final int f43099a;
    public final ig0 f43100b;
    public final TLRPC.TL_error f43101c;
    public final TLObject d;

    public wf0(ig0 ig0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f43099a = i10;
        this.f43100b = ig0Var;
        this.f43101c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f43099a) {
            case 0:
                ig0 ig0Var = this.f43100b;
                ig0Var.getNotificationCenter().d(new wf0(ig0Var, this.f43101c, this.d, 1));
                return;
            default:
                ig0.a0(this.f43100b, this.f43101c, this.d);
                return;
        }
    }
}

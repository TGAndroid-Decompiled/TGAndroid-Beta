package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class th implements Runnable {
    public final int f37652a = 0;
    public final xn f37653b;
    public final TLRPC.TL_error f37654c;
    public final TLRPC.TL_attachMenuBot d;
    public final TLRPC.User e;

    public th(xn xnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f37653b = xnVar;
        this.d = tL_attachMenuBot;
        this.f37654c = tL_error;
        this.e = user;
    }

    @Override
    public final void run() {
        switch (this.f37652a) {
            case 0:
                xn.w1(this.f37653b, this.d, this.f37654c, this.e);
                return;
            default:
                xn.W(this.f37653b, this.d, this.f37654c, this.e);
                return;
        }
    }

    public th(xn xnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f37653b = xnVar;
        this.f37654c = tL_error;
        this.d = tL_attachMenuBot;
        this.e = user;
    }
}

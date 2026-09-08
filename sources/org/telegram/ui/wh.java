package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wh implements Runnable {
    public final int f42417a = 0;
    public final co f42418b;
    public final TLRPC.TL_error f42419c;
    public final TLRPC.TL_attachMenuBot d;
    public final TLRPC.User f42420e;

    public wh(co coVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f42418b = coVar;
        this.d = tL_attachMenuBot;
        this.f42419c = tL_error;
        this.f42420e = user;
    }

    @Override
    public final void run() {
        switch (this.f42417a) {
            case 0:
                co.w1(this.f42418b, this.d, this.f42419c, this.f42420e);
                return;
            default:
                co.W(this.f42418b, this.d, this.f42419c, this.f42420e);
                return;
        }
    }

    public wh(co coVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f42418b = coVar;
        this.f42419c = tL_error;
        this.d = tL_attachMenuBot;
        this.f42420e = user;
    }
}

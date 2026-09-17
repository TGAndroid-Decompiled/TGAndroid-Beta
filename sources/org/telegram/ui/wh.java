package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wh implements Runnable {
    public final int f42418a = 0;
    public final co f42419b;
    public final TLRPC.TL_error f42420c;
    public final TLRPC.TL_attachMenuBot d;
    public final TLRPC.User f42421e;

    public wh(co coVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f42419b = coVar;
        this.d = tL_attachMenuBot;
        this.f42420c = tL_error;
        this.f42421e = user;
    }

    @Override
    public final void run() {
        switch (this.f42418a) {
            case 0:
                co.w1(this.f42419b, this.d, this.f42420c, this.f42421e);
                return;
            default:
                co.W(this.f42419b, this.d, this.f42420c, this.f42421e);
                return;
        }
    }

    public wh(co coVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f42419b = coVar;
        this.f42420c = tL_error;
        this.d = tL_attachMenuBot;
        this.f42421e = user;
    }
}

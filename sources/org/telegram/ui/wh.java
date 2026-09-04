package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wh implements Runnable {
    public final int f42390a = 0;
    public final co f42391b;
    public final TLRPC.TL_error f42392c;
    public final TLRPC.TL_attachMenuBot d;
    public final TLRPC.User f42393e;

    public wh(co coVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f42391b = coVar;
        this.d = tL_attachMenuBot;
        this.f42392c = tL_error;
        this.f42393e = user;
    }

    @Override
    public final void run() {
        switch (this.f42390a) {
            case 0:
                co.w1(this.f42391b, this.d, this.f42392c, this.f42393e);
                return;
            default:
                co.W(this.f42391b, this.d, this.f42392c, this.f42393e);
                return;
        }
    }

    public wh(co coVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f42391b = coVar;
        this.f42392c = tL_error;
        this.d = tL_attachMenuBot;
        this.f42393e = user;
    }
}

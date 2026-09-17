package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wh implements Runnable {
    public final int f42391a = 0;
    public final co f42392b;
    public final TLRPC.TL_error f42393c;
    public final TLRPC.TL_attachMenuBot d;
    public final TLRPC.User f42394e;

    public wh(co coVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f42392b = coVar;
        this.d = tL_attachMenuBot;
        this.f42393c = tL_error;
        this.f42394e = user;
    }

    @Override
    public final void run() {
        switch (this.f42391a) {
            case 0:
                co.w1(this.f42392b, this.d, this.f42393c, this.f42394e);
                return;
            default:
                co.W(this.f42392b, this.d, this.f42393c, this.f42394e);
                return;
        }
    }

    public wh(co coVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f42392b = coVar;
        this.f42393c = tL_error;
        this.d = tL_attachMenuBot;
        this.f42394e = user;
    }
}

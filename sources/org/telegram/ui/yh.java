package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yh implements Runnable {
    public final int f38999a = 0;
    public final eo f39000b;
    public final TLRPC.TL_error f39001c;
    public final TLRPC.TL_attachMenuBot d;
    public final TLRPC.User e;

    public yh(eo eoVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f39000b = eoVar;
        this.d = tL_attachMenuBot;
        this.f39001c = tL_error;
        this.e = user;
    }

    @Override
    public final void run() {
        switch (this.f38999a) {
            case 0:
                eo.w1(this.f39000b, this.d, this.f39001c, this.e);
                return;
            default:
                eo.W(this.f39000b, this.d, this.f39001c, this.e);
                return;
        }
    }

    public yh(eo eoVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f39000b = eoVar;
        this.f39001c = tL_error;
        this.d = tL_attachMenuBot;
        this.e = user;
    }
}

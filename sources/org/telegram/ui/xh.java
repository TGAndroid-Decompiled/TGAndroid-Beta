package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class xh implements Runnable {
    public final int f43961a = 1;
    public final eo f43962b;
    public final TLRPC.TL_attachMenuBot f43963c;
    public final TLRPC.TL_error d;
    public final TLRPC.User f43964e;

    public xh(eo eoVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f43962b = eoVar;
        this.f43963c = tL_attachMenuBot;
        this.d = tL_error;
        this.f43964e = user;
    }

    @Override
    public final void run() {
        switch (this.f43961a) {
            case 0:
                eo.N0(this.f43962b, this.f43963c, this.d, this.f43964e);
                return;
            default:
                eo.Z0(this.f43962b, this.f43963c, this.d, this.f43964e);
                return;
        }
    }

    public xh(eo eoVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f43962b = eoVar;
        this.d = tL_error;
        this.f43963c = tL_attachMenuBot;
        this.f43964e = user;
    }
}

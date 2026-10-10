package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class th implements Runnable {
    public final int f42053a = 1;
    public final zn f42054b;
    public final TLRPC.TL_attachMenuBot f42055c;
    public final TLRPC.TL_error d;
    public final TLRPC.User f42056e;

    public th(zn znVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f42054b = znVar;
        this.f42055c = tL_attachMenuBot;
        this.d = tL_error;
        this.f42056e = user;
    }

    @Override
    public final void run() {
        switch (this.f42053a) {
            case 0:
                zn.N0(this.f42054b, this.f42055c, this.d, this.f42056e);
                return;
            default:
                zn.Z0(this.f42054b, this.f42055c, this.d, this.f42056e);
                return;
        }
    }

    public th(zn znVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f42054b = znVar;
        this.d = tL_error;
        this.f42055c = tL_attachMenuBot;
        this.f42056e = user;
    }
}

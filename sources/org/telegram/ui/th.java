package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class th implements Runnable {
    public final int f42186a = 1;
    public final zn f42187b;
    public final TLRPC.TL_attachMenuBot f42188c;
    public final TLRPC.TL_error d;
    public final TLRPC.User f42189e;

    public th(zn znVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f42187b = znVar;
        this.f42188c = tL_attachMenuBot;
        this.d = tL_error;
        this.f42189e = user;
    }

    @Override
    public final void run() {
        switch (this.f42186a) {
            case 0:
                zn.N0(this.f42187b, this.f42188c, this.d, this.f42189e);
                return;
            default:
                zn.Z0(this.f42187b, this.f42188c, this.d, this.f42189e);
                return;
        }
    }

    public th(zn znVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f42187b = znVar;
        this.d = tL_error;
        this.f42188c = tL_attachMenuBot;
        this.f42189e = user;
    }
}

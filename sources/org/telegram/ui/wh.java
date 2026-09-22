package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wh implements Runnable {
    public final int f39170a = 1;
    public final zn f39171b;
    public final TLRPC.TL_attachMenuBot f39172c;
    public final TLRPC.TL_error d;
    public final TLRPC.User e;

    public wh(zn znVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f39171b = znVar;
        this.f39172c = tL_attachMenuBot;
        this.d = tL_error;
        this.e = user;
    }

    @Override
    public final void run() {
        switch (this.f39170a) {
            case 0:
                zn.Y0(this.f39171b, this.f39172c, this.d, this.e);
                return;
            default:
                zn.L0(this.f39171b, this.f39172c, this.d, this.e);
                return;
        }
    }

    public wh(zn znVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f39171b = znVar;
        this.d = tL_error;
        this.f39172c = tL_attachMenuBot;
        this.e = user;
    }
}

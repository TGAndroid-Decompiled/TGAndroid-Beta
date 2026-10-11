package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class th implements Runnable {
    public final int f42220a = 1;
    public final zn f42221b;
    public final TLRPC.TL_attachMenuBot f42222c;
    public final TLRPC.TL_error d;
    public final TLRPC.User f42223e;

    public th(zn znVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f42221b = znVar;
        this.f42222c = tL_attachMenuBot;
        this.d = tL_error;
        this.f42223e = user;
    }

    @Override
    public final void run() {
        switch (this.f42220a) {
            case 0:
                zn.N0(this.f42221b, this.f42222c, this.d, this.f42223e);
                return;
            default:
                zn.Z0(this.f42221b, this.f42222c, this.d, this.f42223e);
                return;
        }
    }

    public th(zn znVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f42221b = znVar;
        this.d = tL_error;
        this.f42222c = tL_attachMenuBot;
        this.f42223e = user;
    }
}

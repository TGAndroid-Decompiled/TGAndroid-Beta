package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class vh implements Runnable {
    public final int f38579a = 1;
    public final xn f38580b;
    public final TLRPC.TL_attachMenuBot f38581c;
    public final TLRPC.TL_error d;
    public final TLRPC.User e;

    public vh(xn xnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f38580b = xnVar;
        this.f38581c = tL_attachMenuBot;
        this.d = tL_error;
        this.e = user;
    }

    @Override
    public final void run() {
        switch (this.f38579a) {
            case 0:
                xn.Y0(this.f38580b, this.f38581c, this.d, this.e);
                return;
            default:
                xn.K0(this.f38580b, this.f38581c, this.d, this.e);
                return;
        }
    }

    public vh(xn xnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f38580b = xnVar;
        this.d = tL_error;
        this.f38581c = tL_attachMenuBot;
        this.e = user;
    }
}

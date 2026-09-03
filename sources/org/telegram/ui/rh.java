package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rh implements Runnable {
    public final int f37839a = 0;
    public final zn f37840b;
    public final TLRPC.TL_error f37841c;
    public final TLRPC.TL_attachMenuBot d;
    public final TLRPC.User e;

    public rh(zn znVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f37840b = znVar;
        this.d = tL_attachMenuBot;
        this.f37841c = tL_error;
        this.e = user;
    }

    @Override
    public final void run() {
        switch (this.f37839a) {
            case 0:
                zn.w1(this.f37840b, this.d, this.f37841c, this.e);
                return;
            default:
                zn.W(this.f37840b, this.d, this.f37841c, this.e);
                return;
        }
    }

    public rh(zn znVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f37840b = znVar;
        this.f37841c = tL_error;
        this.d = tL_attachMenuBot;
        this.e = user;
    }
}

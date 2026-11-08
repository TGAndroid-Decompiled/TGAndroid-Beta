package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class zg implements Runnable {
    public final int f52581a = 1;
    public final an f52582b;
    public final TLRPC.TL_attachMenuBot f52583c;
    public final TLRPC.TL_error d;
    public final TLRPC.User f52584e;

    public zg(an anVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f52582b = anVar;
        this.f52583c = tL_attachMenuBot;
        this.d = tL_error;
        this.f52584e = user;
    }

    @Override
    public final void run() {
        switch (this.f52581a) {
            case 0:
                an.i0(this.f52582b, this.f52583c, this.d, this.f52584e);
                return;
            default:
                an.t0(this.f52582b, this.f52583c, this.d, this.f52584e);
                return;
        }
    }

    public zg(an anVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f52582b = anVar;
        this.d = tL_error;
        this.f52583c = tL_attachMenuBot;
        this.f52584e = user;
    }
}

package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class zg implements Runnable {
    public final int f52579a = 1;
    public final an f52580b;
    public final TLRPC.TL_attachMenuBot f52581c;
    public final TLRPC.TL_error d;
    public final TLRPC.User f52582e;

    public zg(an anVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f52580b = anVar;
        this.f52581c = tL_attachMenuBot;
        this.d = tL_error;
        this.f52582e = user;
    }

    @Override
    public final void run() {
        switch (this.f52579a) {
            case 0:
                an.i0(this.f52580b, this.f52581c, this.d, this.f52582e);
                return;
            default:
                an.t0(this.f52580b, this.f52581c, this.d, this.f52582e);
                return;
        }
    }

    public zg(an anVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f52580b = anVar;
        this.d = tL_error;
        this.f52581c = tL_attachMenuBot;
        this.f52582e = user;
    }
}

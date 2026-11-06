package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class zg implements Runnable {
    public final int f52577a = 1;
    public final an f52578b;
    public final TLRPC.TL_attachMenuBot f52579c;
    public final TLRPC.TL_error d;
    public final TLRPC.User f52580e;

    public zg(an anVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f52578b = anVar;
        this.f52579c = tL_attachMenuBot;
        this.d = tL_error;
        this.f52580e = user;
    }

    @Override
    public final void run() {
        switch (this.f52577a) {
            case 0:
                an.i0(this.f52578b, this.f52579c, this.d, this.f52580e);
                return;
            default:
                an.t0(this.f52578b, this.f52579c, this.d, this.f52580e);
                return;
        }
    }

    public zg(an anVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f52578b = anVar;
        this.d = tL_error;
        this.f52579c = tL_attachMenuBot;
        this.f52580e = user;
    }
}

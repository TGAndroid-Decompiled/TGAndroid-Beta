package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sh implements Runnable {
    public final int f37765a = 1;
    public final wn f37766b;
    public final TLRPC.TL_attachMenuBot f37767c;
    public final TLRPC.TL_error d;
    public final TLRPC.User e;

    public sh(wn wnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f37766b = wnVar;
        this.f37767c = tL_attachMenuBot;
        this.d = tL_error;
        this.e = user;
    }

    @Override
    public final void run() {
        switch (this.f37765a) {
            case 0:
                wn.Y0(this.f37766b, this.f37767c, this.d, this.e);
                return;
            default:
                wn.K0(this.f37766b, this.f37767c, this.d, this.e);
                return;
        }
    }

    public sh(wn wnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f37766b = wnVar;
        this.d = tL_error;
        this.f37767c = tL_attachMenuBot;
        this.e = user;
    }
}

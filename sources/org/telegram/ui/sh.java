package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sh implements Runnable {
    public final int f37750a = 1;
    public final wn f37751b;
    public final TLRPC.TL_attachMenuBot f37752c;
    public final TLRPC.TL_error d;
    public final TLRPC.User e;

    public sh(wn wnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f37751b = wnVar;
        this.f37752c = tL_attachMenuBot;
        this.d = tL_error;
        this.e = user;
    }

    @Override
    public final void run() {
        switch (this.f37750a) {
            case 0:
                wn.Y0(this.f37751b, this.f37752c, this.d, this.e);
                return;
            default:
                wn.K0(this.f37751b, this.f37752c, this.d, this.e);
                return;
        }
    }

    public sh(wn wnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f37751b = wnVar;
        this.d = tL_error;
        this.f37752c = tL_attachMenuBot;
        this.e = user;
    }
}

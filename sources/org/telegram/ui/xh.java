package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class xh implements Runnable {
    public final int f43966a = 1;
    public final eo f43967b;
    public final TLRPC.TL_attachMenuBot f43968c;
    public final TLRPC.TL_error d;
    public final TLRPC.User f43969e;

    public xh(eo eoVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f43967b = eoVar;
        this.f43968c = tL_attachMenuBot;
        this.d = tL_error;
        this.f43969e = user;
    }

    @Override
    public final void run() {
        switch (this.f43966a) {
            case 0:
                eo.N0(this.f43967b, this.f43968c, this.d, this.f43969e);
                return;
            default:
                eo.Z0(this.f43967b, this.f43968c, this.d, this.f43969e);
                return;
        }
    }

    public xh(eo eoVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f43967b = eoVar;
        this.d = tL_error;
        this.f43968c = tL_attachMenuBot;
        this.f43969e = user;
    }
}

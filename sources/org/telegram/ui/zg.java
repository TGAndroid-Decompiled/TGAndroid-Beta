package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class zg implements Runnable {
    public final int f52572a = 1;
    public final an f52573b;
    public final TLRPC.TL_attachMenuBot f52574c;
    public final TLRPC.TL_error d;
    public final TLRPC.User f52575e;

    public zg(an anVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f52573b = anVar;
        this.f52574c = tL_attachMenuBot;
        this.d = tL_error;
        this.f52575e = user;
    }

    @Override
    public final void run() {
        switch (this.f52572a) {
            case 0:
                an.i0(this.f52573b, this.f52574c, this.d, this.f52575e);
                return;
            default:
                an.t0(this.f52573b, this.f52574c, this.d, this.f52575e);
                return;
        }
    }

    public zg(an anVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f52573b = anVar;
        this.d = tL_error;
        this.f52574c = tL_attachMenuBot;
        this.f52575e = user;
    }
}

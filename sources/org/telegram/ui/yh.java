package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yh implements Runnable {
    public final int f39913a = 0;
    public final bo f39914b;
    public final TLRPC.TL_error f39915c;
    public final TLRPC.TL_attachMenuBot d;
    public final TLRPC.User e;

    public yh(bo boVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f39914b = boVar;
        this.d = tL_attachMenuBot;
        this.f39915c = tL_error;
        this.e = user;
    }

    @Override
    public final void run() {
        switch (this.f39913a) {
            case 0:
                bo.w1(this.f39914b, this.d, this.f39915c, this.e);
                return;
            default:
                bo.W(this.f39914b, this.d, this.f39915c, this.e);
                return;
        }
    }

    public yh(bo boVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f39914b = boVar;
        this.f39915c = tL_error;
        this.d = tL_attachMenuBot;
        this.e = user;
    }
}

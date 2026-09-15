package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wh implements Runnable {
    public final int f39223a = 0;
    public final bo f39224b;
    public final TLRPC.TL_error f39225c;
    public final TLRPC.TL_attachMenuBot d;
    public final TLRPC.User e;

    public wh(bo boVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f39224b = boVar;
        this.d = tL_attachMenuBot;
        this.f39225c = tL_error;
        this.e = user;
    }

    @Override
    public final void run() {
        switch (this.f39223a) {
            case 0:
                bo.w1(this.f39224b, this.d, this.f39225c, this.e);
                return;
            default:
                bo.W(this.f39224b, this.d, this.f39225c, this.e);
                return;
        }
    }

    public wh(bo boVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f39224b = boVar;
        this.f39225c = tL_error;
        this.d = tL_attachMenuBot;
        this.e = user;
    }
}

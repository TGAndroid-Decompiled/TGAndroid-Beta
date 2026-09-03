package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rv implements Runnable {
    public final int f38061a;
    public final qy f38062b;
    public final TLRPC.TL_attachMenuBot f38063c;
    public final LaunchActivity d;

    public rv(qy qyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f38061a = i10;
        this.f38062b = qyVar;
        this.f38063c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f38061a) {
            case 0:
                qy.v0(this.f38062b, this.f38063c, this.d);
                return;
            default:
                qy.w0(this.f38062b, this.f38063c, this.d);
                return;
        }
    }
}

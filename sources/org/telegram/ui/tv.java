package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class tv implements Runnable {
    public final int f37786a;
    public final uy f37787b;
    public final TLRPC.TL_attachMenuBot f37788c;
    public final LaunchActivity d;

    public tv(uy uyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f37786a = i10;
        this.f37787b = uyVar;
        this.f37788c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f37786a) {
            case 0:
                uy.w0(this.f37787b, this.f37788c, this.d);
                return;
            default:
                uy.x0(this.f37787b, this.f37788c, this.d);
                return;
        }
    }
}

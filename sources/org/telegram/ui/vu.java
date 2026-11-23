package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class vu implements Runnable {
    public final int f52861a;
    public final cx f52862b;
    public final TLRPC.TL_attachMenuBot f52863c;
    public final LaunchActivity d;

    public vu(cx cxVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i7) {
        this.f52861a = i7;
        this.f52862b = cxVar;
        this.f52863c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f52861a) {
            case 0:
                cx.G0(this.f52862b, this.f52863c, this.d);
                return;
            default:
                cx.t0(this.f52862b, this.f52863c, this.d);
                return;
        }
    }
}

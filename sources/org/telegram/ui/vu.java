package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class vu implements Runnable {
    public final int f52859a;
    public final cx f52860b;
    public final TLRPC.TL_attachMenuBot f52861c;
    public final LaunchActivity d;

    public vu(cx cxVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i7) {
        this.f52859a = i7;
        this.f52860b = cxVar;
        this.f52861c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f52859a) {
            case 0:
                cx.G0(this.f52860b, this.f52861c, this.d);
                return;
            default:
                cx.t0(this.f52860b, this.f52861c, this.d);
                return;
        }
    }
}

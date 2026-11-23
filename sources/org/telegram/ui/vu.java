package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class vu implements Runnable {
    public final int f52894a;
    public final cx f52895b;
    public final TLRPC.TL_attachMenuBot f52896c;
    public final LaunchActivity d;

    public vu(cx cxVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i7) {
        this.f52894a = i7;
        this.f52895b = cxVar;
        this.f52896c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f52894a) {
            case 0:
                cx.G0(this.f52895b, this.f52896c, this.d);
                return;
            default:
                cx.t0(this.f52895b, this.f52896c, this.d);
                return;
        }
    }
}

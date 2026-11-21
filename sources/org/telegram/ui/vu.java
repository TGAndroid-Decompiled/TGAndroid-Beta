package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class vu implements Runnable {
    public final int f52890a;
    public final cx f52891b;
    public final TLRPC.TL_attachMenuBot f52892c;
    public final LaunchActivity d;

    public vu(cx cxVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i7) {
        this.f52890a = i7;
        this.f52891b = cxVar;
        this.f52892c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f52890a) {
            case 0:
                cx.G0(this.f52891b, this.f52892c, this.d);
                return;
            default:
                cx.t0(this.f52891b, this.f52892c, this.d);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class vu implements Runnable {
    public final int f52849a;
    public final cx f52850b;
    public final TLRPC.TL_attachMenuBot f52851c;
    public final LaunchActivity d;

    public vu(cx cxVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i7) {
        this.f52849a = i7;
        this.f52850b = cxVar;
        this.f52851c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f52849a) {
            case 0:
                cx.G0(this.f52850b, this.f52851c, this.d);
                return;
            default:
                cx.t0(this.f52850b, this.f52851c, this.d);
                return;
        }
    }
}

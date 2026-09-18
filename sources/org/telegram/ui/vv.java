package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class vv implements Runnable {
    public final int f38510a;
    public final wy f38511b;
    public final TLRPC.TL_attachMenuBot f38512c;
    public final LaunchActivity d;

    public vv(wy wyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f38510a = i10;
        this.f38511b = wyVar;
        this.f38512c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f38510a) {
            case 0:
                wy.w0(this.f38511b, this.f38512c, this.d);
                return;
            default:
                wy.x0(this.f38511b, this.f38512c, this.d);
                return;
        }
    }
}

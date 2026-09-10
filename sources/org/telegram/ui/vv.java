package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class vv implements Runnable {
    public final int f37629a;
    public final wy f37630b;
    public final TLRPC.TL_attachMenuBot f37631c;
    public final LaunchActivity d;

    public vv(wy wyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f37629a = i10;
        this.f37630b = wyVar;
        this.f37631c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f37629a) {
            case 0:
                wy.w0(this.f37630b, this.f37631c, this.d);
                return;
            default:
                wy.x0(this.f37630b, this.f37631c, this.d);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class uu implements Runnable {
    public final int f52729a;
    public final bx f52730b;
    public final TLRPC.TL_attachMenuBot f52731c;
    public final LaunchActivity d;

    public uu(bx bxVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i7) {
        this.f52729a = i7;
        this.f52730b = bxVar;
        this.f52731c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f52729a) {
            case 0:
                bx.G0(this.f52730b, this.f52731c, this.d);
                return;
            default:
                bx.t0(this.f52730b, this.f52731c, this.d);
                return;
        }
    }
}

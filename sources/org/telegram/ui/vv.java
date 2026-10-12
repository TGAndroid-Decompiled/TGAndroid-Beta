package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class vv implements Runnable {
    public final int f42858a;
    public final vy f42859b;
    public final TLRPC.TL_attachMenuBot f42860c;
    public final LaunchActivity d;

    public vv(vy vyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f42858a = i10;
        this.f42859b = vyVar;
        this.f42860c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f42858a) {
            case 0:
                vy.r0(this.f42859b, this.f42860c, this.d);
                return;
            default:
                vy.f0(this.f42859b, this.f42860c, this.d);
                return;
        }
    }
}

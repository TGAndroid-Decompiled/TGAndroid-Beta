package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class vv implements Runnable {
    public final int f42860a;
    public final vy f42861b;
    public final TLRPC.TL_attachMenuBot f42862c;
    public final LaunchActivity d;

    public vv(vy vyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f42860a = i10;
        this.f42861b = vyVar;
        this.f42862c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f42860a) {
            case 0:
                vy.r0(this.f42861b, this.f42862c, this.d);
                return;
            default:
                vy.f0(this.f42861b, this.f42862c, this.d);
                return;
        }
    }
}

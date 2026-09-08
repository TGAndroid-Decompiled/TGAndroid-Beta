package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class uv implements Runnable {
    public final int f41247a;
    public final uy f41248b;
    public final TLRPC.TL_attachMenuBot f41249c;
    public final LaunchActivity d;

    public uv(uy uyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f41247a = i10;
        this.f41248b = uyVar;
        this.f41249c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f41247a) {
            case 0:
                uy.w0(this.f41248b, this.f41249c, this.d);
                return;
            default:
                uy.x0(this.f41248b, this.f41249c, this.d);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class uv implements Runnable {
    public final int f41220a;
    public final uy f41221b;
    public final TLRPC.TL_attachMenuBot f41222c;
    public final LaunchActivity d;

    public uv(uy uyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f41220a = i10;
        this.f41221b = uyVar;
        this.f41222c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f41220a) {
            case 0:
                uy.w0(this.f41221b, this.f41222c, this.d);
                return;
            default:
                uy.x0(this.f41221b, this.f41222c, this.d);
                return;
        }
    }
}

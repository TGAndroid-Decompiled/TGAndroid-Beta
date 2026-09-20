package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class uv implements Runnable {
    public final int f38217a;
    public final uy f38218b;
    public final TLRPC.TL_attachMenuBot f38219c;
    public final LaunchActivity d;

    public uv(uy uyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f38217a = i10;
        this.f38218b = uyVar;
        this.f38219c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f38217a) {
            case 0:
                uy.w0(this.f38218b, this.f38219c, this.d);
                return;
            default:
                uy.x0(this.f38218b, this.f38219c, this.d);
                return;
        }
    }
}

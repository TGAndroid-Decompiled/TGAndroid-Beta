package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class uv implements Runnable {
    public final int f41221a;
    public final uy f41222b;
    public final TLRPC.TL_attachMenuBot f41223c;
    public final LaunchActivity d;

    public uv(uy uyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f41221a = i10;
        this.f41222b = uyVar;
        this.f41223c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f41221a) {
            case 0:
                uy.w0(this.f41222b, this.f41223c, this.d);
                return;
            default:
                uy.x0(this.f41222b, this.f41223c, this.d);
                return;
        }
    }
}

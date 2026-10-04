package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class uv implements Runnable {
    public final int f41321a;
    public final uy f41322b;
    public final TLRPC.TL_attachMenuBot f41323c;
    public final LaunchActivity d;

    public uv(uy uyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f41321a = i10;
        this.f41322b = uyVar;
        this.f41323c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f41321a) {
            case 0:
                uy.w0(this.f41322b, this.f41323c, this.d);
                return;
            default:
                uy.x0(this.f41322b, this.f41323c, this.d);
                return;
        }
    }
}

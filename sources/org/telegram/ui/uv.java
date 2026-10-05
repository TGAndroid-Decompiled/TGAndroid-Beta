package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class uv implements Runnable {
    public final int f41363a;
    public final uy f41364b;
    public final TLRPC.TL_attachMenuBot f41365c;
    public final LaunchActivity d;

    public uv(uy uyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f41363a = i10;
        this.f41364b = uyVar;
        this.f41365c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f41363a) {
            case 0:
                uy.w0(this.f41364b, this.f41365c, this.d);
                return;
            default:
                uy.x0(this.f41364b, this.f41365c, this.d);
                return;
        }
    }
}

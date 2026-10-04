package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class uv implements Runnable {
    public final int f41320a;
    public final uy f41321b;
    public final TLRPC.TL_attachMenuBot f41322c;
    public final LaunchActivity d;

    public uv(uy uyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f41320a = i10;
        this.f41321b = uyVar;
        this.f41322c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f41320a) {
            case 0:
                uy.w0(this.f41321b, this.f41322c, this.d);
                return;
            default:
                uy.x0(this.f41321b, this.f41322c, this.d);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class uv implements Runnable {
    public final int f38238a;
    public final uy f38239b;
    public final TLRPC.TL_attachMenuBot f38240c;
    public final LaunchActivity d;

    public uv(uy uyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f38238a = i10;
        this.f38239b = uyVar;
        this.f38240c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f38238a) {
            case 0:
                uy.w0(this.f38239b, this.f38240c, this.d);
                return;
            default:
                uy.x0(this.f38239b, this.f38240c, this.d);
                return;
        }
    }
}

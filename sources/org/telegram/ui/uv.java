package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class uv implements Runnable {
    public final int f38108a;
    public final uy f38109b;
    public final TLRPC.TL_attachMenuBot f38110c;
    public final LaunchActivity d;

    public uv(uy uyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f38108a = i10;
        this.f38109b = uyVar;
        this.f38110c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f38108a) {
            case 0:
                uy.w0(this.f38109b, this.f38110c, this.d);
                return;
            default:
                uy.x0(this.f38109b, this.f38110c, this.d);
                return;
        }
    }
}

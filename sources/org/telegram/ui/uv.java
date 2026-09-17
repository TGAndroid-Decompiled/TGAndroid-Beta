package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class uv implements Runnable {
    public final int f41248a;
    public final uy f41249b;
    public final TLRPC.TL_attachMenuBot f41250c;
    public final LaunchActivity d;

    public uv(uy uyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f41248a = i10;
        this.f41249b = uyVar;
        this.f41250c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f41248a) {
            case 0:
                uy.w0(this.f41249b, this.f41250c, this.d);
                return;
            default:
                uy.x0(this.f41249b, this.f41250c, this.d);
                return;
        }
    }
}

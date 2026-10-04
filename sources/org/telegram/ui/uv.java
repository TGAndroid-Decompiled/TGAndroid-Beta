package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class uv implements Runnable {
    public final int f41328a;
    public final uy f41329b;
    public final TLRPC.TL_attachMenuBot f41330c;
    public final LaunchActivity d;

    public uv(uy uyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f41328a = i10;
        this.f41329b = uyVar;
        this.f41330c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f41328a) {
            case 0:
                uy.w0(this.f41329b, this.f41330c, this.d);
                return;
            default:
                uy.x0(this.f41329b, this.f41330c, this.d);
                return;
        }
    }
}

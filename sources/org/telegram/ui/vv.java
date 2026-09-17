package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class vv implements Runnable {
    public final int f38505a;
    public final wy f38506b;
    public final TLRPC.TL_attachMenuBot f38507c;
    public final LaunchActivity d;

    public vv(wy wyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f38505a = i10;
        this.f38506b = wyVar;
        this.f38507c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f38505a) {
            case 0:
                wy.w0(this.f38506b, this.f38507c, this.d);
                return;
            default:
                wy.x0(this.f38506b, this.f38507c, this.d);
                return;
        }
    }
}

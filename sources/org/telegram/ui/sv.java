package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sv implements Runnable {
    public final int f37582a;
    public final ty f37583b;
    public final TLRPC.TL_attachMenuBot f37584c;
    public final LaunchActivity d;

    public sv(ty tyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f37582a = i10;
        this.f37583b = tyVar;
        this.f37584c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f37582a) {
            case 0:
                ty.w0(this.f37583b, this.f37584c, this.d);
                return;
            default:
                ty.x0(this.f37583b, this.f37584c, this.d);
                return;
        }
    }
}

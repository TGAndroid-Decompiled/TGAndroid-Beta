package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sv implements Runnable {
    public final int f41773a;
    public final ty f41774b;
    public final TLRPC.TL_attachMenuBot f41775c;
    public final LaunchActivity d;

    public sv(ty tyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f41773a = i10;
        this.f41774b = tyVar;
        this.f41775c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f41773a) {
            case 0:
                ty.r0(this.f41774b, this.f41775c, this.d);
                return;
            default:
                ty.f0(this.f41774b, this.f41775c, this.d);
                return;
        }
    }
}

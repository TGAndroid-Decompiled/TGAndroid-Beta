package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sv implements Runnable {
    public final int f41775a;
    public final ty f41776b;
    public final TLRPC.TL_attachMenuBot f41777c;
    public final LaunchActivity d;

    public sv(ty tyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f41775a = i10;
        this.f41776b = tyVar;
        this.f41777c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f41775a) {
            case 0:
                ty.r0(this.f41776b, this.f41777c, this.d);
                return;
            default:
                ty.f0(this.f41776b, this.f41777c, this.d);
                return;
        }
    }
}

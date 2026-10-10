package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sv implements Runnable {
    public final int f41819a;
    public final ty f41820b;
    public final TLRPC.TL_attachMenuBot f41821c;
    public final LaunchActivity d;

    public sv(ty tyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f41819a = i10;
        this.f41820b = tyVar;
        this.f41821c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f41819a) {
            case 0:
                ty.r0(this.f41820b, this.f41821c, this.d);
                return;
            default:
                ty.f0(this.f41820b, this.f41821c, this.d);
                return;
        }
    }
}

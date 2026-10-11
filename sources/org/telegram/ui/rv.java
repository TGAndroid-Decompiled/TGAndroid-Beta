package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rv implements Runnable {
    public final int f41549a;
    public final sy f41550b;
    public final TLRPC.TL_attachMenuBot f41551c;
    public final LaunchActivity d;

    public rv(sy syVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f41549a = i10;
        this.f41550b = syVar;
        this.f41551c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f41549a) {
            case 0:
                sy.r0(this.f41550b, this.f41551c, this.d);
                return;
            default:
                sy.f0(this.f41550b, this.f41551c, this.d);
                return;
        }
    }
}

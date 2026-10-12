package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yv implements Runnable {
    public final int f42285a;
    public final yy f42286b;
    public final TLRPC.TL_attachMenuBot f42287c;
    public final LaunchActivity d;

    public yv(yy yyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f42285a = i10;
        this.f42286b = yyVar;
        this.f42287c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f42285a) {
            case 0:
                yy.r0(this.f42286b, this.f42287c, this.d);
                return;
            default:
                yy.f0(this.f42286b, this.f42287c, this.d);
                return;
        }
    }
}

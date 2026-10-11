package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rv implements Runnable {
    public final int f41515a;
    public final sy f41516b;
    public final TLRPC.TL_attachMenuBot f41517c;
    public final LaunchActivity d;

    public rv(sy syVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f41515a = i10;
        this.f41516b = syVar;
        this.f41517c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f41515a) {
            case 0:
                sy.r0(this.f41516b, this.f41517c, this.d);
                return;
            default:
                sy.f0(this.f41516b, this.f41517c, this.d);
                return;
        }
    }
}

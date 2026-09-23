package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class qv implements Runnable {
    public final int f36618a;
    public final ry f36619b;
    public final TLRPC.TL_attachMenuBot f36620c;
    public final LaunchActivity d;

    public qv(ry ryVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f36618a = i10;
        this.f36619b = ryVar;
        this.f36620c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f36618a) {
            case 0:
                ry.w0(this.f36619b, this.f36620c, this.d);
                return;
            default:
                ry.x0(this.f36619b, this.f36620c, this.d);
                return;
        }
    }
}

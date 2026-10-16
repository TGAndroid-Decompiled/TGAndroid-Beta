package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yv implements Runnable {
    public final int f41963a;
    public final yy f41964b;
    public final TLRPC.TL_attachMenuBot f41965c;
    public final LaunchActivity d;

    public yv(yy yyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f41963a = i10;
        this.f41964b = yyVar;
        this.f41965c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f41963a) {
            case 0:
                yy.i0(this.f41964b, this.f41965c, this.d);
                return;
            default:
                yy.p0(this.f41964b, this.f41965c, this.d);
                return;
        }
    }
}

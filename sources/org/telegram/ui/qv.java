package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class qv implements Runnable {
    public final int f40701a;
    public final py f40702b;
    public final TLRPC.TL_attachMenuBot f40703c;
    public final LaunchActivity d;

    public qv(py pyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f40701a = i10;
        this.f40702b = pyVar;
        this.f40703c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f40701a) {
            case 0:
                py.v0(this.f40702b, this.f40703c, this.d);
                return;
            default:
                py.w0(this.f40702b, this.f40703c, this.d);
                return;
        }
    }
}

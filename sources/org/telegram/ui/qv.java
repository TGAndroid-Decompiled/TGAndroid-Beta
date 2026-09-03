package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class qv implements Runnable {
    public final int f40695a;
    public final py f40696b;
    public final TLRPC.TL_attachMenuBot f40697c;
    public final LaunchActivity d;

    public qv(py pyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f40695a = i10;
        this.f40696b = pyVar;
        this.f40697c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f40695a) {
            case 0:
                py.v0(this.f40696b, this.f40697c, this.d);
                return;
            default:
                py.w0(this.f40696b, this.f40697c, this.d);
                return;
        }
    }
}

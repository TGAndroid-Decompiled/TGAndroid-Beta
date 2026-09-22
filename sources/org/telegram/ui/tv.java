package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class tv implements Runnable {
    public final int f37735a;
    public final uy f37736b;
    public final TLRPC.TL_attachMenuBot f37737c;
    public final LaunchActivity d;

    public tv(uy uyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.f37735a = i10;
        this.f37736b = uyVar;
        this.f37737c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.f37735a) {
            case 0:
                uy.w0(this.f37736b, this.f37737c, this.d);
                return;
            default:
                uy.x0(this.f37736b, this.f37737c, this.d);
                return;
        }
    }
}

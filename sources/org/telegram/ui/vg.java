package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class vg implements Runnable {
    public final int f50508a = 1;
    public final wm f50509b;
    public final TLRPC.TL_attachMenuBot f50510c;
    public final TLRPC.TL_error d;
    public final TLRPC.User f50511e;

    public vg(wm wmVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f50509b = wmVar;
        this.f50510c = tL_attachMenuBot;
        this.d = tL_error;
        this.f50511e = user;
    }

    @Override
    public final void run() {
        switch (this.f50508a) {
            case 0:
                wm.i0(this.f50509b, this.f50510c, this.d, this.f50511e);
                return;
            default:
                wm.t0(this.f50509b, this.f50510c, this.d, this.f50511e);
                return;
        }
    }

    public vg(wm wmVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f50509b = wmVar;
        this.d = tL_error;
        this.f50510c = tL_attachMenuBot;
        this.f50511e = user;
    }
}

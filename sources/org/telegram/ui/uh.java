package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class uh implements Runnable {
    public final int f41268a = 0;
    public final yn f41269b;
    public final TLRPC.TL_error f41270c;
    public final TLRPC.TL_attachMenuBot d;
    public final TLRPC.User f41271e;

    public uh(yn ynVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f41269b = ynVar;
        this.d = tL_attachMenuBot;
        this.f41270c = tL_error;
        this.f41271e = user;
    }

    @Override
    public final void run() {
        switch (this.f41268a) {
            case 0:
                yn.x1(this.f41269b, this.d, this.f41270c, this.f41271e);
                return;
            default:
                yn.W(this.f41269b, this.d, this.f41270c, this.f41271e);
                return;
        }
    }

    public uh(yn ynVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f41269b = ynVar;
        this.f41270c = tL_error;
        this.d = tL_attachMenuBot;
        this.f41271e = user;
    }
}

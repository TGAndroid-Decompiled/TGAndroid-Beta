package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class uh implements Runnable {
    public final int f41224a = 0;
    public final yn f41225b;
    public final TLRPC.TL_error f41226c;
    public final TLRPC.TL_attachMenuBot d;
    public final TLRPC.User f41227e;

    public uh(yn ynVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f41225b = ynVar;
        this.d = tL_attachMenuBot;
        this.f41226c = tL_error;
        this.f41227e = user;
    }

    @Override
    public final void run() {
        switch (this.f41224a) {
            case 0:
                yn.x1(this.f41225b, this.d, this.f41226c, this.f41227e);
                return;
            default:
                yn.W(this.f41225b, this.d, this.f41226c, this.f41227e);
                return;
        }
    }

    public uh(yn ynVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f41225b = ynVar;
        this.f41226c = tL_error;
        this.d = tL_attachMenuBot;
        this.f41227e = user;
    }
}

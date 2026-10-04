package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class uh implements Runnable {
    public final int f41223a = 0;
    public final yn f41224b;
    public final TLRPC.TL_error f41225c;
    public final TLRPC.TL_attachMenuBot d;
    public final TLRPC.User f41226e;

    public uh(yn ynVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f41224b = ynVar;
        this.d = tL_attachMenuBot;
        this.f41225c = tL_error;
        this.f41226e = user;
    }

    @Override
    public final void run() {
        switch (this.f41223a) {
            case 0:
                yn.x1(this.f41224b, this.d, this.f41225c, this.f41226e);
                return;
            default:
                yn.W(this.f41224b, this.d, this.f41225c, this.f41226e);
                return;
        }
    }

    public uh(yn ynVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f41224b = ynVar;
        this.f41225c = tL_error;
        this.d = tL_attachMenuBot;
        this.f41226e = user;
    }
}

package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class uh implements Runnable {
    public final int f41231a = 0;
    public final yn f41232b;
    public final TLRPC.TL_error f41233c;
    public final TLRPC.TL_attachMenuBot d;
    public final TLRPC.User f41234e;

    public uh(yn ynVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f41232b = ynVar;
        this.d = tL_attachMenuBot;
        this.f41233c = tL_error;
        this.f41234e = user;
    }

    @Override
    public final void run() {
        switch (this.f41231a) {
            case 0:
                yn.x1(this.f41232b, this.d, this.f41233c, this.f41234e);
                return;
            default:
                yn.W(this.f41232b, this.d, this.f41233c, this.f41234e);
                return;
        }
    }

    public uh(yn ynVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f41232b = ynVar;
        this.f41233c = tL_error;
        this.d = tL_attachMenuBot;
        this.f41234e = user;
    }
}

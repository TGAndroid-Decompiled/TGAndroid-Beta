package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class th implements Runnable {
    public final int f42009a = 1;
    public final zn f42010b;
    public final TLRPC.TL_attachMenuBot f42011c;
    public final TLRPC.TL_error d;
    public final TLRPC.User f42012e;

    public th(zn znVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f42010b = znVar;
        this.f42011c = tL_attachMenuBot;
        this.d = tL_error;
        this.f42012e = user;
    }

    @Override
    public final void run() {
        switch (this.f42009a) {
            case 0:
                zn.N0(this.f42010b, this.f42011c, this.d, this.f42012e);
                return;
            default:
                zn.Z0(this.f42010b, this.f42011c, this.d, this.f42012e);
                return;
        }
    }

    public th(zn znVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f42010b = znVar;
        this.d = tL_error;
        this.f42011c = tL_attachMenuBot;
        this.f42012e = user;
    }
}

package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class th implements Runnable {
    public final int f42007a = 1;
    public final zn f42008b;
    public final TLRPC.TL_attachMenuBot f42009c;
    public final TLRPC.TL_error d;
    public final TLRPC.User f42010e;

    public th(zn znVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f42008b = znVar;
        this.f42009c = tL_attachMenuBot;
        this.d = tL_error;
        this.f42010e = user;
    }

    @Override
    public final void run() {
        switch (this.f42007a) {
            case 0:
                zn.N0(this.f42008b, this.f42009c, this.d, this.f42010e);
                return;
            default:
                zn.Z0(this.f42008b, this.f42009c, this.d, this.f42010e);
                return;
        }
    }

    public th(zn znVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f42008b = znVar;
        this.d = tL_error;
        this.f42009c = tL_attachMenuBot;
        this.f42010e = user;
    }
}

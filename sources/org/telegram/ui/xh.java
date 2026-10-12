package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class xh implements Runnable {
    public final int f41859a = 1;
    public final fo f41860b;
    public final TLRPC.TL_attachMenuBot f41861c;
    public final TLRPC.TL_error d;
    public final TLRPC.User e;

    public xh(fo foVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f41860b = foVar;
        this.f41861c = tL_attachMenuBot;
        this.d = tL_error;
        this.e = user;
    }

    @Override
    public final void run() {
        switch (this.f41859a) {
            case 0:
                fo.N0(this.f41860b, this.f41861c, this.d, this.e);
                return;
            default:
                fo.Z0(this.f41860b, this.f41861c, this.d, this.e);
                return;
        }
    }

    public xh(fo foVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f41860b = foVar;
        this.d = tL_error;
        this.f41861c = tL_attachMenuBot;
        this.e = user;
    }
}

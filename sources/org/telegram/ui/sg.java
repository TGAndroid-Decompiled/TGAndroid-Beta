package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sg implements Runnable {
    public final int f40490a;
    public final yn f40491b;
    public final TLRPC.User f40492c;

    public sg(yn ynVar, TLRPC.User user, int i10) {
        this.f40490a = i10;
        this.f40491b = ynVar;
        this.f40492c = user;
    }

    @Override
    public final void run() {
        switch (this.f40490a) {
            case 0:
                yn ynVar = this.f40491b;
                ynVar.getClass();
                ynVar.presentFragment(yn.Q9(this.f40492c.f20194id));
                return;
            default:
                this.f40491b.la(this.f40492c);
                return;
        }
    }
}

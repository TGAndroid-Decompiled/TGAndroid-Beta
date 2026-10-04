package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sg implements Runnable {
    public final int f40481a;
    public final yn f40482b;
    public final TLRPC.User f40483c;

    public sg(yn ynVar, TLRPC.User user, int i10) {
        this.f40481a = i10;
        this.f40482b = ynVar;
        this.f40483c = user;
    }

    @Override
    public final void run() {
        switch (this.f40481a) {
            case 0:
                yn ynVar = this.f40482b;
                ynVar.getClass();
                ynVar.presentFragment(yn.Q9(this.f40483c.f20189id));
                return;
            default:
                this.f40482b.la(this.f40483c);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sg implements Runnable {
    public final int f40475a;
    public final yn f40476b;
    public final TLRPC.User f40477c;

    public sg(yn ynVar, TLRPC.User user, int i10) {
        this.f40475a = i10;
        this.f40476b = ynVar;
        this.f40477c = user;
    }

    @Override
    public final void run() {
        switch (this.f40475a) {
            case 0:
                yn ynVar = this.f40476b;
                ynVar.getClass();
                ynVar.presentFragment(yn.Q9(this.f40477c.f20184id));
                return;
            default:
                this.f40476b.la(this.f40477c);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sg implements Runnable {
    public final int f40476a;
    public final yn f40477b;
    public final TLRPC.User f40478c;

    public sg(yn ynVar, TLRPC.User user, int i10) {
        this.f40476a = i10;
        this.f40477b = ynVar;
        this.f40478c = user;
    }

    @Override
    public final void run() {
        switch (this.f40476a) {
            case 0:
                yn ynVar = this.f40477b;
                ynVar.getClass();
                ynVar.presentFragment(yn.Q9(this.f40478c.f20185id));
                return;
            default:
                this.f40477b.la(this.f40478c);
                return;
        }
    }
}

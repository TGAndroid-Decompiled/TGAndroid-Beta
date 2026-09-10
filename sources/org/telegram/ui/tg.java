package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class tg implements Runnable {
    public final int f36929a;
    public final eo f36930b;
    public final TLRPC.User f36931c;

    public tg(eo eoVar, TLRPC.User user, int i10) {
        this.f36929a = i10;
        this.f36930b = eoVar;
        this.f36931c = user;
    }

    @Override
    public final void run() {
        switch (this.f36929a) {
            case 0:
                eo eoVar = this.f36930b;
                eoVar.getClass();
                eoVar.presentFragment(eo.R9(this.f36931c.f17342id));
                return;
            default:
                this.f36930b.ma(this.f36931c);
                return;
        }
    }
}

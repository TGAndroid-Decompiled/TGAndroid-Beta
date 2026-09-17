package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sg implements Runnable {
    public final int f40440a;
    public final co f40441b;
    public final TLRPC.User f40442c;

    public sg(co coVar, TLRPC.User user, int i10) {
        this.f40440a = i10;
        this.f40441b = coVar;
        this.f40442c = user;
    }

    @Override
    public final void run() {
        switch (this.f40440a) {
            case 0:
                co coVar = this.f40441b;
                coVar.getClass();
                coVar.presentFragment(co.R9(this.f40442c.f20016id));
                return;
            default:
                this.f40441b.ma(this.f40442c);
                return;
        }
    }
}

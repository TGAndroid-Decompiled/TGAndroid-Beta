package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sg implements Runnable {
    public final int f40439a;
    public final co f40440b;
    public final TLRPC.User f40441c;

    public sg(co coVar, TLRPC.User user, int i10) {
        this.f40439a = i10;
        this.f40440b = coVar;
        this.f40441c = user;
    }

    @Override
    public final void run() {
        switch (this.f40439a) {
            case 0:
                co coVar = this.f40440b;
                coVar.getClass();
                coVar.presentFragment(co.R9(this.f40441c.f20016id));
                return;
            default:
                this.f40440b.ma(this.f40441c);
                return;
        }
    }
}

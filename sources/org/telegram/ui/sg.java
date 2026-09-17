package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sg implements Runnable {
    public final int f40467a;
    public final co f40468b;
    public final TLRPC.User f40469c;

    public sg(co coVar, TLRPC.User user, int i10) {
        this.f40467a = i10;
        this.f40468b = coVar;
        this.f40469c = user;
    }

    @Override
    public final void run() {
        switch (this.f40467a) {
            case 0:
                co coVar = this.f40468b;
                coVar.getClass();
                coVar.presentFragment(co.R9(this.f40469c.f20043id));
                return;
            default:
                this.f40468b.ma(this.f40469c);
                return;
        }
    }
}

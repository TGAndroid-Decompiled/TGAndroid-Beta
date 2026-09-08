package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sg implements Runnable {
    public final int f40466a;
    public final co f40467b;
    public final TLRPC.User f40468c;

    public sg(co coVar, TLRPC.User user, int i10) {
        this.f40466a = i10;
        this.f40467b = coVar;
        this.f40468c = user;
    }

    @Override
    public final void run() {
        switch (this.f40466a) {
            case 0:
                co coVar = this.f40467b;
                coVar.getClass();
                coVar.presentFragment(co.R9(this.f40468c.f20043id));
                return;
            default:
                this.f40467b.ma(this.f40468c);
                return;
        }
    }
}

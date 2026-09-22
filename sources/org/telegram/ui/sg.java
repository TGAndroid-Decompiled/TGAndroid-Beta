package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sg implements Runnable {
    public final int f37392a;
    public final bo f37393b;
    public final TLRPC.User f37394c;

    public sg(bo boVar, TLRPC.User user, int i10) {
        this.f37392a = i10;
        this.f37393b = boVar;
        this.f37394c = user;
    }

    @Override
    public final void run() {
        switch (this.f37392a) {
            case 0:
                bo boVar = this.f37393b;
                boVar.getClass();
                boVar.presentFragment(bo.R9(this.f37394c.f18256id));
                return;
            default:
                this.f37393b.ma(this.f37394c);
                return;
        }
    }
}

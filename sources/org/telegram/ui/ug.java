package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ug implements Runnable {
    public final int f38073a;
    public final bo f38074b;
    public final TLRPC.User f38075c;

    public ug(bo boVar, TLRPC.User user, int i10) {
        this.f38073a = i10;
        this.f38074b = boVar;
        this.f38075c = user;
    }

    @Override
    public final void run() {
        switch (this.f38073a) {
            case 0:
                bo boVar = this.f38074b;
                boVar.getClass();
                boVar.presentFragment(bo.R9(this.f38075c.f18268id));
                return;
            default:
                this.f38074b.ma(this.f38075c);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ug implements Runnable {
    public final int f38068a;
    public final bo f38069b;
    public final TLRPC.User f38070c;

    public ug(bo boVar, TLRPC.User user, int i10) {
        this.f38068a = i10;
        this.f38069b = boVar;
        this.f38070c = user;
    }

    @Override
    public final void run() {
        switch (this.f38068a) {
            case 0:
                bo boVar = this.f38069b;
                boVar.getClass();
                boVar.presentFragment(bo.R9(this.f38070c.f18268id));
                return;
            default:
                this.f38069b.ma(this.f38070c);
                return;
        }
    }
}

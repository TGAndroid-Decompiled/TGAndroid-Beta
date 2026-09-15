package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sg implements Runnable {
    public final int f37384a;
    public final bo f37385b;
    public final TLRPC.User f37386c;

    public sg(bo boVar, TLRPC.User user, int i10) {
        this.f37384a = i10;
        this.f37385b = boVar;
        this.f37386c = user;
    }

    @Override
    public final void run() {
        switch (this.f37384a) {
            case 0:
                bo boVar = this.f37385b;
                boVar.getClass();
                boVar.presentFragment(bo.R9(this.f37386c.f18259id));
                return;
            default:
                this.f37385b.ma(this.f37386c);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yf implements Runnable {
    public final int f52209a;
    public final an f52210b;
    public final TLRPC.User f52211c;

    public yf(an anVar, TLRPC.User user, int i7) {
        this.f52209a = i7;
        this.f52210b = anVar;
        this.f52211c = user;
    }

    @Override
    public final void run() {
        switch (this.f52209a) {
            case 0:
                an anVar = this.f52210b;
                anVar.getClass();
                anVar.presentFragment(an.ra(this.f52211c.f27101id));
                return;
            default:
                this.f52210b.Ma(this.f52211c);
                return;
        }
    }
}

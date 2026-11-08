package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yf implements Runnable {
    public final int f52208a;
    public final an f52209b;
    public final TLRPC.User f52210c;

    public yf(an anVar, TLRPC.User user, int i7) {
        this.f52208a = i7;
        this.f52209b = anVar;
        this.f52210c = user;
    }

    @Override
    public final void run() {
        switch (this.f52208a) {
            case 0:
                an anVar = this.f52209b;
                anVar.getClass();
                anVar.presentFragment(an.ra(this.f52210c.f27105id));
                return;
            default:
                this.f52209b.Ma(this.f52210c);
                return;
        }
    }
}

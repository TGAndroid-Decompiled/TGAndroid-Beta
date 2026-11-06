package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yf implements Runnable {
    public final int f52230a;
    public final an f52231b;
    public final TLRPC.User f52232c;

    public yf(an anVar, TLRPC.User user, int i7) {
        this.f52230a = i7;
        this.f52231b = anVar;
        this.f52232c = user;
    }

    @Override
    public final void run() {
        switch (this.f52230a) {
            case 0:
                an anVar = this.f52231b;
                anVar.getClass();
                anVar.presentFragment(an.ra(this.f52232c.f27101id));
                return;
            default:
                this.f52231b.Ma(this.f52232c);
                return;
        }
    }
}

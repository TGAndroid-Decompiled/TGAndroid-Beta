package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yf implements Runnable {
    public final int f52228a;
    public final an f52229b;
    public final TLRPC.User f52230c;

    public yf(an anVar, TLRPC.User user, int i7) {
        this.f52228a = i7;
        this.f52229b = anVar;
        this.f52230c = user;
    }

    @Override
    public final void run() {
        switch (this.f52228a) {
            case 0:
                an anVar = this.f52229b;
                anVar.getClass();
                anVar.presentFragment(an.ra(this.f52230c.f27102id));
                return;
            default:
                this.f52229b.Ma(this.f52230c);
                return;
        }
    }
}

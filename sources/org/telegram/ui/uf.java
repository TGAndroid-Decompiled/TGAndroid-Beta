package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class uf implements Runnable {
    public final int f50073a;
    public final wm f50074b;
    public final TLRPC.User f50075c;

    public uf(wm wmVar, TLRPC.User user, int i3) {
        this.f50073a = i3;
        this.f50074b = wmVar;
        this.f50075c = user;
    }

    @Override
    public final void run() {
        switch (this.f50073a) {
            case 0:
                wm wmVar = this.f50074b;
                wmVar.getClass();
                wmVar.presentFragment(wm.ra(this.f50075c.f27150id));
                return;
            default:
                this.f50074b.Ma(this.f50075c);
                return;
        }
    }
}

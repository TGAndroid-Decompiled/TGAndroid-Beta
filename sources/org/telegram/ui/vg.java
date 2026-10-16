package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class vg implements Runnable {
    public final int f40696a;
    public final fo f40697b;
    public final TLRPC.User f40698c;

    public vg(fo foVar, TLRPC.User user, int i10) {
        this.f40696a = i10;
        this.f40697b = foVar;
        this.f40698c = user;
    }

    @Override
    public final void run() {
        switch (this.f40696a) {
            case 0:
                fo foVar = this.f40697b;
                foVar.getClass();
                foVar.presentFragment(fo.W9(this.f40698c.f19063id));
                return;
            default:
                this.f40697b.ra(this.f40698c);
                return;
        }
    }
}

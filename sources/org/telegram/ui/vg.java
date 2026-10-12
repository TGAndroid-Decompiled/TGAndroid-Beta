package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class vg implements Runnable {
    public final int f40986a;
    public final fo f40987b;
    public final TLRPC.User f40988c;

    public vg(fo foVar, TLRPC.User user, int i10) {
        this.f40986a = i10;
        this.f40987b = foVar;
        this.f40988c = user;
    }

    @Override
    public final void run() {
        switch (this.f40986a) {
            case 0:
                fo foVar = this.f40987b;
                foVar.getClass();
                foVar.presentFragment(fo.W9(this.f40988c.f19363id));
                return;
            default:
                this.f40987b.ra(this.f40988c);
                return;
        }
    }
}

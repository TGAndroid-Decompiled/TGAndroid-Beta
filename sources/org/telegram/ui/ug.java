package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ug implements Runnable {
    public final int f42513a;
    public final eo f42514b;
    public final TLRPC.User f42515c;

    public ug(eo eoVar, TLRPC.User user, int i10) {
        this.f42513a = i10;
        this.f42514b = eoVar;
        this.f42515c = user;
    }

    @Override
    public final void run() {
        switch (this.f42513a) {
            case 0:
                eo eoVar = this.f42514b;
                eoVar.getClass();
                eoVar.presentFragment(eo.W9(this.f42515c.f19949id));
                return;
            default:
                this.f42514b.ra(this.f42515c);
                return;
        }
    }
}

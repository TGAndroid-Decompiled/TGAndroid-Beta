package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ug implements Runnable {
    public final int f42515a;
    public final eo f42516b;
    public final TLRPC.User f42517c;

    public ug(eo eoVar, TLRPC.User user, int i10) {
        this.f42515a = i10;
        this.f42516b = eoVar;
        this.f42517c = user;
    }

    @Override
    public final void run() {
        switch (this.f42515a) {
            case 0:
                eo eoVar = this.f42516b;
                eoVar.getClass();
                eoVar.presentFragment(eo.W9(this.f42517c.f19950id));
                return;
            default:
                this.f42516b.ra(this.f42517c);
                return;
        }
    }
}

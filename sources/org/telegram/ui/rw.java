package org.telegram.ui;
public final class rw implements Runnable {
    public final int f49298a;
    public final int f49299b;
    public final Object f49300c;
    public final Object d;

    public rw(int i3, org.telegram.messenger.u10 u10Var, org.telegram.ui.Wallet.k0 k0Var) {
        this.f49298a = 15;
        this.f49299b = i3;
        this.f49300c = u10Var;
        this.d = k0Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rw.run():void");
    }

    public rw(Object obj, int i3, Object obj2, int i10) {
        this.f49298a = i10;
        this.f49300c = obj;
        this.f49299b = i3;
        this.d = obj2;
    }

    public rw(Object obj, Object obj2, int i3, int i10) {
        this.f49298a = i10;
        this.f49300c = obj;
        this.d = obj2;
        this.f49299b = i3;
    }
}

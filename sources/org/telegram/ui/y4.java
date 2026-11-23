package org.telegram.ui;

import org.telegram.tgnet.TLObject;
public abstract class y4 {
    public final x4 f54184a = new x4(this, 0);
    public final org.telegram.messenger.ks f54185b = org.telegram.messenger.ks.f(org.telegram.messenger.i10.f24637t0);
    public final Object f54186c;
    public final int d;
    public final int f54187e;
    public di.d7 f54188f;
    public boolean f54189g;

    public y4(int i7, int i10, TLObject tLObject) {
        this.f54186c = tLObject;
        this.d = i7;
        this.f54187e = i10;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}

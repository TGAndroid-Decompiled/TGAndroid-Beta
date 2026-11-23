package org.telegram.ui;

import org.telegram.tgnet.TLObject;
public abstract class y4 {
    public final x4 f54010a = new x4(this, 0);
    public final org.telegram.messenger.ls f54011b = org.telegram.messenger.ls.f(org.telegram.messenger.k10.f24932t0);
    public final Object f54012c;
    public final int d;
    public final int f54013e;
    public di.d7 f54014f;
    public boolean f54015g;

    public y4(int i7, int i10, TLObject tLObject) {
        this.f54012c = tLObject;
        this.d = i7;
        this.f54013e = i10;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}

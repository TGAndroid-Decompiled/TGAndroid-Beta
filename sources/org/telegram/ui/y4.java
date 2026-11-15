package org.telegram.ui;

import org.telegram.tgnet.TLObject;
public abstract class y4 {
    public final x4 f53408a = new x4(this, 0);
    public final org.telegram.messenger.ns f53409b = org.telegram.messenger.ns.f(org.telegram.messenger.m10.f24940t0);
    public final Object f53410c;
    public final int d;
    public final int f53411e;
    public di.a7 f53412f;
    public boolean f53413g;

    public y4(int i7, int i10, TLObject tLObject) {
        this.f53410c = tLObject;
        this.d = i7;
        this.f53411e = i10;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}

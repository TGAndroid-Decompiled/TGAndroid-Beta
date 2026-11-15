package org.telegram.ui;

import org.telegram.tgnet.TLObject;
public abstract class y4 {
    public final x4 f53404a = new x4(this, 0);
    public final org.telegram.messenger.ns f53405b = org.telegram.messenger.ns.f(org.telegram.messenger.m10.f24934t0);
    public final Object f53406c;
    public final int d;
    public final int f53407e;
    public di.a7 f53408f;
    public boolean f53409g;

    public y4(int i7, int i10, TLObject tLObject) {
        this.f53406c = tLObject;
        this.d = i7;
        this.f53407e = i10;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}

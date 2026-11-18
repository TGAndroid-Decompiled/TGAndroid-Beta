package org.telegram.ui;

import org.telegram.tgnet.TLObject;
public abstract class y4 {
    public final x4 f54017a = new x4(this, 0);
    public final org.telegram.messenger.ks f54018b = org.telegram.messenger.ks.f(org.telegram.messenger.j10.f24773t0);
    public final Object f54019c;
    public final int d;
    public final int f54020e;
    public di.d7 f54021f;
    public boolean f54022g;

    public y4(int i7, int i10, TLObject tLObject) {
        this.f54019c = tLObject;
        this.d = i7;
        this.f54020e = i10;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}

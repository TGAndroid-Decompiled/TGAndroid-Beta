package org.telegram.ui;

import org.telegram.tgnet.TLObject;
public abstract class y4 {
    public final x4 f53985a = new x4(this, 0);
    public final org.telegram.messenger.ks f53986b = org.telegram.messenger.ks.f(org.telegram.messenger.j10.f24770t0);
    public final Object f53987c;
    public final int d;
    public final int f53988e;
    public di.d7 f53989f;
    public boolean f53990g;

    public y4(int i7, int i10, TLObject tLObject) {
        this.f53987c = tLObject;
        this.d = i7;
        this.f53988e = i10;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}

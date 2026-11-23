package org.telegram.ui;

import org.telegram.tgnet.TLObject;
public abstract class y4 {
    public final x4 f54036a = new x4(this, 0);
    public final org.telegram.messenger.ls f54037b = org.telegram.messenger.ls.f(org.telegram.messenger.k10.f24968t0);
    public final Object f54038c;
    public final int d;
    public final int f54039e;
    public di.d7 f54040f;
    public boolean f54041g;

    public y4(int i7, int i10, TLObject tLObject) {
        this.f54038c = tLObject;
        this.d = i7;
        this.f54039e = i10;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}

package org.telegram.ui;

import org.telegram.tgnet.TLObject;
public abstract class y4 {
    public final x4 f54032a = new x4(this, 0);
    public final org.telegram.messenger.ks f54033b = org.telegram.messenger.ks.f(org.telegram.messenger.j10.f24798t0);
    public final Object f54034c;
    public final int d;
    public final int f54035e;
    public di.d7 f54036f;
    public boolean f54037g;

    public y4(int i7, int i10, TLObject tLObject) {
        this.f54034c = tLObject;
        this.d = i7;
        this.f54035e = i10;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}

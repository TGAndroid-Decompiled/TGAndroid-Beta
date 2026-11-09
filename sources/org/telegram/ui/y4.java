package org.telegram.ui;

import org.telegram.tgnet.TLObject;
public abstract class y4 {
    public final x4 f51849a = new x4(this, 0);
    public final org.telegram.messenger.qs f51850b = org.telegram.messenger.qs.f(org.telegram.messenger.p10.f24470s0);
    public final Object f51851c;
    public final int d;
    public final int f51852e;
    public bi.h8 f51853f;
    public boolean f51854g;

    public y4(int i7, int i10, TLObject tLObject) {
        this.f51851c = tLObject;
        this.d = i7;
        this.f51852e = i10;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}

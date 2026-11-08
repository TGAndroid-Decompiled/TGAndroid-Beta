package org.telegram.ui;

import org.telegram.tgnet.TLObject;
public abstract class y4 {
    public final x4 f52061a = new x4(this, 0);
    public final org.telegram.messenger.qs f52062b = org.telegram.messenger.qs.f(org.telegram.messenger.p10.f24470s0);
    public final Object f52063c;
    public final int d;
    public final int f52064e;
    public bi.h8 f52065f;
    public boolean f52066g;

    public y4(int i7, int i10, TLObject tLObject) {
        this.f52063c = tLObject;
        this.d = i7;
        this.f52064e = i10;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}

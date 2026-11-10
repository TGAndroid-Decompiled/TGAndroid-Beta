package org.telegram.ui;

import org.telegram.tgnet.TLObject;
public abstract class y4 {
    public final x4 f51885a = new x4(this, 0);
    public final org.telegram.messenger.qs f51886b = org.telegram.messenger.qs.f(org.telegram.messenger.p10.f24474s0);
    public final Object f51887c;
    public final int d;
    public final int f51888e;
    public bi.h8 f51889f;
    public boolean f51890g;

    public y4(int i7, int i10, TLObject tLObject) {
        this.f51887c = tLObject;
        this.d = i7;
        this.f51888e = i10;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}

package org.telegram.ui;

import org.telegram.tgnet.TLObject;
public abstract class y4 {
    public final x4 f52068a = new x4(this, 0);
    public final org.telegram.messenger.qs f52069b = org.telegram.messenger.qs.f(org.telegram.messenger.p10.f24467s0);
    public final Object f52070c;
    public final int d;
    public final int f52071e;
    public bi.h8 f52072f;
    public boolean f52073g;

    public y4(int i7, int i10, TLObject tLObject) {
        this.f52070c = tLObject;
        this.d = i7;
        this.f52071e = i10;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}

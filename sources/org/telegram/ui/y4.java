package org.telegram.ui;

import org.telegram.tgnet.TLObject;
public abstract class y4 {
    public final x4 f52070a = new x4(this, 0);
    public final org.telegram.messenger.qs f52071b = org.telegram.messenger.qs.f(org.telegram.messenger.p10.f24459s0);
    public final Object f52072c;
    public final int d;
    public final int f52073e;
    public bi.h8 f52074f;
    public boolean f52075g;

    public y4(int i7, int i10, TLObject tLObject) {
        this.f52072c = tLObject;
        this.d = i7;
        this.f52073e = i10;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}

package org.telegram.ui;

import org.telegram.tgnet.TLObject;
public abstract class x4 {
    public final w4 f43434a = new w4(this, 0);
    public final org.telegram.messenger.zs f43435b = org.telegram.messenger.zs.f(org.telegram.messenger.d20.f15147s0);
    public final Object f43436c;
    public final int d;
    public final int e;
    public mg.f0 f43437f;
    public boolean f43438g;

    public x4(int i10, int i11, TLObject tLObject) {
        this.f43436c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}

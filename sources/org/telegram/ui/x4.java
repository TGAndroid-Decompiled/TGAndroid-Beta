package org.telegram.ui;

import org.telegram.tgnet.TLObject;
public abstract class x4 {
    public final w4 f43222a = new w4(this, 0);
    public final org.telegram.messenger.at f43223b = org.telegram.messenger.at.f(org.telegram.messenger.e20.f15506s0);
    public final Object f43224c;
    public final int d;
    public final int e;
    public mg.f0 f43225f;
    public boolean f43226g;

    public x4(int i10, int i11, TLObject tLObject) {
        this.f43224c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}

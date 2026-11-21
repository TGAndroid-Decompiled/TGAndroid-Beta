package org.telegram.utils.twidget;

import org.telegram.ui.Wallet.x2;
public final class i0 implements x2 {
    public final k0 f54826a;
    public final d1 f54827b;
    public final long f54828c;
    public final byte[] d;

    public i0(k0 k0Var, d1 d1Var, long j3, byte[] bArr) {
        this.f54826a = k0Var;
        this.f54827b = d1Var;
        this.f54828c = j3;
        this.d = bArr;
    }

    @Override
    public final void a() {
        this.f54827b.b(5, null, this.f54828c);
    }

    @Override
    public final void b() {
        this.f54827b.b(3, null, this.f54828c);
    }
}

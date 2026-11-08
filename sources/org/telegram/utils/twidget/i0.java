package org.telegram.utils.twidget;

import org.telegram.ui.Wallet.s2;
public final class i0 implements s2 {
    public final k0 f52854a;
    public final v0 f52855b;
    public final long f52856c;
    public final byte[] d;

    public i0(k0 k0Var, v0 v0Var, long j3, byte[] bArr) {
        this.f52854a = k0Var;
        this.f52855b = v0Var;
        this.f52856c = j3;
        this.d = bArr;
    }

    @Override
    public final void a() {
        this.f52855b.b(5, null, this.f52856c);
    }

    @Override
    public final void b() {
        this.f52855b.b(3, null, this.f52856c);
    }
}

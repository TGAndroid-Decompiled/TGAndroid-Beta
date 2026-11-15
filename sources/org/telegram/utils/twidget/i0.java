package org.telegram.utils.twidget;

import org.telegram.ui.Wallet.q2;
public final class i0 implements q2 {
    public final k0 f54253a;
    public final y0 f54254b;
    public final long f54255c;
    public final byte[] d;

    public i0(k0 k0Var, y0 y0Var, long j3, byte[] bArr) {
        this.f54253a = k0Var;
        this.f54254b = y0Var;
        this.f54255c = j3;
        this.d = bArr;
    }

    @Override
    public final void a() {
        this.f54254b.b(5, null, this.f54255c);
    }

    @Override
    public final void b() {
        this.f54254b.b(3, null, this.f54255c);
    }
}

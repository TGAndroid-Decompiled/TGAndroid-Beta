package org.telegram.utils.twidget;

import org.telegram.ui.Wallet.y2;
public final class i0 implements y2 {
    public final k0 f54911a;
    public final d1 f54912b;
    public final long f54913c;
    public final byte[] d;

    public i0(k0 k0Var, d1 d1Var, long j3, byte[] bArr) {
        this.f54911a = k0Var;
        this.f54912b = d1Var;
        this.f54913c = j3;
        this.d = bArr;
    }

    @Override
    public final void a() {
        this.f54912b.b(5, null, this.f54913c);
    }

    @Override
    public final void b() {
        this.f54912b.b(3, null, this.f54913c);
    }
}

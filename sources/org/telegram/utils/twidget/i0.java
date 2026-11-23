package org.telegram.utils.twidget;

import org.telegram.ui.Wallet.x2;
public final class i0 implements x2 {
    public final k0 f54830a;
    public final d1 f54831b;
    public final long f54832c;
    public final byte[] d;

    public i0(k0 k0Var, d1 d1Var, long j3, byte[] bArr) {
        this.f54830a = k0Var;
        this.f54831b = d1Var;
        this.f54832c = j3;
        this.d = bArr;
    }

    @Override
    public final void a() {
        this.f54831b.b(5, null, this.f54832c);
    }

    @Override
    public final void b() {
        this.f54831b.b(3, null, this.f54832c);
    }
}

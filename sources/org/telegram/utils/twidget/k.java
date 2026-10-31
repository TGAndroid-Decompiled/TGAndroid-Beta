package org.telegram.utils.twidget;

import org.telegram.ui.Wallet.s2;
public final class k implements s2 {
    public final m f44365a;
    public final w f44366b;
    public final long f44367c;
    public final byte[] d;

    public k(m mVar, w wVar, long j10, byte[] bArr) {
        this.f44365a = mVar;
        this.f44366b = wVar;
        this.f44367c = j10;
        this.d = bArr;
    }

    @Override
    public final void a() {
        this.f44366b.a(5, null, this.f44367c);
    }

    @Override
    public final void b() {
        this.f44366b.a(3, null, this.f44367c);
    }
}

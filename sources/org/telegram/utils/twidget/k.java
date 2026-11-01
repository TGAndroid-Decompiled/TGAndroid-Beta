package org.telegram.utils.twidget;

import org.telegram.ui.Wallet.t2;
public final class k implements t2 {
    public final m f44376a;
    public final w f44377b;
    public final long f44378c;
    public final byte[] d;

    public k(m mVar, w wVar, long j10, byte[] bArr) {
        this.f44376a = mVar;
        this.f44377b = wVar;
        this.f44378c = j10;
        this.d = bArr;
    }

    @Override
    public final void a() {
        this.f44377b.a(5, null, this.f44378c);
    }

    @Override
    public final void b() {
        this.f44377b.a(3, null, this.f44378c);
    }
}

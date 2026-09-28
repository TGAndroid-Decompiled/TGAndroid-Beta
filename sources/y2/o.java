package y2;

import android.net.Uri;
import e2.d0;
import g2.b0;
import java.io.IOException;
import u2.t;
public final class o implements i {
    public final long f46578a = t.f43770b.getAndIncrement();
    public final g2.m f46579b;
    public final int f46580c;
    public final b0 d;
    public final n e;
    public volatile Object f46581f;

    public o(g2.h hVar, g2.m mVar, int i10, n nVar) {
        this.d = new b0(hVar);
        this.f46579b = mVar;
        this.f46580c = i10;
        this.e = nVar;
    }

    @Override
    public final void a() {
        this.d.f9333b = 0L;
        g2.k kVar = new g2.k(this.d, this.f46579b);
        try {
            kVar.f9353a.open(kVar.f9354b);
            kVar.d = true;
            Uri uri = this.d.f9332a.getUri();
            uri.getClass();
            this.f46581f = this.e.n2(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = d0.f7870a;
            try {
                kVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override
    public final void D() {
    }
}

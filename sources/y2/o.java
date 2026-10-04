package y2;

import android.net.Uri;
import e2.d0;
import g2.b0;
import java.io.IOException;
import u2.t;
public final class o implements i {
    public final long f50403a = t.f47393b.getAndIncrement();
    public final g2.m f50404b;
    public final int f50405c;
    public final b0 d;
    public final n f50406e;
    public volatile Object f50407f;

    public o(g2.h hVar, g2.m mVar, int i10, n nVar) {
        this.d = new b0(hVar);
        this.f50404b = mVar;
        this.f50405c = i10;
        this.f50406e = nVar;
    }

    @Override
    public final void a() {
        this.d.f10160b = 0L;
        g2.k kVar = new g2.k(this.d, this.f50404b);
        try {
            kVar.f10182a.open(kVar.f10183b);
            kVar.d = true;
            Uri uri = this.d.f10159a.getUri();
            uri.getClass();
            this.f50407f = this.f50406e.n2(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = d0.f8537a;
            try {
                kVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override
    public final void q() {
    }
}

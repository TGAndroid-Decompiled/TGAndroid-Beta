package y2;

import android.net.Uri;
import e2.n0;
import g2.b0;
import java.io.IOException;
import u2.u;
public final class o implements i {
    public final long f52025a = u.f49470g.getAndIncrement();
    public final g2.m f52026b;
    public final int f52027c;
    public final b0 d;
    public final n e;
    public volatile Object f52028f;

    public o(g2.h hVar, g2.m mVar, int i10, n nVar) {
        this.d = new b0(hVar);
        this.f52026b = mVar;
        this.f52027c = i10;
        this.e = nVar;
    }

    @Override
    public final void b() {
        this.d.f12229b = 0L;
        g2.k kVar = new g2.k(this.d, this.f52026b);
        try {
            kVar.a();
            Uri uri = this.d.f12228a.getUri();
            uri.getClass();
            this.f52028f = this.e.S1(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = n0.f9691a;
            try {
                kVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override
    public final void f0() {
    }
}

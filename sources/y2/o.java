package y2;

import android.net.Uri;
import e2.m0;
import g2.b0;
import java.io.IOException;
import u2.u;
public final class o implements i {
    public final long f48546a = u.f46053g.getAndIncrement();
    public final g2.m f48547b;
    public final int f48548c;
    public final b0 d;
    public final n e;
    public volatile Object f48549f;

    public o(g2.h hVar, g2.m mVar, int i10, n nVar) {
        this.d = new b0(hVar);
        this.f48547b = mVar;
        this.f48548c = i10;
        this.e = nVar;
    }

    @Override
    public final void a() {
        this.d.f9855b = 0L;
        g2.k kVar = new g2.k(this.d, this.f48547b);
        try {
            kVar.a();
            Uri uri = this.d.f9854a.getUri();
            uri.getClass();
            this.f48549f = this.e.d2(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = m0.f8372a;
            try {
                kVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override
    public final void J() {
    }
}

package y2;

import android.net.Uri;
import e2.d0;
import g2.b0;
import java.io.IOException;
import u2.u;
public final class q implements k {
    public final long f46448a = u.f42455b.getAndIncrement();
    public final g2.m f46449b;
    public final int f46450c;
    public final b0 d;
    public final p e;
    public volatile Object f46451f;

    public q(g2.h hVar, g2.m mVar, int i10, p pVar) {
        this.d = new b0(hVar);
        this.f46449b = mVar;
        this.f46450c = i10;
        this.e = pVar;
    }

    @Override
    public final void a() {
        this.d.f8479b = 0L;
        g2.k kVar = new g2.k(this.d, this.f46449b);
        try {
            kVar.f8499a.open(kVar.f8500b);
            kVar.d = true;
            Uri uri = this.d.f8478a.getUri();
            uri.getClass();
            this.f46451f = this.e.l2(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = d0.f7188a;
            try {
                kVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override
    public final void k() {
    }
}

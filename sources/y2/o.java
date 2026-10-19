package y2;

import android.net.Uri;
import e2.m0;
import g2.b0;
import java.io.IOException;
import u2.u;
public final class o implements i {
    public final long f49927a = u.f47437g.getAndIncrement();
    public final g2.m f49928b;
    public final int f49929c;
    public final b0 d;
    public final n e;
    public volatile Object f49930f;

    public o(g2.h hVar, g2.m mVar, int i10, n nVar) {
        this.d = new b0(hVar);
        this.f49928b = mVar;
        this.f49929c = i10;
        this.e = nVar;
    }

    @Override
    public final void a() {
        this.d.f10765b = 0L;
        g2.k kVar = new g2.k(this.d, this.f49928b);
        try {
            kVar.a();
            Uri uri = this.d.f10764a.getUri();
            uri.getClass();
            this.f49930f = this.e.d2(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = m0.f8254a;
            try {
                kVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override
    public final void O() {
    }
}

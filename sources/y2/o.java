package y2;

import android.net.Uri;
import e2.d0;
import g2.b0;
import java.io.IOException;
import u2.t;
public final class o implements i {
    public final long f46622a = t.f43813b.getAndIncrement();
    public final g2.m f46623b;
    public final int f46624c;
    public final b0 d;
    public final n e;
    public volatile Object f46625f;

    public o(g2.h hVar, g2.m mVar, int i10, n nVar) {
        this.d = new b0(hVar);
        this.f46623b = mVar;
        this.f46624c = i10;
        this.e = nVar;
    }

    @Override
    public final void a() {
        this.d.f9338b = 0L;
        g2.k kVar = new g2.k(this.d, this.f46623b);
        try {
            kVar.f9358a.open(kVar.f9359b);
            kVar.d = true;
            Uri uri = this.d.f9337a.getUri();
            uri.getClass();
            this.f46625f = this.e.n2(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = d0.f7872a;
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

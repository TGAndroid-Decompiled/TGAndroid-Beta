package y2;

import android.net.Uri;
import e2.d0;
import g2.b0;
import java.io.IOException;
import u2.t;
public final class o implements i {
    public final long f50402a = t.f47392b.getAndIncrement();
    public final g2.m f50403b;
    public final int f50404c;
    public final b0 d;
    public final n f50405e;
    public volatile Object f50406f;

    public o(g2.h hVar, g2.m mVar, int i10, n nVar) {
        this.d = new b0(hVar);
        this.f50403b = mVar;
        this.f50404c = i10;
        this.f50405e = nVar;
    }

    @Override
    public final void a() {
        this.d.f10160b = 0L;
        g2.k kVar = new g2.k(this.d, this.f50403b);
        try {
            kVar.f10182a.open(kVar.f10183b);
            kVar.d = true;
            Uri uri = this.d.f10159a.getUri();
            uri.getClass();
            this.f50406f = this.f50405e.n2(uri, kVar);
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

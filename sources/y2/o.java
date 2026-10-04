package y2;

import android.net.Uri;
import e2.d0;
import g2.b0;
import java.io.IOException;
import u2.t;
public final class o implements i {
    public final long f50411a = t.f47401b.getAndIncrement();
    public final g2.m f50412b;
    public final int f50413c;
    public final b0 d;
    public final n f50414e;
    public volatile Object f50415f;

    public o(g2.h hVar, g2.m mVar, int i10, n nVar) {
        this.d = new b0(hVar);
        this.f50412b = mVar;
        this.f50413c = i10;
        this.f50414e = nVar;
    }

    @Override
    public final void a() {
        this.d.f10161b = 0L;
        g2.k kVar = new g2.k(this.d, this.f50412b);
        try {
            kVar.f10183a.open(kVar.f10184b);
            kVar.d = true;
            Uri uri = this.d.f10160a.getUri();
            uri.getClass();
            this.f50415f = this.f50414e.n2(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = d0.f8538a;
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

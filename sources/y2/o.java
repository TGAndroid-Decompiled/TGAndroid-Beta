package y2;

import android.net.Uri;
import e2.d0;
import g2.b0;
import java.io.IOException;
import u2.t;
public final class o implements i {
    public final long f51697a = t.f48706b.getAndIncrement();
    public final g2.m f51698b;
    public final int f51699c;
    public final b0 d;
    public final n f51700e;
    public volatile Object f51701f;

    public o(g2.h hVar, g2.m mVar, int i10, n nVar) {
        this.d = new b0(hVar);
        this.f51698b = mVar;
        this.f51699c = i10;
        this.f51700e = nVar;
    }

    @Override
    public final void a() {
        this.d.f10234b = 0L;
        g2.k kVar = new g2.k(this.d, this.f51698b);
        try {
            kVar.f10256a.open(kVar.f10257b);
            kVar.d = true;
            Uri uri = this.d.f10233a.getUri();
            uri.getClass();
            this.f51701f = this.f51700e.t2(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = d0.f8532a;
            try {
                kVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override
    public final void v() {
    }
}

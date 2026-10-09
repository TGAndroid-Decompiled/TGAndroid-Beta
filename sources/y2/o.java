package y2;

import android.net.Uri;
import e2.d0;
import g2.b0;
import java.io.IOException;
import u2.t;
public final class o implements i {
    public final long f51699a = t.f48708b.getAndIncrement();
    public final g2.m f51700b;
    public final int f51701c;
    public final b0 d;
    public final n f51702e;
    public volatile Object f51703f;

    public o(g2.h hVar, g2.m mVar, int i10, n nVar) {
        this.d = new b0(hVar);
        this.f51700b = mVar;
        this.f51701c = i10;
        this.f51702e = nVar;
    }

    @Override
    public final void a() {
        this.d.f10234b = 0L;
        g2.k kVar = new g2.k(this.d, this.f51700b);
        try {
            kVar.f10256a.open(kVar.f10257b);
            kVar.d = true;
            Uri uri = this.d.f10233a.getUri();
            uri.getClass();
            this.f51703f = this.f51702e.t2(uri, kVar);
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

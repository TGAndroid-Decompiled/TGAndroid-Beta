package y2;

import android.net.Uri;
import e2.m0;
import g2.b0;
import java.io.IOException;
import u2.t;
public final class o implements i {
    public final long f49975a = t.f47480g.getAndIncrement();
    public final g2.m f49976b;
    public final int f49977c;
    public final b0 d;
    public final n e;
    public volatile Object f49978f;

    public o(g2.h hVar, g2.m mVar, int i10, n nVar) {
        this.d = new b0(hVar);
        this.f49976b = mVar;
        this.f49977c = i10;
        this.e = nVar;
    }

    @Override
    public final void a() {
        this.d.f10766b = 0L;
        g2.k kVar = new g2.k(this.d, this.f49976b);
        try {
            kVar.a();
            Uri uri = this.d.f10765a.getUri();
            uri.getClass();
            this.f49978f = this.e.d2(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = m0.f8255a;
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

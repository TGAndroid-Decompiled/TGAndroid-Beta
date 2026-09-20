package y2;

import android.net.Uri;
import e2.d0;
import g2.b0;
import java.io.IOException;
import u2.t;
public final class p implements j {
    public final long f46600a = t.f43784b.getAndIncrement();
    public final g2.m f46601b;
    public final int f46602c;
    public final b0 d;
    public final o e;
    public volatile Object f46603f;

    public p(g2.h hVar, g2.m mVar, int i10, o oVar) {
        this.d = new b0(hVar);
        this.f46601b = mVar;
        this.f46602c = i10;
        this.e = oVar;
    }

    @Override
    public final void a() {
        this.d.f9351b = 0L;
        g2.k kVar = new g2.k(this.d, this.f46601b);
        try {
            kVar.f9371a.open(kVar.f9372b);
            kVar.d = true;
            Uri uri = this.d.f9350a.getUri();
            uri.getClass();
            this.f46603f = this.e.n2(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = d0.f7888a;
            try {
                kVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override
    public final void H() {
    }
}

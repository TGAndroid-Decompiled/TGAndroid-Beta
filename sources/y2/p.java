package y2;

import android.net.Uri;
import e2.d0;
import g2.b0;
import java.io.IOException;
import u2.t;
public final class p implements j {
    public final long f46252a = t.f43412b.getAndIncrement();
    public final g2.m f46253b;
    public final int f46254c;
    public final b0 d;
    public final o e;
    public volatile Object f46255f;

    public p(g2.h hVar, g2.m mVar, int i10, o oVar) {
        this.d = new b0(hVar);
        this.f46253b = mVar;
        this.f46254c = i10;
        this.e = oVar;
    }

    @Override
    public final void a() {
        this.d.f9334b = 0L;
        g2.k kVar = new g2.k(this.d, this.f46253b);
        try {
            kVar.f9354a.open(kVar.f9355b);
            kVar.d = true;
            Uri uri = this.d.f9333a.getUri();
            uri.getClass();
            this.f46255f = this.e.n2(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = d0.f7871a;
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

package y2;

import android.net.Uri;
import e2.d0;
import g2.b0;
import java.io.IOException;
import u2.t;
public final class p implements j {
    public final long f46566a = t.f43755b.getAndIncrement();
    public final g2.m f46567b;
    public final int f46568c;
    public final b0 d;
    public final o e;
    public volatile Object f46569f;

    public p(g2.h hVar, g2.m mVar, int i10, o oVar) {
        this.d = new b0(hVar);
        this.f46567b = mVar;
        this.f46568c = i10;
        this.e = oVar;
    }

    @Override
    public final void a() {
        this.d.f9333b = 0L;
        g2.k kVar = new g2.k(this.d, this.f46567b);
        try {
            kVar.f9353a.open(kVar.f9354b);
            kVar.d = true;
            Uri uri = this.d.f9332a.getUri();
            uri.getClass();
            this.f46569f = this.e.n2(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = d0.f7870a;
            try {
                kVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override
    public final void D() {
    }
}

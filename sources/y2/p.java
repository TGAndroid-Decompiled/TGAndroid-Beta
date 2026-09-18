package y2;

import android.net.Uri;
import e2.d0;
import g2.b0;
import java.io.IOException;
import u2.t;
public final class p implements j {
    public final long f46553a = t.f43739b.getAndIncrement();
    public final g2.m f46554b;
    public final int f46555c;
    public final b0 d;
    public final o e;
    public volatile Object f46556f;

    public p(g2.h hVar, g2.m mVar, int i10, o oVar) {
        this.d = new b0(hVar);
        this.f46554b = mVar;
        this.f46555c = i10;
        this.e = oVar;
    }

    @Override
    public final void a() {
        this.d.f9350b = 0L;
        g2.k kVar = new g2.k(this.d, this.f46554b);
        try {
            kVar.f9370a.open(kVar.f9371b);
            kVar.d = true;
            Uri uri = this.d.f9349a.getUri();
            uri.getClass();
            this.f46556f = this.e.n2(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = d0.f7887a;
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

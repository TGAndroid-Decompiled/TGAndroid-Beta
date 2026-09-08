package y2;

import android.net.Uri;
import e2.d0;
import g2.b0;
import java.io.IOException;
import u2.t;
public final class p implements j {
    public final long f49550a = t.f46832b.getAndIncrement();
    public final g2.m f49551b;
    public final int f49552c;
    public final b0 d;
    public final o f49553e;
    public volatile Object f49554f;

    public p(g2.h hVar, g2.m mVar, int i10, o oVar) {
        this.d = new b0(hVar);
        this.f49551b = mVar;
        this.f49552c = i10;
        this.f49553e = oVar;
    }

    @Override
    public final void a() {
        this.d.f10325b = 0L;
        g2.k kVar = new g2.k(this.d, this.f49551b);
        try {
            kVar.f10347a.open(kVar.f10348b);
            kVar.d = true;
            Uri uri = this.d.f10324a.getUri();
            uri.getClass();
            this.f49554f = this.f49553e.f2(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = d0.f8765a;
            try {
                kVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override
    public final void W() {
    }
}

package y2;

import android.net.Uri;
import e2.d0;
import g2.b0;
import java.io.IOException;
import u2.t;
public final class p implements j {
    public final long f49522a = t.f46805b.getAndIncrement();
    public final g2.m f49523b;
    public final int f49524c;
    public final b0 d;
    public final o f49525e;
    public volatile Object f49526f;

    public p(g2.h hVar, g2.m mVar, int i10, o oVar) {
        this.d = new b0(hVar);
        this.f49523b = mVar;
        this.f49524c = i10;
        this.f49525e = oVar;
    }

    @Override
    public final void a() {
        this.d.f10297b = 0L;
        g2.k kVar = new g2.k(this.d, this.f49523b);
        try {
            kVar.f10319a.open(kVar.f10320b);
            kVar.d = true;
            Uri uri = this.d.f10296a.getUri();
            uri.getClass();
            this.f49526f = this.f49525e.f2(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = d0.f8737a;
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

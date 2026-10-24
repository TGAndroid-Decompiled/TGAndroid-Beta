package y2;

import android.net.Uri;
import e2.m0;
import g2.b0;
import java.io.IOException;
import u2.v;
public final class o implements i {
    public final long f50377a = v.f47897g.getAndIncrement();
    public final g2.m f50378b;
    public final int f50379c;
    public final b0 d;
    public final n e;
    public volatile Object f50380f;

    public o(g2.h hVar, g2.m mVar, int i10, n nVar) {
        this.d = new b0(hVar);
        this.f50378b = mVar;
        this.f50379c = i10;
        this.e = nVar;
    }

    @Override
    public final void a() {
        this.d.f10782b = 0L;
        g2.k kVar = new g2.k(this.d, this.f50378b);
        try {
            kVar.a();
            Uri uri = this.d.f10781a.getUri();
            uri.getClass();
            this.f50380f = this.e.d2(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = m0.f8259a;
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

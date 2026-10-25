package y2;

import android.net.Uri;
import e2.n0;
import g2.b0;
import java.io.IOException;
import u2.u;
public final class o implements i {
    public final long f51964a = u.f49432g.getAndIncrement();
    public final g2.m f51965b;
    public final int f51966c;
    public final b0 d;
    public final n e;
    public volatile Object f51967f;

    public o(g2.h hVar, g2.m mVar, int i10, n nVar) {
        this.d = new b0(hVar);
        this.f51965b = mVar;
        this.f51966c = i10;
        this.e = nVar;
    }

    @Override
    public final void b() {
        this.d.f12230b = 0L;
        g2.k kVar = new g2.k(this.d, this.f51965b);
        try {
            kVar.a();
            Uri uri = this.d.f12229a.getUri();
            uri.getClass();
            this.f51967f = this.e.S1(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = n0.f9692a;
            try {
                kVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override
    public final void f0() {
    }
}

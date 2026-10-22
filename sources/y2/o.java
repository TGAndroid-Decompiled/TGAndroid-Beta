package y2;

import android.net.Uri;
import e2.m0;
import g2.b0;
import java.io.IOException;
import u2.u;
public final class o implements i {
    public final long f49937a = u.f47443g.getAndIncrement();
    public final g2.m f49938b;
    public final int f49939c;
    public final b0 d;
    public final n e;
    public volatile Object f49940f;

    public o(g2.h hVar, g2.m mVar, int i10, n nVar) {
        this.d = new b0(hVar);
        this.f49938b = mVar;
        this.f49939c = i10;
        this.e = nVar;
    }

    @Override
    public final void a() {
        this.d.f10763b = 0L;
        g2.k kVar = new g2.k(this.d, this.f49938b);
        try {
            kVar.a();
            Uri uri = this.d.f10762a.getUri();
            uri.getClass();
            this.f49940f = this.e.d2(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = m0.f8252a;
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

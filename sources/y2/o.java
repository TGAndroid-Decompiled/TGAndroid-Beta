package y2;

import android.net.Uri;
import e2.d0;
import g2.b0;
import java.io.IOException;
import u2.t;
public final class o implements i {
    public final long f51820a = t.f48808b.getAndIncrement();
    public final g2.m f51821b;
    public final int f51822c;
    public final b0 d;
    public final n f51823e;
    public volatile Object f51824f;

    public o(g2.h hVar, g2.m mVar, int i10, n nVar) {
        this.d = new b0(hVar);
        this.f51821b = mVar;
        this.f51822c = i10;
        this.f51823e = nVar;
    }

    @Override
    public final void a() {
        this.d.f10233b = 0L;
        g2.k kVar = new g2.k(this.d, this.f51821b);
        try {
            kVar.f10255a.open(kVar.f10256b);
            kVar.d = true;
            Uri uri = this.d.f10232a.getUri();
            uri.getClass();
            this.f51824f = this.f51823e.t2(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = d0.f8531a;
            try {
                kVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override
    public final void v() {
    }
}

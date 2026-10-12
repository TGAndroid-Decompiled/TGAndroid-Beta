package y2;

import android.net.Uri;
import e2.d0;
import g2.b0;
import java.io.IOException;
import u2.t;
public final class o implements i {
    public final long f51923a = t.f48915b.getAndIncrement();
    public final g2.m f51924b;
    public final int f51925c;
    public final b0 d;
    public final n f51926e;
    public volatile Object f51927f;

    public o(g2.h hVar, g2.m mVar, int i10, n nVar) {
        this.d = new b0(hVar);
        this.f51924b = mVar;
        this.f51925c = i10;
        this.f51926e = nVar;
    }

    @Override
    public final void a() {
        this.d.f10232b = 0L;
        g2.k kVar = new g2.k(this.d, this.f51924b);
        try {
            kVar.f10254a.open(kVar.f10255b);
            kVar.d = true;
            Uri uri = this.d.f10231a.getUri();
            uri.getClass();
            this.f51927f = this.f51926e.t2(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = d0.f8529a;
            try {
                kVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override
    public final void C() {
    }
}

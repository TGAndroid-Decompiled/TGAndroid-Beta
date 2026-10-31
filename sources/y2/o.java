package y2;

import android.net.Uri;
import e2.l0;
import g2.c0;
import java.io.IOException;
import u2.u;
public final class o implements i {
    public final long f54167a = u.f50014g.getAndIncrement();
    public final g2.n f54168b;
    public final int f54169c;
    public final c0 d;
    public final n e;
    public volatile Object f54170f;

    public o(g2.h hVar, g2.n nVar, int i10, n nVar2) {
        this.d = new c0(hVar);
        this.f54168b = nVar;
        this.f54169c = i10;
        this.e = nVar2;
    }

    @Override
    public final void b() {
        this.d.f7283b = 0L;
        g2.l lVar = new g2.l(this.d, this.f54168b);
        try {
            lVar.a();
            Uri uri = this.d.f7282a.getUri();
            uri.getClass();
            this.f54170f = this.e.g1(uri, lVar);
            try {
                lVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = l0.f6165a;
            try {
                lVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override
    public final void R1() {
    }
}

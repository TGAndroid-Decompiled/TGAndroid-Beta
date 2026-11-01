package y2;

import android.net.Uri;
import e2.l0;
import g2.c0;
import java.io.IOException;
import u2.u;
public final class o implements i {
    public final long f54188a = u.f50028g.getAndIncrement();
    public final g2.n f54189b;
    public final int f54190c;
    public final c0 d;
    public final n e;
    public volatile Object f54191f;

    public o(g2.h hVar, g2.n nVar, int i10, n nVar2) {
        this.d = new c0(hVar);
        this.f54189b = nVar;
        this.f54190c = i10;
        this.e = nVar2;
    }

    @Override
    public final void b() {
        this.d.f7284b = 0L;
        g2.l lVar = new g2.l(this.d, this.f54189b);
        try {
            lVar.a();
            Uri uri = this.d.f7283a.getUri();
            uri.getClass();
            this.f54191f = this.e.g1(uri, lVar);
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

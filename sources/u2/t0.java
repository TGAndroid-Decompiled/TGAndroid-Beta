package u2;

import a8.hc;
import a8.ng;
import a8.yb;
import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class t0 implements y2.i {
    public final Uri f49460a;
    public final g2.b0 f49461b;
    public final s4.d f49462c;
    public final w0 d;
    public final e2.i e;
    public volatile boolean h;
    public long f49465r;
    public g2.m f49466s;
    public c3.j0 v;
    public boolean f49467w;
    public final w0 f49468x;
    public final c3.s f49463f = new Object();
    public boolean f49464n = true;

    public t0(w0 w0Var, Uri uri, g2.h hVar, s4.d dVar, w0 w0Var2, e2.i iVar) {
        this.f49468x = w0Var;
        this.f49460a = uri;
        this.f49461b = new g2.b0(hVar);
        this.f49462c = dVar;
        this.d = w0Var2;
        this.e = iVar;
        u.f49470g.getAndIncrement();
        this.f49466s = a(0L, null);
    }

    public final g2.m a(long j10, String str) {
        Map map = w0.f49483i0;
        if (str != null && !str.startsWith("W/")) {
            ng ngVar = new ng(4, 7);
            ngVar.x(map.entrySet());
            ngVar.w("If-Range", str);
            map = ngVar.e();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.f49468x.f49498r;
        Uri uri = this.f49460a;
        yb.l(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map, j10, -1L, str2, 6);
    }

    @Override
    public final void b() {
        g2.h hVar;
        c3.o oVar;
        int i10;
        int i11 = 0;
        String str = null;
        while (i11 == 0 && !this.h) {
            try {
                long j10 = this.f49463f.f6092a;
                g2.m a2 = a(j10, str);
                this.f49466s = a2;
                long open = this.f49461b.open(a2);
                if (this.h) {
                    if (i11 != 1 && this.f49462c.l() != -1) {
                        this.f49463f.f6092a = this.f49462c.l();
                    }
                    hc.a(this.f49461b);
                    return;
                }
                List list = (List) this.f49461b.f12228a.getResponseHeaders().get("ETag");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                if (open != -1) {
                    open += j10;
                    w0 w0Var = this.f49468x;
                    w0Var.H.post(new p0(w0Var, 0));
                }
                long j11 = open;
                this.f49468x.J = p3.b.d(this.f49461b.f12228a.getResponseHeaders());
                g2.b0 b0Var = this.f49461b;
                p3.b bVar = this.f49468x.J;
                if (bVar != null && (i10 = bVar.f46681f) != -1) {
                    hVar = new t(b0Var, i10, this);
                    c3.j0 x9 = this.f49468x.x(new v0(0, true));
                    this.v = x9;
                    x9.b(w0.f49484j0);
                } else {
                    hVar = b0Var;
                }
                this.f49462c.r(hVar, this.f49460a, this.f49461b.f12228a.getResponseHeaders(), j10, j11, this.d);
                if (this.f49468x.J != null && (oVar = (c3.o) this.f49462c.f47756c) != null) {
                    c3.o b10 = oVar.b();
                    if (b10 instanceof v3.d) {
                        ((v3.d) b10).f50088t = true;
                    }
                }
                if (this.f49464n) {
                    s4.d dVar = this.f49462c;
                    long j12 = this.f49465r;
                    c3.o oVar2 = (c3.o) dVar.f47756c;
                    oVar2.getClass();
                    oVar2.d(j10, j12);
                    this.f49464n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.i iVar = this.e;
                        synchronized (iVar) {
                            while (!iVar.f9669b) {
                                iVar.f9668a.getClass();
                                iVar.wait();
                            }
                        }
                        s4.d dVar2 = this.f49462c;
                        c3.s sVar = this.f49463f;
                        c3.o oVar3 = (c3.o) dVar2.f47756c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) dVar2.d;
                        lVar.getClass();
                        i11 = oVar3.f(lVar, sVar);
                        long l4 = this.f49462c.l();
                        if (l4 > this.f49468x.f49499s + j10) {
                            this.e.d();
                            w0 w0Var2 = this.f49468x;
                            w0Var2.H.post(w0Var2.G);
                            j10 = l4;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f49462c.l() != -1) {
                    this.f49463f.f6092a = this.f49462c.l();
                }
                hc.a(this.f49461b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f49462c.l() != -1) {
                    this.f49463f.f6092a = this.f49462c.l();
                }
                hc.a(this.f49461b);
                throw th2;
            }
        }
    }

    @Override
    public final void f0() {
        this.h = true;
    }
}

package x2;

import a8.la;
import a8.xa;
import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.telegram.ui.nd0;
public final class t0 implements b3.m {
    public final Uri f60225a;
    public final j2.b0 f60226b;
    public final nd0 f60227c;
    public final w0 d;
    public final h2.i f60228e;
    public volatile boolean h;
    public long f60231r;
    public j2.m f60232s;
    public f3.i0 f60233w;
    public boolean f60234x;
    public final w0 f60235y;
    public final f3.s f60229f = new Object();
    public boolean f60230n = true;

    public t0(w0 w0Var, Uri uri, j2.h hVar, nd0 nd0Var, w0 w0Var2, h2.i iVar) {
        this.f60235y = w0Var;
        this.f60225a = uri;
        this.f60226b = new j2.b0(hVar);
        this.f60227c = nd0Var;
        this.d = w0Var2;
        this.f60228e = iVar;
        u.f60237g.getAndIncrement();
        this.f60232s = b(0L, null);
    }

    @Override
    public final void A() {
        this.h = true;
    }

    @Override
    public final void a() {
        j2.h hVar;
        f3.o oVar;
        int i7;
        int i10 = 0;
        String str = null;
        while (i10 == 0 && !this.h) {
            try {
                long j3 = this.f60229f.f11196a;
                j2.m b10 = b(j3, str);
                this.f60232s = b10;
                long open = this.f60226b.open(b10);
                if (this.h) {
                    if (i10 != 1 && this.f60227c.v() != -1) {
                        this.f60229f.f11196a = this.f60227c.v();
                    }
                    c8.s0.a(this.f60226b);
                    return;
                }
                List list = (List) this.f60226b.f17151a.getResponseHeaders().get("ETag");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                if (open != -1) {
                    open += j3;
                    w0 w0Var = this.f60235y;
                    w0Var.I.post(new p0(w0Var, 0));
                }
                long j10 = open;
                this.f60235y.K = s3.b.d(this.f60226b.f17151a.getResponseHeaders());
                j2.b0 b0Var = this.f60226b;
                s3.b bVar = this.f60235y.K;
                if (bVar != null && (i7 = bVar.f56915f) != -1) {
                    hVar = new t(b0Var, i7, this);
                    f3.i0 B = this.f60235y.B(new v0(0, true));
                    this.f60233w = B;
                    B.g(w0.f60252k0);
                } else {
                    hVar = b0Var;
                }
                this.f60227c.C(hVar, this.f60225a, this.f60226b.f17151a.getResponseHeaders(), j3, j10, this.d);
                if (this.f60235y.K != null && (oVar = (f3.o) this.f60227c.f50149c) != null) {
                    f3.o a10 = oVar.a();
                    if (a10 instanceof y3.d) {
                        ((y3.d) a10).f60733t = true;
                    }
                }
                if (this.f60230n) {
                    nd0 nd0Var = this.f60227c;
                    long j11 = this.f60231r;
                    f3.o oVar2 = (f3.o) nd0Var.f50149c;
                    oVar2.getClass();
                    oVar2.d(j3, j11);
                    this.f60230n = false;
                }
                while (i10 == 0 && !this.h) {
                    try {
                        h2.i iVar = this.f60228e;
                        synchronized (iVar) {
                            while (!iVar.f13766b) {
                                iVar.f13765a.getClass();
                                iVar.wait();
                            }
                        }
                        nd0 nd0Var2 = this.f60227c;
                        f3.s sVar = this.f60229f;
                        f3.o oVar3 = (f3.o) nd0Var2.f50149c;
                        oVar3.getClass();
                        f3.l lVar = (f3.l) nd0Var2.d;
                        lVar.getClass();
                        i10 = oVar3.f(lVar, sVar);
                        long v = this.f60227c.v();
                        if (v > this.f60235y.f60269s + j3) {
                            this.f60228e.d();
                            w0 w0Var2 = this.f60235y;
                            w0Var2.I.post(w0Var2.H);
                            j3 = v;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i10 == 1) {
                    i10 = 0;
                } else if (this.f60227c.v() != -1) {
                    this.f60229f.f11196a = this.f60227c.v();
                }
                c8.s0.a(this.f60226b);
            } catch (Throwable th2) {
                if (i10 != 1 && this.f60227c.v() != -1) {
                    this.f60229f.f11196a = this.f60227c.v();
                }
                c8.s0.a(this.f60226b);
                throw th2;
            }
        }
    }

    public final j2.m b(long j3, String str) {
        Map map = w0.f60251j0;
        if (str != null && !str.startsWith("W/")) {
            xa xaVar = new xa(4, 10);
            xaVar.x(map.entrySet());
            xaVar.w("If-Range", str);
            map = xaVar.d();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.f60235y.f60268r;
        Uri uri = this.f60225a;
        la.k(uri, "The uri must be set.");
        return new j2.m(uri, 1, null, map, j3, -1L, str2, 6);
    }
}

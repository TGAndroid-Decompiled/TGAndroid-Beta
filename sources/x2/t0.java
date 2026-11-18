package x2;

import a8.la;
import a8.xa;
import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.telegram.ui.md0;
public final class t0 implements b3.m {
    public final Uri f60224a;
    public final j2.b0 f60225b;
    public final md0 f60226c;
    public final w0 d;
    public final h2.i f60227e;
    public volatile boolean h;
    public long f60230r;
    public j2.m f60231s;
    public f3.i0 f60232w;
    public boolean f60233x;
    public final w0 f60234y;
    public final f3.s f60228f = new Object();
    public boolean f60229n = true;

    public t0(w0 w0Var, Uri uri, j2.h hVar, md0 md0Var, w0 w0Var2, h2.i iVar) {
        this.f60234y = w0Var;
        this.f60224a = uri;
        this.f60225b = new j2.b0(hVar);
        this.f60226c = md0Var;
        this.d = w0Var2;
        this.f60227e = iVar;
        u.f60236g.getAndIncrement();
        this.f60231s = b(0L, null);
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
                long j3 = this.f60228f.f11199a;
                j2.m b10 = b(j3, str);
                this.f60231s = b10;
                long open = this.f60225b.open(b10);
                if (this.h) {
                    if (i10 != 1 && this.f60226c.v() != -1) {
                        this.f60228f.f11199a = this.f60226c.v();
                    }
                    c8.s0.a(this.f60225b);
                    return;
                }
                List list = (List) this.f60225b.f17154a.getResponseHeaders().get("ETag");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                if (open != -1) {
                    open += j3;
                    w0 w0Var = this.f60234y;
                    w0Var.I.post(new p0(w0Var, 0));
                }
                long j10 = open;
                this.f60234y.K = s3.b.d(this.f60225b.f17154a.getResponseHeaders());
                j2.b0 b0Var = this.f60225b;
                s3.b bVar = this.f60234y.K;
                if (bVar != null && (i7 = bVar.f56915f) != -1) {
                    hVar = new t(b0Var, i7, this);
                    f3.i0 B = this.f60234y.B(new v0(0, true));
                    this.f60232w = B;
                    B.g(w0.f60251k0);
                } else {
                    hVar = b0Var;
                }
                this.f60226c.C(hVar, this.f60224a, this.f60225b.f17154a.getResponseHeaders(), j3, j10, this.d);
                if (this.f60234y.K != null && (oVar = (f3.o) this.f60226c.f49839c) != null) {
                    f3.o a10 = oVar.a();
                    if (a10 instanceof y3.d) {
                        ((y3.d) a10).f60732t = true;
                    }
                }
                if (this.f60229n) {
                    md0 md0Var = this.f60226c;
                    long j11 = this.f60230r;
                    f3.o oVar2 = (f3.o) md0Var.f49839c;
                    oVar2.getClass();
                    oVar2.d(j3, j11);
                    this.f60229n = false;
                }
                while (i10 == 0 && !this.h) {
                    try {
                        h2.i iVar = this.f60227e;
                        synchronized (iVar) {
                            while (!iVar.f13769b) {
                                iVar.f13768a.getClass();
                                iVar.wait();
                            }
                        }
                        md0 md0Var2 = this.f60226c;
                        f3.s sVar = this.f60228f;
                        f3.o oVar3 = (f3.o) md0Var2.f49839c;
                        oVar3.getClass();
                        f3.l lVar = (f3.l) md0Var2.d;
                        lVar.getClass();
                        i10 = oVar3.f(lVar, sVar);
                        long v = this.f60226c.v();
                        if (v > this.f60234y.f60268s + j3) {
                            this.f60227e.d();
                            w0 w0Var2 = this.f60234y;
                            w0Var2.I.post(w0Var2.H);
                            j3 = v;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i10 == 1) {
                    i10 = 0;
                } else if (this.f60226c.v() != -1) {
                    this.f60228f.f11199a = this.f60226c.v();
                }
                c8.s0.a(this.f60225b);
            } catch (Throwable th2) {
                if (i10 != 1 && this.f60226c.v() != -1) {
                    this.f60228f.f11199a = this.f60226c.v();
                }
                c8.s0.a(this.f60225b);
                throw th2;
            }
        }
    }

    public final j2.m b(long j3, String str) {
        Map map = w0.f60250j0;
        if (str != null && !str.startsWith("W/")) {
            xa xaVar = new xa(4, 10);
            xaVar.x(map.entrySet());
            xaVar.w("If-Range", str);
            map = xaVar.d();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.f60234y.f60267r;
        Uri uri = this.f60224a;
        la.k(uri, "The uri must be set.");
        return new j2.m(uri, 1, null, map, j3, -1L, str2, 6);
    }
}

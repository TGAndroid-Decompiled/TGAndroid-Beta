package x2;

import a8.ma;
import a8.xa;
import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.telegram.ui.md0;
public final class t0 implements b3.m {
    public final Uri f60235a;
    public final j2.b0 f60236b;
    public final md0 f60237c;
    public final w0 d;
    public final h2.i f60238e;
    public volatile boolean h;
    public long f60241r;
    public j2.m f60242s;
    public f3.i0 f60243w;
    public boolean f60244x;
    public final w0 f60245y;
    public final f3.s f60239f = new Object();
    public boolean f60240n = true;

    public t0(w0 w0Var, Uri uri, j2.h hVar, md0 md0Var, w0 w0Var2, h2.i iVar) {
        this.f60245y = w0Var;
        this.f60235a = uri;
        this.f60236b = new j2.b0(hVar);
        this.f60237c = md0Var;
        this.d = w0Var2;
        this.f60238e = iVar;
        u.f60247g.getAndIncrement();
        this.f60242s = b(0L, null);
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
                long j3 = this.f60239f.f11191a;
                j2.m b10 = b(j3, str);
                this.f60242s = b10;
                long open = this.f60236b.open(b10);
                if (this.h) {
                    if (i10 != 1 && this.f60237c.v() != -1) {
                        this.f60239f.f11191a = this.f60237c.v();
                    }
                    c8.t0.a(this.f60236b);
                    return;
                }
                List list = (List) this.f60236b.f17145a.getResponseHeaders().get("ETag");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                if (open != -1) {
                    open += j3;
                    w0 w0Var = this.f60245y;
                    w0Var.I.post(new p0(w0Var, 0));
                }
                long j10 = open;
                this.f60245y.K = s3.b.d(this.f60236b.f17145a.getResponseHeaders());
                j2.b0 b0Var = this.f60236b;
                s3.b bVar = this.f60245y.K;
                if (bVar != null && (i7 = bVar.f56925f) != -1) {
                    hVar = new t(b0Var, i7, this);
                    f3.i0 B = this.f60245y.B(new v0(0, true));
                    this.f60243w = B;
                    B.g(w0.f60262k0);
                } else {
                    hVar = b0Var;
                }
                this.f60237c.C(hVar, this.f60235a, this.f60236b.f17145a.getResponseHeaders(), j3, j10, this.d);
                if (this.f60245y.K != null && (oVar = (f3.o) this.f60237c.f49831c) != null) {
                    f3.o a10 = oVar.a();
                    if (a10 instanceof y3.d) {
                        ((y3.d) a10).f60743t = true;
                    }
                }
                if (this.f60240n) {
                    md0 md0Var = this.f60237c;
                    long j11 = this.f60241r;
                    f3.o oVar2 = (f3.o) md0Var.f49831c;
                    oVar2.getClass();
                    oVar2.d(j3, j11);
                    this.f60240n = false;
                }
                while (i10 == 0 && !this.h) {
                    try {
                        h2.i iVar = this.f60238e;
                        synchronized (iVar) {
                            while (!iVar.f13761b) {
                                iVar.f13760a.getClass();
                                iVar.wait();
                            }
                        }
                        md0 md0Var2 = this.f60237c;
                        f3.s sVar = this.f60239f;
                        f3.o oVar3 = (f3.o) md0Var2.f49831c;
                        oVar3.getClass();
                        f3.l lVar = (f3.l) md0Var2.d;
                        lVar.getClass();
                        i10 = oVar3.f(lVar, sVar);
                        long v = this.f60237c.v();
                        if (v > this.f60245y.f60279s + j3) {
                            this.f60238e.d();
                            w0 w0Var2 = this.f60245y;
                            w0Var2.I.post(w0Var2.H);
                            j3 = v;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i10 == 1) {
                    i10 = 0;
                } else if (this.f60237c.v() != -1) {
                    this.f60239f.f11191a = this.f60237c.v();
                }
                c8.t0.a(this.f60236b);
            } catch (Throwable th2) {
                if (i10 != 1 && this.f60237c.v() != -1) {
                    this.f60239f.f11191a = this.f60237c.v();
                }
                c8.t0.a(this.f60236b);
                throw th2;
            }
        }
    }

    public final j2.m b(long j3, String str) {
        Map map = w0.f60261j0;
        if (str != null && !str.startsWith("W/")) {
            xa xaVar = new xa(4, 10);
            xaVar.x(map.entrySet());
            xaVar.w("If-Range", str);
            map = xaVar.d();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.f60245y.f60278r;
        Uri uri = this.f60235a;
        ma.k(uri, "The uri must be set.");
        return new j2.m(uri, 1, null, map, j3, -1L, str2, 6);
    }
}

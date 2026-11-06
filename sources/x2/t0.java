package x2;

import a8.ia;
import a8.wa;
import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.telegram.ui.hy0;
public final class t0 implements b3.l {
    public final Uri f58345a;
    public final j2.c0 f58346b;
    public final hy0 f58347c;
    public final w0 d;
    public final h2.i f58348e;
    public volatile boolean h;
    public long f58351r;
    public j2.m f58352s;
    public f3.j0 f58353w;
    public boolean f58354x;
    public final w0 f58355y;
    public final f3.s f58349f = new Object();
    public boolean f58350n = true;

    public t0(w0 w0Var, Uri uri, j2.h hVar, hy0 hy0Var, w0 w0Var2, h2.i iVar) {
        this.f58355y = w0Var;
        this.f58345a = uri;
        this.f58346b = new j2.c0(hVar);
        this.f58347c = hy0Var;
        this.d = w0Var2;
        this.f58348e = iVar;
        u.f58356g.getAndIncrement();
        this.f58352s = b(0L, null);
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
                long j3 = this.f58349f.f11070a;
                j2.m b10 = b(j3, str);
                this.f58352s = b10;
                long open = this.f58346b.open(b10);
                if (this.h) {
                    if (i10 != 1 && this.f58347c.x() != -1) {
                        this.f58349f.f11070a = this.f58347c.x();
                    }
                    c8.p0.a(this.f58346b);
                    return;
                }
                List list = (List) this.f58346b.f16412a.getResponseHeaders().get("ETag");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                if (open != -1) {
                    open += j3;
                    w0 w0Var = this.f58355y;
                    w0Var.H.post(new p0(w0Var, 0));
                }
                long j10 = open;
                this.f58355y.J = s3.b.d(this.f58346b.f16412a.getResponseHeaders());
                j2.c0 c0Var = this.f58346b;
                s3.b bVar = this.f58355y.J;
                if (bVar != null && (i7 = bVar.f54659f) != -1) {
                    hVar = new t(c0Var, i7, this);
                    f3.j0 x10 = this.f58355y.x(new v0(0, true));
                    this.f58353w = x10;
                    x10.g(w0.f58371j0);
                } else {
                    hVar = c0Var;
                }
                this.f58347c.E(hVar, this.f58345a, this.f58346b.f16412a.getResponseHeaders(), j3, j10, this.d);
                if (this.f58355y.J != null && (oVar = (f3.o) this.f58347c.f46520c) != null) {
                    f3.o a10 = oVar.a();
                    if (a10 instanceof y3.d) {
                        ((y3.d) a10).f58827t = true;
                    }
                }
                if (this.f58350n) {
                    hy0 hy0Var = this.f58347c;
                    long j11 = this.f58351r;
                    f3.o oVar2 = (f3.o) hy0Var.f46520c;
                    oVar2.getClass();
                    oVar2.d(j3, j11);
                    this.f58350n = false;
                }
                while (i10 == 0 && !this.h) {
                    try {
                        h2.i iVar = this.f58348e;
                        synchronized (iVar) {
                            while (!iVar.f14094b) {
                                iVar.f14093a.getClass();
                                iVar.wait();
                            }
                        }
                        hy0 hy0Var2 = this.f58347c;
                        f3.s sVar = this.f58349f;
                        f3.o oVar3 = (f3.o) hy0Var2.f46520c;
                        oVar3.getClass();
                        f3.l lVar = (f3.l) hy0Var2.d;
                        lVar.getClass();
                        i10 = oVar3.f(lVar, sVar);
                        long x11 = this.f58347c.x();
                        if (x11 > this.f58355y.f58387s + j3) {
                            this.f58348e.d();
                            w0 w0Var2 = this.f58355y;
                            w0Var2.H.post(w0Var2.G);
                            j3 = x11;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i10 == 1) {
                    i10 = 0;
                } else if (this.f58347c.x() != -1) {
                    this.f58349f.f11070a = this.f58347c.x();
                }
                c8.p0.a(this.f58346b);
            } catch (Throwable th2) {
                if (i10 != 1 && this.f58347c.x() != -1) {
                    this.f58349f.f11070a = this.f58347c.x();
                }
                c8.p0.a(this.f58346b);
                throw th2;
            }
        }
    }

    public final j2.m b(long j3, String str) {
        Map map = w0.f58370i0;
        if (str != null && !str.startsWith("W/")) {
            wa waVar = new wa(4, 10);
            waVar.w(map.entrySet());
            waVar.v("If-Range", str);
            map = waVar.e();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.f58355y.f58386r;
        Uri uri = this.f58345a;
        ia.k(uri, "The uri must be set.");
        return new j2.m(uri, 1, null, map, j3, -1L, str2, 6);
    }

    @Override
    public final void q0() {
        this.h = true;
    }
}

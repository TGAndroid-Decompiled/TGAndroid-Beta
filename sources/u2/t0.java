package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import v7.k7;
import v7.u6;
public final class t0 implements y2.i {
    public final Uri f47429a;
    public final g2.b0 f47430b;
    public final c f47431c;
    public final w0 d;
    public final e2.i e;
    public volatile boolean h;
    public long f47434r;
    public g2.m f47435s;
    public c3.j0 v;
    public boolean f47436w;
    public final w0 f47437x;
    public final c3.s f47432f = new Object();
    public boolean f47433n = true;

    public t0(w0 w0Var, Uri uri, g2.h hVar, c cVar, w0 w0Var2, e2.i iVar) {
        this.f47437x = w0Var;
        this.f47429a = uri;
        this.f47430b = new g2.b0(hVar);
        this.f47431c = cVar;
        this.d = w0Var2;
        this.e = iVar;
        u.f47439g.getAndIncrement();
        this.f47435s = b(0L, null);
    }

    @Override
    public final void O() {
        this.h = true;
    }

    @Override
    public final void a() {
        g2.h hVar;
        c3.o oVar;
        int i10;
        int i11 = 0;
        String str = null;
        while (i11 == 0 && !this.h) {
            try {
                long j10 = this.f47432f.f4655a;
                g2.m b10 = b(j10, str);
                this.f47435s = b10;
                long open = this.f47430b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f47431c.b() != -1) {
                        this.f47432f.f4655a = this.f47431c.b();
                    }
                    k7.a(this.f47430b);
                    return;
                }
                List list = (List) this.f47430b.f10762a.getResponseHeaders().get("ETag");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                if (open != -1) {
                    open += j10;
                    w0 w0Var = this.f47437x;
                    w0Var.H.post(new p0(w0Var, 0));
                }
                long j11 = open;
                this.f47437x.J = p3.b.d(this.f47430b.f10762a.getResponseHeaders());
                g2.b0 b0Var = this.f47430b;
                p3.b bVar = this.f47437x.J;
                if (bVar != null && (i10 = bVar.f44077f) != -1) {
                    hVar = new t(b0Var, i10, this);
                    c3.j0 z10 = this.f47437x.z(new v0(0, true));
                    this.v = z10;
                    z10.b(w0.f47453j0);
                } else {
                    hVar = b0Var;
                }
                this.f47431c.c(hVar, this.f47429a, this.f47430b.f10762a.getResponseHeaders(), j10, j11, this.d);
                if (this.f47437x.J != null && (oVar = (c3.o) this.f47431c.f47262c) != null) {
                    c3.o b11 = oVar.b();
                    if (b11 instanceof v3.d) {
                        ((v3.d) b11).f47933t = true;
                    }
                }
                if (this.f47433n) {
                    c cVar = this.f47431c;
                    long j12 = this.f47434r;
                    c3.o oVar2 = (c3.o) cVar.f47262c;
                    oVar2.getClass();
                    oVar2.d(j10, j12);
                    this.f47433n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.i iVar = this.e;
                        synchronized (iVar) {
                            while (!iVar.f8235b) {
                                iVar.f8234a.getClass();
                                iVar.wait();
                            }
                        }
                        c cVar2 = this.f47431c;
                        c3.s sVar = this.f47432f;
                        c3.o oVar3 = (c3.o) cVar2.f47262c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) cVar2.d;
                        lVar.getClass();
                        i11 = oVar3.f(lVar, sVar);
                        long b12 = this.f47431c.b();
                        if (b12 > this.f47437x.f47468s + j10) {
                            this.e.d();
                            w0 w0Var2 = this.f47437x;
                            w0Var2.H.post(w0Var2.G);
                            j10 = b12;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f47431c.b() != -1) {
                    this.f47432f.f4655a = this.f47431c.b();
                }
                k7.a(this.f47430b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f47431c.b() != -1) {
                    this.f47432f.f4655a = this.f47431c.b();
                }
                k7.a(this.f47430b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j10, String str) {
        Map map = w0.f47452i0;
        if (str != null && !str.startsWith("W/")) {
            a5.a aVar = new a5.a(4, 5);
            aVar.y(map.entrySet());
            aVar.x("If-Range", str);
            map = aVar.g();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.f47437x.f47467r;
        Uri uri = this.f47429a;
        u6.l(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map, j10, -1L, str2, 6);
    }
}

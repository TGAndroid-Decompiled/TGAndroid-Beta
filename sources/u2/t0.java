package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import v7.k7;
import v7.u6;
public final class t0 implements y2.i {
    public final Uri f47427a;
    public final g2.b0 f47428b;
    public final c f47429c;
    public final w0 d;
    public final e2.i e;
    public volatile boolean h;
    public long f47432r;
    public g2.m f47433s;
    public c3.j0 v;
    public boolean f47434w;
    public final w0 f47435x;
    public final c3.s f47430f = new Object();
    public boolean f47431n = true;

    public t0(w0 w0Var, Uri uri, g2.h hVar, c cVar, w0 w0Var2, e2.i iVar) {
        this.f47435x = w0Var;
        this.f47427a = uri;
        this.f47428b = new g2.b0(hVar);
        this.f47429c = cVar;
        this.d = w0Var2;
        this.e = iVar;
        u.f47437g.getAndIncrement();
        this.f47433s = b(0L, null);
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
                long j10 = this.f47430f.f4657a;
                g2.m b10 = b(j10, str);
                this.f47433s = b10;
                long open = this.f47428b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f47429c.b() != -1) {
                        this.f47430f.f4657a = this.f47429c.b();
                    }
                    k7.a(this.f47428b);
                    return;
                }
                List list = (List) this.f47428b.f10764a.getResponseHeaders().get("ETag");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                if (open != -1) {
                    open += j10;
                    w0 w0Var = this.f47435x;
                    w0Var.H.post(new p0(w0Var, 0));
                }
                long j11 = open;
                this.f47435x.J = p3.b.d(this.f47428b.f10764a.getResponseHeaders());
                g2.b0 b0Var = this.f47428b;
                p3.b bVar = this.f47435x.J;
                if (bVar != null && (i10 = bVar.f44075f) != -1) {
                    hVar = new t(b0Var, i10, this);
                    c3.j0 z10 = this.f47435x.z(new v0(0, true));
                    this.v = z10;
                    z10.b(w0.f47451j0);
                } else {
                    hVar = b0Var;
                }
                this.f47429c.c(hVar, this.f47427a, this.f47428b.f10764a.getResponseHeaders(), j10, j11, this.d);
                if (this.f47435x.J != null && (oVar = (c3.o) this.f47429c.f47260c) != null) {
                    c3.o b11 = oVar.b();
                    if (b11 instanceof v3.d) {
                        ((v3.d) b11).f47931t = true;
                    }
                }
                if (this.f47431n) {
                    c cVar = this.f47429c;
                    long j12 = this.f47432r;
                    c3.o oVar2 = (c3.o) cVar.f47260c;
                    oVar2.getClass();
                    oVar2.d(j10, j12);
                    this.f47431n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.i iVar = this.e;
                        synchronized (iVar) {
                            while (!iVar.f8237b) {
                                iVar.f8236a.getClass();
                                iVar.wait();
                            }
                        }
                        c cVar2 = this.f47429c;
                        c3.s sVar = this.f47430f;
                        c3.o oVar3 = (c3.o) cVar2.f47260c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) cVar2.d;
                        lVar.getClass();
                        i11 = oVar3.f(lVar, sVar);
                        long b12 = this.f47429c.b();
                        if (b12 > this.f47435x.f47466s + j10) {
                            this.e.d();
                            w0 w0Var2 = this.f47435x;
                            w0Var2.H.post(w0Var2.G);
                            j10 = b12;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f47429c.b() != -1) {
                    this.f47430f.f4657a = this.f47429c.b();
                }
                k7.a(this.f47428b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f47429c.b() != -1) {
                    this.f47430f.f4657a = this.f47429c.b();
                }
                k7.a(this.f47428b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j10, String str) {
        Map map = w0.f47450i0;
        if (str != null && !str.startsWith("W/")) {
            a5.a aVar = new a5.a(4, 5);
            aVar.y(map.entrySet());
            aVar.x("If-Range", str);
            map = aVar.g();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.f47435x.f47465r;
        Uri uri = this.f47427a;
        u6.l(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map, j10, -1L, str2, 6);
    }
}

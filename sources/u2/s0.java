package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import v7.k7;
import v7.u6;
public final class s0 implements y2.i {
    public final Uri f47470a;
    public final g2.b0 f47471b;
    public final t0.h f47472c;
    public final v0 d;
    public final e2.i e;
    public volatile boolean h;
    public long f47475r;
    public g2.m f47476s;
    public c3.j0 v;
    public boolean f47477w;
    public final v0 f47478x;
    public final c3.s f47473f = new Object();
    public boolean f47474n = true;

    public s0(v0 v0Var, Uri uri, g2.h hVar, t0.h hVar2, v0 v0Var2, e2.i iVar) {
        this.f47478x = v0Var;
        this.f47470a = uri;
        this.f47471b = new g2.b0(hVar);
        this.f47472c = hVar2;
        this.d = v0Var2;
        this.e = iVar;
        t.f47480g.getAndIncrement();
        this.f47476s = b(0L, null);
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
                long j10 = this.f47473f.f4659a;
                g2.m b10 = b(j10, str);
                this.f47476s = b10;
                long open = this.f47471b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f47472c.g() != -1) {
                        this.f47473f.f4659a = this.f47472c.g();
                    }
                    k7.a(this.f47471b);
                    return;
                }
                List list = (List) this.f47471b.f10765a.getResponseHeaders().get("ETag");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                if (open != -1) {
                    open += j10;
                    v0 v0Var = this.f47478x;
                    v0Var.H.post(new o0(v0Var, 0));
                }
                long j11 = open;
                this.f47478x.J = p3.b.d(this.f47471b.f10765a.getResponseHeaders());
                g2.b0 b0Var = this.f47471b;
                p3.b bVar = this.f47478x.J;
                if (bVar != null && (i10 = bVar.f44123f) != -1) {
                    hVar = new s(b0Var, i10, this);
                    c3.j0 z10 = this.f47478x.z(new u0(0, true));
                    this.v = z10;
                    z10.b(v0.f47494j0);
                } else {
                    hVar = b0Var;
                }
                this.f47472c.h(hVar, this.f47470a, this.f47471b.f10765a.getResponseHeaders(), j10, j11, this.d);
                if (this.f47478x.J != null && (oVar = (c3.o) this.f47472c.f46912c) != null) {
                    c3.o b11 = oVar.b();
                    if (b11 instanceof v3.d) {
                        ((v3.d) b11).f47978t = true;
                    }
                }
                if (this.f47474n) {
                    t0.h hVar2 = this.f47472c;
                    long j12 = this.f47475r;
                    c3.o oVar2 = (c3.o) hVar2.f46912c;
                    oVar2.getClass();
                    oVar2.d(j10, j12);
                    this.f47474n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.i iVar = this.e;
                        synchronized (iVar) {
                            while (!iVar.f8238b) {
                                iVar.f8237a.getClass();
                                iVar.wait();
                            }
                        }
                        t0.h hVar3 = this.f47472c;
                        c3.s sVar = this.f47473f;
                        c3.o oVar3 = (c3.o) hVar3.f46912c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) hVar3.d;
                        lVar.getClass();
                        i11 = oVar3.f(lVar, sVar);
                        long g10 = this.f47472c.g();
                        if (g10 > this.f47478x.f47509s + j10) {
                            this.e.d();
                            v0 v0Var2 = this.f47478x;
                            v0Var2.H.post(v0Var2.G);
                            j10 = g10;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f47472c.g() != -1) {
                    this.f47473f.f4659a = this.f47472c.g();
                }
                k7.a(this.f47471b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f47472c.g() != -1) {
                    this.f47473f.f4659a = this.f47472c.g();
                }
                k7.a(this.f47471b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j10, String str) {
        Map map = v0.f47493i0;
        if (str != null && !str.startsWith("W/")) {
            a5.a aVar = new a5.a(4, 5);
            aVar.y(map.entrySet());
            aVar.x("If-Range", str);
            map = aVar.g();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.f47478x.f47508r;
        Uri uri = this.f47470a;
        u6.l(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map, j10, -1L, str2, 6);
    }
}

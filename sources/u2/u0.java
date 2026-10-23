package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import v7.k7;
import v7.u6;
public final class u0 implements y2.i {
    public final Uri f47449a;
    public final g2.b0 f47450b;
    public final c f47451c;
    public final x0 d;
    public final e2.i e;
    public volatile boolean h;
    public long f47454r;
    public g2.m f47455s;
    public c3.j0 v;
    public boolean f47456w;
    public final x0 f47457x;
    public final c3.s f47452f = new Object();
    public boolean f47453n = true;

    public u0(x0 x0Var, Uri uri, g2.h hVar, c cVar, x0 x0Var2, e2.i iVar) {
        this.f47457x = x0Var;
        this.f47449a = uri;
        this.f47450b = new g2.b0(hVar);
        this.f47451c = cVar;
        this.d = x0Var2;
        this.e = iVar;
        u.f47444g.getAndIncrement();
        this.f47455s = b(0L, null);
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
                long j10 = this.f47452f.f4655a;
                g2.m b10 = b(j10, str);
                this.f47455s = b10;
                long open = this.f47450b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f47451c.b() != -1) {
                        this.f47452f.f4655a = this.f47451c.b();
                    }
                    k7.a(this.f47450b);
                    return;
                }
                List list = (List) this.f47450b.f10762a.getResponseHeaders().get("ETag");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                if (open != -1) {
                    open += j10;
                    x0 x0Var = this.f47457x;
                    x0Var.H.post(new q0(x0Var, 0));
                }
                long j11 = open;
                this.f47457x.J = p3.b.d(this.f47450b.f10762a.getResponseHeaders());
                g2.b0 b0Var = this.f47450b;
                p3.b bVar = this.f47457x.J;
                if (bVar != null && (i10 = bVar.f44089f) != -1) {
                    hVar = new t(b0Var, i10, this);
                    c3.j0 z10 = this.f47457x.z(new w0(0, true));
                    this.v = z10;
                    z10.b(x0.f47471j0);
                } else {
                    hVar = b0Var;
                }
                this.f47451c.c(hVar, this.f47449a, this.f47450b.f10762a.getResponseHeaders(), j10, j11, this.d);
                if (this.f47457x.J != null && (oVar = (c3.o) this.f47451c.f47274c) != null) {
                    c3.o b11 = oVar.b();
                    if (b11 instanceof v3.d) {
                        ((v3.d) b11).f47942t = true;
                    }
                }
                if (this.f47453n) {
                    c cVar = this.f47451c;
                    long j12 = this.f47454r;
                    c3.o oVar2 = (c3.o) cVar.f47274c;
                    oVar2.getClass();
                    oVar2.d(j10, j12);
                    this.f47453n = false;
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
                        c cVar2 = this.f47451c;
                        c3.s sVar = this.f47452f;
                        c3.o oVar3 = (c3.o) cVar2.f47274c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) cVar2.d;
                        lVar.getClass();
                        i11 = oVar3.f(lVar, sVar);
                        long b12 = this.f47451c.b();
                        if (b12 > this.f47457x.f47486s + j10) {
                            this.e.d();
                            x0 x0Var2 = this.f47457x;
                            x0Var2.H.post(x0Var2.G);
                            j10 = b12;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f47451c.b() != -1) {
                    this.f47452f.f4655a = this.f47451c.b();
                }
                k7.a(this.f47450b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f47451c.b() != -1) {
                    this.f47452f.f4655a = this.f47451c.b();
                }
                k7.a(this.f47450b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j10, String str) {
        Map map = x0.f47470i0;
        if (str != null && !str.startsWith("W/")) {
            a5.a aVar = new a5.a(4, 5);
            aVar.y(map.entrySet());
            aVar.x("If-Range", str);
            map = aVar.g();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.f47457x.f47485r;
        Uri uri = this.f47449a;
        u6.l(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map, j10, -1L, str2, 6);
    }
}

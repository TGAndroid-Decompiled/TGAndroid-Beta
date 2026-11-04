package w2;

import android.net.Uri;
import b8.kg;
import b8.uc;
import b8.zb;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class t0 implements a3.m {
    public final Uri f57218a;
    public final i2.c0 f57219b;
    public final p7.d f57220c;
    public final w0 d;
    public final g2.j f57221e;
    public volatile boolean h;
    public long f57224r;
    public i2.n f57225s;
    public e3.i0 f57226w;
    public boolean f57227x;
    public final w0 f57228y;
    public final e3.s f57222f = new Object();
    public boolean f57223n = true;

    public t0(w0 w0Var, Uri uri, i2.h hVar, p7.d dVar, w0 w0Var2, g2.j jVar) {
        this.f57228y = w0Var;
        this.f57218a = uri;
        this.f57219b = new i2.c0(hVar);
        this.f57220c = dVar;
        this.d = w0Var2;
        this.f57221e = jVar;
        u.f57230g.getAndIncrement();
        this.f57225s = b(0L, null);
    }

    @Override
    public final void X1() {
        this.h = true;
    }

    @Override
    public final void a() {
        i2.h hVar;
        e3.o oVar;
        int i3;
        int i10 = 0;
        String str = null;
        while (i10 == 0 && !this.h) {
            try {
                long j10 = this.f57222f.f9506a;
                i2.n b10 = b(j10, str);
                this.f57225s = b10;
                long open = this.f57219b.open(b10);
                if (this.h) {
                    if (i10 != 1 && this.f57220c.p() != -1) {
                        this.f57222f.f9506a = this.f57220c.p();
                    }
                    uc.a(this.f57219b);
                    return;
                }
                List list = (List) this.f57219b.f14527a.getResponseHeaders().get("ETag");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                if (open != -1) {
                    open += j10;
                    w0 w0Var = this.f57228y;
                    w0Var.I.post(new p0(w0Var, 0));
                }
                long j11 = open;
                this.f57228y.K = r3.b.d(this.f57219b.f14527a.getResponseHeaders());
                i2.c0 c0Var = this.f57219b;
                r3.b bVar = this.f57228y.K;
                if (bVar != null && (i3 = bVar.f54241f) != -1) {
                    hVar = new t(c0Var, i3, this);
                    e3.i0 z10 = this.f57228y.z(new v0(0, true));
                    this.f57226w = z10;
                    z10.g(w0.f57245k0);
                } else {
                    hVar = c0Var;
                }
                this.f57220c.y(hVar, this.f57218a, this.f57219b.f14527a.getResponseHeaders(), j10, j11, this.d);
                if (this.f57228y.K != null && (oVar = (e3.o) this.f57220c.d) != null) {
                    e3.o a10 = oVar.a();
                    if (a10 instanceof x3.d) {
                        ((x3.d) a10).f58200t = true;
                    }
                }
                if (this.f57223n) {
                    p7.d dVar = this.f57220c;
                    long j12 = this.f57224r;
                    e3.o oVar2 = (e3.o) dVar.d;
                    oVar2.getClass();
                    oVar2.d(j10, j12);
                    this.f57223n = false;
                }
                while (i10 == 0 && !this.h) {
                    try {
                        g2.j jVar = this.f57221e;
                        synchronized (jVar) {
                            while (!jVar.f11855b) {
                                jVar.f11854a.getClass();
                                jVar.wait();
                            }
                        }
                        p7.d dVar2 = this.f57220c;
                        e3.s sVar = this.f57222f;
                        e3.o oVar3 = (e3.o) dVar2.d;
                        oVar3.getClass();
                        e3.l lVar = (e3.l) dVar2.f53346c;
                        lVar.getClass();
                        i10 = oVar3.f(lVar, sVar);
                        long p10 = this.f57220c.p();
                        if (p10 > this.f57228y.f57262s + j10) {
                            this.f57221e.d();
                            w0 w0Var2 = this.f57228y;
                            w0Var2.I.post(w0Var2.H);
                            j10 = p10;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i10 == 1) {
                    i10 = 0;
                } else if (this.f57220c.p() != -1) {
                    this.f57222f.f9506a = this.f57220c.p();
                }
                uc.a(this.f57219b);
            } catch (Throwable th2) {
                if (i10 != 1 && this.f57220c.p() != -1) {
                    this.f57222f.f9506a = this.f57220c.p();
                }
                uc.a(this.f57219b);
                throw th2;
            }
        }
    }

    public final i2.n b(long j10, String str) {
        Map map = w0.f57244j0;
        if (str != null && !str.startsWith("W/")) {
            kg kgVar = new kg(4, 8);
            kgVar.x(map.entrySet());
            kgVar.w("If-Range", str);
            map = kgVar.f();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.f57228y.f57261r;
        Uri uri = this.f57218a;
        zb.k(uri, "The uri must be set.");
        return new i2.n(uri, 1, null, map, j10, -1L, str2, 6);
    }
}

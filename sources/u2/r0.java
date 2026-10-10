package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import v7.k7;
public final class r0 implements y2.i {
    public final Uri f48736a;
    public final g2.b0 f48737b;
    public final la.h f48738c;
    public final u0 d;
    public final e2.g f48739e;
    public volatile boolean h;
    public long f48742r;
    public g2.m f48743s;
    public c3.h0 v;
    public boolean f48744w;
    public final u0 f48745x;
    public final c3.s f48740f = new Object();
    public boolean f48741n = true;

    public r0(u0 u0Var, Uri uri, g2.h hVar, la.h hVar2, u0 u0Var2, e2.g gVar) {
        this.f48745x = u0Var;
        this.f48736a = uri;
        this.f48737b = new g2.b0(hVar);
        this.f48738c = hVar2;
        this.d = u0Var2;
        this.f48739e = gVar;
        t.f48752b.getAndIncrement();
        this.f48743s = b(0L);
    }

    @Override
    public final void a() {
        g2.h hVar;
        c3.o oVar;
        int i10;
        int i11 = 0;
        while (i11 == 0 && !this.h) {
            try {
                long j3 = this.f48740f.f4150a;
                g2.m b10 = b(j3);
                this.f48743s = b10;
                long open = this.f48737b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f48738c.F() != -1) {
                        this.f48740f.f4150a = this.f48738c.F();
                    }
                    k7.a(this.f48737b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    u0 u0Var = this.f48745x;
                    u0Var.H.post(new o0(u0Var, 0));
                }
                long j10 = open;
                this.f48745x.J = p3.b.d(this.f48737b.f10233a.getResponseHeaders());
                g2.b0 b0Var = this.f48737b;
                p3.b bVar = this.f48745x.J;
                if (bVar != null && (i10 = bVar.f45359f) != -1) {
                    hVar = new s(b0Var, i10, this);
                    c3.h0 w10 = this.f48745x.w(new t0(0, true));
                    this.v = w10;
                    w10.b(u0.f48758h0);
                } else {
                    hVar = b0Var;
                }
                this.f48738c.P(hVar, this.f48736a, this.f48737b.f10233a.getResponseHeaders(), j3, j10, this.d);
                if (this.f48745x.J != null && (oVar = (c3.o) this.f48738c.f15467c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).f49143s = true;
                    }
                }
                if (this.f48741n) {
                    la.h hVar2 = this.f48738c;
                    long j11 = this.f48742r;
                    c3.o oVar2 = (c3.o) hVar2.f15467c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.f48741n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.g gVar = this.f48739e;
                        synchronized (gVar) {
                            while (!gVar.f8549b) {
                                gVar.f8548a.getClass();
                                gVar.wait();
                            }
                        }
                        la.h hVar3 = this.f48738c;
                        c3.s sVar = this.f48740f;
                        c3.o oVar3 = (c3.o) hVar3.f15467c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) hVar3.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long F = this.f48738c.F();
                        if (F > this.f48745x.f48772s + j3) {
                            this.f48739e.d();
                            u0 u0Var2 = this.f48745x;
                            u0Var2.H.post(u0Var2.G);
                            j3 = F;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f48738c.F() != -1) {
                    this.f48740f.f4150a = this.f48738c.F();
                }
                k7.a(this.f48737b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f48738c.F() != -1) {
                    this.f48740f.f4150a = this.f48738c.F();
                }
                k7.a(this.f48737b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f48745x.f48771r;
        Map map2 = u0.f48757g0;
        Uri uri = this.f48736a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }

    @Override
    public final void v() {
        this.h = true;
    }
}

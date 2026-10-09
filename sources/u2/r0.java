package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import v7.k7;
public final class r0 implements y2.i {
    public final Uri f48690a;
    public final g2.b0 f48691b;
    public final la.h f48692c;
    public final u0 d;
    public final e2.g f48693e;
    public volatile boolean h;
    public long f48696r;
    public g2.m f48697s;
    public c3.h0 v;
    public boolean f48698w;
    public final u0 f48699x;
    public final c3.s f48694f = new Object();
    public boolean f48695n = true;

    public r0(u0 u0Var, Uri uri, g2.h hVar, la.h hVar2, u0 u0Var2, e2.g gVar) {
        this.f48699x = u0Var;
        this.f48690a = uri;
        this.f48691b = new g2.b0(hVar);
        this.f48692c = hVar2;
        this.d = u0Var2;
        this.f48693e = gVar;
        t.f48706b.getAndIncrement();
        this.f48697s = b(0L);
    }

    @Override
    public final void a() {
        g2.h hVar;
        c3.o oVar;
        int i10;
        int i11 = 0;
        while (i11 == 0 && !this.h) {
            try {
                long j3 = this.f48694f.f4150a;
                g2.m b10 = b(j3);
                this.f48697s = b10;
                long open = this.f48691b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f48692c.F() != -1) {
                        this.f48694f.f4150a = this.f48692c.F();
                    }
                    k7.a(this.f48691b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    u0 u0Var = this.f48699x;
                    u0Var.H.post(new o0(u0Var, 0));
                }
                long j10 = open;
                this.f48699x.J = p3.b.d(this.f48691b.f10233a.getResponseHeaders());
                g2.b0 b0Var = this.f48691b;
                p3.b bVar = this.f48699x.J;
                if (bVar != null && (i10 = bVar.f45313f) != -1) {
                    hVar = new s(b0Var, i10, this);
                    c3.h0 w10 = this.f48699x.w(new t0(0, true));
                    this.v = w10;
                    w10.b(u0.f48712h0);
                } else {
                    hVar = b0Var;
                }
                this.f48692c.P(hVar, this.f48690a, this.f48691b.f10233a.getResponseHeaders(), j3, j10, this.d);
                if (this.f48699x.J != null && (oVar = (c3.o) this.f48692c.f15463c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).f49097s = true;
                    }
                }
                if (this.f48695n) {
                    la.h hVar2 = this.f48692c;
                    long j11 = this.f48696r;
                    c3.o oVar2 = (c3.o) hVar2.f15463c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.f48695n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.g gVar = this.f48693e;
                        synchronized (gVar) {
                            while (!gVar.f8549b) {
                                gVar.f8548a.getClass();
                                gVar.wait();
                            }
                        }
                        la.h hVar3 = this.f48692c;
                        c3.s sVar = this.f48694f;
                        c3.o oVar3 = (c3.o) hVar3.f15463c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) hVar3.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long F = this.f48692c.F();
                        if (F > this.f48699x.f48726s + j3) {
                            this.f48693e.d();
                            u0 u0Var2 = this.f48699x;
                            u0Var2.H.post(u0Var2.G);
                            j3 = F;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f48692c.F() != -1) {
                    this.f48694f.f4150a = this.f48692c.F();
                }
                k7.a(this.f48691b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f48692c.F() != -1) {
                    this.f48694f.f4150a = this.f48692c.F();
                }
                k7.a(this.f48691b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f48699x.f48725r;
        Map map2 = u0.f48711g0;
        Uri uri = this.f48690a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }

    @Override
    public final void v() {
        this.h = true;
    }
}

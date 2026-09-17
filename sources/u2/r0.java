package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import v7.m7;
public final class r0 implements y2.j {
    public final Uri f46817a;
    public final g2.b0 f46818b;
    public final m2.t f46819c;
    public final u0 d;
    public final e2.g f46820e;
    public volatile boolean h;
    public long f46823r;
    public g2.m f46824s;
    public c3.h0 v;
    public boolean f46825w;
    public final u0 f46826x;
    public final c3.s f46821f = new Object();
    public boolean f46822n = true;

    public r0(u0 u0Var, Uri uri, g2.h hVar, m2.t tVar, u0 u0Var2, e2.g gVar) {
        this.f46826x = u0Var;
        this.f46817a = uri;
        this.f46818b = new g2.b0(hVar);
        this.f46819c = tVar;
        this.d = u0Var2;
        this.f46820e = gVar;
        t.f46833b.getAndIncrement();
        this.f46824s = b(0L);
    }

    @Override
    public final void W() {
        this.h = true;
    }

    @Override
    public final void a() {
        g2.h hVar;
        c3.o oVar;
        int i10;
        int i11 = 0;
        while (i11 == 0 && !this.h) {
            try {
                long j3 = this.f46821f.f4321a;
                g2.m b10 = b(j3);
                this.f46824s = b10;
                long open = this.f46818b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f46819c.z() != -1) {
                        this.f46821f.f4321a = this.f46819c.z();
                    }
                    m7.a(this.f46818b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    u0 u0Var = this.f46826x;
                    u0Var.H.post(new p0(u0Var, 0));
                }
                long j10 = open;
                this.f46826x.J = p3.b.d(this.f46818b.f10324a.getResponseHeaders());
                g2.b0 b0Var = this.f46818b;
                p3.b bVar = this.f46826x.J;
                if (bVar != null && (i10 = bVar.f43821f) != -1) {
                    hVar = new s(b0Var, i10, this);
                    c3.h0 A = this.f46826x.A(new t0(0, true));
                    this.v = A;
                    A.b(u0.f46839h0);
                } else {
                    hVar = b0Var;
                }
                this.f46819c.H(hVar, this.f46817a, this.f46818b.f10324a.getResponseHeaders(), j3, j10, this.d);
                if (this.f46826x.J != null && (oVar = (c3.o) this.f46819c.f15845c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).f47376s = true;
                    }
                }
                if (this.f46822n) {
                    m2.t tVar = this.f46819c;
                    long j11 = this.f46823r;
                    c3.o oVar2 = (c3.o) tVar.f15845c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.f46822n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.g gVar = this.f46820e;
                        synchronized (gVar) {
                            while (!gVar.f8782b) {
                                gVar.f8781a.getClass();
                                gVar.wait();
                            }
                        }
                        m2.t tVar2 = this.f46819c;
                        c3.s sVar = this.f46821f;
                        c3.o oVar3 = (c3.o) tVar2.f15845c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) tVar2.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long z10 = this.f46819c.z();
                        if (z10 > this.f46826x.f46853s + j3) {
                            this.f46820e.d();
                            u0 u0Var2 = this.f46826x;
                            u0Var2.H.post(u0Var2.G);
                            j3 = z10;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f46819c.z() != -1) {
                    this.f46821f.f4321a = this.f46819c.z();
                }
                m7.a(this.f46818b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f46819c.z() != -1) {
                    this.f46821f.f4321a = this.f46819c.z();
                }
                m7.a(this.f46818b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f46826x.f46852r;
        Map map2 = u0.f46838g0;
        Uri uri = this.f46817a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }
}

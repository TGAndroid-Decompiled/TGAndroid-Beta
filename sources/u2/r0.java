package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import v7.m7;
public final class r0 implements y2.j {
    public final Uri f46788a;
    public final g2.b0 f46789b;
    public final m2.t f46790c;
    public final u0 d;
    public final e2.g f46791e;
    public volatile boolean h;
    public long f46794r;
    public g2.m f46795s;
    public c3.h0 v;
    public boolean f46796w;
    public final u0 f46797x;
    public final c3.s f46792f = new Object();
    public boolean f46793n = true;

    public r0(u0 u0Var, Uri uri, g2.h hVar, m2.t tVar, u0 u0Var2, e2.g gVar) {
        this.f46797x = u0Var;
        this.f46788a = uri;
        this.f46789b = new g2.b0(hVar);
        this.f46790c = tVar;
        this.d = u0Var2;
        this.f46791e = gVar;
        t.f46804b.getAndIncrement();
        this.f46795s = b(0L);
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
                long j3 = this.f46792f.f4294a;
                g2.m b10 = b(j3);
                this.f46795s = b10;
                long open = this.f46789b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f46790c.z() != -1) {
                        this.f46792f.f4294a = this.f46790c.z();
                    }
                    m7.a(this.f46789b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    u0 u0Var = this.f46797x;
                    u0Var.H.post(new p0(u0Var, 0));
                }
                long j10 = open;
                this.f46797x.J = p3.b.d(this.f46789b.f10296a.getResponseHeaders());
                g2.b0 b0Var = this.f46789b;
                p3.b bVar = this.f46797x.J;
                if (bVar != null && (i10 = bVar.f43793f) != -1) {
                    hVar = new s(b0Var, i10, this);
                    c3.h0 A = this.f46797x.A(new t0(0, true));
                    this.v = A;
                    A.b(u0.f46810h0);
                } else {
                    hVar = b0Var;
                }
                this.f46790c.H(hVar, this.f46788a, this.f46789b.f10296a.getResponseHeaders(), j3, j10, this.d);
                if (this.f46797x.J != null && (oVar = (c3.o) this.f46790c.f15818c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).f47347s = true;
                    }
                }
                if (this.f46793n) {
                    m2.t tVar = this.f46790c;
                    long j11 = this.f46794r;
                    c3.o oVar2 = (c3.o) tVar.f15818c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.f46793n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.g gVar = this.f46791e;
                        synchronized (gVar) {
                            while (!gVar.f8754b) {
                                gVar.f8753a.getClass();
                                gVar.wait();
                            }
                        }
                        m2.t tVar2 = this.f46790c;
                        c3.s sVar = this.f46792f;
                        c3.o oVar3 = (c3.o) tVar2.f15818c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) tVar2.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long z10 = this.f46790c.z();
                        if (z10 > this.f46797x.f46824s + j3) {
                            this.f46791e.d();
                            u0 u0Var2 = this.f46797x;
                            u0Var2.H.post(u0Var2.G);
                            j3 = z10;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f46790c.z() != -1) {
                    this.f46792f.f4294a = this.f46790c.z();
                }
                m7.a(this.f46789b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f46790c.z() != -1) {
                    this.f46792f.f4294a = this.f46790c.z();
                }
                m7.a(this.f46789b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f46797x.f46823r;
        Map map2 = u0.f46809g0;
        Uri uri = this.f46788a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }
}

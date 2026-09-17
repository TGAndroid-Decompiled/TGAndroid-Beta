package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import v7.m7;
public final class r0 implements y2.j {
    public final Uri f46789a;
    public final g2.b0 f46790b;
    public final m2.t f46791c;
    public final u0 d;
    public final e2.g f46792e;
    public volatile boolean h;
    public long f46795r;
    public g2.m f46796s;
    public c3.h0 v;
    public boolean f46797w;
    public final u0 f46798x;
    public final c3.s f46793f = new Object();
    public boolean f46794n = true;

    public r0(u0 u0Var, Uri uri, g2.h hVar, m2.t tVar, u0 u0Var2, e2.g gVar) {
        this.f46798x = u0Var;
        this.f46789a = uri;
        this.f46790b = new g2.b0(hVar);
        this.f46791c = tVar;
        this.d = u0Var2;
        this.f46792e = gVar;
        t.f46805b.getAndIncrement();
        this.f46796s = b(0L);
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
                long j3 = this.f46793f.f4294a;
                g2.m b10 = b(j3);
                this.f46796s = b10;
                long open = this.f46790b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f46791c.z() != -1) {
                        this.f46793f.f4294a = this.f46791c.z();
                    }
                    m7.a(this.f46790b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    u0 u0Var = this.f46798x;
                    u0Var.H.post(new p0(u0Var, 0));
                }
                long j10 = open;
                this.f46798x.J = p3.b.d(this.f46790b.f10296a.getResponseHeaders());
                g2.b0 b0Var = this.f46790b;
                p3.b bVar = this.f46798x.J;
                if (bVar != null && (i10 = bVar.f43794f) != -1) {
                    hVar = new s(b0Var, i10, this);
                    c3.h0 A = this.f46798x.A(new t0(0, true));
                    this.v = A;
                    A.b(u0.f46811h0);
                } else {
                    hVar = b0Var;
                }
                this.f46791c.H(hVar, this.f46789a, this.f46790b.f10296a.getResponseHeaders(), j3, j10, this.d);
                if (this.f46798x.J != null && (oVar = (c3.o) this.f46791c.f15818c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).f47348s = true;
                    }
                }
                if (this.f46794n) {
                    m2.t tVar = this.f46791c;
                    long j11 = this.f46795r;
                    c3.o oVar2 = (c3.o) tVar.f15818c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.f46794n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.g gVar = this.f46792e;
                        synchronized (gVar) {
                            while (!gVar.f8754b) {
                                gVar.f8753a.getClass();
                                gVar.wait();
                            }
                        }
                        m2.t tVar2 = this.f46791c;
                        c3.s sVar = this.f46793f;
                        c3.o oVar3 = (c3.o) tVar2.f15818c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) tVar2.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long z10 = this.f46791c.z();
                        if (z10 > this.f46798x.f46825s + j3) {
                            this.f46792e.d();
                            u0 u0Var2 = this.f46798x;
                            u0Var2.H.post(u0Var2.G);
                            j3 = z10;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f46791c.z() != -1) {
                    this.f46793f.f4294a = this.f46791c.z();
                }
                m7.a(this.f46790b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f46791c.z() != -1) {
                    this.f46793f.f4294a = this.f46791c.z();
                }
                m7.a(this.f46790b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f46798x.f46824r;
        Map map2 = u0.f46810g0;
        Uri uri = this.f46789a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }
}

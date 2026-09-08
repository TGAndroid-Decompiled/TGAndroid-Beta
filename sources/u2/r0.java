package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import v7.m7;
public final class r0 implements y2.j {
    public final Uri f46816a;
    public final g2.b0 f46817b;
    public final m2.t f46818c;
    public final u0 d;
    public final e2.g f46819e;
    public volatile boolean h;
    public long f46822r;
    public g2.m f46823s;
    public c3.h0 v;
    public boolean f46824w;
    public final u0 f46825x;
    public final c3.s f46820f = new Object();
    public boolean f46821n = true;

    public r0(u0 u0Var, Uri uri, g2.h hVar, m2.t tVar, u0 u0Var2, e2.g gVar) {
        this.f46825x = u0Var;
        this.f46816a = uri;
        this.f46817b = new g2.b0(hVar);
        this.f46818c = tVar;
        this.d = u0Var2;
        this.f46819e = gVar;
        t.f46832b.getAndIncrement();
        this.f46823s = b(0L);
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
                long j3 = this.f46820f.f4321a;
                g2.m b10 = b(j3);
                this.f46823s = b10;
                long open = this.f46817b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f46818c.z() != -1) {
                        this.f46820f.f4321a = this.f46818c.z();
                    }
                    m7.a(this.f46817b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    u0 u0Var = this.f46825x;
                    u0Var.H.post(new p0(u0Var, 0));
                }
                long j10 = open;
                this.f46825x.J = p3.b.d(this.f46817b.f10324a.getResponseHeaders());
                g2.b0 b0Var = this.f46817b;
                p3.b bVar = this.f46825x.J;
                if (bVar != null && (i10 = bVar.f43820f) != -1) {
                    hVar = new s(b0Var, i10, this);
                    c3.h0 A = this.f46825x.A(new t0(0, true));
                    this.v = A;
                    A.b(u0.f46838h0);
                } else {
                    hVar = b0Var;
                }
                this.f46818c.H(hVar, this.f46816a, this.f46817b.f10324a.getResponseHeaders(), j3, j10, this.d);
                if (this.f46825x.J != null && (oVar = (c3.o) this.f46818c.f15845c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).f47375s = true;
                    }
                }
                if (this.f46821n) {
                    m2.t tVar = this.f46818c;
                    long j11 = this.f46822r;
                    c3.o oVar2 = (c3.o) tVar.f15845c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.f46821n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.g gVar = this.f46819e;
                        synchronized (gVar) {
                            while (!gVar.f8782b) {
                                gVar.f8781a.getClass();
                                gVar.wait();
                            }
                        }
                        m2.t tVar2 = this.f46818c;
                        c3.s sVar = this.f46820f;
                        c3.o oVar3 = (c3.o) tVar2.f15845c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) tVar2.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long z10 = this.f46818c.z();
                        if (z10 > this.f46825x.f46852s + j3) {
                            this.f46819e.d();
                            u0 u0Var2 = this.f46825x;
                            u0Var2.H.post(u0Var2.G);
                            j3 = z10;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f46818c.z() != -1) {
                    this.f46820f.f4321a = this.f46818c.z();
                }
                m7.a(this.f46817b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f46818c.z() != -1) {
                    this.f46820f.f4321a = this.f46818c.z();
                }
                m7.a(this.f46817b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f46825x.f46851r;
        Map map2 = u0.f46837g0;
        Uri uri = this.f46816a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }
}

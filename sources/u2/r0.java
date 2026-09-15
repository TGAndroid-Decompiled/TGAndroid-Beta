package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import m.e3;
import v7.m7;
public final class r0 implements y2.j {
    public final Uri f43470a;
    public final g2.b0 f43471b;
    public final e3 f43472c;
    public final u0 d;
    public final e2.g e;
    public volatile boolean h;
    public long f43475r;
    public g2.m f43476s;
    public c3.h0 v;
    public boolean f43477w;
    public final u0 f43478x;
    public final c3.s f43473f = new Object();
    public boolean f43474n = true;

    public r0(u0 u0Var, Uri uri, g2.h hVar, e3 e3Var, u0 u0Var2, e2.g gVar) {
        this.f43478x = u0Var;
        this.f43470a = uri;
        this.f43471b = new g2.b0(hVar);
        this.f43472c = e3Var;
        this.d = u0Var2;
        this.e = gVar;
        t.f43484b.getAndIncrement();
        this.f43476s = b(0L);
    }

    @Override
    public final void H() {
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
                long j3 = this.f43473f.f3793a;
                g2.m b10 = b(j3);
                this.f43476s = b10;
                long open = this.f43471b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f43472c.D() != -1) {
                        this.f43473f.f3793a = this.f43472c.D();
                    }
                    m7.a(this.f43471b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    u0 u0Var = this.f43478x;
                    u0Var.H.post(new p0(u0Var, 0));
                }
                long j10 = open;
                this.f43478x.J = p3.b.d(this.f43471b.f9345a.getResponseHeaders());
                g2.b0 b0Var = this.f43471b;
                p3.b bVar = this.f43478x.J;
                if (bVar != null && (i10 = bVar.f40540f) != -1) {
                    hVar = new s(b0Var, i10, this);
                    c3.h0 z10 = this.f43478x.z(new t0(0, true));
                    this.v = z10;
                    z10.b(u0.f43490h0);
                } else {
                    hVar = b0Var;
                }
                this.f43472c.N(hVar, this.f43470a, this.f43471b.f9345a.getResponseHeaders(), j3, j10, this.d);
                if (this.f43478x.J != null && (oVar = (c3.o) this.f43472c.f14166c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).f43887s = true;
                    }
                }
                if (this.f43474n) {
                    e3 e3Var = this.f43472c;
                    long j11 = this.f43475r;
                    c3.o oVar2 = (c3.o) e3Var.f14166c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.f43474n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.g gVar = this.e;
                        synchronized (gVar) {
                            while (!gVar.f7899b) {
                                gVar.f7898a.getClass();
                                gVar.wait();
                            }
                        }
                        e3 e3Var2 = this.f43472c;
                        c3.s sVar = this.f43473f;
                        c3.o oVar3 = (c3.o) e3Var2.f14166c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) e3Var2.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long D = this.f43472c.D();
                        if (D > this.f43478x.f43503s + j3) {
                            this.e.d();
                            u0 u0Var2 = this.f43478x;
                            u0Var2.H.post(u0Var2.G);
                            j3 = D;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f43472c.D() != -1) {
                    this.f43473f.f3793a = this.f43472c.D();
                }
                m7.a(this.f43471b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f43472c.D() != -1) {
                    this.f43473f.f3793a = this.f43472c.D();
                }
                m7.a(this.f43471b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f43478x.f43502r;
        Map map2 = u0.f43489g0;
        Uri uri = this.f43470a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }
}

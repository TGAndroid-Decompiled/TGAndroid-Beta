package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import v7.n7;
public final class q0 implements y2.i {
    public final Uri f43797a;
    public final g2.b0 f43798b;
    public final la.h f43799c;
    public final t0 d;
    public final e2.g e;
    public volatile boolean h;
    public long f43802r;
    public g2.m f43803s;
    public c3.h0 v;
    public boolean f43804w;
    public final t0 f43805x;
    public final c3.s f43800f = new Object();
    public boolean f43801n = true;

    public q0(t0 t0Var, Uri uri, g2.h hVar, la.h hVar2, t0 t0Var2, e2.g gVar) {
        this.f43805x = t0Var;
        this.f43797a = uri;
        this.f43798b = new g2.b0(hVar);
        this.f43799c = hVar2;
        this.d = t0Var2;
        this.e = gVar;
        t.f43813b.getAndIncrement();
        this.f43803s = b(0L);
    }

    @Override
    public final void a() {
        g2.h hVar;
        c3.o oVar;
        int i10;
        int i11 = 0;
        while (i11 == 0 && !this.h) {
            try {
                long j3 = this.f43800f.f3792a;
                g2.m b10 = b(j3);
                this.f43803s = b10;
                long open = this.f43798b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f43799c.E() != -1) {
                        this.f43800f.f3792a = this.f43799c.E();
                    }
                    n7.a(this.f43798b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    t0 t0Var = this.f43805x;
                    t0Var.H.post(new o0(t0Var, 0));
                }
                long j10 = open;
                this.f43805x.J = p3.b.d(this.f43798b.f9337a.getResponseHeaders());
                g2.b0 b0Var = this.f43798b;
                p3.b bVar = this.f43805x.J;
                if (bVar != null && (i10 = bVar.f40805f) != -1) {
                    hVar = new s(b0Var, i10, this);
                    c3.h0 z10 = this.f43805x.z(new s0(0, true));
                    this.v = z10;
                    z10.b(t0.f43816h0);
                } else {
                    hVar = b0Var;
                }
                this.f43799c.O(hVar, this.f43797a, this.f43798b.f9337a.getResponseHeaders(), j3, j10, this.d);
                if (this.f43805x.J != null && (oVar = (c3.o) this.f43799c.f14169c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).f44215s = true;
                    }
                }
                if (this.f43801n) {
                    la.h hVar2 = this.f43799c;
                    long j11 = this.f43802r;
                    c3.o oVar2 = (c3.o) hVar2.f14169c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.f43801n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.g gVar = this.e;
                        synchronized (gVar) {
                            while (!gVar.f7888b) {
                                gVar.f7887a.getClass();
                                gVar.wait();
                            }
                        }
                        la.h hVar3 = this.f43799c;
                        c3.s sVar = this.f43800f;
                        c3.o oVar3 = (c3.o) hVar3.f14169c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) hVar3.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long E = this.f43799c.E();
                        if (E > this.f43805x.f43829s + j3) {
                            this.e.d();
                            t0 t0Var2 = this.f43805x;
                            t0Var2.H.post(t0Var2.G);
                            j3 = E;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f43799c.E() != -1) {
                    this.f43800f.f3792a = this.f43799c.E();
                }
                n7.a(this.f43798b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f43799c.E() != -1) {
                    this.f43800f.f3792a = this.f43799c.E();
                }
                n7.a(this.f43798b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f43805x.f43828r;
        Map map2 = t0.f43815g0;
        Uri uri = this.f43797a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }

    @Override
    public final void q() {
        this.h = true;
    }
}

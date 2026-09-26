package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import v7.n7;
public final class r0 implements y2.i {
    public final Uri f43754a;
    public final g2.b0 f43755b;
    public final la.h f43756c;
    public final u0 d;
    public final e2.g e;
    public volatile boolean h;
    public long f43759r;
    public g2.m f43760s;
    public c3.h0 v;
    public boolean f43761w;
    public final u0 f43762x;
    public final c3.s f43757f = new Object();
    public boolean f43758n = true;

    public r0(u0 u0Var, Uri uri, g2.h hVar, la.h hVar2, u0 u0Var2, e2.g gVar) {
        this.f43762x = u0Var;
        this.f43754a = uri;
        this.f43755b = new g2.b0(hVar);
        this.f43756c = hVar2;
        this.d = u0Var2;
        this.e = gVar;
        t.f43768b.getAndIncrement();
        this.f43760s = b(0L);
    }

    @Override
    public final void D() {
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
                long j3 = this.f43757f.f3790a;
                g2.m b10 = b(j3);
                this.f43760s = b10;
                long open = this.f43755b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f43756c.E() != -1) {
                        this.f43757f.f3790a = this.f43756c.E();
                    }
                    n7.a(this.f43755b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    u0 u0Var = this.f43762x;
                    u0Var.H.post(new o0(u0Var, 0));
                }
                long j10 = open;
                this.f43762x.J = p3.b.d(this.f43755b.f9332a.getResponseHeaders());
                g2.b0 b0Var = this.f43755b;
                p3.b bVar = this.f43762x.J;
                if (bVar != null && (i10 = bVar.f40806f) != -1) {
                    hVar = new s(b0Var, i10, this);
                    c3.h0 z10 = this.f43762x.z(new t0(0, true));
                    this.v = z10;
                    z10.b(u0.f43774h0);
                } else {
                    hVar = b0Var;
                }
                this.f43756c.O(hVar, this.f43754a, this.f43755b.f9332a.getResponseHeaders(), j3, j10, this.d);
                if (this.f43762x.J != null && (oVar = (c3.o) this.f43756c.f14167c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).f44168s = true;
                    }
                }
                if (this.f43758n) {
                    la.h hVar2 = this.f43756c;
                    long j11 = this.f43759r;
                    c3.o oVar2 = (c3.o) hVar2.f14167c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.f43758n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.g gVar = this.e;
                        synchronized (gVar) {
                            while (!gVar.f7886b) {
                                gVar.f7885a.getClass();
                                gVar.wait();
                            }
                        }
                        la.h hVar3 = this.f43756c;
                        c3.s sVar = this.f43757f;
                        c3.o oVar3 = (c3.o) hVar3.f14167c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) hVar3.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long E = this.f43756c.E();
                        if (E > this.f43762x.f43787s + j3) {
                            this.e.d();
                            u0 u0Var2 = this.f43762x;
                            u0Var2.H.post(u0Var2.G);
                            j3 = E;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f43756c.E() != -1) {
                    this.f43757f.f3790a = this.f43756c.E();
                }
                n7.a(this.f43755b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f43756c.E() != -1) {
                    this.f43757f.f3790a = this.f43756c.E();
                }
                n7.a(this.f43755b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f43762x.f43786r;
        Map map2 = u0.f43773g0;
        Uri uri = this.f43754a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }
}

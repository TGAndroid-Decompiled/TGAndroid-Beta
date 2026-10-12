package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import m.f3;
import v7.k7;
public final class q0 implements y2.i {
    public final Uri f48904a;
    public final g2.b0 f48905b;
    public final f3 f48906c;
    public final t0 d;
    public final e2.g f48907e;
    public volatile boolean h;
    public long f48910r;
    public g2.m f48911s;
    public c3.h0 v;
    public boolean f48912w;
    public final t0 f48913x;
    public final c3.s f48908f = new Object();
    public boolean f48909n = true;

    public q0(t0 t0Var, Uri uri, g2.h hVar, f3 f3Var, t0 t0Var2, e2.g gVar) {
        this.f48913x = t0Var;
        this.f48904a = uri;
        this.f48905b = new g2.b0(hVar);
        this.f48906c = f3Var;
        this.d = t0Var2;
        this.f48907e = gVar;
        t.f48923b.getAndIncrement();
        this.f48911s = b(0L);
    }

    @Override
    public final void C() {
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
                long j3 = this.f48908f.f4149a;
                g2.m b10 = b(j3);
                this.f48911s = b10;
                long open = this.f48905b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f48906c.E() != -1) {
                        this.f48908f.f4149a = this.f48906c.E();
                    }
                    k7.a(this.f48905b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    t0 t0Var = this.f48913x;
                    t0Var.H.post(new o0(t0Var, 0));
                }
                long j10 = open;
                this.f48913x.J = p3.b.d(this.f48905b.f10231a.getResponseHeaders());
                g2.b0 b0Var = this.f48905b;
                p3.b bVar = this.f48913x.J;
                if (bVar != null && (i10 = bVar.f45203f) != -1) {
                    hVar = new s(b0Var, i10, this);
                    c3.h0 w10 = this.f48913x.w(new s0(0, true));
                    this.v = w10;
                    w10.b(t0.f48926h0);
                } else {
                    hVar = b0Var;
                }
                this.f48906c.O(hVar, this.f48904a, this.f48905b.f10231a.getResponseHeaders(), j3, j10, this.d);
                if (this.f48913x.J != null && (oVar = (c3.o) this.f48906c.f15425c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).f49335s = true;
                    }
                }
                if (this.f48909n) {
                    f3 f3Var = this.f48906c;
                    long j11 = this.f48910r;
                    c3.o oVar2 = (c3.o) f3Var.f15425c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.f48909n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.g gVar = this.f48907e;
                        synchronized (gVar) {
                            while (!gVar.f8546b) {
                                gVar.f8545a.getClass();
                                gVar.wait();
                            }
                        }
                        f3 f3Var2 = this.f48906c;
                        c3.s sVar = this.f48908f;
                        c3.o oVar3 = (c3.o) f3Var2.f15425c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) f3Var2.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long E = this.f48906c.E();
                        if (E > this.f48913x.f48940s + j3) {
                            this.f48907e.d();
                            t0 t0Var2 = this.f48913x;
                            t0Var2.H.post(t0Var2.G);
                            j3 = E;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f48906c.E() != -1) {
                    this.f48908f.f4149a = this.f48906c.E();
                }
                k7.a(this.f48905b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f48906c.E() != -1) {
                    this.f48908f.f4149a = this.f48906c.E();
                }
                k7.a(this.f48905b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f48913x.f48939r;
        Map map2 = t0.f48925g0;
        Uri uri = this.f48904a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }
}

package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import m.f3;
import v7.k7;
public final class q0 implements y2.i {
    public final Uri f48896a;
    public final g2.b0 f48897b;
    public final f3 f48898c;
    public final t0 d;
    public final e2.g f48899e;
    public volatile boolean h;
    public long f48902r;
    public g2.m f48903s;
    public c3.h0 v;
    public boolean f48904w;
    public final t0 f48905x;
    public final c3.s f48900f = new Object();
    public boolean f48901n = true;

    public q0(t0 t0Var, Uri uri, g2.h hVar, f3 f3Var, t0 t0Var2, e2.g gVar) {
        this.f48905x = t0Var;
        this.f48896a = uri;
        this.f48897b = new g2.b0(hVar);
        this.f48898c = f3Var;
        this.d = t0Var2;
        this.f48899e = gVar;
        t.f48915b.getAndIncrement();
        this.f48903s = b(0L);
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
                long j3 = this.f48900f.f4149a;
                g2.m b10 = b(j3);
                this.f48903s = b10;
                long open = this.f48897b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f48898c.E() != -1) {
                        this.f48900f.f4149a = this.f48898c.E();
                    }
                    k7.a(this.f48897b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    t0 t0Var = this.f48905x;
                    t0Var.H.post(new o0(t0Var, 0));
                }
                long j10 = open;
                this.f48905x.J = p3.b.d(this.f48897b.f10231a.getResponseHeaders());
                g2.b0 b0Var = this.f48897b;
                p3.b bVar = this.f48905x.J;
                if (bVar != null && (i10 = bVar.f45198f) != -1) {
                    hVar = new s(b0Var, i10, this);
                    c3.h0 w10 = this.f48905x.w(new s0(0, true));
                    this.v = w10;
                    w10.b(t0.f48918h0);
                } else {
                    hVar = b0Var;
                }
                this.f48898c.O(hVar, this.f48896a, this.f48897b.f10231a.getResponseHeaders(), j3, j10, this.d);
                if (this.f48905x.J != null && (oVar = (c3.o) this.f48898c.f15424c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).f49327s = true;
                    }
                }
                if (this.f48901n) {
                    f3 f3Var = this.f48898c;
                    long j11 = this.f48902r;
                    c3.o oVar2 = (c3.o) f3Var.f15424c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.f48901n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.g gVar = this.f48899e;
                        synchronized (gVar) {
                            while (!gVar.f8546b) {
                                gVar.f8545a.getClass();
                                gVar.wait();
                            }
                        }
                        f3 f3Var2 = this.f48898c;
                        c3.s sVar = this.f48900f;
                        c3.o oVar3 = (c3.o) f3Var2.f15424c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) f3Var2.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long E = this.f48898c.E();
                        if (E > this.f48905x.f48932s + j3) {
                            this.f48899e.d();
                            t0 t0Var2 = this.f48905x;
                            t0Var2.H.post(t0Var2.G);
                            j3 = E;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f48898c.E() != -1) {
                    this.f48900f.f4149a = this.f48898c.E();
                }
                k7.a(this.f48897b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f48898c.E() != -1) {
                    this.f48900f.f4149a = this.f48898c.E();
                }
                k7.a(this.f48897b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f48905x.f48931r;
        Map map2 = t0.f48917g0;
        Uri uri = this.f48896a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }
}

package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import v7.k7;
public final class q0 implements y2.i {
    public final Uri f48755a;
    public final g2.b0 f48756b;
    public final la.h f48757c;
    public final t0 d;
    public final e2.g f48758e;
    public volatile boolean h;
    public long f48761r;
    public g2.m f48762s;
    public c3.h0 v;
    public boolean f48763w;
    public final t0 f48764x;
    public final c3.s f48759f = new Object();
    public boolean f48760n = true;

    public q0(t0 t0Var, Uri uri, g2.h hVar, la.h hVar2, t0 t0Var2, e2.g gVar) {
        this.f48764x = t0Var;
        this.f48755a = uri;
        this.f48756b = new g2.b0(hVar);
        this.f48757c = hVar2;
        this.d = t0Var2;
        this.f48758e = gVar;
        t.f48774b.getAndIncrement();
        this.f48762s = b(0L);
    }

    @Override
    public final void a() {
        g2.h hVar;
        c3.o oVar;
        int i10;
        int i11 = 0;
        while (i11 == 0 && !this.h) {
            try {
                long j3 = this.f48759f.f4150a;
                g2.m b10 = b(j3);
                this.f48762s = b10;
                long open = this.f48756b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f48757c.F() != -1) {
                        this.f48759f.f4150a = this.f48757c.F();
                    }
                    k7.a(this.f48756b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    t0 t0Var = this.f48764x;
                    t0Var.H.post(new o0(t0Var, 0));
                }
                long j10 = open;
                this.f48764x.J = p3.b.d(this.f48756b.f10232a.getResponseHeaders());
                g2.b0 b0Var = this.f48756b;
                p3.b bVar = this.f48764x.J;
                if (bVar != null && (i10 = bVar.f45349f) != -1) {
                    hVar = new s(b0Var, i10, this);
                    c3.h0 w10 = this.f48764x.w(new s0(0, true));
                    this.v = w10;
                    w10.b(t0.f48777h0);
                } else {
                    hVar = b0Var;
                }
                this.f48757c.P(hVar, this.f48755a, this.f48756b.f10232a.getResponseHeaders(), j3, j10, this.d);
                if (this.f48764x.J != null && (oVar = (c3.o) this.f48757c.f15466c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).f49186s = true;
                    }
                }
                if (this.f48760n) {
                    la.h hVar2 = this.f48757c;
                    long j11 = this.f48761r;
                    c3.o oVar2 = (c3.o) hVar2.f15466c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.f48760n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.g gVar = this.f48758e;
                        synchronized (gVar) {
                            while (!gVar.f8548b) {
                                gVar.f8547a.getClass();
                                gVar.wait();
                            }
                        }
                        la.h hVar3 = this.f48757c;
                        c3.s sVar = this.f48759f;
                        c3.o oVar3 = (c3.o) hVar3.f15466c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) hVar3.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long F = this.f48757c.F();
                        if (F > this.f48764x.f48791s + j3) {
                            this.f48758e.d();
                            t0 t0Var2 = this.f48764x;
                            t0Var2.H.post(t0Var2.G);
                            j3 = F;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f48757c.F() != -1) {
                    this.f48759f.f4150a = this.f48757c.F();
                }
                k7.a(this.f48756b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f48757c.F() != -1) {
                    this.f48759f.f4150a = this.f48757c.F();
                }
                k7.a(this.f48756b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f48764x.f48790r;
        Map map2 = t0.f48776g0;
        Uri uri = this.f48755a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }

    @Override
    public final void v() {
        this.h = true;
    }
}

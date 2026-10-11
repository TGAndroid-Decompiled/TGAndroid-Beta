package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import v7.k7;
public final class q0 implements y2.i {
    public final Uri f48789a;
    public final g2.b0 f48790b;
    public final la.h f48791c;
    public final t0 d;
    public final e2.g f48792e;
    public volatile boolean h;
    public long f48795r;
    public g2.m f48796s;
    public c3.h0 v;
    public boolean f48797w;
    public final t0 f48798x;
    public final c3.s f48793f = new Object();
    public boolean f48794n = true;

    public q0(t0 t0Var, Uri uri, g2.h hVar, la.h hVar2, t0 t0Var2, e2.g gVar) {
        this.f48798x = t0Var;
        this.f48789a = uri;
        this.f48790b = new g2.b0(hVar);
        this.f48791c = hVar2;
        this.d = t0Var2;
        this.f48792e = gVar;
        t.f48808b.getAndIncrement();
        this.f48796s = b(0L);
    }

    @Override
    public final void a() {
        g2.h hVar;
        c3.o oVar;
        int i10;
        int i11 = 0;
        while (i11 == 0 && !this.h) {
            try {
                long j3 = this.f48793f.f4150a;
                g2.m b10 = b(j3);
                this.f48796s = b10;
                long open = this.f48790b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f48791c.F() != -1) {
                        this.f48793f.f4150a = this.f48791c.F();
                    }
                    k7.a(this.f48790b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    t0 t0Var = this.f48798x;
                    t0Var.H.post(new o0(t0Var, 0));
                }
                long j10 = open;
                this.f48798x.J = p3.b.d(this.f48790b.f10232a.getResponseHeaders());
                g2.b0 b0Var = this.f48790b;
                p3.b bVar = this.f48798x.J;
                if (bVar != null && (i10 = bVar.f45383f) != -1) {
                    hVar = new s(b0Var, i10, this);
                    c3.h0 w10 = this.f48798x.w(new s0(0, true));
                    this.v = w10;
                    w10.b(t0.f48811h0);
                } else {
                    hVar = b0Var;
                }
                this.f48791c.P(hVar, this.f48789a, this.f48790b.f10232a.getResponseHeaders(), j3, j10, this.d);
                if (this.f48798x.J != null && (oVar = (c3.o) this.f48791c.f15502c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).f49220s = true;
                    }
                }
                if (this.f48794n) {
                    la.h hVar2 = this.f48791c;
                    long j11 = this.f48795r;
                    c3.o oVar2 = (c3.o) hVar2.f15502c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.f48794n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.g gVar = this.f48792e;
                        synchronized (gVar) {
                            while (!gVar.f8548b) {
                                gVar.f8547a.getClass();
                                gVar.wait();
                            }
                        }
                        la.h hVar3 = this.f48791c;
                        c3.s sVar = this.f48793f;
                        c3.o oVar3 = (c3.o) hVar3.f15502c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) hVar3.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long F = this.f48791c.F();
                        if (F > this.f48798x.f48825s + j3) {
                            this.f48792e.d();
                            t0 t0Var2 = this.f48798x;
                            t0Var2.H.post(t0Var2.G);
                            j3 = F;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f48791c.F() != -1) {
                    this.f48793f.f4150a = this.f48791c.F();
                }
                k7.a(this.f48790b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f48791c.F() != -1) {
                    this.f48793f.f4150a = this.f48791c.F();
                }
                k7.a(this.f48790b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f48798x.f48824r;
        Map map2 = t0.f48810g0;
        Uri uri = this.f48789a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }

    @Override
    public final void v() {
        this.h = true;
    }
}

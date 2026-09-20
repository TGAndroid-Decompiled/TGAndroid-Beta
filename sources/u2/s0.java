package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import v7.n7;
public final class s0 implements y2.j {
    public final Uri f43775a;
    public final g2.b0 f43776b;
    public final lf.h f43777c;
    public final v0 d;
    public final e2.g e;
    public volatile boolean h;
    public long f43780r;
    public g2.m f43781s;
    public c3.h0 v;
    public boolean f43782w;
    public final v0 f43783x;
    public final c3.s f43778f = new Object();
    public boolean f43779n = true;

    public s0(v0 v0Var, Uri uri, g2.h hVar, lf.h hVar2, v0 v0Var2, e2.g gVar) {
        this.f43783x = v0Var;
        this.f43775a = uri;
        this.f43776b = new g2.b0(hVar);
        this.f43777c = hVar2;
        this.d = v0Var2;
        this.e = gVar;
        t.f43784b.getAndIncrement();
        this.f43781s = b(0L);
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
                long j3 = this.f43778f.f3798a;
                g2.m b10 = b(j3);
                this.f43781s = b10;
                long open = this.f43776b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f43777c.E() != -1) {
                        this.f43778f.f3798a = this.f43777c.E();
                    }
                    n7.a(this.f43776b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    v0 v0Var = this.f43783x;
                    v0Var.H.post(new q0(v0Var, 0));
                }
                long j10 = open;
                this.f43783x.J = p3.b.d(this.f43776b.f9350a.getResponseHeaders());
                g2.b0 b0Var = this.f43776b;
                p3.b bVar = this.f43783x.J;
                if (bVar != null && (i10 = bVar.f40834f) != -1) {
                    hVar = new s(b0Var, i10, this);
                    c3.h0 z10 = this.f43783x.z(new u0(0, true));
                    this.v = z10;
                    z10.b(v0.f43795h0);
                } else {
                    hVar = b0Var;
                }
                this.f43777c.O(hVar, this.f43775a, this.f43776b.f9350a.getResponseHeaders(), j3, j10, this.d);
                if (this.f43783x.J != null && (oVar = (c3.o) this.f43777c.f14216c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).f44185s = true;
                    }
                }
                if (this.f43779n) {
                    lf.h hVar2 = this.f43777c;
                    long j11 = this.f43780r;
                    c3.o oVar2 = (c3.o) hVar2.f14216c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.f43779n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.g gVar = this.e;
                        synchronized (gVar) {
                            while (!gVar.f7904b) {
                                gVar.f7903a.getClass();
                                gVar.wait();
                            }
                        }
                        lf.h hVar3 = this.f43777c;
                        c3.s sVar = this.f43778f;
                        c3.o oVar3 = (c3.o) hVar3.f14216c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) hVar3.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long E = this.f43777c.E();
                        if (E > this.f43783x.f43808s + j3) {
                            this.e.d();
                            v0 v0Var2 = this.f43783x;
                            v0Var2.H.post(v0Var2.G);
                            j3 = E;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f43777c.E() != -1) {
                    this.f43778f.f3798a = this.f43777c.E();
                }
                n7.a(this.f43776b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f43777c.E() != -1) {
                    this.f43778f.f3798a = this.f43777c.E();
                }
                n7.a(this.f43776b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f43783x.f43807r;
        Map map2 = v0.f43794g0;
        Uri uri = this.f43775a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }
}

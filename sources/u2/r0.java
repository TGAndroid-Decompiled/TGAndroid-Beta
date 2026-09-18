package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import v7.m7;
public final class r0 implements y2.j {
    public final Uri f43725a;
    public final g2.b0 f43726b;
    public final lf.i f43727c;
    public final u0 d;
    public final e2.g e;
    public volatile boolean h;
    public long f43730r;
    public g2.m f43731s;
    public c3.h0 v;
    public boolean f43732w;
    public final u0 f43733x;
    public final c3.s f43728f = new Object();
    public boolean f43729n = true;

    public r0(u0 u0Var, Uri uri, g2.h hVar, lf.i iVar, u0 u0Var2, e2.g gVar) {
        this.f43733x = u0Var;
        this.f43725a = uri;
        this.f43726b = new g2.b0(hVar);
        this.f43727c = iVar;
        this.d = u0Var2;
        this.e = gVar;
        t.f43739b.getAndIncrement();
        this.f43731s = b(0L);
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
                long j3 = this.f43728f.f3798a;
                g2.m b10 = b(j3);
                this.f43731s = b10;
                long open = this.f43726b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f43727c.E() != -1) {
                        this.f43728f.f3798a = this.f43727c.E();
                    }
                    m7.a(this.f43726b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    u0 u0Var = this.f43733x;
                    u0Var.H.post(new p0(u0Var, 0));
                }
                long j10 = open;
                this.f43733x.J = p3.b.d(this.f43726b.f9349a.getResponseHeaders());
                g2.b0 b0Var = this.f43726b;
                p3.b bVar = this.f43733x.J;
                if (bVar != null && (i10 = bVar.f40793f) != -1) {
                    hVar = new s(b0Var, i10, this);
                    c3.h0 z10 = this.f43733x.z(new t0(0, true));
                    this.v = z10;
                    z10.b(u0.f43745h0);
                } else {
                    hVar = b0Var;
                }
                this.f43727c.O(hVar, this.f43725a, this.f43726b.f9349a.getResponseHeaders(), j3, j10, this.d);
                if (this.f43733x.J != null && (oVar = (c3.o) this.f43727c.f14180c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).f44141s = true;
                    }
                }
                if (this.f43729n) {
                    lf.i iVar = this.f43727c;
                    long j11 = this.f43730r;
                    c3.o oVar2 = (c3.o) iVar.f14180c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.f43729n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.g gVar = this.e;
                        synchronized (gVar) {
                            while (!gVar.f7903b) {
                                gVar.f7902a.getClass();
                                gVar.wait();
                            }
                        }
                        lf.i iVar2 = this.f43727c;
                        c3.s sVar = this.f43728f;
                        c3.o oVar3 = (c3.o) iVar2.f14180c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) iVar2.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long E = this.f43727c.E();
                        if (E > this.f43733x.f43758s + j3) {
                            this.e.d();
                            u0 u0Var2 = this.f43733x;
                            u0Var2.H.post(u0Var2.G);
                            j3 = E;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f43727c.E() != -1) {
                    this.f43728f.f3798a = this.f43727c.E();
                }
                m7.a(this.f43726b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f43727c.E() != -1) {
                    this.f43728f.f3798a = this.f43727c.E();
                }
                m7.a(this.f43726b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f43733x.f43757r;
        Map map2 = u0.f43744g0;
        Uri uri = this.f43725a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }
}

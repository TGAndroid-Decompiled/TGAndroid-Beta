package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import v7.m7;
public final class r0 implements y2.j {
    public final Uri f43498a;
    public final g2.b0 f43499b;
    public final lf.i f43500c;
    public final u0 d;
    public final e2.g e;
    public volatile boolean h;
    public long f43503r;
    public g2.m f43504s;
    public c3.h0 v;
    public boolean f43505w;
    public final u0 f43506x;
    public final c3.s f43501f = new Object();
    public boolean f43502n = true;

    public r0(u0 u0Var, Uri uri, g2.h hVar, lf.i iVar, u0 u0Var2, e2.g gVar) {
        this.f43506x = u0Var;
        this.f43498a = uri;
        this.f43499b = new g2.b0(hVar);
        this.f43500c = iVar;
        this.d = u0Var2;
        this.e = gVar;
        t.f43512b.getAndIncrement();
        this.f43504s = b(0L);
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
                long j3 = this.f43501f.f3798a;
                g2.m b10 = b(j3);
                this.f43504s = b10;
                long open = this.f43499b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f43500c.E() != -1) {
                        this.f43501f.f3798a = this.f43500c.E();
                    }
                    m7.a(this.f43499b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    u0 u0Var = this.f43506x;
                    u0Var.H.post(new p0(u0Var, 0));
                }
                long j10 = open;
                this.f43506x.J = p3.b.d(this.f43499b.f9350a.getResponseHeaders());
                g2.b0 b0Var = this.f43499b;
                p3.b bVar = this.f43506x.J;
                if (bVar != null && (i10 = bVar.f40567f) != -1) {
                    hVar = new s(b0Var, i10, this);
                    c3.h0 z10 = this.f43506x.z(new t0(0, true));
                    this.v = z10;
                    z10.b(u0.f43518h0);
                } else {
                    hVar = b0Var;
                }
                this.f43500c.O(hVar, this.f43498a, this.f43499b.f9350a.getResponseHeaders(), j3, j10, this.d);
                if (this.f43506x.J != null && (oVar = (c3.o) this.f43500c.f14034c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).f43915s = true;
                    }
                }
                if (this.f43502n) {
                    lf.i iVar = this.f43500c;
                    long j11 = this.f43503r;
                    c3.o oVar2 = (c3.o) iVar.f14034c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.f43502n = false;
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
                        lf.i iVar2 = this.f43500c;
                        c3.s sVar = this.f43501f;
                        c3.o oVar3 = (c3.o) iVar2.f14034c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) iVar2.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long E = this.f43500c.E();
                        if (E > this.f43506x.f43531s + j3) {
                            this.e.d();
                            u0 u0Var2 = this.f43506x;
                            u0Var2.H.post(u0Var2.G);
                            j3 = E;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f43500c.E() != -1) {
                    this.f43501f.f3798a = this.f43500c.E();
                }
                m7.a(this.f43499b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f43500c.E() != -1) {
                    this.f43501f.f3798a = this.f43500c.E();
                }
                m7.a(this.f43499b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f43506x.f43530r;
        Map map2 = u0.f43517g0;
        Uri uri = this.f43498a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }
}

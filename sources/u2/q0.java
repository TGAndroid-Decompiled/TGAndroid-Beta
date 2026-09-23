package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import v7.m7;
public final class q0 implements y2.j {
    public final Uri f43396a;
    public final g2.b0 f43397b;
    public final lf.i f43398c;
    public final t0 d;
    public final e2.g e;
    public volatile boolean h;
    public long f43401r;
    public g2.m f43402s;
    public c3.h0 v;
    public boolean f43403w;
    public final t0 f43404x;
    public final c3.s f43399f = new Object();
    public boolean f43400n = true;

    public q0(t0 t0Var, Uri uri, g2.h hVar, lf.i iVar, t0 t0Var2, e2.g gVar) {
        this.f43404x = t0Var;
        this.f43396a = uri;
        this.f43397b = new g2.b0(hVar);
        this.f43398c = iVar;
        this.d = t0Var2;
        this.e = gVar;
        t.f43412b.getAndIncrement();
        this.f43402s = b(0L);
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
                long j3 = this.f43399f.f3790a;
                g2.m b10 = b(j3);
                this.f43402s = b10;
                long open = this.f43397b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f43398c.E() != -1) {
                        this.f43399f.f3790a = this.f43398c.E();
                    }
                    m7.a(this.f43397b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    t0 t0Var = this.f43404x;
                    t0Var.H.post(new o0(t0Var, 0));
                }
                long j10 = open;
                this.f43404x.J = p3.b.d(this.f43397b.f9333a.getResponseHeaders());
                g2.b0 b0Var = this.f43397b;
                p3.b bVar = this.f43404x.J;
                if (bVar != null && (i10 = bVar.f40491f) != -1) {
                    hVar = new s(b0Var, i10, this);
                    c3.h0 z10 = this.f43404x.z(new s0(0, true));
                    this.v = z10;
                    z10.b(t0.f43415h0);
                } else {
                    hVar = b0Var;
                }
                this.f43398c.O(hVar, this.f43396a, this.f43397b.f9333a.getResponseHeaders(), j3, j10, this.d);
                if (this.f43404x.J != null && (oVar = (c3.o) this.f43398c.f14012c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.e) {
                        ((v3.e) c10).f43837s = true;
                    }
                }
                if (this.f43400n) {
                    lf.i iVar = this.f43398c;
                    long j11 = this.f43401r;
                    c3.o oVar2 = (c3.o) iVar.f14012c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.f43400n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.g gVar = this.e;
                        synchronized (gVar) {
                            while (!gVar.f7887b) {
                                gVar.f7886a.getClass();
                                gVar.wait();
                            }
                        }
                        lf.i iVar2 = this.f43398c;
                        c3.s sVar = this.f43399f;
                        c3.o oVar3 = (c3.o) iVar2.f14012c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) iVar2.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long E = this.f43398c.E();
                        if (E > this.f43404x.f43428s + j3) {
                            this.e.d();
                            t0 t0Var2 = this.f43404x;
                            t0Var2.H.post(t0Var2.G);
                            j3 = E;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f43398c.E() != -1) {
                    this.f43399f.f3790a = this.f43398c.E();
                }
                m7.a(this.f43397b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f43398c.E() != -1) {
                    this.f43399f.f3790a = this.f43398c.E();
                }
                m7.a(this.f43397b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f43404x.f43427r;
        Map map2 = t0.f43414g0;
        Uri uri = this.f43396a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }
}

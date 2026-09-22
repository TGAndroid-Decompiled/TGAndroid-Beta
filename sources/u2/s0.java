package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import v7.n7;
public final class s0 implements y2.j {
    public final Uri f43796a;
    public final g2.b0 f43797b;
    public final lf.h f43798c;
    public final v0 d;
    public final e2.g e;
    public volatile boolean h;
    public long f43801r;
    public g2.m f43802s;
    public c3.h0 v;
    public boolean f43803w;
    public final v0 f43804x;
    public final c3.s f43799f = new Object();
    public boolean f43800n = true;

    public s0(v0 v0Var, Uri uri, g2.h hVar, lf.h hVar2, v0 v0Var2, e2.g gVar) {
        this.f43804x = v0Var;
        this.f43796a = uri;
        this.f43797b = new g2.b0(hVar);
        this.f43798c = hVar2;
        this.d = v0Var2;
        this.e = gVar;
        t.f43805b.getAndIncrement();
        this.f43802s = b(0L);
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
                long j3 = this.f43799f.f3797a;
                g2.m b10 = b(j3);
                this.f43802s = b10;
                long open = this.f43797b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f43798c.E() != -1) {
                        this.f43799f.f3797a = this.f43798c.E();
                    }
                    n7.a(this.f43797b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    v0 v0Var = this.f43804x;
                    v0Var.H.post(new q0(v0Var, 0));
                }
                long j10 = open;
                this.f43804x.J = p3.b.d(this.f43797b.f9350a.getResponseHeaders());
                g2.b0 b0Var = this.f43797b;
                p3.b bVar = this.f43804x.J;
                if (bVar != null && (i10 = bVar.f40855f) != -1) {
                    hVar = new s(b0Var, i10, this);
                    c3.h0 z10 = this.f43804x.z(new u0(0, true));
                    this.v = z10;
                    z10.b(v0.f43816h0);
                } else {
                    hVar = b0Var;
                }
                this.f43798c.O(hVar, this.f43796a, this.f43797b.f9350a.getResponseHeaders(), j3, j10, this.d);
                if (this.f43804x.J != null && (oVar = (c3.o) this.f43798c.f14231c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).f44207s = true;
                    }
                }
                if (this.f43800n) {
                    lf.h hVar2 = this.f43798c;
                    long j11 = this.f43801r;
                    c3.o oVar2 = (c3.o) hVar2.f14231c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.f43800n = false;
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
                        lf.h hVar3 = this.f43798c;
                        c3.s sVar = this.f43799f;
                        c3.o oVar3 = (c3.o) hVar3.f14231c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) hVar3.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long E = this.f43798c.E();
                        if (E > this.f43804x.f43829s + j3) {
                            this.e.d();
                            v0 v0Var2 = this.f43804x;
                            v0Var2.H.post(v0Var2.G);
                            j3 = E;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f43798c.E() != -1) {
                    this.f43799f.f3797a = this.f43798c.E();
                }
                n7.a(this.f43797b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f43798c.E() != -1) {
                    this.f43799f.f3797a = this.f43798c.E();
                }
                n7.a(this.f43797b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f43804x.f43828r;
        Map map2 = v0.f43815g0;
        Uri uri = this.f43796a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }
}

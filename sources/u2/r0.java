package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import v7.n7;
public final class r0 implements y2.i {
    public final Uri f43863a;
    public final g2.b0 f43864b;
    public final la.h f43865c;
    public final u0 d;
    public final e2.g e;
    public volatile boolean h;
    public long f43868r;
    public g2.m f43869s;
    public c3.h0 v;
    public boolean f43870w;
    public final u0 f43871x;
    public final c3.s f43866f = new Object();
    public boolean f43867n = true;

    public r0(u0 u0Var, Uri uri, g2.h hVar, la.h hVar2, u0 u0Var2, e2.g gVar) {
        this.f43871x = u0Var;
        this.f43863a = uri;
        this.f43864b = new g2.b0(hVar);
        this.f43865c = hVar2;
        this.d = u0Var2;
        this.e = gVar;
        t.f43877b.getAndIncrement();
        this.f43869s = b(0L);
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
                long j3 = this.f43866f.f3797a;
                g2.m b10 = b(j3);
                this.f43869s = b10;
                long open = this.f43864b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f43865c.E() != -1) {
                        this.f43866f.f3797a = this.f43865c.E();
                    }
                    n7.a(this.f43864b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    u0 u0Var = this.f43871x;
                    u0Var.H.post(new o0(u0Var, 0));
                }
                long j10 = open;
                this.f43871x.J = p3.b.d(this.f43864b.f9344a.getResponseHeaders());
                g2.b0 b0Var = this.f43864b;
                p3.b bVar = this.f43871x.J;
                if (bVar != null && (i10 = bVar.f40906f) != -1) {
                    hVar = new s(b0Var, i10, this);
                    c3.h0 z10 = this.f43871x.z(new t0(0, true));
                    this.v = z10;
                    z10.b(u0.f43883h0);
                } else {
                    hVar = b0Var;
                }
                this.f43865c.O(hVar, this.f43863a, this.f43864b.f9344a.getResponseHeaders(), j3, j10, this.d);
                if (this.f43871x.J != null && (oVar = (c3.o) this.f43865c.f14183c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).f44277s = true;
                    }
                }
                if (this.f43867n) {
                    la.h hVar2 = this.f43865c;
                    long j11 = this.f43868r;
                    c3.o oVar2 = (c3.o) hVar2.f14183c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.f43867n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.g gVar = this.e;
                        synchronized (gVar) {
                            while (!gVar.f7898b) {
                                gVar.f7897a.getClass();
                                gVar.wait();
                            }
                        }
                        la.h hVar3 = this.f43865c;
                        c3.s sVar = this.f43866f;
                        c3.o oVar3 = (c3.o) hVar3.f14183c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) hVar3.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long E = this.f43865c.E();
                        if (E > this.f43871x.f43896s + j3) {
                            this.e.d();
                            u0 u0Var2 = this.f43871x;
                            u0Var2.H.post(u0Var2.G);
                            j3 = E;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f43865c.E() != -1) {
                    this.f43866f.f3797a = this.f43865c.E();
                }
                n7.a(this.f43864b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f43865c.E() != -1) {
                    this.f43866f.f3797a = this.f43865c.E();
                }
                n7.a(this.f43864b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f43871x.f43895r;
        Map map2 = u0.f43882g0;
        Uri uri = this.f43863a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }
}

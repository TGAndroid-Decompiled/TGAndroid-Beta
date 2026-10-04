package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import v7.m7;
public final class s0 implements y2.i {
    public final Uri f47382a;
    public final g2.b0 f47383b;
    public final la.h f47384c;
    public final v0 d;
    public final e2.g f47385e;
    public volatile boolean h;
    public long f47388r;
    public g2.m f47389s;
    public c3.h0 v;
    public boolean f47390w;
    public final v0 f47391x;
    public final c3.s f47386f = new Object();
    public boolean f47387n = true;

    public s0(v0 v0Var, Uri uri, g2.h hVar, la.h hVar2, v0 v0Var2, e2.g gVar) {
        this.f47391x = v0Var;
        this.f47382a = uri;
        this.f47383b = new g2.b0(hVar);
        this.f47384c = hVar2;
        this.d = v0Var2;
        this.f47385e = gVar;
        t.f47392b.getAndIncrement();
        this.f47389s = b(0L);
    }

    @Override
    public final void a() {
        g2.h hVar;
        c3.o oVar;
        int i10;
        int i11 = 0;
        while (i11 == 0 && !this.h) {
            try {
                long j3 = this.f47386f.f4100a;
                g2.m b10 = b(j3);
                this.f47389s = b10;
                long open = this.f47383b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f47384c.E() != -1) {
                        this.f47386f.f4100a = this.f47384c.E();
                    }
                    m7.a(this.f47383b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    v0 v0Var = this.f47391x;
                    v0Var.H.post(new q0(v0Var, 0));
                }
                long j10 = open;
                this.f47391x.J = p3.b.d(this.f47383b.f10159a.getResponseHeaders());
                g2.b0 b0Var = this.f47383b;
                p3.b bVar = this.f47391x.J;
                if (bVar != null && (i10 = bVar.f44134f) != -1) {
                    hVar = new s(b0Var, i10, this);
                    c3.h0 z10 = this.f47391x.z(new u0(0, true));
                    this.v = z10;
                    z10.b(v0.f47403h0);
                } else {
                    hVar = b0Var;
                }
                this.f47384c.O(hVar, this.f47382a, this.f47383b.f10159a.getResponseHeaders(), j3, j10, this.d);
                if (this.f47391x.J != null && (oVar = (c3.o) this.f47384c.f15398c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).f47826s = true;
                    }
                }
                if (this.f47387n) {
                    la.h hVar2 = this.f47384c;
                    long j11 = this.f47388r;
                    c3.o oVar2 = (c3.o) hVar2.f15398c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.f47387n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.g gVar = this.f47385e;
                        synchronized (gVar) {
                            while (!gVar.f8554b) {
                                gVar.f8553a.getClass();
                                gVar.wait();
                            }
                        }
                        la.h hVar3 = this.f47384c;
                        c3.s sVar = this.f47386f;
                        c3.o oVar3 = (c3.o) hVar3.f15398c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) hVar3.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long E = this.f47384c.E();
                        if (E > this.f47391x.f47417s + j3) {
                            this.f47385e.d();
                            v0 v0Var2 = this.f47391x;
                            v0Var2.H.post(v0Var2.G);
                            j3 = E;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f47384c.E() != -1) {
                    this.f47386f.f4100a = this.f47384c.E();
                }
                m7.a(this.f47383b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f47384c.E() != -1) {
                    this.f47386f.f4100a = this.f47384c.E();
                }
                m7.a(this.f47383b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f47391x.f47416r;
        Map map2 = v0.f47402g0;
        Uri uri = this.f47382a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }

    @Override
    public final void q() {
        this.h = true;
    }
}

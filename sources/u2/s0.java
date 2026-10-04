package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import v7.m7;
public final class s0 implements y2.i {
    public final Uri f47391a;
    public final g2.b0 f47392b;
    public final la.h f47393c;
    public final v0 d;
    public final e2.g f47394e;
    public volatile boolean h;
    public long f47397r;
    public g2.m f47398s;
    public c3.h0 v;
    public boolean f47399w;
    public final v0 f47400x;
    public final c3.s f47395f = new Object();
    public boolean f47396n = true;

    public s0(v0 v0Var, Uri uri, g2.h hVar, la.h hVar2, v0 v0Var2, e2.g gVar) {
        this.f47400x = v0Var;
        this.f47391a = uri;
        this.f47392b = new g2.b0(hVar);
        this.f47393c = hVar2;
        this.d = v0Var2;
        this.f47394e = gVar;
        t.f47401b.getAndIncrement();
        this.f47398s = b(0L);
    }

    @Override
    public final void a() {
        g2.h hVar;
        c3.o oVar;
        int i10;
        int i11 = 0;
        while (i11 == 0 && !this.h) {
            try {
                long j3 = this.f47395f.f4101a;
                g2.m b10 = b(j3);
                this.f47398s = b10;
                long open = this.f47392b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f47393c.E() != -1) {
                        this.f47395f.f4101a = this.f47393c.E();
                    }
                    m7.a(this.f47392b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    v0 v0Var = this.f47400x;
                    v0Var.H.post(new q0(v0Var, 0));
                }
                long j10 = open;
                this.f47400x.J = p3.b.d(this.f47392b.f10160a.getResponseHeaders());
                g2.b0 b0Var = this.f47392b;
                p3.b bVar = this.f47400x.J;
                if (bVar != null && (i10 = bVar.f44142f) != -1) {
                    hVar = new s(b0Var, i10, this);
                    c3.h0 z10 = this.f47400x.z(new u0(0, true));
                    this.v = z10;
                    z10.b(v0.f47412h0);
                } else {
                    hVar = b0Var;
                }
                this.f47393c.O(hVar, this.f47391a, this.f47392b.f10160a.getResponseHeaders(), j3, j10, this.d);
                if (this.f47400x.J != null && (oVar = (c3.o) this.f47393c.f15400c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).f47835s = true;
                    }
                }
                if (this.f47396n) {
                    la.h hVar2 = this.f47393c;
                    long j11 = this.f47397r;
                    c3.o oVar2 = (c3.o) hVar2.f15400c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.f47396n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.g gVar = this.f47394e;
                        synchronized (gVar) {
                            while (!gVar.f8555b) {
                                gVar.f8554a.getClass();
                                gVar.wait();
                            }
                        }
                        la.h hVar3 = this.f47393c;
                        c3.s sVar = this.f47395f;
                        c3.o oVar3 = (c3.o) hVar3.f15400c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) hVar3.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long E = this.f47393c.E();
                        if (E > this.f47400x.f47426s + j3) {
                            this.f47394e.d();
                            v0 v0Var2 = this.f47400x;
                            v0Var2.H.post(v0Var2.G);
                            j3 = E;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f47393c.E() != -1) {
                    this.f47395f.f4101a = this.f47393c.E();
                }
                m7.a(this.f47392b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f47393c.E() != -1) {
                    this.f47395f.f4101a = this.f47393c.E();
                }
                m7.a(this.f47392b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f47400x.f47425r;
        Map map2 = v0.f47411g0;
        Uri uri = this.f47391a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }

    @Override
    public final void q() {
        this.h = true;
    }
}

package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import v7.m7;
public final class r0 implements y2.j {
    public final Uri f43466a;
    public final g2.b0 f43467b;
    public final lf.i f43468c;
    public final u0 d;
    public final e2.g e;
    public volatile boolean h;
    public long f43471r;
    public g2.m f43472s;
    public c3.h0 v;
    public boolean f43473w;
    public final u0 f43474x;
    public final c3.s f43469f = new Object();
    public boolean f43470n = true;

    public r0(u0 u0Var, Uri uri, g2.h hVar, lf.i iVar, u0 u0Var2, e2.g gVar) {
        this.f43474x = u0Var;
        this.f43466a = uri;
        this.f43467b = new g2.b0(hVar);
        this.f43468c = iVar;
        this.d = u0Var2;
        this.e = gVar;
        t.f43480b.getAndIncrement();
        this.f43472s = b(0L);
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
                long j3 = this.f43469f.f3795a;
                g2.m b10 = b(j3);
                this.f43472s = b10;
                long open = this.f43467b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f43468c.E() != -1) {
                        this.f43469f.f3795a = this.f43468c.E();
                    }
                    m7.a(this.f43467b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    u0 u0Var = this.f43474x;
                    u0Var.H.post(new p0(u0Var, 0));
                }
                long j10 = open;
                this.f43474x.J = p3.b.d(this.f43467b.f9347a.getResponseHeaders());
                g2.b0 b0Var = this.f43467b;
                p3.b bVar = this.f43474x.J;
                if (bVar != null && (i10 = bVar.f40536f) != -1) {
                    hVar = new s(b0Var, i10, this);
                    c3.h0 z10 = this.f43474x.z(new t0(0, true));
                    this.v = z10;
                    z10.b(u0.f43486h0);
                } else {
                    hVar = b0Var;
                }
                this.f43468c.O(hVar, this.f43466a, this.f43467b.f9347a.getResponseHeaders(), j3, j10, this.d);
                if (this.f43474x.J != null && (oVar = (c3.o) this.f43468c.f14022c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).f43883s = true;
                    }
                }
                if (this.f43470n) {
                    lf.i iVar = this.f43468c;
                    long j11 = this.f43471r;
                    c3.o oVar2 = (c3.o) iVar.f14022c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.f43470n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.g gVar = this.e;
                        synchronized (gVar) {
                            while (!gVar.f7901b) {
                                gVar.f7900a.getClass();
                                gVar.wait();
                            }
                        }
                        lf.i iVar2 = this.f43468c;
                        c3.s sVar = this.f43469f;
                        c3.o oVar3 = (c3.o) iVar2.f14022c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) iVar2.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long E = this.f43468c.E();
                        if (E > this.f43474x.f43499s + j3) {
                            this.e.d();
                            u0 u0Var2 = this.f43474x;
                            u0Var2.H.post(u0Var2.G);
                            j3 = E;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f43468c.E() != -1) {
                    this.f43469f.f3795a = this.f43468c.E();
                }
                m7.a(this.f43467b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f43468c.E() != -1) {
                    this.f43469f.f3795a = this.f43468c.E();
                }
                m7.a(this.f43467b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f43474x.f43498r;
        Map map2 = u0.f43485g0;
        Uri uri = this.f43466a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }
}

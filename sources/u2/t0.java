package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import m.e3;
import v7.n7;
public final class t0 implements y2.k {
    public final Uri f42446a;
    public final g2.b0 f42447b;
    public final e3 f42448c;
    public final w0 d;
    public final e2.g e;
    public volatile boolean h;
    public long f42451r;
    public g2.m f42452s;
    public c3.h0 v;
    public boolean f42453w;
    public final w0 f42454x;
    public final c3.s f42449f = new Object();
    public boolean f42450n = true;

    public t0(w0 w0Var, Uri uri, g2.h hVar, e3 e3Var, w0 w0Var2, e2.g gVar) {
        this.f42454x = w0Var;
        this.f42446a = uri;
        this.f42447b = new g2.b0(hVar);
        this.f42448c = e3Var;
        this.d = w0Var2;
        this.e = gVar;
        u.f42455b.getAndIncrement();
        this.f42452s = b(0L);
    }

    @Override
    public final void a() {
        g2.h hVar;
        c3.o oVar;
        int i10;
        int i11 = 0;
        while (i11 == 0 && !this.h) {
            try {
                long j3 = this.f42449f.f4212a;
                g2.m b10 = b(j3);
                this.f42452s = b10;
                long open = this.f42447b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f42448c.D() != -1) {
                        this.f42449f.f4212a = this.f42448c.D();
                    }
                    n7.a(this.f42447b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    w0 w0Var = this.f42454x;
                    w0Var.H.post(new r0(w0Var, 0));
                }
                long j10 = open;
                this.f42454x.J = p3.b.d(this.f42447b.f8478a.getResponseHeaders());
                g2.b0 b0Var = this.f42447b;
                p3.b bVar = this.f42454x.J;
                if (bVar != null && (i10 = bVar.f39665f) != -1) {
                    hVar = new t(b0Var, i10, this);
                    c3.h0 z10 = this.f42454x.z(new v0(0, true));
                    this.v = z10;
                    z10.b(w0.f42466h0);
                } else {
                    hVar = b0Var;
                }
                this.f42448c.N(hVar, this.f42446a, this.f42447b.f8478a.getResponseHeaders(), j3, j10, this.d);
                if (this.f42454x.J != null && (oVar = (c3.o) this.f42448c.f13002c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).f42907s = true;
                    }
                }
                if (this.f42450n) {
                    e3 e3Var = this.f42448c;
                    long j11 = this.f42451r;
                    c3.o oVar2 = (c3.o) e3Var.f13002c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.f42450n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.g gVar = this.e;
                        synchronized (gVar) {
                            while (!gVar.f7204b) {
                                gVar.f7203a.getClass();
                                gVar.wait();
                            }
                        }
                        e3 e3Var2 = this.f42448c;
                        c3.s sVar = this.f42449f;
                        c3.o oVar3 = (c3.o) e3Var2.f13002c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) e3Var2.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long D = this.f42448c.D();
                        if (D > this.f42454x.f42479s + j3) {
                            this.e.d();
                            w0 w0Var2 = this.f42454x;
                            w0Var2.H.post(w0Var2.G);
                            j3 = D;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f42448c.D() != -1) {
                    this.f42449f.f4212a = this.f42448c.D();
                }
                n7.a(this.f42447b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f42448c.D() != -1) {
                    this.f42449f.f4212a = this.f42448c.D();
                }
                n7.a(this.f42447b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f42454x.f42478r;
        Map map2 = w0.f42465g0;
        Uri uri = this.f42446a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }

    @Override
    public final void k() {
        this.h = true;
    }
}

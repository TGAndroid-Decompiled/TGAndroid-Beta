package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import v7.l7;
import v7.t6;
public final class t0 implements y2.i {
    public final Uri f50003a;
    public final g2.c0 f50004b;
    public final q5.d f50005c;
    public final w0 d;
    public final e2.i e;
    public volatile boolean h;
    public long f50008r;
    public g2.n f50009s;
    public c3.k0 f50010w;
    public boolean f50011x;
    public final w0 f50012y;
    public final c3.s f50006f = new Object();
    public boolean f50007n = true;

    public t0(w0 w0Var, Uri uri, g2.h hVar, q5.d dVar, w0 w0Var2, e2.i iVar) {
        this.f50012y = w0Var;
        this.f50003a = uri;
        this.f50004b = new g2.c0(hVar);
        this.f50005c = dVar;
        this.d = w0Var2;
        this.e = iVar;
        u.f50014g.getAndIncrement();
        this.f50009s = a(0L, null);
    }

    @Override
    public final void R1() {
        this.h = true;
    }

    public final g2.n a(long j10, String str) {
        Map map = w0.f50027i0;
        if (str != null && !str.startsWith("W/")) {
            a5.a aVar = new a5.a(4, 6);
            aVar.x(map.entrySet());
            aVar.w("If-Range", str);
            map = aVar.g();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.f50012y.f50042r;
        Uri uri = this.f50003a;
        t6.l(uri, "The uri must be set.");
        return new g2.n(uri, 1, null, map, j10, -1L, str2, 6);
    }

    @Override
    public final void b() {
        g2.h hVar;
        c3.o oVar;
        int i10;
        int i11 = 0;
        String str = null;
        while (i11 == 0 && !this.h) {
            try {
                long j10 = this.f50006f.f3687a;
                g2.n a2 = a(j10, str);
                this.f50009s = a2;
                long open = this.f50004b.open(a2);
                if (this.h) {
                    if (i11 != 1 && this.f50005c.n() != -1) {
                        this.f50006f.f3687a = this.f50005c.n();
                    }
                    l7.a(this.f50004b);
                    return;
                }
                List list = (List) this.f50004b.f7282a.getResponseHeaders().get("ETag");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                if (open != -1) {
                    open += j10;
                    w0 w0Var = this.f50012y;
                    w0Var.H.post(new p0(w0Var, 0));
                }
                long j11 = open;
                this.f50012y.J = p3.b.d(this.f50004b.f7282a.getResponseHeaders());
                g2.c0 c0Var = this.f50004b;
                p3.b bVar = this.f50012y.J;
                if (bVar != null && (i10 = bVar.f44695f) != -1) {
                    hVar = new t(c0Var, i10, this);
                    c3.k0 z10 = this.f50012y.z(new v0(0, true));
                    this.f50010w = z10;
                    z10.b(w0.f50028j0);
                } else {
                    hVar = c0Var;
                }
                this.f50005c.u(hVar, this.f50003a, this.f50004b.f7282a.getResponseHeaders(), j10, j11, this.d);
                if (this.f50012y.J != null && (oVar = (c3.o) this.f50005c.f45488c) != null) {
                    c3.o b10 = oVar.b();
                    if (b10 instanceof v3.d) {
                        ((v3.d) b10).f50353t = true;
                    }
                }
                if (this.f50007n) {
                    q5.d dVar = this.f50005c;
                    long j12 = this.f50008r;
                    c3.o oVar2 = (c3.o) dVar.f45488c;
                    oVar2.getClass();
                    oVar2.d(j10, j12);
                    this.f50007n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.i iVar = this.e;
                        synchronized (iVar) {
                            while (!iVar.f6149b) {
                                iVar.f6148a.getClass();
                                iVar.wait();
                            }
                        }
                        q5.d dVar2 = this.f50005c;
                        c3.s sVar = this.f50006f;
                        c3.o oVar3 = (c3.o) dVar2.f45488c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) dVar2.d;
                        lVar.getClass();
                        i11 = oVar3.f(lVar, sVar);
                        long n10 = this.f50005c.n();
                        if (n10 > this.f50012y.f50043s + j10) {
                            this.e.d();
                            w0 w0Var2 = this.f50012y;
                            w0Var2.H.post(w0Var2.G);
                            j10 = n10;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f50005c.n() != -1) {
                    this.f50006f.f3687a = this.f50005c.n();
                }
                l7.a(this.f50004b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f50005c.n() != -1) {
                    this.f50006f.f3687a = this.f50005c.n();
                }
                l7.a(this.f50004b);
                throw th2;
            }
        }
    }
}

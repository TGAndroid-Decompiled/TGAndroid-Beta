package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import v7.l7;
import v7.t6;
public final class t0 implements y2.i {
    public final Uri f50017a;
    public final g2.c0 f50018b;
    public final q5.d f50019c;
    public final w0 d;
    public final e2.i e;
    public volatile boolean h;
    public long f50022r;
    public g2.n f50023s;
    public c3.k0 f50024w;
    public boolean f50025x;
    public final w0 f50026y;
    public final c3.s f50020f = new Object();
    public boolean f50021n = true;

    public t0(w0 w0Var, Uri uri, g2.h hVar, q5.d dVar, w0 w0Var2, e2.i iVar) {
        this.f50026y = w0Var;
        this.f50017a = uri;
        this.f50018b = new g2.c0(hVar);
        this.f50019c = dVar;
        this.d = w0Var2;
        this.e = iVar;
        u.f50028g.getAndIncrement();
        this.f50023s = a(0L, null);
    }

    @Override
    public final void R1() {
        this.h = true;
    }

    public final g2.n a(long j10, String str) {
        Map map = w0.f50041i0;
        if (str != null && !str.startsWith("W/")) {
            a5.a aVar = new a5.a(4, 6);
            aVar.x(map.entrySet());
            aVar.w("If-Range", str);
            map = aVar.g();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.f50026y.f50056r;
        Uri uri = this.f50017a;
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
                long j10 = this.f50020f.f3687a;
                g2.n a2 = a(j10, str);
                this.f50023s = a2;
                long open = this.f50018b.open(a2);
                if (this.h) {
                    if (i11 != 1 && this.f50019c.n() != -1) {
                        this.f50020f.f3687a = this.f50019c.n();
                    }
                    l7.a(this.f50018b);
                    return;
                }
                List list = (List) this.f50018b.f7283a.getResponseHeaders().get("ETag");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                if (open != -1) {
                    open += j10;
                    w0 w0Var = this.f50026y;
                    w0Var.H.post(new p0(w0Var, 0));
                }
                long j11 = open;
                this.f50026y.J = p3.b.d(this.f50018b.f7283a.getResponseHeaders());
                g2.c0 c0Var = this.f50018b;
                p3.b bVar = this.f50026y.J;
                if (bVar != null && (i10 = bVar.f44706f) != -1) {
                    hVar = new t(c0Var, i10, this);
                    c3.k0 z10 = this.f50026y.z(new v0(0, true));
                    this.f50024w = z10;
                    z10.b(w0.f50042j0);
                } else {
                    hVar = c0Var;
                }
                this.f50019c.u(hVar, this.f50017a, this.f50018b.f7283a.getResponseHeaders(), j10, j11, this.d);
                if (this.f50026y.J != null && (oVar = (c3.o) this.f50019c.f45499c) != null) {
                    c3.o b10 = oVar.b();
                    if (b10 instanceof v3.d) {
                        ((v3.d) b10).f50367t = true;
                    }
                }
                if (this.f50021n) {
                    q5.d dVar = this.f50019c;
                    long j12 = this.f50022r;
                    c3.o oVar2 = (c3.o) dVar.f45499c;
                    oVar2.getClass();
                    oVar2.d(j10, j12);
                    this.f50021n = false;
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
                        q5.d dVar2 = this.f50019c;
                        c3.s sVar = this.f50020f;
                        c3.o oVar3 = (c3.o) dVar2.f45499c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) dVar2.d;
                        lVar.getClass();
                        i11 = oVar3.f(lVar, sVar);
                        long n10 = this.f50019c.n();
                        if (n10 > this.f50026y.f50057s + j10) {
                            this.e.d();
                            w0 w0Var2 = this.f50026y;
                            w0Var2.H.post(w0Var2.G);
                            j10 = n10;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f50019c.n() != -1) {
                    this.f50020f.f3687a = this.f50019c.n();
                }
                l7.a(this.f50018b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f50019c.n() != -1) {
                    this.f50020f.f3687a = this.f50019c.n();
                }
                l7.a(this.f50018b);
                throw th2;
            }
        }
    }
}

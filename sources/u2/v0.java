package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import v7.k7;
import v7.u6;
public final class v0 implements y2.i {
    public final Uri f47902a;
    public final g2.b0 f47903b;
    public final c f47904c;
    public final y0 d;
    public final e2.i e;
    public volatile boolean h;
    public long f47907r;
    public g2.m f47908s;
    public c3.l0 v;
    public boolean f47909w;
    public final y0 f47910x;
    public final c3.u f47905f = new Object();
    public boolean f47906n = true;

    public v0(y0 y0Var, Uri uri, g2.h hVar, c cVar, y0 y0Var2, e2.i iVar) {
        this.f47910x = y0Var;
        this.f47902a = uri;
        this.f47903b = new g2.b0(hVar);
        this.f47904c = cVar;
        this.d = y0Var2;
        this.e = iVar;
        v.f47897g.getAndIncrement();
        this.f47908s = b(0L, null);
    }

    @Override
    public final void O() {
        this.h = true;
    }

    @Override
    public final void a() {
        g2.h hVar;
        c3.q qVar;
        int i10;
        int i11 = 0;
        String str = null;
        while (i11 == 0 && !this.h) {
            try {
                long j10 = this.f47905f.f4664a;
                g2.m b10 = b(j10, str);
                this.f47908s = b10;
                long open = this.f47903b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f47904c.b() != -1) {
                        this.f47905f.f4664a = this.f47904c.b();
                    }
                    k7.a(this.f47903b);
                    return;
                }
                List list = (List) this.f47903b.f10781a.getResponseHeaders().get("ETag");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                if (open != -1) {
                    open += j10;
                    y0 y0Var = this.f47910x;
                    y0Var.H.post(new r0(y0Var, 0));
                }
                long j11 = open;
                this.f47910x.J = p3.b.d(this.f47903b.f10781a.getResponseHeaders());
                g2.b0 b0Var = this.f47903b;
                p3.b bVar = this.f47910x.J;
                if (bVar != null && (i10 = bVar.f44503f) != -1) {
                    hVar = new u(b0Var, i10, this);
                    c3.l0 A = this.f47910x.A(new x0(0, true));
                    this.v = A;
                    A.b(y0.f47924j0);
                } else {
                    hVar = b0Var;
                }
                this.f47904c.c(hVar, this.f47902a, this.f47903b.f10781a.getResponseHeaders(), j10, j11, this.d);
                if (this.f47910x.J != null && (qVar = (c3.q) this.f47904c.f47712c) != null) {
                    c3.q b11 = qVar.b();
                    if (b11 instanceof v3.d) {
                        ((v3.d) b11).f48379t = true;
                    }
                }
                if (this.f47906n) {
                    c cVar = this.f47904c;
                    long j12 = this.f47907r;
                    c3.q qVar2 = (c3.q) cVar.f47712c;
                    qVar2.getClass();
                    qVar2.d(j10, j12);
                    this.f47906n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.i iVar = this.e;
                        synchronized (iVar) {
                            while (!iVar.f8242b) {
                                iVar.f8241a.getClass();
                                iVar.wait();
                            }
                        }
                        c cVar2 = this.f47904c;
                        c3.u uVar = this.f47905f;
                        c3.q qVar3 = (c3.q) cVar2.f47712c;
                        qVar3.getClass();
                        c3.l lVar = (c3.l) cVar2.d;
                        lVar.getClass();
                        i11 = qVar3.f(lVar, uVar);
                        long b12 = this.f47904c.b();
                        if (b12 > this.f47910x.f47939s + j10) {
                            this.e.d();
                            y0 y0Var2 = this.f47910x;
                            y0Var2.H.post(y0Var2.G);
                            j10 = b12;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f47904c.b() != -1) {
                    this.f47905f.f4664a = this.f47904c.b();
                }
                k7.a(this.f47903b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f47904c.b() != -1) {
                    this.f47905f.f4664a = this.f47904c.b();
                }
                k7.a(this.f47903b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j10, String str) {
        Map map = y0.f47923i0;
        if (str != null && !str.startsWith("W/")) {
            a5.a aVar = new a5.a(4, 5);
            aVar.y(map.entrySet());
            aVar.x("If-Range", str);
            map = aVar.g();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.f47910x.f47938r;
        Uri uri = this.f47902a;
        u6.l(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map, j10, -1L, str2, 6);
    }
}

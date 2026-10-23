package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import v7.k7;
import v7.u6;
public final class v0 implements y2.i {
    public final Uri f47903a;
    public final g2.b0 f47904b;
    public final c f47905c;
    public final y0 d;
    public final e2.i e;
    public volatile boolean h;
    public long f47908r;
    public g2.m f47909s;
    public c3.l0 v;
    public boolean f47910w;
    public final y0 f47911x;
    public final c3.u f47906f = new Object();
    public boolean f47907n = true;

    public v0(y0 y0Var, Uri uri, g2.h hVar, c cVar, y0 y0Var2, e2.i iVar) {
        this.f47911x = y0Var;
        this.f47903a = uri;
        this.f47904b = new g2.b0(hVar);
        this.f47905c = cVar;
        this.d = y0Var2;
        this.e = iVar;
        v.f47898g.getAndIncrement();
        this.f47909s = b(0L, null);
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
                long j10 = this.f47906f.f4664a;
                g2.m b10 = b(j10, str);
                this.f47909s = b10;
                long open = this.f47904b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.f47905c.b() != -1) {
                        this.f47906f.f4664a = this.f47905c.b();
                    }
                    k7.a(this.f47904b);
                    return;
                }
                List list = (List) this.f47904b.f10781a.getResponseHeaders().get("ETag");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                if (open != -1) {
                    open += j10;
                    y0 y0Var = this.f47911x;
                    y0Var.H.post(new r0(y0Var, 0));
                }
                long j11 = open;
                this.f47911x.J = p3.b.d(this.f47904b.f10781a.getResponseHeaders());
                g2.b0 b0Var = this.f47904b;
                p3.b bVar = this.f47911x.J;
                if (bVar != null && (i10 = bVar.f44504f) != -1) {
                    hVar = new u(b0Var, i10, this);
                    c3.l0 A = this.f47911x.A(new x0(0, true));
                    this.v = A;
                    A.b(y0.f47925j0);
                } else {
                    hVar = b0Var;
                }
                this.f47905c.c(hVar, this.f47903a, this.f47904b.f10781a.getResponseHeaders(), j10, j11, this.d);
                if (this.f47911x.J != null && (qVar = (c3.q) this.f47905c.f47713c) != null) {
                    c3.q b11 = qVar.b();
                    if (b11 instanceof v3.d) {
                        ((v3.d) b11).f48380t = true;
                    }
                }
                if (this.f47907n) {
                    c cVar = this.f47905c;
                    long j12 = this.f47908r;
                    c3.q qVar2 = (c3.q) cVar.f47713c;
                    qVar2.getClass();
                    qVar2.d(j10, j12);
                    this.f47907n = false;
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
                        c cVar2 = this.f47905c;
                        c3.u uVar = this.f47906f;
                        c3.q qVar3 = (c3.q) cVar2.f47713c;
                        qVar3.getClass();
                        c3.l lVar = (c3.l) cVar2.d;
                        lVar.getClass();
                        i11 = qVar3.f(lVar, uVar);
                        long b12 = this.f47905c.b();
                        if (b12 > this.f47911x.f47940s + j10) {
                            this.e.d();
                            y0 y0Var2 = this.f47911x;
                            y0Var2.H.post(y0Var2.G);
                            j10 = b12;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f47905c.b() != -1) {
                    this.f47906f.f4664a = this.f47905c.b();
                }
                k7.a(this.f47904b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f47905c.b() != -1) {
                    this.f47906f.f4664a = this.f47905c.b();
                }
                k7.a(this.f47904b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j10, String str) {
        Map map = y0.f47924i0;
        if (str != null && !str.startsWith("W/")) {
            a5.a aVar = new a5.a(4, 5);
            aVar.y(map.entrySet());
            aVar.x("If-Range", str);
            map = aVar.g();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.f47911x.f47939r;
        Uri uri = this.f47903a;
        u6.l(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map, j10, -1L, str2, 6);
    }
}

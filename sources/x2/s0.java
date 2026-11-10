package x2;

import a8.ia;
import a8.wa;
import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.telegram.ui.ly0;
public final class s0 implements b3.l {
    public final Uri f58471a;
    public final j2.c0 f58472b;
    public final ly0 f58473c;
    public final v0 d;
    public final h2.i f58474e;
    public volatile boolean h;
    public long f58477r;
    public j2.m f58478s;
    public f3.j0 f58479w;
    public boolean f58480x;
    public final v0 f58481y;
    public final f3.s f58475f = new Object();
    public boolean f58476n = true;

    public s0(v0 v0Var, Uri uri, j2.h hVar, ly0 ly0Var, v0 v0Var2, h2.i iVar) {
        this.f58481y = v0Var;
        this.f58471a = uri;
        this.f58472b = new j2.c0(hVar);
        this.f58473c = ly0Var;
        this.d = v0Var2;
        this.f58474e = iVar;
        t.f58482g.getAndIncrement();
        this.f58478s = b(0L, null);
    }

    @Override
    public final void a() {
        j2.h hVar;
        f3.o oVar;
        int i7;
        int i10 = 0;
        String str = null;
        while (i10 == 0 && !this.h) {
            try {
                long j3 = this.f58475f.f11075a;
                j2.m b10 = b(j3, str);
                this.f58478s = b10;
                long open = this.f58472b.open(b10);
                if (this.h) {
                    if (i10 != 1 && this.f58473c.x() != -1) {
                        this.f58475f.f11075a = this.f58473c.x();
                    }
                    c8.p0.a(this.f58472b);
                    return;
                }
                List list = (List) this.f58472b.f16415a.getResponseHeaders().get("ETag");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                if (open != -1) {
                    open += j3;
                    v0 v0Var = this.f58481y;
                    v0Var.H.post(new o0(v0Var, 0));
                }
                long j10 = open;
                this.f58481y.J = s3.b.d(this.f58472b.f16415a.getResponseHeaders());
                j2.c0 c0Var = this.f58472b;
                s3.b bVar = this.f58481y.J;
                if (bVar != null && (i7 = bVar.f54787f) != -1) {
                    hVar = new s(c0Var, i7, this);
                    f3.j0 x10 = this.f58481y.x(new u0(0, true));
                    this.f58479w = x10;
                    x10.g(v0.f58497j0);
                } else {
                    hVar = c0Var;
                }
                this.f58473c.E(hVar, this.f58471a, this.f58472b.f16415a.getResponseHeaders(), j3, j10, this.d);
                if (this.f58481y.J != null && (oVar = (f3.o) this.f58473c.f47747c) != null) {
                    f3.o a10 = oVar.a();
                    if (a10 instanceof y3.d) {
                        ((y3.d) a10).f58954t = true;
                    }
                }
                if (this.f58476n) {
                    ly0 ly0Var = this.f58473c;
                    long j11 = this.f58477r;
                    f3.o oVar2 = (f3.o) ly0Var.f47747c;
                    oVar2.getClass();
                    oVar2.d(j3, j11);
                    this.f58476n = false;
                }
                while (i10 == 0 && !this.h) {
                    try {
                        h2.i iVar = this.f58474e;
                        synchronized (iVar) {
                            while (!iVar.f14096b) {
                                iVar.f14095a.getClass();
                                iVar.wait();
                            }
                        }
                        ly0 ly0Var2 = this.f58473c;
                        f3.s sVar = this.f58475f;
                        f3.o oVar3 = (f3.o) ly0Var2.f47747c;
                        oVar3.getClass();
                        f3.l lVar = (f3.l) ly0Var2.d;
                        lVar.getClass();
                        i10 = oVar3.f(lVar, sVar);
                        long x11 = this.f58473c.x();
                        if (x11 > this.f58481y.f58513s + j3) {
                            this.f58474e.d();
                            v0 v0Var2 = this.f58481y;
                            v0Var2.H.post(v0Var2.G);
                            j3 = x11;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i10 == 1) {
                    i10 = 0;
                } else if (this.f58473c.x() != -1) {
                    this.f58475f.f11075a = this.f58473c.x();
                }
                c8.p0.a(this.f58472b);
            } catch (Throwable th2) {
                if (i10 != 1 && this.f58473c.x() != -1) {
                    this.f58475f.f11075a = this.f58473c.x();
                }
                c8.p0.a(this.f58472b);
                throw th2;
            }
        }
    }

    public final j2.m b(long j3, String str) {
        Map map = v0.f58496i0;
        if (str != null && !str.startsWith("W/")) {
            wa waVar = new wa(4, 10);
            waVar.w(map.entrySet());
            waVar.v("If-Range", str);
            map = waVar.e();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.f58481y.f58512r;
        Uri uri = this.f58471a;
        ia.k(uri, "The uri must be set.");
        return new j2.m(uri, 1, null, map, j3, -1L, str2, 6);
    }

    @Override
    public final void q0() {
        this.h = true;
    }
}

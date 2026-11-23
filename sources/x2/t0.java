package x2;

import a8.ma;
import a8.xa;
import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.telegram.ui.Components.i61;
public final class t0 implements b3.m {
    public final Uri f60353a;
    public final j2.b0 f60354b;
    public final i61 f60355c;
    public final w0 d;
    public final h2.i f60356e;
    public volatile boolean h;
    public long f60359r;
    public j2.m f60360s;
    public f3.j0 f60361w;
    public boolean f60362x;
    public final w0 f60363y;
    public final f3.s f60357f = new Object();
    public boolean f60358n = true;

    public t0(w0 w0Var, Uri uri, j2.h hVar, i61 i61Var, w0 w0Var2, h2.i iVar) {
        this.f60363y = w0Var;
        this.f60353a = uri;
        this.f60354b = new j2.b0(hVar);
        this.f60355c = i61Var;
        this.d = w0Var2;
        this.f60356e = iVar;
        u.f60365g.getAndIncrement();
        this.f60360s = b(0L, null);
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
                long j3 = this.f60357f.f11195a;
                j2.m b10 = b(j3, str);
                this.f60360s = b10;
                long open = this.f60354b.open(b10);
                if (this.h) {
                    if (i10 != 1 && this.f60355c.A() != -1) {
                        this.f60357f.f11195a = this.f60355c.A();
                    }
                    c8.t0.a(this.f60354b);
                    return;
                }
                List list = (List) this.f60354b.f17242a.getResponseHeaders().get("ETag");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                if (open != -1) {
                    open += j3;
                    w0 w0Var = this.f60363y;
                    w0Var.I.post(new p0(w0Var, 0));
                }
                long j10 = open;
                this.f60363y.K = s3.b.d(this.f60354b.f17242a.getResponseHeaders());
                j2.b0 b0Var = this.f60354b;
                s3.b bVar = this.f60363y.K;
                if (bVar != null && (i7 = bVar.f57041f) != -1) {
                    hVar = new t(b0Var, i7, this);
                    f3.j0 B = this.f60363y.B(new v0(0, true));
                    this.f60361w = B;
                    B.g(w0.f60380k0);
                } else {
                    hVar = b0Var;
                }
                this.f60355c.I(hVar, this.f60353a, this.f60354b.f17242a.getResponseHeaders(), j3, j10, this.d);
                if (this.f60363y.K != null && (oVar = (f3.o) this.f60355c.f35959c) != null) {
                    f3.o a10 = oVar.a();
                    if (a10 instanceof y3.d) {
                        ((y3.d) a10).f60861t = true;
                    }
                }
                if (this.f60358n) {
                    i61 i61Var = this.f60355c;
                    long j11 = this.f60359r;
                    f3.o oVar2 = (f3.o) i61Var.f35959c;
                    oVar2.getClass();
                    oVar2.d(j3, j11);
                    this.f60358n = false;
                }
                while (i10 == 0 && !this.h) {
                    try {
                        h2.i iVar = this.f60356e;
                        synchronized (iVar) {
                            while (!iVar.f13761b) {
                                iVar.f13760a.getClass();
                                iVar.wait();
                            }
                        }
                        i61 i61Var2 = this.f60355c;
                        f3.s sVar = this.f60357f;
                        f3.o oVar3 = (f3.o) i61Var2.f35959c;
                        oVar3.getClass();
                        f3.l lVar = (f3.l) i61Var2.d;
                        lVar.getClass();
                        i10 = oVar3.f(lVar, sVar);
                        long A = this.f60355c.A();
                        if (A > this.f60363y.f60397s + j3) {
                            this.f60356e.d();
                            w0 w0Var2 = this.f60363y;
                            w0Var2.I.post(w0Var2.H);
                            j3 = A;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i10 == 1) {
                    i10 = 0;
                } else if (this.f60355c.A() != -1) {
                    this.f60357f.f11195a = this.f60355c.A();
                }
                c8.t0.a(this.f60354b);
            } catch (Throwable th2) {
                if (i10 != 1 && this.f60355c.A() != -1) {
                    this.f60357f.f11195a = this.f60355c.A();
                }
                c8.t0.a(this.f60354b);
                throw th2;
            }
        }
    }

    public final j2.m b(long j3, String str) {
        Map map = w0.f60379j0;
        if (str != null && !str.startsWith("W/")) {
            xa xaVar = new xa(4, 10);
            xaVar.w(map.entrySet());
            xaVar.u("If-Range", str);
            map = xaVar.d();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.f60363y.f60396r;
        Uri uri = this.f60353a;
        ma.k(uri, "The uri must be set.");
        return new j2.m(uri, 1, null, map, j3, -1L, str2, 6);
    }

    @Override
    public final void y() {
        this.h = true;
    }
}

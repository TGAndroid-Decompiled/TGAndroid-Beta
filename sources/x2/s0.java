package x2;

import a8.ja;
import a8.xa;
import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.telegram.ui.ld0;
public final class s0 implements b3.l {
    public final Uri f59652a;
    public final j2.b0 f59653b;
    public final ld0 f59654c;
    public final v0 d;
    public final h2.i f59655e;
    public volatile boolean h;
    public long f59658r;
    public j2.m f59659s;
    public f3.i0 f59660w;
    public boolean f59661x;
    public final v0 f59662y;
    public final f3.s f59656f = new Object();
    public boolean f59657n = true;

    public s0(v0 v0Var, Uri uri, j2.h hVar, ld0 ld0Var, v0 v0Var2, h2.i iVar) {
        this.f59662y = v0Var;
        this.f59652a = uri;
        this.f59653b = new j2.b0(hVar);
        this.f59654c = ld0Var;
        this.d = v0Var2;
        this.f59655e = iVar;
        t.f59664g.getAndIncrement();
        this.f59659s = b(0L, null);
    }

    @Override
    public final void D() {
        this.h = true;
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
                long j3 = this.f59656f.f10877a;
                j2.m b10 = b(j3, str);
                this.f59659s = b10;
                long open = this.f59653b.open(b10);
                if (this.h) {
                    if (i10 != 1 && this.f59654c.v() != -1) {
                        this.f59656f.f10877a = this.f59654c.v();
                    }
                    c8.q0.a(this.f59653b);
                    return;
                }
                List list = (List) this.f59653b.f16769a.getResponseHeaders().get("ETag");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                if (open != -1) {
                    open += j3;
                    v0 v0Var = this.f59662y;
                    v0Var.I.post(new o0(v0Var, 0));
                }
                long j10 = open;
                this.f59662y.K = s3.b.d(this.f59653b.f16769a.getResponseHeaders());
                j2.b0 b0Var = this.f59653b;
                s3.b bVar = this.f59662y.K;
                if (bVar != null && (i7 = bVar.f56341f) != -1) {
                    hVar = new s(b0Var, i7, this);
                    f3.i0 B = this.f59662y.B(new u0(0, true));
                    this.f59660w = B;
                    B.g(v0.f59679k0);
                } else {
                    hVar = b0Var;
                }
                this.f59654c.C(hVar, this.f59652a, this.f59653b.f16769a.getResponseHeaders(), j3, j10, this.d);
                if (this.f59662y.K != null && (oVar = (f3.o) this.f59654c.f48977c) != null) {
                    f3.o a10 = oVar.a();
                    if (a10 instanceof y3.d) {
                        ((y3.d) a10).f60167t = true;
                    }
                }
                if (this.f59657n) {
                    ld0 ld0Var = this.f59654c;
                    long j11 = this.f59658r;
                    f3.o oVar2 = (f3.o) ld0Var.f48977c;
                    oVar2.getClass();
                    oVar2.d(j3, j11);
                    this.f59657n = false;
                }
                while (i10 == 0 && !this.h) {
                    try {
                        h2.i iVar = this.f59655e;
                        synchronized (iVar) {
                            while (!iVar.f13454b) {
                                iVar.f13453a.getClass();
                                iVar.wait();
                            }
                        }
                        ld0 ld0Var2 = this.f59654c;
                        f3.s sVar = this.f59656f;
                        f3.o oVar3 = (f3.o) ld0Var2.f48977c;
                        oVar3.getClass();
                        f3.l lVar = (f3.l) ld0Var2.d;
                        lVar.getClass();
                        i10 = oVar3.f(lVar, sVar);
                        long v = this.f59654c.v();
                        if (v > this.f59662y.f59696s + j3) {
                            this.f59655e.d();
                            v0 v0Var2 = this.f59662y;
                            v0Var2.I.post(v0Var2.H);
                            j3 = v;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i10 == 1) {
                    i10 = 0;
                } else if (this.f59654c.v() != -1) {
                    this.f59656f.f10877a = this.f59654c.v();
                }
                c8.q0.a(this.f59653b);
            } catch (Throwable th2) {
                if (i10 != 1 && this.f59654c.v() != -1) {
                    this.f59656f.f10877a = this.f59654c.v();
                }
                c8.q0.a(this.f59653b);
                throw th2;
            }
        }
    }

    public final j2.m b(long j3, String str) {
        Map map = v0.f59678j0;
        if (str != null && !str.startsWith("W/")) {
            xa xaVar = new xa(4, 10);
            xaVar.v(map.entrySet());
            xaVar.u("If-Range", str);
            map = xaVar.d();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.f59662y.f59695r;
        Uri uri = this.f59652a;
        ja.k(uri, "The uri must be set.");
        return new j2.m(uri, 1, null, map, j3, -1L, str2, 6);
    }
}

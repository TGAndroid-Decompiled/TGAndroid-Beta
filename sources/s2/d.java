package s2;

import a8.xa;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import e2.s0;
import e2.t0;
import h2.l0;
import h9.g2;
import h9.i0;
import j2.b0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.ActionBar.i5;
import r0.f1;
public final class d implements b3.k {
    public static final f1 K = new f1(16);
    public i0 E;
    public i0 F;
    public Uri G;
    public n H;
    public boolean I;
    public final i5 f56880a;
    public final u f56881b;
    public final qb.a f56882c;
    public xa f56884f;
    public b3.p h;
    public Handler f56885n;
    public r2.k f56886r;
    public q f56887s;
    public t0 f56888w;
    public i0 f56889x;
    public i0 f56890y;
    public final CopyOnWriteArrayList f56883e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long J = -9223372036854775807L;

    public d(i5 i5Var, qb.a aVar, u uVar) {
        this.f56880a = i5Var;
        this.f56881b = uVar;
        this.f56882c = aVar;
    }

    public final void a(List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            x xVar = (x) list.get(i7);
            c cVar = new c(this, xVar);
            g2 it = h9.t0.q(xVar.f57032b.values()).iterator();
            while (it.hasNext()) {
                this.d.put((Uri) it.next(), cVar);
            }
        }
    }

    public final n b(Uri uri, boolean z10) {
        HashMap hashMap = this.d;
        c cVar = (c) hashMap.get(uri);
        if (cVar == null) {
            return null;
        }
        n a10 = c.a(cVar, uri);
        if (a10 != null && z10) {
            g(uri);
            c cVar2 = (c) hashMap.get(uri);
            cVar2.getClass();
            HashMap hashMap2 = cVar2.f56878b;
            b bVar = (b) p5.c.i(hashMap2, uri, uri);
            bVar.getClass();
            if (!bVar.f56875x) {
                b bVar2 = (b) p5.c.i(hashMap2, uri, uri);
                bVar2.getClass();
                bVar2.f56875x = true;
                n a11 = c.a(cVar2, uri);
                if (a11 != null && !a11.f56962o) {
                    c.b(cVar2, uri, true);
                }
            }
        }
        return a10;
    }

    public final i0 c(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        return null;
                    }
                    return this.F;
                }
                return this.E;
            }
            return this.f56890y;
        }
        return this.f56889x;
    }

    public final Uri d(Uri uri) {
        j jVar;
        n nVar = this.H;
        if (nVar != null && nVar.v.f56952e && (jVar = (j) nVar.f56967t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(jVar.f56936b));
            int i7 = jVar.f56937c;
            if (i7 != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i7));
            }
            return buildUpon.build();
        }
        return uri;
    }

    public final boolean e(x xVar, long j3) {
        boolean z10;
        c cVar = (c) this.d.get(xVar.c());
        if (cVar == null) {
            return false;
        }
        Iterator it = cVar.f56878b.values().iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            if (j3 <= ((b) it.next()).f56872r) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 &= z10;
        }
        return z11;
    }

    public final boolean f(Uri uri) {
        int i7;
        c cVar = (c) this.d.get(uri);
        if (cVar != null) {
            b bVar = (b) p5.c.i(cVar.f56878b, uri, uri);
            bVar.getClass();
            if (bVar.f56869e != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long max = Math.max(30000L, l0.h0(bVar.f56869e.f56968u));
                n nVar = bVar.f56869e;
                if (nVar.f56962o || (i7 = nVar.d) == 2 || i7 == 1 || bVar.f56870f + max > elapsedRealtime) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void g(Uri uri) {
        if (!uri.equals(this.G)) {
            List list = this.f56887s.f56981e;
            for (int i7 = 0; i7 < list.size(); i7++) {
                if (uri.equals(((p) list.get(i7)).f56974a)) {
                    n nVar = this.H;
                    if (nVar == null || !nVar.f56962o) {
                        this.G = uri;
                        c cVar = (c) this.d.get(uri);
                        cVar.getClass();
                        n a10 = c.a(cVar, uri);
                        if (a10 != null && a10.f56962o) {
                            this.H = a10;
                            this.f56886r.v(a10);
                            return;
                        }
                        Uri d = d(uri);
                        b bVar = (b) p5.c.i(cVar.f56878b, uri, uri);
                        bVar.getClass();
                        bVar.c(d);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void h(Uri uri) {
        c cVar = (c) this.d.get(uri);
        if (cVar != null) {
            b bVar = (b) p5.c.i(cVar.f56878b, uri, uri);
            bVar.getClass();
            bVar.f56868c.a();
            IOException iOException = bVar.f56874w;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final b3.i k(b3.m mVar, long j3, long j10, IOException iOException, int i7) {
        boolean z10;
        long min;
        b3.s sVar = (b3.s) mVar;
        long j11 = sVar.f2888a;
        j2.m mVar2 = sVar.f2889b;
        b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.f17244c, b0Var.d, j3, j10, b0Var.f17243b);
        int i10 = sVar.f2890c;
        this.f56882c.getClass();
        Throwable th2 = iOException;
        while (true) {
            z10 = true;
            if (th2 != null) {
                if ((th2 instanceof t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.u) || (th2 instanceof b3.o) || ((th2 instanceof j2.j) && ((j2.j) th2).f17264a == 2008)) {
                    break;
                }
                th2 = th2.getCause();
            } else {
                min = Math.min((i7 - 1) * 1000, 5000);
                break;
            }
        }
        min = -9223372036854775807L;
        if (min != -9223372036854775807L) {
            z10 = false;
        }
        this.f56884f.q(uVar, i10, iOException, z10);
        if (z10) {
            return b3.p.f2884f;
        }
        return new b3.i(0, min, false);
    }

    @Override
    public final void m(b3.m mVar, long j3, long j10, boolean z10) {
        b3.s sVar = (b3.s) mVar;
        long j11 = sVar.f2888a;
        j2.m mVar2 = sVar.f2889b;
        b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.f17244c, b0Var.d, j3, j10, b0Var.f17243b);
        this.f56882c.getClass();
        this.f56884f.n(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void t(b3.m mVar, long j3, long j10, int i7) {
        x2.u uVar;
        b3.s sVar = (b3.s) mVar;
        if (i7 == 0) {
            long j11 = sVar.f2888a;
            uVar = new x2.u(sVar.f2889b, j3);
        } else {
            long j12 = sVar.f2888a;
            j2.m mVar2 = sVar.f2889b;
            b0 b0Var = sVar.d;
            uVar = new x2.u(mVar2, b0Var.f17244c, b0Var.d, j3, j10, b0Var.f17243b);
        }
        this.f56884f.s(uVar, sVar.f2890c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i7);
    }

    @Override
    public final void x(b3.m mVar, long j3, long j10) {
        q qVar;
        b3.s sVar = (b3.s) mVar;
        r rVar = (r) sVar.f2892f;
        boolean z10 = rVar instanceof n;
        if (z10) {
            String str = rVar.f56989a;
            q qVar2 = q.f56980n;
            Uri parse = Uri.parse(str);
            e2.t tVar = new e2.t();
            tVar.f10692a = "0";
            tVar.f10706q = s0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new p(parse, new e2.u(tVar), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            qVar = new q("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            qVar = (q) rVar;
        }
        this.f56887s = qVar;
        try {
            this.f56889x = x.b(qVar.f56981e);
            this.f56890y = x.a(qVar.f56982f);
            this.E = x.a(qVar.f56983g);
            this.F = x.a(qVar.h);
            this.G = ((x) this.f56889x.get(0)).c();
            this.f56883e.add(new a(this));
            a(this.f56889x);
            a(this.f56890y);
            a(this.E);
            a(this.F);
            j2.m mVar2 = sVar.f2889b;
            b0 b0Var = sVar.d;
            x2.u uVar = new x2.u(mVar2, b0Var.f17244c, b0Var.d, j3, j10, b0Var.f17243b);
            c cVar = (c) this.d.get(this.G);
            cVar.getClass();
            if (z10) {
                Uri uri = sVar.d.f17244c;
                b bVar = (b) p5.c.i(cVar.f56878b, uri, uri);
                bVar.getClass();
                bVar.d((n) rVar, uVar);
            } else {
                c.b(cVar, this.G, false);
            }
            this.f56882c.getClass();
            this.f56884f.o(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (t0 e10) {
            this.f56888w = e10;
        }
    }
}

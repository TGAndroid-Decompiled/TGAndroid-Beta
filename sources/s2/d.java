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
import org.telegram.ui.Components.cf;
public final class d implements b3.j {
    public static final r2.j K = new r2.j(15);
    public i0 E;
    public i0 F;
    public Uri G;
    public m H;
    public boolean I;
    public final cf f56183a;
    public final t f56184b;
    public final qb.a f56185c;
    public xa f56187f;
    public b3.o h;
    public Handler f56188n;
    public r2.l f56189r;
    public p f56190s;
    public t0 f56191w;
    public i0 f56192x;
    public i0 f56193y;
    public final CopyOnWriteArrayList f56186e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long J = -9223372036854775807L;

    public d(cf cfVar, qb.a aVar, t tVar) {
        this.f56183a = cfVar;
        this.f56184b = tVar;
        this.f56185c = aVar;
    }

    public final void a(List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            w wVar = (w) list.get(i7);
            c cVar = new c(this, wVar);
            g2 it = h9.t0.q(wVar.f56332b.values()).iterator();
            while (it.hasNext()) {
                this.d.put((Uri) it.next(), cVar);
            }
        }
    }

    public final m b(Uri uri, boolean z10) {
        HashMap hashMap = this.d;
        c cVar = (c) hashMap.get(uri);
        if (cVar == null) {
            return null;
        }
        m a10 = c.a(cVar, uri);
        if (a10 != null && z10) {
            g(uri);
            c cVar2 = (c) hashMap.get(uri);
            cVar2.getClass();
            HashMap hashMap2 = cVar2.f56181b;
            b bVar = (b) r.b.i(hashMap2, uri, uri);
            bVar.getClass();
            if (!bVar.f56178x) {
                b bVar2 = (b) r.b.i(hashMap2, uri, uri);
                bVar2.getClass();
                bVar2.f56178x = true;
                m a11 = c.a(cVar2, uri);
                if (a11 != null && !a11.f56262o) {
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
            return this.f56193y;
        }
        return this.f56192x;
    }

    public final Uri d(Uri uri) {
        i iVar;
        m mVar = this.H;
        if (mVar != null && mVar.v.f56252e && (iVar = (i) mVar.f56267t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar.f56236b));
            int i7 = iVar.f56237c;
            if (i7 != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i7));
            }
            return buildUpon.build();
        }
        return uri;
    }

    public final boolean e(w wVar, long j3) {
        boolean z10;
        c cVar = (c) this.d.get(wVar.c());
        if (cVar == null) {
            return false;
        }
        Iterator it = cVar.f56181b.values().iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            if (j3 <= ((b) it.next()).f56175r) {
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
            b bVar = (b) r.b.i(cVar.f56181b, uri, uri);
            bVar.getClass();
            if (bVar.f56172e != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long max = Math.max(30000L, l0.h0(bVar.f56172e.f56268u));
                m mVar = bVar.f56172e;
                if (mVar.f56262o || (i7 = mVar.d) == 2 || i7 == 1 || bVar.f56173f + max > elapsedRealtime) {
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
            List list = this.f56190s.f56281e;
            for (int i7 = 0; i7 < list.size(); i7++) {
                if (uri.equals(((o) list.get(i7)).f56274a)) {
                    m mVar = this.H;
                    if (mVar == null || !mVar.f56262o) {
                        this.G = uri;
                        c cVar = (c) this.d.get(uri);
                        cVar.getClass();
                        m a10 = c.a(cVar, uri);
                        if (a10 != null && a10.f56262o) {
                            this.H = a10;
                            this.f56189r.v(a10);
                            return;
                        }
                        Uri d = d(uri);
                        b bVar = (b) r.b.i(cVar.f56181b, uri, uri);
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
            b bVar = (b) r.b.i(cVar.f56181b, uri, uri);
            bVar.getClass();
            bVar.f56171c.a();
            IOException iOException = bVar.f56177w;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final b3.i k(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        boolean z10;
        long min;
        b3.r rVar = (b3.r) lVar;
        long j11 = rVar.f2919a;
        j2.m mVar = rVar.f2920b;
        b0 b0Var = rVar.d;
        x2.t tVar = new x2.t(mVar, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
        int i10 = rVar.f2921c;
        this.f56185c.getClass();
        Throwable th2 = iOException;
        while (true) {
            z10 = true;
            if (th2 != null) {
                if ((th2 instanceof t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.u) || (th2 instanceof b3.n) || ((th2 instanceof j2.j) && ((j2.j) th2).f16791a == 2008)) {
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
        this.f56187f.q(tVar, i10, iOException, z10);
        if (z10) {
            return b3.o.f2915f;
        }
        return new b3.i(0, min, false);
    }

    @Override
    public final void m(b3.l lVar, long j3, long j10, boolean z10) {
        b3.r rVar = (b3.r) lVar;
        long j11 = rVar.f2919a;
        j2.m mVar = rVar.f2920b;
        b0 b0Var = rVar.d;
        x2.t tVar = new x2.t(mVar, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
        this.f56185c.getClass();
        this.f56187f.n(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void r(b3.l lVar, long j3, long j10, int i7) {
        x2.t tVar;
        b3.r rVar = (b3.r) lVar;
        if (i7 == 0) {
            long j11 = rVar.f2919a;
            tVar = new x2.t(rVar.f2920b, j3);
        } else {
            long j12 = rVar.f2919a;
            j2.m mVar = rVar.f2920b;
            b0 b0Var = rVar.d;
            tVar = new x2.t(mVar, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
        }
        this.f56187f.s(tVar, rVar.f2921c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i7);
    }

    @Override
    public final void w(b3.l lVar, long j3, long j10) {
        p pVar;
        b3.r rVar = (b3.r) lVar;
        q qVar = (q) rVar.f2923f;
        boolean z10 = qVar instanceof m;
        if (z10) {
            String str = qVar.f56289a;
            p pVar2 = p.f56280n;
            Uri parse = Uri.parse(str);
            e2.t tVar = new e2.t();
            tVar.f10384a = "0";
            tVar.f10398q = s0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new o(parse, new e2.u(tVar), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            pVar = new p("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            pVar = (p) qVar;
        }
        this.f56190s = pVar;
        try {
            this.f56192x = w.b(pVar.f56281e);
            this.f56193y = w.a(pVar.f56282f);
            this.E = w.a(pVar.f56283g);
            this.F = w.a(pVar.h);
            this.G = ((w) this.f56192x.get(0)).c();
            this.f56186e.add(new a(this));
            a(this.f56192x);
            a(this.f56193y);
            a(this.E);
            a(this.F);
            j2.m mVar = rVar.f2920b;
            b0 b0Var = rVar.d;
            x2.t tVar2 = new x2.t(mVar, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
            c cVar = (c) this.d.get(this.G);
            cVar.getClass();
            if (z10) {
                Uri uri = rVar.d.f16771c;
                b bVar = (b) r.b.i(cVar.f56181b, uri, uri);
                bVar.getClass();
                bVar.d((m) qVar, tVar2);
            } else {
                c.b(cVar, this.G, false);
            }
            this.f56185c.getClass();
            this.f56187f.o(tVar2, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (t0 e10) {
            this.f56191w = e10;
        }
    }
}

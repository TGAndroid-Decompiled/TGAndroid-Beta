package s2;

import a8.xa;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import e2.s0;
import e2.t0;
import h2.l0;
import h9.h2;
import h9.i0;
import j2.b0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Cells.c5;
import r0.f1;
public final class d implements b3.k {
    public static final f1 K = new f1(16);
    public i0 E;
    public i0 F;
    public Uri G;
    public m H;
    public boolean I;
    public final c5 f56767a;
    public final t f56768b;
    public final qb.a f56769c;
    public xa f56771f;
    public b3.p h;
    public Handler f56772n;
    public r2.k f56773r;
    public p f56774s;
    public t0 f56775w;
    public i0 f56776x;
    public i0 f56777y;
    public final CopyOnWriteArrayList f56770e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long J = -9223372036854775807L;

    public d(c5 c5Var, qb.a aVar, t tVar) {
        this.f56767a = c5Var;
        this.f56768b = tVar;
        this.f56769c = aVar;
    }

    public final void a(List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            w wVar = (w) list.get(i7);
            c cVar = new c(this, wVar);
            h2 it = h9.t0.q(wVar.f56916b.values()).iterator();
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
            HashMap hashMap2 = cVar2.f56765b;
            b bVar = (b) p5.c.i(hashMap2, uri, uri);
            bVar.getClass();
            if (!bVar.f56762x) {
                b bVar2 = (b) p5.c.i(hashMap2, uri, uri);
                bVar2.getClass();
                bVar2.f56762x = true;
                m a11 = c.a(cVar2, uri);
                if (a11 != null && !a11.f56846o) {
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
            return this.f56777y;
        }
        return this.f56776x;
    }

    public final Uri d(Uri uri) {
        i iVar;
        m mVar = this.H;
        if (mVar != null && mVar.v.f56836e && (iVar = (i) mVar.f56851t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar.f56820b));
            int i7 = iVar.f56821c;
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
        Iterator it = cVar.f56765b.values().iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            if (j3 <= ((b) it.next()).f56759r) {
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
            b bVar = (b) p5.c.i(cVar.f56765b, uri, uri);
            bVar.getClass();
            if (bVar.f56756e != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long max = Math.max(30000L, l0.h0(bVar.f56756e.f56852u));
                m mVar = bVar.f56756e;
                if (mVar.f56846o || (i7 = mVar.d) == 2 || i7 == 1 || bVar.f56757f + max > elapsedRealtime) {
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
            List list = this.f56774s.f56865e;
            for (int i7 = 0; i7 < list.size(); i7++) {
                if (uri.equals(((o) list.get(i7)).f56858a)) {
                    m mVar = this.H;
                    if (mVar == null || !mVar.f56846o) {
                        this.G = uri;
                        c cVar = (c) this.d.get(uri);
                        cVar.getClass();
                        m a10 = c.a(cVar, uri);
                        if (a10 != null && a10.f56846o) {
                            this.H = a10;
                            this.f56773r.v(a10);
                            return;
                        }
                        Uri d = d(uri);
                        b bVar = (b) p5.c.i(cVar.f56765b, uri, uri);
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
            b bVar = (b) p5.c.i(cVar.f56765b, uri, uri);
            bVar.getClass();
            bVar.f56755c.a();
            IOException iOException = bVar.f56761w;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final b3.i l(b3.m mVar, long j3, long j10, IOException iOException, int i7) {
        boolean z10;
        long min;
        b3.s sVar = (b3.s) mVar;
        long j11 = sVar.f2887a;
        j2.m mVar2 = sVar.f2888b;
        b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.f17147c, b0Var.d, j3, j10, b0Var.f17146b);
        int i10 = sVar.f2889c;
        this.f56769c.getClass();
        Throwable th2 = iOException;
        while (true) {
            z10 = true;
            if (th2 != null) {
                if ((th2 instanceof t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.u) || (th2 instanceof b3.o) || ((th2 instanceof j2.j) && ((j2.j) th2).f17167a == 2008)) {
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
        this.f56771f.r(uVar, i10, iOException, z10);
        if (z10) {
            return b3.p.f2883f;
        }
        return new b3.i(0, min, false);
    }

    @Override
    public final void p(b3.m mVar, long j3, long j10, boolean z10) {
        b3.s sVar = (b3.s) mVar;
        long j11 = sVar.f2887a;
        j2.m mVar2 = sVar.f2888b;
        b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.f17147c, b0Var.d, j3, j10, b0Var.f17146b);
        this.f56769c.getClass();
        this.f56771f.o(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void s(b3.m mVar, long j3, long j10, int i7) {
        x2.u uVar;
        b3.s sVar = (b3.s) mVar;
        if (i7 == 0) {
            long j11 = sVar.f2887a;
            uVar = new x2.u(sVar.f2888b, j3);
        } else {
            long j12 = sVar.f2887a;
            j2.m mVar2 = sVar.f2888b;
            b0 b0Var = sVar.d;
            uVar = new x2.u(mVar2, b0Var.f17147c, b0Var.d, j3, j10, b0Var.f17146b);
        }
        this.f56771f.u(uVar, sVar.f2889c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i7);
    }

    @Override
    public final void z(b3.m mVar, long j3, long j10) {
        p pVar;
        b3.s sVar = (b3.s) mVar;
        q qVar = (q) sVar.f2891f;
        boolean z10 = qVar instanceof m;
        if (z10) {
            String str = qVar.f56873a;
            p pVar2 = p.f56864n;
            Uri parse = Uri.parse(str);
            e2.t tVar = new e2.t();
            tVar.f10694a = "0";
            tVar.f10708q = s0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new o(parse, new e2.u(tVar), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            pVar = new p("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            pVar = (p) qVar;
        }
        this.f56774s = pVar;
        try {
            this.f56776x = w.b(pVar.f56865e);
            this.f56777y = w.a(pVar.f56866f);
            this.E = w.a(pVar.f56867g);
            this.F = w.a(pVar.h);
            this.G = ((w) this.f56776x.get(0)).c();
            this.f56770e.add(new a(this));
            a(this.f56776x);
            a(this.f56777y);
            a(this.E);
            a(this.F);
            j2.m mVar2 = sVar.f2888b;
            b0 b0Var = sVar.d;
            x2.u uVar = new x2.u(mVar2, b0Var.f17147c, b0Var.d, j3, j10, b0Var.f17146b);
            c cVar = (c) this.d.get(this.G);
            cVar.getClass();
            if (z10) {
                Uri uri = sVar.d.f17147c;
                b bVar = (b) p5.c.i(cVar.f56765b, uri, uri);
                bVar.getClass();
                bVar.d((m) qVar, uVar);
            } else {
                c.b(cVar, this.G, false);
            }
            this.f56769c.getClass();
            this.f56771f.p(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (t0 e10) {
            this.f56775w = e10;
        }
    }
}

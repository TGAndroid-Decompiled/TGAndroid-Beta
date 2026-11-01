package p2;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import b2.v0;
import b2.w0;
import b2.x;
import e2.l0;
import e9.m2;
import e9.n0;
import e9.y0;
import g2.c0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
public final class d implements y2.g {
    public static final org.telegram.utils.twidget.t J = new org.telegram.utils.twidget.t(4);
    public n0 D;
    public n0 E;
    public Uri F;
    public m G;
    public boolean H;
    public final l2.f f44558a;
    public final t f44559b;
    public final hb.a f44560c;
    public a5.a f44561f;
    public y2.l h;
    public Handler f44562n;
    public o2.l f44563r;
    public p f44564s;
    public w0 f44565w;
    public n0 f44566x;
    public n0 f44567y;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long I = -9223372036854775807L;

    public d(l2.f fVar, hb.a aVar, t tVar) {
        this.f44558a = fVar;
        this.f44559b = tVar;
        this.f44560c = aVar;
    }

    @Override
    public final void M(y2.i iVar, long j10, long j11, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f54188a;
        g2.n nVar = oVar.f54189b;
        c0 c0Var = oVar.d;
        u2.u uVar = new u2.u(nVar, c0Var.f7285c, c0Var.d, j10, j11, c0Var.f7284b);
        this.f44560c.getClass();
        this.f44561f.p(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void a(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            w wVar = (w) list.get(i10);
            c cVar = new c(this, wVar);
            m2 it = y0.u(wVar.f44698b.values()).iterator();
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
        m a2 = c.a(cVar, uri);
        if (a2 != null && z10) {
            g(uri);
            c cVar2 = (c) hashMap.get(uri);
            cVar2.getClass();
            HashMap hashMap2 = cVar2.f44556b;
            b bVar = (b) i0.a.h(hashMap2, uri, uri);
            bVar.getClass();
            if (!bVar.f44553x) {
                b bVar2 = (b) i0.a.h(hashMap2, uri, uri);
                bVar2.getClass();
                bVar2.f44553x = true;
                m a10 = c.a(cVar2, uri);
                if (a10 != null && !a10.f44631o) {
                    c.b(cVar2, uri, true);
                }
            }
        }
        return a2;
    }

    public final n0 c(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return this.E;
                }
                return this.D;
            }
            return this.f44567y;
        }
        return this.f44566x;
    }

    public final Uri d(Uri uri) {
        i iVar;
        m mVar = this.G;
        if (mVar != null && mVar.v.e && (iVar = (i) mVar.f44636t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar.f44608b));
            int i10 = iVar.f44609c;
            if (i10 != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
            }
            return buildUpon.build();
        }
        return uri;
    }

    public final boolean e(w wVar, long j10) {
        boolean z10;
        c cVar = (c) this.d.get(wVar.c());
        if (cVar == null) {
            return false;
        }
        Iterator it = cVar.f44556b.values().iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            if (j10 <= ((b) it.next()).f44550r) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 &= z10;
        }
        return z11;
    }

    public final boolean f(Uri uri) {
        int i10;
        c cVar = (c) this.d.get(uri);
        if (cVar != null) {
            b bVar = (b) i0.a.h(cVar.f44556b, uri, uri);
            bVar.getClass();
            if (bVar.e != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long max = Math.max(30000L, l0.h0(bVar.e.f44637u));
                m mVar = bVar.e;
                if (mVar.f44631o || (i10 = mVar.d) == 2 || i10 == 1 || bVar.f44548f + max > elapsedRealtime) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void g(Uri uri) {
        if (!uri.equals(this.F)) {
            List list = this.f44564s.e;
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (uri.equals(((o) list.get(i10)).f44643a)) {
                    m mVar = this.G;
                    if (mVar == null || !mVar.f44631o) {
                        this.F = uri;
                        c cVar = (c) this.d.get(uri);
                        cVar.getClass();
                        m a2 = c.a(cVar, uri);
                        if (a2 != null && a2.f44631o) {
                            this.G = a2;
                            this.f44563r.v(a2);
                            return;
                        }
                        Uri d = d(uri);
                        b bVar = (b) i0.a.h(cVar.f44556b, uri, uri);
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
            b bVar = (b) i0.a.h(cVar.f44556b, uri, uri);
            bVar.getClass();
            bVar.f44547c.a();
            IOException iOException = bVar.f44552w;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final k4.d l(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        long min;
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f54188a;
        g2.n nVar = oVar.f54189b;
        c0 c0Var = oVar.d;
        u2.u uVar = new u2.u(nVar, c0Var.f7285c, c0Var.d, j10, j11, c0Var.f7284b);
        int i11 = oVar.f54190c;
        this.f44560c.getClass();
        Throwable th2 = iOException;
        while (true) {
            z10 = true;
            if (th2 != null) {
                if ((th2 instanceof w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.v) || (th2 instanceof y2.k) || ((th2 instanceof g2.k) && ((g2.k) th2).f7305a == 2008)) {
                    break;
                }
                th2 = th2.getCause();
            } else {
                min = Math.min((i10 - 1) * 1000, 5000);
                break;
            }
        }
        min = -9223372036854775807L;
        if (min != -9223372036854775807L) {
            z10 = false;
        }
        this.f44561f.s(uVar, i11, iOException, z10);
        if (z10) {
            return y2.l.f54184f;
        }
        return new k4.d(0, min, false);
    }

    @Override
    public final void n(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j12 = oVar.f54188a;
            uVar = new u2.u(oVar.f54189b, j10);
        } else {
            long j13 = oVar.f54188a;
            g2.n nVar = oVar.f54189b;
            c0 c0Var = oVar.d;
            uVar = new u2.u(nVar, c0Var.f7285c, c0Var.d, j10, j11, c0Var.f7284b);
        }
        this.f44561f.u(uVar, oVar.f54190c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void o(y2.i iVar, long j10, long j11) {
        p pVar;
        y2.o oVar = (y2.o) iVar;
        q qVar = (q) oVar.f54191f;
        boolean z10 = qVar instanceof m;
        if (z10) {
            String str = qVar.f44656a;
            p pVar2 = p.f44648n;
            Uri parse = Uri.parse(str);
            b2.w wVar = new b2.w();
            wVar.f2356a = "0";
            wVar.f2369q = v0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new o(parse, new x(wVar), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            pVar = new p("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            pVar = (p) qVar;
        }
        this.f44564s = pVar;
        try {
            this.f44566x = w.b(pVar.e);
            this.f44567y = w.a(pVar.f44649f);
            this.D = w.a(pVar.f44650g);
            this.E = w.a(pVar.h);
            this.F = ((w) this.f44566x.get(0)).c();
            this.e.add(new a(this));
            a(this.f44566x);
            a(this.f44567y);
            a(this.D);
            a(this.E);
            g2.n nVar = oVar.f54189b;
            c0 c0Var = oVar.d;
            u2.u uVar = new u2.u(nVar, c0Var.f7285c, c0Var.d, j10, j11, c0Var.f7284b);
            c cVar = (c) this.d.get(this.F);
            cVar.getClass();
            if (z10) {
                Uri uri = oVar.d.f7285c;
                b bVar = (b) i0.a.h(cVar.f44556b, uri, uri);
                bVar.getClass();
                bVar.d((m) qVar, uVar);
            } else {
                c.b(cVar, this.F, false);
            }
            this.f44560c.getClass();
            this.f44561f.q(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (w0 e) {
            this.f44565w = e;
        }
    }
}

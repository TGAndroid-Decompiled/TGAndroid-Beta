package p2;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import b2.w0;
import b2.x;
import b2.x0;
import e2.m0;
import e9.m2;
import e9.n0;
import e9.y0;
import g2.b0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.ps0;
public final class d implements y2.g {
    public static final ps0 J = new ps0(16);
    public n0 E;
    public Uri F;
    public m G;
    public boolean H;
    public final m.h f42546a;
    public final t f42547b;
    public final oa.d f42548c;
    public a5.a f42549f;
    public y2.l h;
    public Handler f42550n;
    public o2.l f42551r;
    public p f42552s;
    public x0 v;
    public n0 f42553w;
    public n0 f42554x;
    public n0 f42555y;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long I = -9223372036854775807L;

    public d(m.h hVar, oa.d dVar, t tVar) {
        this.f42546a = hVar;
        this.f42547b = tVar;
        this.f42548c = dVar;
    }

    @Override
    public final void A(y2.i iVar, long j10, long j11) {
        p pVar;
        y2.o oVar = (y2.o) iVar;
        q qVar = (q) oVar.f48548f;
        boolean z10 = qVar instanceof m;
        if (z10) {
            String str = qVar.f42643a;
            p pVar2 = p.f42635n;
            Uri parse = Uri.parse(str);
            b2.w wVar = new b2.w();
            wVar.f2456a = "0";
            wVar.f2469q = w0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new o(parse, new x(wVar), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            pVar = new p("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            pVar = (p) qVar;
        }
        this.f42552s = pVar;
        try {
            this.f42553w = w.b(pVar.e);
            this.f42554x = w.a(pVar.f42636f);
            this.f42555y = w.a(pVar.f42637g);
            this.E = w.a(pVar.h);
            this.F = ((w) this.f42553w.get(0)).c();
            this.e.add(new a(this));
            a(this.f42553w);
            a(this.f42554x);
            a(this.f42555y);
            a(this.E);
            g2.m mVar = oVar.f48546b;
            b0 b0Var = oVar.d;
            u2.u uVar = new u2.u(mVar, b0Var.f9859c, b0Var.d, j10, j11, b0Var.f9858b);
            c cVar = (c) this.d.get(this.F);
            cVar.getClass();
            if (z10) {
                Uri uri = oVar.d.f9859c;
                b bVar = (b) i2.d.i(cVar.f42544b, uri, uri);
                bVar.getClass();
                bVar.d((m) qVar, uVar);
            } else {
                c.b(cVar, this.F, false);
            }
            this.f42548c.getClass();
            this.f42549f.r(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (x0 e) {
            this.v = e;
        }
    }

    @Override
    public final void X0(y2.i iVar, long j10, long j11, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f48545a;
        g2.m mVar = oVar.f48546b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f9859c, b0Var.d, j10, j11, b0Var.f9858b);
        this.f42548c.getClass();
        this.f42549f.q(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void a(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            w wVar = (w) list.get(i10);
            c cVar = new c(this, wVar);
            m2 it = y0.u(wVar.f42685b.values()).iterator();
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
            HashMap hashMap2 = cVar2.f42544b;
            b bVar = (b) i2.d.i(hashMap2, uri, uri);
            bVar.getClass();
            if (!bVar.f42541w) {
                b bVar2 = (b) i2.d.i(hashMap2, uri, uri);
                bVar2.getClass();
                bVar2.f42541w = true;
                m a10 = c.a(cVar2, uri);
                if (a10 != null && !a10.f42618o) {
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
                return this.f42555y;
            }
            return this.f42554x;
        }
        return this.f42553w;
    }

    public final Uri d(Uri uri) {
        i iVar;
        m mVar = this.G;
        if (mVar != null && mVar.v.e && (iVar = (i) mVar.f42623t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar.f42596b));
            int i10 = iVar.f42597c;
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
        Iterator it = cVar.f42544b.values().iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            if (j10 <= ((b) it.next()).f42539r) {
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
            b bVar = (b) i2.d.i(cVar.f42544b, uri, uri);
            bVar.getClass();
            if (bVar.e != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long max = Math.max(30000L, m0.h0(bVar.e.f42624u));
                m mVar = bVar.e;
                if (mVar.f42618o || (i10 = mVar.d) == 2 || i10 == 1 || bVar.f42537f + max > elapsedRealtime) {
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
            List list = this.f42552s.e;
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (uri.equals(((o) list.get(i10)).f42630a)) {
                    m mVar = this.G;
                    if (mVar == null || !mVar.f42618o) {
                        this.F = uri;
                        c cVar = (c) this.d.get(uri);
                        cVar.getClass();
                        m a2 = c.a(cVar, uri);
                        if (a2 != null && a2.f42618o) {
                            this.G = a2;
                            this.f42551r.v(a2);
                            return;
                        }
                        Uri d = d(uri);
                        b bVar = (b) i2.d.i(cVar.f42544b, uri, uri);
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
            b bVar = (b) i2.d.i(cVar.f42544b, uri, uri);
            bVar.getClass();
            bVar.f42536c.b();
            IOException iOException = bVar.v;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final k4.d w(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        long min;
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f48545a;
        g2.m mVar = oVar.f48546b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f9859c, b0Var.d, j10, j11, b0Var.f9858b);
        int i11 = oVar.f48547c;
        this.f42548c.getClass();
        Throwable th2 = iOException;
        while (true) {
            z10 = true;
            if (th2 != null) {
                if ((th2 instanceof x0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).f9876a == 2008)) {
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
        this.f42549f.t(uVar, i11, iOException, z10);
        if (z10) {
            return y2.l.f48541f;
        }
        return new k4.d(0, min, false);
    }

    @Override
    public final void y(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j12 = oVar.f48545a;
            uVar = new u2.u(oVar.f48546b, j10);
        } else {
            long j13 = oVar.f48545a;
            g2.m mVar = oVar.f48546b;
            b0 b0Var = oVar.d;
            uVar = new u2.u(mVar, b0Var.f9859c, b0Var.d, j10, j11, b0Var.f9858b);
        }
        this.f42549f.v(uVar, oVar.f48547c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }
}

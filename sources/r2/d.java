package r2;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import b8.kg;
import d2.u0;
import d2.v0;
import g2.n0;
import g9.g2;
import g9.i0;
import g9.t0;
import i2.c0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.i9;
public final class d implements a3.k {
    public static final org.telegram.utils.twidget.a K = new Object();
    public i0 E;
    public i0 F;
    public Uri G;
    public m H;
    public boolean I;
    public final i9 f54083a;
    public final t f54084b;
    public final kb.a f54085c;
    public kg f54087f;
    public a3.q h;
    public Handler f54088n;
    public q2.l f54089r;
    public p f54090s;
    public v0 f54091w;
    public i0 f54092x;
    public i0 f54093y;
    public final CopyOnWriteArrayList f54086e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long J = -9223372036854775807L;

    public d(i9 i9Var, kb.a aVar, t tVar) {
        this.f54083a = i9Var;
        this.f54084b = tVar;
        this.f54085c = aVar;
    }

    @Override
    public final void M(a3.m mVar, long j10, long j11, int i3) {
        w2.u uVar;
        a3.t tVar = (a3.t) mVar;
        if (i3 == 0) {
            long j12 = tVar.f110a;
            uVar = new w2.u(tVar.f111b, j10);
        } else {
            long j13 = tVar.f110a;
            i2.n nVar = tVar.f111b;
            c0 c0Var = tVar.d;
            uVar = new w2.u(nVar, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        }
        this.f54087f.u(uVar, tVar.f112c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i3);
    }

    public final void a(List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            w wVar = (w) list.get(i3);
            c cVar = new c(this, wVar);
            g2 it = t0.q(wVar.f54232b.values()).iterator();
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
            HashMap hashMap2 = cVar2.f54081b;
            b bVar = (b) f1.p(hashMap2, uri, uri);
            bVar.getClass();
            if (!bVar.f54078x) {
                b bVar2 = (b) f1.p(hashMap2, uri, uri);
                bVar2.getClass();
                bVar2.f54078x = true;
                m a11 = c.a(cVar2, uri);
                if (a11 != null && !a11.f54162o) {
                    c.b(cVar2, uri, true);
                }
            }
        }
        return a10;
    }

    public final i0 c(int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        return null;
                    }
                    return this.F;
                }
                return this.E;
            }
            return this.f54093y;
        }
        return this.f54092x;
    }

    public final Uri d(Uri uri) {
        i iVar;
        m mVar = this.H;
        if (mVar != null && mVar.v.f54152e && (iVar = (i) mVar.f54167t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar.f54136b));
            int i3 = iVar.f54137c;
            if (i3 != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i3));
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
        Iterator it = cVar.f54081b.values().iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            if (j10 <= ((b) it.next()).f54075r) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 &= z10;
        }
        return z11;
    }

    public final boolean f(Uri uri) {
        int i3;
        c cVar = (c) this.d.get(uri);
        if (cVar != null) {
            b bVar = (b) f1.p(cVar.f54081b, uri, uri);
            bVar.getClass();
            if (bVar.f54072e != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long max = Math.max(30000L, n0.h0(bVar.f54072e.f54168u));
                m mVar = bVar.f54072e;
                if (mVar.f54162o || (i3 = mVar.d) == 2 || i3 == 1 || bVar.f54073f + max > elapsedRealtime) {
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
            List list = this.f54090s.f54181e;
            for (int i3 = 0; i3 < list.size(); i3++) {
                if (uri.equals(((o) list.get(i3)).f54174a)) {
                    m mVar = this.H;
                    if (mVar == null || !mVar.f54162o) {
                        this.G = uri;
                        c cVar = (c) this.d.get(uri);
                        cVar.getClass();
                        m a10 = c.a(cVar, uri);
                        if (a10 != null && a10.f54162o) {
                            this.H = a10;
                            this.f54089r.v(a10);
                            return;
                        }
                        Uri d = d(uri);
                        b bVar = (b) f1.p(cVar.f54081b, uri, uri);
                        bVar.getClass();
                        bVar.c(d);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override
    public final void h(a3.m mVar, long j10, long j11) {
        p pVar;
        a3.t tVar = (a3.t) mVar;
        q qVar = (q) tVar.f114f;
        boolean z10 = qVar instanceof m;
        if (z10) {
            String str = qVar.f54189a;
            p pVar2 = p.f54180n;
            Uri parse = Uri.parse(str);
            d2.u uVar = new d2.u();
            uVar.f8416a = "0";
            uVar.f8430q = u0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new o(parse, new d2.v(uVar), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            pVar = new p("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            pVar = (p) qVar;
        }
        this.f54090s = pVar;
        try {
            this.f54092x = w.b(pVar.f54181e);
            this.f54093y = w.a(pVar.f54182f);
            this.E = w.a(pVar.f54183g);
            this.F = w.a(pVar.h);
            this.G = ((w) this.f54092x.get(0)).c();
            this.f54086e.add(new a(this));
            a(this.f54092x);
            a(this.f54093y);
            a(this.E);
            a(this.F);
            i2.n nVar = tVar.f111b;
            c0 c0Var = tVar.d;
            w2.u uVar2 = new w2.u(nVar, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
            c cVar = (c) this.d.get(this.G);
            cVar.getClass();
            if (z10) {
                Uri uri = tVar.d.f14529c;
                b bVar = (b) f1.p(cVar.f54081b, uri, uri);
                bVar.getClass();
                bVar.d((m) qVar, uVar2);
            } else {
                c.b(cVar, this.G, false);
            }
            this.f54085c.getClass();
            this.f54087f.q(uVar2, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (v0 e10) {
            this.f54091w = e10;
        }
    }

    public final void i(Uri uri) {
        c cVar = (c) this.d.get(uri);
        if (cVar != null) {
            b bVar = (b) f1.p(cVar.f54081b, uri, uri);
            bVar.getClass();
            bVar.f54071c.a();
            IOException iOException = bVar.f54077w;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final a3.i k(a3.m mVar, long j10, long j11, IOException iOException, int i3) {
        boolean z10;
        long min;
        a3.t tVar = (a3.t) mVar;
        long j12 = tVar.f110a;
        i2.n nVar = tVar.f111b;
        c0 c0Var = tVar.d;
        w2.u uVar = new w2.u(nVar, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        int i10 = tVar.f112c;
        this.f54085c.getClass();
        Throwable th2 = iOException;
        while (true) {
            z10 = true;
            if (th2 != null) {
                if ((th2 instanceof v0) || (th2 instanceof FileNotFoundException) || (th2 instanceof i2.v) || (th2 instanceof a3.p) || ((th2 instanceof i2.k) && ((i2.k) th2).f14552a == 2008)) {
                    break;
                }
                th2 = th2.getCause();
            } else {
                min = Math.min((i3 - 1) * 1000, 5000);
                break;
            }
        }
        min = -9223372036854775807L;
        if (min != -9223372036854775807L) {
            z10 = false;
        }
        this.f54087f.s(uVar, i10, iOException, z10);
        if (z10) {
            return a3.q.f106f;
        }
        return new a3.i(0, min, false);
    }

    @Override
    public final void q0(a3.m mVar, long j10, long j11, boolean z10) {
        a3.t tVar = (a3.t) mVar;
        long j12 = tVar.f110a;
        i2.n nVar = tVar.f111b;
        c0 c0Var = tVar.d;
        w2.u uVar = new w2.u(nVar, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        this.f54085c.getClass();
        this.f54087f.p(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}

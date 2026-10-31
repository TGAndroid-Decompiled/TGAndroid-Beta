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
    public final l2.f f44547a;
    public final t f44548b;
    public final hb.a f44549c;
    public a5.a f44550f;
    public y2.l h;
    public Handler f44551n;
    public o2.l f44552r;
    public p f44553s;
    public w0 f44554w;
    public n0 f44555x;
    public n0 f44556y;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long I = -9223372036854775807L;

    public d(l2.f fVar, hb.a aVar, t tVar) {
        this.f44547a = fVar;
        this.f44548b = tVar;
        this.f44549c = aVar;
    }

    @Override
    public final void M(y2.i iVar, long j10, long j11, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f54167a;
        g2.n nVar = oVar.f54168b;
        c0 c0Var = oVar.d;
        u2.u uVar = new u2.u(nVar, c0Var.f7284c, c0Var.d, j10, j11, c0Var.f7283b);
        this.f44549c.getClass();
        this.f44550f.p(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void a(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            w wVar = (w) list.get(i10);
            c cVar = new c(this, wVar);
            m2 it = y0.u(wVar.f44687b.values()).iterator();
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
            HashMap hashMap2 = cVar2.f44545b;
            b bVar = (b) i0.a.h(hashMap2, uri, uri);
            bVar.getClass();
            if (!bVar.f44542x) {
                b bVar2 = (b) i0.a.h(hashMap2, uri, uri);
                bVar2.getClass();
                bVar2.f44542x = true;
                m a10 = c.a(cVar2, uri);
                if (a10 != null && !a10.f44620o) {
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
            return this.f44556y;
        }
        return this.f44555x;
    }

    public final Uri d(Uri uri) {
        i iVar;
        m mVar = this.G;
        if (mVar != null && mVar.v.e && (iVar = (i) mVar.f44625t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar.f44597b));
            int i10 = iVar.f44598c;
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
        Iterator it = cVar.f44545b.values().iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            if (j10 <= ((b) it.next()).f44539r) {
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
            b bVar = (b) i0.a.h(cVar.f44545b, uri, uri);
            bVar.getClass();
            if (bVar.e != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long max = Math.max(30000L, l0.h0(bVar.e.f44626u));
                m mVar = bVar.e;
                if (mVar.f44620o || (i10 = mVar.d) == 2 || i10 == 1 || bVar.f44537f + max > elapsedRealtime) {
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
            List list = this.f44553s.e;
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (uri.equals(((o) list.get(i10)).f44632a)) {
                    m mVar = this.G;
                    if (mVar == null || !mVar.f44620o) {
                        this.F = uri;
                        c cVar = (c) this.d.get(uri);
                        cVar.getClass();
                        m a2 = c.a(cVar, uri);
                        if (a2 != null && a2.f44620o) {
                            this.G = a2;
                            this.f44552r.v(a2);
                            return;
                        }
                        Uri d = d(uri);
                        b bVar = (b) i0.a.h(cVar.f44545b, uri, uri);
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
            b bVar = (b) i0.a.h(cVar.f44545b, uri, uri);
            bVar.getClass();
            bVar.f44536c.a();
            IOException iOException = bVar.f44541w;
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
        long j12 = oVar.f54167a;
        g2.n nVar = oVar.f54168b;
        c0 c0Var = oVar.d;
        u2.u uVar = new u2.u(nVar, c0Var.f7284c, c0Var.d, j10, j11, c0Var.f7283b);
        int i11 = oVar.f54169c;
        this.f44549c.getClass();
        Throwable th2 = iOException;
        while (true) {
            z10 = true;
            if (th2 != null) {
                if ((th2 instanceof w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.v) || (th2 instanceof y2.k) || ((th2 instanceof g2.k) && ((g2.k) th2).f7304a == 2008)) {
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
        this.f44550f.s(uVar, i11, iOException, z10);
        if (z10) {
            return y2.l.f54163f;
        }
        return new k4.d(0, min, false);
    }

    @Override
    public final void n(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j12 = oVar.f54167a;
            uVar = new u2.u(oVar.f54168b, j10);
        } else {
            long j13 = oVar.f54167a;
            g2.n nVar = oVar.f54168b;
            c0 c0Var = oVar.d;
            uVar = new u2.u(nVar, c0Var.f7284c, c0Var.d, j10, j11, c0Var.f7283b);
        }
        this.f44550f.u(uVar, oVar.f54169c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void o(y2.i iVar, long j10, long j11) {
        p pVar;
        y2.o oVar = (y2.o) iVar;
        q qVar = (q) oVar.f54170f;
        boolean z10 = qVar instanceof m;
        if (z10) {
            String str = qVar.f44645a;
            p pVar2 = p.f44637n;
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
        this.f44553s = pVar;
        try {
            this.f44555x = w.b(pVar.e);
            this.f44556y = w.a(pVar.f44638f);
            this.D = w.a(pVar.f44639g);
            this.E = w.a(pVar.h);
            this.F = ((w) this.f44555x.get(0)).c();
            this.e.add(new a(this));
            a(this.f44555x);
            a(this.f44556y);
            a(this.D);
            a(this.E);
            g2.n nVar = oVar.f54168b;
            c0 c0Var = oVar.d;
            u2.u uVar = new u2.u(nVar, c0Var.f7284c, c0Var.d, j10, j11, c0Var.f7283b);
            c cVar = (c) this.d.get(this.F);
            cVar.getClass();
            if (z10) {
                Uri uri = oVar.d.f7284c;
                b bVar = (b) i0.a.h(cVar.f44545b, uri, uri);
                bVar.getClass();
                bVar.d((m) qVar, uVar);
            } else {
                c.b(cVar, this.F, false);
            }
            this.f44549c.getClass();
            this.f44550f.q(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (w0 e) {
            this.f44554w = e;
        }
    }
}

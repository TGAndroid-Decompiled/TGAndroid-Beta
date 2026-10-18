package p2;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import b2.v0;
import b2.w0;
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
import org.telegram.ui.hk0;
public final class e implements y2.g {
    public static final hk0 J = new hk0(19);
    public n0 E;
    public Uri F;
    public n G;
    public boolean H;
    public final l2.f f43976a;
    public final u f43977b;
    public final oa.d f43978c;
    public a5.a f43979f;
    public y2.l h;
    public Handler f43980n;
    public o2.l f43981r;
    public q f43982s;
    public w0 v;
    public n0 f43983w;
    public n0 f43984x;
    public n0 f43985y;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long I = -9223372036854775807L;

    public e(l2.f fVar, oa.d dVar, u uVar) {
        this.f43976a = fVar;
        this.f43977b = uVar;
        this.f43978c = dVar;
    }

    @Override
    public final void I(y2.i iVar, long j10, long j11, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f49975a;
        g2.m mVar = oVar.f49976b;
        b0 b0Var = oVar.d;
        u2.t tVar = new u2.t(mVar, b0Var.f10767c, b0Var.d, j10, j11, b0Var.f10766b);
        this.f43978c.getClass();
        this.f43979f.q(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void a(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            x xVar = (x) list.get(i10);
            d dVar = new d(this, xVar);
            m2 it = y0.u(xVar.f44115b.values()).iterator();
            while (it.hasNext()) {
                this.d.put((Uri) it.next(), dVar);
            }
        }
    }

    public final n b(Uri uri, boolean z10) {
        HashMap hashMap = this.d;
        d dVar = (d) hashMap.get(uri);
        if (dVar == null) {
            return null;
        }
        n a2 = d.a(dVar, uri);
        if (a2 != null && z10) {
            g(uri);
            d dVar2 = (d) hashMap.get(uri);
            dVar2.getClass();
            HashMap hashMap2 = dVar2.f43974b;
            c cVar = (c) i2.d.i(hashMap2, uri, uri);
            cVar.getClass();
            if (!cVar.f43971w) {
                c cVar2 = (c) i2.d.i(hashMap2, uri, uri);
                cVar2.getClass();
                cVar2.f43971w = true;
                n a10 = d.a(dVar2, uri);
                if (a10 != null && !a10.f44048o) {
                    d.b(dVar2, uri, true);
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
                return this.f43985y;
            }
            return this.f43984x;
        }
        return this.f43983w;
    }

    public final Uri d(Uri uri) {
        j jVar;
        n nVar = this.G;
        if (nVar != null && nVar.v.e && (jVar = (j) nVar.f44053t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(jVar.f44026b));
            int i10 = jVar.f44027c;
            if (i10 != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
            }
            return buildUpon.build();
        }
        return uri;
    }

    public final boolean e(x xVar, long j10) {
        boolean z10;
        d dVar = (d) this.d.get(xVar.c());
        if (dVar == null) {
            return false;
        }
        Iterator it = dVar.f43974b.values().iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            if (j10 <= ((c) it.next()).f43969r) {
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
        d dVar = (d) this.d.get(uri);
        if (dVar != null) {
            c cVar = (c) i2.d.i(dVar.f43974b, uri, uri);
            cVar.getClass();
            if (cVar.e != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long max = Math.max(30000L, m0.h0(cVar.e.f44054u));
                n nVar = cVar.e;
                if (nVar.f44048o || (i10 = nVar.d) == 2 || i10 == 1 || cVar.f43967f + max > elapsedRealtime) {
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
            List list = this.f43982s.e;
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (uri.equals(((p) list.get(i10)).f44060a)) {
                    n nVar = this.G;
                    if (nVar == null || !nVar.f44048o) {
                        this.F = uri;
                        d dVar = (d) this.d.get(uri);
                        dVar.getClass();
                        n a2 = d.a(dVar, uri);
                        if (a2 != null && a2.f44048o) {
                            this.G = a2;
                            this.f43981r.v(a2);
                            return;
                        }
                        Uri d = d(uri);
                        c cVar = (c) i2.d.i(dVar.f43974b, uri, uri);
                        cVar.getClass();
                        cVar.c(d);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void h(Uri uri) {
        d dVar = (d) this.d.get(uri);
        if (dVar != null) {
            c cVar = (c) i2.d.i(dVar.f43974b, uri, uri);
            cVar.getClass();
            cVar.f43966c.a();
            IOException iOException = cVar.v;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final k4.d j(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        long min;
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f49975a;
        g2.m mVar = oVar.f49976b;
        b0 b0Var = oVar.d;
        u2.t tVar = new u2.t(mVar, b0Var.f10767c, b0Var.d, j10, j11, b0Var.f10766b);
        int i11 = oVar.f49977c;
        this.f43978c.getClass();
        Throwable th2 = iOException;
        while (true) {
            z10 = true;
            if (th2 != null) {
                if ((th2 instanceof w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).f10784a == 2008)) {
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
        this.f43979f.t(tVar, i11, iOException, z10);
        if (z10) {
            return y2.l.f49971f;
        }
        return new k4.d(0, min, false);
    }

    @Override
    public final void l(y2.i iVar, long j10, long j11, int i10) {
        u2.t tVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j12 = oVar.f49975a;
            tVar = new u2.t(oVar.f49976b, j10);
        } else {
            long j13 = oVar.f49975a;
            g2.m mVar = oVar.f49976b;
            b0 b0Var = oVar.d;
            tVar = new u2.t(mVar, b0Var.f10767c, b0Var.d, j10, j11, b0Var.f10766b);
        }
        this.f43979f.v(tVar, oVar.f49977c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void n(y2.i iVar, long j10, long j11) {
        q qVar;
        y2.o oVar = (y2.o) iVar;
        r rVar = (r) oVar.f49978f;
        boolean z10 = rVar instanceof n;
        if (z10) {
            String str = rVar.f44073a;
            q qVar2 = q.f44065n;
            Uri parse = Uri.parse(str);
            b2.v vVar = new b2.v();
            vVar.f4065a = "0";
            vVar.f4078q = v0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new p(parse, new b2.w(vVar), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            qVar = new q("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            qVar = (q) rVar;
        }
        this.f43982s = qVar;
        try {
            this.f43983w = x.b(qVar.e);
            this.f43984x = x.a(qVar.f44066f);
            this.f43985y = x.a(qVar.f44067g);
            this.E = x.a(qVar.h);
            this.F = ((x) this.f43983w.get(0)).c();
            this.e.add(new a(this));
            a(this.f43983w);
            a(this.f43984x);
            a(this.f43985y);
            a(this.E);
            g2.m mVar = oVar.f49976b;
            b0 b0Var = oVar.d;
            u2.t tVar = new u2.t(mVar, b0Var.f10767c, b0Var.d, j10, j11, b0Var.f10766b);
            d dVar = (d) this.d.get(this.F);
            dVar.getClass();
            if (z10) {
                Uri uri = oVar.d.f10767c;
                c cVar = (c) i2.d.i(dVar.f43974b, uri, uri);
                cVar.getClass();
                cVar.d((n) rVar, tVar);
            } else {
                d.b(dVar, this.F, false);
            }
            this.f43978c.getClass();
            this.f43979f.r(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (w0 e) {
            this.v = e;
        }
    }
}

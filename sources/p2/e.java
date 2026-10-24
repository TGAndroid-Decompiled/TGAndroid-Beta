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
import i2.o1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.web.d0;
public final class e implements y2.g {
    public static final d0 J = new d0(2);
    public n0 E;
    public Uri F;
    public n G;
    public boolean H;
    public final l2.f f44356a;
    public final u f44357b;
    public final oa.d f44358c;
    public a5.a f44359f;
    public y2.l h;
    public Handler f44360n;
    public o2.l f44361r;
    public q f44362s;
    public w0 v;
    public n0 f44363w;
    public n0 f44364x;
    public n0 f44365y;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long I = -9223372036854775807L;

    public e(l2.f fVar, oa.d dVar, u uVar) {
        this.f44356a = fVar;
        this.f44357b = uVar;
        this.f44358c = dVar;
    }

    public final void a(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            x xVar = (x) list.get(i10);
            d dVar = new d(this, xVar);
            m2 it = y0.u(xVar.f44495b.values()).iterator();
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
            h(uri);
            d dVar2 = (d) hashMap.get(uri);
            dVar2.getClass();
            HashMap hashMap2 = dVar2.f44354b;
            c cVar = (c) o1.j(hashMap2, uri, uri);
            cVar.getClass();
            if (!cVar.f44351w) {
                c cVar2 = (c) o1.j(hashMap2, uri, uri);
                cVar2.getClass();
                cVar2.f44351w = true;
                n a10 = d.a(dVar2, uri);
                if (a10 != null && !a10.f44428o) {
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
                return this.f44365y;
            }
            return this.f44364x;
        }
        return this.f44363w;
    }

    public final Uri d(Uri uri) {
        j jVar;
        n nVar = this.G;
        if (nVar != null && nVar.v.e && (jVar = (j) nVar.f44433t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(jVar.f44406b));
            int i10 = jVar.f44407c;
            if (i10 != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
            }
            return buildUpon.build();
        }
        return uri;
    }

    @Override
    public final k4.d e(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        long min;
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f50377a;
        g2.m mVar = oVar.f50378b;
        b0 b0Var = oVar.d;
        u2.v vVar = new u2.v(mVar, b0Var.f10783c, b0Var.d, j10, j11, b0Var.f10782b);
        int i11 = oVar.f50379c;
        this.f44358c.getClass();
        Throwable th2 = iOException;
        while (true) {
            z10 = true;
            if (th2 != null) {
                if ((th2 instanceof w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).f10800a == 2008)) {
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
        this.f44359f.t(vVar, i11, iOException, z10);
        if (z10) {
            return y2.l.f50373f;
        }
        return new k4.d(0, min, false);
    }

    public final boolean f(x xVar, long j10) {
        boolean z10;
        d dVar = (d) this.d.get(xVar.c());
        if (dVar == null) {
            return false;
        }
        Iterator it = dVar.f44354b.values().iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            if (j10 <= ((c) it.next()).f44349r) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 &= z10;
        }
        return z11;
    }

    public final boolean g(Uri uri) {
        int i10;
        d dVar = (d) this.d.get(uri);
        if (dVar != null) {
            c cVar = (c) o1.j(dVar.f44354b, uri, uri);
            cVar.getClass();
            if (cVar.e != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long max = Math.max(30000L, m0.h0(cVar.e.f44434u));
                n nVar = cVar.e;
                if (nVar.f44428o || (i10 = nVar.d) == 2 || i10 == 1 || cVar.f44347f + max > elapsedRealtime) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void h(Uri uri) {
        if (!uri.equals(this.F)) {
            List list = this.f44362s.e;
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (uri.equals(((p) list.get(i10)).f44440a)) {
                    n nVar = this.G;
                    if (nVar == null || !nVar.f44428o) {
                        this.F = uri;
                        d dVar = (d) this.d.get(uri);
                        dVar.getClass();
                        n a2 = d.a(dVar, uri);
                        if (a2 != null && a2.f44428o) {
                            this.G = a2;
                            this.f44361r.v(a2);
                            return;
                        }
                        Uri d = d(uri);
                        c cVar = (c) o1.j(dVar.f44354b, uri, uri);
                        cVar.getClass();
                        cVar.c(d);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void i(Uri uri) {
        d dVar = (d) this.d.get(uri);
        if (dVar != null) {
            c cVar = (c) o1.j(dVar.f44354b, uri, uri);
            cVar.getClass();
            cVar.f44346c.a();
            IOException iOException = cVar.v;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void j(y2.i iVar, long j10, long j11, int i10) {
        u2.v vVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j12 = oVar.f50377a;
            vVar = new u2.v(oVar.f50378b, j10);
        } else {
            long j13 = oVar.f50377a;
            g2.m mVar = oVar.f50378b;
            b0 b0Var = oVar.d;
            vVar = new u2.v(mVar, b0Var.f10783c, b0Var.d, j10, j11, b0Var.f10782b);
        }
        this.f44359f.v(vVar, oVar.f50379c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void k(y2.i iVar, long j10, long j11) {
        q qVar;
        y2.o oVar = (y2.o) iVar;
        r rVar = (r) oVar.f50380f;
        boolean z10 = rVar instanceof n;
        if (z10) {
            String str = rVar.f44453a;
            q qVar2 = q.f44445n;
            Uri parse = Uri.parse(str);
            b2.v vVar = new b2.v();
            vVar.f4068a = "0";
            vVar.f4081q = v0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new p(parse, new b2.w(vVar), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            qVar = new q("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            qVar = (q) rVar;
        }
        this.f44362s = qVar;
        try {
            this.f44363w = x.b(qVar.e);
            this.f44364x = x.a(qVar.f44446f);
            this.f44365y = x.a(qVar.f44447g);
            this.E = x.a(qVar.h);
            this.F = ((x) this.f44363w.get(0)).c();
            this.e.add(new a(this));
            a(this.f44363w);
            a(this.f44364x);
            a(this.f44365y);
            a(this.E);
            g2.m mVar = oVar.f50378b;
            b0 b0Var = oVar.d;
            u2.v vVar2 = new u2.v(mVar, b0Var.f10783c, b0Var.d, j10, j11, b0Var.f10782b);
            d dVar = (d) this.d.get(this.F);
            dVar.getClass();
            if (z10) {
                Uri uri = oVar.d.f10783c;
                c cVar = (c) o1.j(dVar.f44354b, uri, uri);
                cVar.getClass();
                cVar.d((n) rVar, vVar2);
            } else {
                d.b(dVar, this.F, false);
            }
            this.f44358c.getClass();
            this.f44359f.r(vVar2, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (w0 e) {
            this.v = e;
        }
    }

    @Override
    public final void z(y2.i iVar, long j10, long j11, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f50377a;
        g2.m mVar = oVar.f50378b;
        b0 b0Var = oVar.d;
        u2.v vVar = new u2.v(mVar, b0Var.f10783c, b0Var.d, j10, j11, b0Var.f10782b);
        this.f44358c.getClass();
        this.f44359f.q(vVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}

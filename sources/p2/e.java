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
    public final l2.f f43956a;
    public final u f43957b;
    public final oa.d f43958c;
    public a5.a f43959f;
    public y2.l h;
    public Handler f43960n;
    public o2.l f43961r;
    public q f43962s;
    public w0 v;
    public n0 f43963w;
    public n0 f43964x;
    public n0 f43965y;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long I = -9223372036854775807L;

    public e(l2.f fVar, oa.d dVar, u uVar) {
        this.f43956a = fVar;
        this.f43957b = uVar;
        this.f43958c = dVar;
    }

    @Override
    public final void I(y2.i iVar, long j10, long j11, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f49950a;
        g2.m mVar = oVar.f49951b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f10765c, b0Var.d, j10, j11, b0Var.f10764b);
        this.f43958c.getClass();
        this.f43959f.q(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void a(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            x xVar = (x) list.get(i10);
            d dVar = new d(this, xVar);
            m2 it = y0.u(xVar.f44095b.values()).iterator();
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
            HashMap hashMap2 = dVar2.f43954b;
            c cVar = (c) i0.a.i(hashMap2, uri, uri);
            cVar.getClass();
            if (!cVar.f43951w) {
                c cVar2 = (c) i0.a.i(hashMap2, uri, uri);
                cVar2.getClass();
                cVar2.f43951w = true;
                n a10 = d.a(dVar2, uri);
                if (a10 != null && !a10.f44028o) {
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
                return this.f43965y;
            }
            return this.f43964x;
        }
        return this.f43963w;
    }

    public final Uri d(Uri uri) {
        j jVar;
        n nVar = this.G;
        if (nVar != null && nVar.v.e && (jVar = (j) nVar.f44033t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(jVar.f44006b));
            int i10 = jVar.f44007c;
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
        Iterator it = dVar.f43954b.values().iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            if (j10 <= ((c) it.next()).f43949r) {
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
            c cVar = (c) i0.a.i(dVar.f43954b, uri, uri);
            cVar.getClass();
            if (cVar.e != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long max = Math.max(30000L, m0.h0(cVar.e.f44034u));
                n nVar = cVar.e;
                if (nVar.f44028o || (i10 = nVar.d) == 2 || i10 == 1 || cVar.f43947f + max > elapsedRealtime) {
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
            List list = this.f43962s.e;
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (uri.equals(((p) list.get(i10)).f44040a)) {
                    n nVar = this.G;
                    if (nVar == null || !nVar.f44028o) {
                        this.F = uri;
                        d dVar = (d) this.d.get(uri);
                        dVar.getClass();
                        n a2 = d.a(dVar, uri);
                        if (a2 != null && a2.f44028o) {
                            this.G = a2;
                            this.f43961r.v(a2);
                            return;
                        }
                        Uri d = d(uri);
                        c cVar = (c) i0.a.i(dVar.f43954b, uri, uri);
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
            c cVar = (c) i0.a.i(dVar.f43954b, uri, uri);
            cVar.getClass();
            cVar.f43946c.a();
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
        long j12 = oVar.f49950a;
        g2.m mVar = oVar.f49951b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f10765c, b0Var.d, j10, j11, b0Var.f10764b);
        int i11 = oVar.f49952c;
        this.f43958c.getClass();
        Throwable th2 = iOException;
        while (true) {
            z10 = true;
            if (th2 != null) {
                if ((th2 instanceof w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).f10782a == 2008)) {
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
        this.f43959f.t(uVar, i11, iOException, z10);
        if (z10) {
            return y2.l.f49946f;
        }
        return new k4.d(0, min, false);
    }

    @Override
    public final void l(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j12 = oVar.f49950a;
            uVar = new u2.u(oVar.f49951b, j10);
        } else {
            long j13 = oVar.f49950a;
            g2.m mVar = oVar.f49951b;
            b0 b0Var = oVar.d;
            uVar = new u2.u(mVar, b0Var.f10765c, b0Var.d, j10, j11, b0Var.f10764b);
        }
        this.f43959f.v(uVar, oVar.f49952c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void n(y2.i iVar, long j10, long j11) {
        q qVar;
        y2.o oVar = (y2.o) iVar;
        r rVar = (r) oVar.f49953f;
        boolean z10 = rVar instanceof n;
        if (z10) {
            String str = rVar.f44053a;
            q qVar2 = q.f44045n;
            Uri parse = Uri.parse(str);
            b2.v vVar = new b2.v();
            vVar.f4064a = "0";
            vVar.f4077q = v0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new p(parse, new b2.w(vVar), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            qVar = new q("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            qVar = (q) rVar;
        }
        this.f43962s = qVar;
        try {
            this.f43963w = x.b(qVar.e);
            this.f43964x = x.a(qVar.f44046f);
            this.f43965y = x.a(qVar.f44047g);
            this.E = x.a(qVar.h);
            this.F = ((x) this.f43963w.get(0)).c();
            this.e.add(new a(this));
            a(this.f43963w);
            a(this.f43964x);
            a(this.f43965y);
            a(this.E);
            g2.m mVar = oVar.f49951b;
            b0 b0Var = oVar.d;
            u2.u uVar = new u2.u(mVar, b0Var.f10765c, b0Var.d, j10, j11, b0Var.f10764b);
            d dVar = (d) this.d.get(this.F);
            dVar.getClass();
            if (z10) {
                Uri uri = oVar.d.f10765c;
                c cVar = (c) i0.a.i(dVar.f43954b, uri, uri);
                cVar.getClass();
                cVar.d((n) rVar, uVar);
            } else {
                d.b(dVar, this.F, false);
            }
            this.f43958c.getClass();
            this.f43959f.r(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (w0 e) {
            this.v = e;
        }
    }
}

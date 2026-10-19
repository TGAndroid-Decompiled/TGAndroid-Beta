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
import org.telegram.ui.fk0;
public final class e implements y2.g {
    public static final fk0 J = new fk0(20);
    public n0 E;
    public Uri F;
    public n G;
    public boolean H;
    public final l2.f f43930a;
    public final u f43931b;
    public final oa.d f43932c;
    public a5.a f43933f;
    public y2.l h;
    public Handler f43934n;
    public o2.l f43935r;
    public q f43936s;
    public w0 v;
    public n0 f43937w;
    public n0 f43938x;
    public n0 f43939y;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long I = -9223372036854775807L;

    public e(l2.f fVar, oa.d dVar, u uVar) {
        this.f43930a = fVar;
        this.f43931b = uVar;
        this.f43932c = dVar;
    }

    @Override
    public final void J(y2.i iVar, long j10, long j11, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f49929a;
        g2.m mVar = oVar.f49930b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f10764c, b0Var.d, j10, j11, b0Var.f10763b);
        this.f43932c.getClass();
        this.f43933f.q(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void a(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            x xVar = (x) list.get(i10);
            d dVar = new d(this, xVar);
            m2 it = y0.u(xVar.f44069b.values()).iterator();
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
            i(uri);
            d dVar2 = (d) hashMap.get(uri);
            dVar2.getClass();
            HashMap hashMap2 = dVar2.f43928b;
            c cVar = (c) i2.e.i(hashMap2, uri, uri);
            cVar.getClass();
            if (!cVar.f43925w) {
                c cVar2 = (c) i2.e.i(hashMap2, uri, uri);
                cVar2.getClass();
                cVar2.f43925w = true;
                n a10 = d.a(dVar2, uri);
                if (a10 != null && !a10.f44002o) {
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
                return this.f43939y;
            }
            return this.f43938x;
        }
        return this.f43937w;
    }

    public final Uri d(Uri uri) {
        j jVar;
        n nVar = this.G;
        if (nVar != null && nVar.v.e && (jVar = (j) nVar.f44007t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(jVar.f43980b));
            int i10 = jVar.f43981c;
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
        long j12 = oVar.f49929a;
        g2.m mVar = oVar.f49930b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f10764c, b0Var.d, j10, j11, b0Var.f10763b);
        int i11 = oVar.f49931c;
        this.f43932c.getClass();
        Throwable th2 = iOException;
        while (true) {
            z10 = true;
            if (th2 != null) {
                if ((th2 instanceof w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).f10781a == 2008)) {
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
        this.f43933f.t(uVar, i11, iOException, z10);
        if (z10) {
            return y2.l.f49925f;
        }
        return new k4.d(0, min, false);
    }

    public final boolean f(x xVar, long j10) {
        boolean z10;
        d dVar = (d) this.d.get(xVar.c());
        if (dVar == null) {
            return false;
        }
        Iterator it = dVar.f43928b.values().iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            if (j10 <= ((c) it.next()).f43923r) {
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
            c cVar = (c) i2.e.i(dVar.f43928b, uri, uri);
            cVar.getClass();
            if (cVar.e != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long max = Math.max(30000L, m0.h0(cVar.e.f44008u));
                n nVar = cVar.e;
                if (nVar.f44002o || (i10 = nVar.d) == 2 || i10 == 1 || cVar.f43921f + max > elapsedRealtime) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void h(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j12 = oVar.f49929a;
            uVar = new u2.u(oVar.f49930b, j10);
        } else {
            long j13 = oVar.f49929a;
            g2.m mVar = oVar.f49930b;
            b0 b0Var = oVar.d;
            uVar = new u2.u(mVar, b0Var.f10764c, b0Var.d, j10, j11, b0Var.f10763b);
        }
        this.f43933f.v(uVar, oVar.f49931c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    public final void i(Uri uri) {
        if (!uri.equals(this.F)) {
            List list = this.f43936s.e;
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (uri.equals(((p) list.get(i10)).f44014a)) {
                    n nVar = this.G;
                    if (nVar == null || !nVar.f44002o) {
                        this.F = uri;
                        d dVar = (d) this.d.get(uri);
                        dVar.getClass();
                        n a2 = d.a(dVar, uri);
                        if (a2 != null && a2.f44002o) {
                            this.G = a2;
                            this.f43935r.v(a2);
                            return;
                        }
                        Uri d = d(uri);
                        c cVar = (c) i2.e.i(dVar.f43928b, uri, uri);
                        cVar.getClass();
                        cVar.c(d);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void j(Uri uri) {
        d dVar = (d) this.d.get(uri);
        if (dVar != null) {
            c cVar = (c) i2.e.i(dVar.f43928b, uri, uri);
            cVar.getClass();
            cVar.f43920c.a();
            IOException iOException = cVar.v;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void k(y2.i iVar, long j10, long j11) {
        q qVar;
        y2.o oVar = (y2.o) iVar;
        r rVar = (r) oVar.f49932f;
        boolean z10 = rVar instanceof n;
        if (z10) {
            String str = rVar.f44027a;
            q qVar2 = q.f44019n;
            Uri parse = Uri.parse(str);
            b2.v vVar = new b2.v();
            vVar.f4061a = "0";
            vVar.f4074q = v0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new p(parse, new b2.w(vVar), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            qVar = new q("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            qVar = (q) rVar;
        }
        this.f43936s = qVar;
        try {
            this.f43937w = x.b(qVar.e);
            this.f43938x = x.a(qVar.f44020f);
            this.f43939y = x.a(qVar.f44021g);
            this.E = x.a(qVar.h);
            this.F = ((x) this.f43937w.get(0)).c();
            this.e.add(new a(this));
            a(this.f43937w);
            a(this.f43938x);
            a(this.f43939y);
            a(this.E);
            g2.m mVar = oVar.f49930b;
            b0 b0Var = oVar.d;
            u2.u uVar = new u2.u(mVar, b0Var.f10764c, b0Var.d, j10, j11, b0Var.f10763b);
            d dVar = (d) this.d.get(this.F);
            dVar.getClass();
            if (z10) {
                Uri uri = oVar.d.f10764c;
                c cVar = (c) i2.e.i(dVar.f43928b, uri, uri);
                cVar.getClass();
                cVar.d((n) rVar, uVar);
            } else {
                d.b(dVar, this.F, false);
            }
            this.f43932c.getClass();
            this.f43933f.r(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (w0 e) {
            this.v = e;
        }
    }
}

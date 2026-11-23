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
    public final c5 f56802a;
    public final t f56803b;
    public final qb.a f56804c;
    public xa f56806f;
    public b3.p h;
    public Handler f56807n;
    public r2.k f56808r;
    public p f56809s;
    public t0 f56810w;
    public i0 f56811x;
    public i0 f56812y;
    public final CopyOnWriteArrayList f56805e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long J = -9223372036854775807L;

    public d(c5 c5Var, qb.a aVar, t tVar) {
        this.f56802a = c5Var;
        this.f56803b = tVar;
        this.f56804c = aVar;
    }

    public final void a(List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            w wVar = (w) list.get(i7);
            c cVar = new c(this, wVar);
            h2 it = h9.t0.q(wVar.f56951b.values()).iterator();
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
            HashMap hashMap2 = cVar2.f56800b;
            b bVar = (b) p5.c.i(hashMap2, uri, uri);
            bVar.getClass();
            if (!bVar.f56797x) {
                b bVar2 = (b) p5.c.i(hashMap2, uri, uri);
                bVar2.getClass();
                bVar2.f56797x = true;
                m a11 = c.a(cVar2, uri);
                if (a11 != null && !a11.f56881o) {
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
            return this.f56812y;
        }
        return this.f56811x;
    }

    public final Uri d(Uri uri) {
        i iVar;
        m mVar = this.H;
        if (mVar != null && mVar.v.f56871e && (iVar = (i) mVar.f56886t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar.f56855b));
            int i7 = iVar.f56856c;
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
        Iterator it = cVar.f56800b.values().iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            if (j3 <= ((b) it.next()).f56794r) {
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
            b bVar = (b) p5.c.i(cVar.f56800b, uri, uri);
            bVar.getClass();
            if (bVar.f56791e != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long max = Math.max(30000L, l0.h0(bVar.f56791e.f56887u));
                m mVar = bVar.f56791e;
                if (mVar.f56881o || (i7 = mVar.d) == 2 || i7 == 1 || bVar.f56792f + max > elapsedRealtime) {
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
            List list = this.f56809s.f56900e;
            for (int i7 = 0; i7 < list.size(); i7++) {
                if (uri.equals(((o) list.get(i7)).f56893a)) {
                    m mVar = this.H;
                    if (mVar == null || !mVar.f56881o) {
                        this.G = uri;
                        c cVar = (c) this.d.get(uri);
                        cVar.getClass();
                        m a10 = c.a(cVar, uri);
                        if (a10 != null && a10.f56881o) {
                            this.H = a10;
                            this.f56808r.v(a10);
                            return;
                        }
                        Uri d = d(uri);
                        b bVar = (b) p5.c.i(cVar.f56800b, uri, uri);
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
            b bVar = (b) p5.c.i(cVar.f56800b, uri, uri);
            bVar.getClass();
            bVar.f56790c.a();
            IOException iOException = bVar.f56796w;
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
        long j11 = sVar.f2936a;
        j2.m mVar2 = sVar.f2937b;
        b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.f17181c, b0Var.d, j3, j10, b0Var.f17180b);
        int i10 = sVar.f2938c;
        this.f56804c.getClass();
        Throwable th2 = iOException;
        while (true) {
            z10 = true;
            if (th2 != null) {
                if ((th2 instanceof t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.u) || (th2 instanceof b3.o) || ((th2 instanceof j2.j) && ((j2.j) th2).f17201a == 2008)) {
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
        this.f56806f.r(uVar, i10, iOException, z10);
        if (z10) {
            return b3.p.f2932f;
        }
        return new b3.i(0, min, false);
    }

    @Override
    public final void p(b3.m mVar, long j3, long j10, boolean z10) {
        b3.s sVar = (b3.s) mVar;
        long j11 = sVar.f2936a;
        j2.m mVar2 = sVar.f2937b;
        b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.f17181c, b0Var.d, j3, j10, b0Var.f17180b);
        this.f56804c.getClass();
        this.f56806f.o(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void s(b3.m mVar, long j3, long j10, int i7) {
        x2.u uVar;
        b3.s sVar = (b3.s) mVar;
        if (i7 == 0) {
            long j11 = sVar.f2936a;
            uVar = new x2.u(sVar.f2937b, j3);
        } else {
            long j12 = sVar.f2936a;
            j2.m mVar2 = sVar.f2937b;
            b0 b0Var = sVar.d;
            uVar = new x2.u(mVar2, b0Var.f17181c, b0Var.d, j3, j10, b0Var.f17180b);
        }
        this.f56806f.u(uVar, sVar.f2938c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i7);
    }

    @Override
    public final void z(b3.m mVar, long j3, long j10) {
        p pVar;
        b3.s sVar = (b3.s) mVar;
        q qVar = (q) sVar.f2940f;
        boolean z10 = qVar instanceof m;
        if (z10) {
            String str = qVar.f56908a;
            p pVar2 = p.f56899n;
            Uri parse = Uri.parse(str);
            e2.t tVar = new e2.t();
            tVar.f10731a = "0";
            tVar.f10745q = s0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new o(parse, new e2.u(tVar), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            pVar = new p("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            pVar = (p) qVar;
        }
        this.f56809s = pVar;
        try {
            this.f56811x = w.b(pVar.f56900e);
            this.f56812y = w.a(pVar.f56901f);
            this.E = w.a(pVar.f56902g);
            this.F = w.a(pVar.h);
            this.G = ((w) this.f56811x.get(0)).c();
            this.f56805e.add(new a(this));
            a(this.f56811x);
            a(this.f56812y);
            a(this.E);
            a(this.F);
            j2.m mVar2 = sVar.f2937b;
            b0 b0Var = sVar.d;
            x2.u uVar = new x2.u(mVar2, b0Var.f17181c, b0Var.d, j3, j10, b0Var.f17180b);
            c cVar = (c) this.d.get(this.G);
            cVar.getClass();
            if (z10) {
                Uri uri = sVar.d.f17181c;
                b bVar = (b) p5.c.i(cVar.f56800b, uri, uri);
                bVar.getClass();
                bVar.d((m) qVar, uVar);
            } else {
                c.b(cVar, this.G, false);
            }
            this.f56804c.getClass();
            this.f56806f.p(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (t0 e10) {
            this.f56810w = e10;
        }
    }
}

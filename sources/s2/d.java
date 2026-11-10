package s2;

import a8.wa;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import e2.s0;
import e2.t0;
import h2.m0;
import h9.h2;
import h9.i0;
import j2.c0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Cells.f1;
public final class d implements b3.j {
    public static final s0.b J = new s0.b(8);
    public i0 D;
    public i0 E;
    public Uri F;
    public m G;
    public boolean H;
    public final org.telegram.ui.Components.m f54629a;
    public final t f54630b;
    public final pb.b f54631c;
    public wa f54633f;
    public b3.o h;
    public Handler f54634n;
    public r2.k f54635r;
    public p f54636s;
    public t0 f54637w;
    public i0 f54638x;
    public i0 f54639y;
    public final CopyOnWriteArrayList f54632e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long I = -9223372036854775807L;

    public d(org.telegram.ui.Components.m mVar, pb.b bVar, t tVar) {
        this.f54629a = mVar;
        this.f54630b = tVar;
        this.f54631c = bVar;
    }

    @Override
    public final void M0(b3.l lVar, long j3, long j10, int i7) {
        x2.t tVar;
        b3.r rVar = (b3.r) lVar;
        if (i7 == 0) {
            long j11 = rVar.f2965a;
            tVar = new x2.t(rVar.f2966b, j3);
        } else {
            long j12 = rVar.f2965a;
            j2.m mVar = rVar.f2966b;
            c0 c0Var = rVar.d;
            tVar = new x2.t(mVar, c0Var.f16417c, c0Var.d, j3, j10, c0Var.f16416b);
        }
        this.f54633f.t(tVar, rVar.f2967c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i7);
    }

    public final void a(List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            w wVar = (w) list.get(i7);
            c cVar = new c(this, wVar);
            h2 it = h9.t0.q(wVar.f54778b.values()).iterator();
            while (it.hasNext()) {
                this.d.put((Uri) it.next(), cVar);
            }
        }
    }

    public final m b(Uri uri, boolean z9) {
        HashMap hashMap = this.d;
        c cVar = (c) hashMap.get(uri);
        if (cVar == null) {
            return null;
        }
        m a10 = c.a(cVar, uri);
        if (a10 != null && z9) {
            g(uri);
            c cVar2 = (c) hashMap.get(uri);
            cVar2.getClass();
            HashMap hashMap2 = cVar2.f54627b;
            b bVar = (b) f1.l(hashMap2, uri, uri);
            bVar.getClass();
            if (!bVar.f54624x) {
                b bVar2 = (b) f1.l(hashMap2, uri, uri);
                bVar2.getClass();
                bVar2.f54624x = true;
                m a11 = c.a(cVar2, uri);
                if (a11 != null && !a11.f54708o) {
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
                    return this.E;
                }
                return this.D;
            }
            return this.f54639y;
        }
        return this.f54638x;
    }

    public final Uri d(Uri uri) {
        i iVar;
        m mVar = this.G;
        if (mVar != null && mVar.v.f54698e && (iVar = (i) mVar.f54713t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar.f54682b));
            int i7 = iVar.f54683c;
            if (i7 != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i7));
            }
            return buildUpon.build();
        }
        return uri;
    }

    public final boolean e(w wVar, long j3) {
        boolean z9;
        c cVar = (c) this.d.get(wVar.c());
        if (cVar == null) {
            return false;
        }
        Iterator it = cVar.f54627b.values().iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (j3 <= ((b) it.next()).f54621r) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 &= z9;
        }
        return z10;
    }

    public final boolean f(Uri uri) {
        int i7;
        c cVar = (c) this.d.get(uri);
        if (cVar != null) {
            b bVar = (b) f1.l(cVar.f54627b, uri, uri);
            bVar.getClass();
            if (bVar.f54618e != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long max = Math.max(30000L, m0.h0(bVar.f54618e.f54714u));
                m mVar = bVar.f54618e;
                if (mVar.f54708o || (i7 = mVar.d) == 2 || i7 == 1 || bVar.f54619f + max > elapsedRealtime) {
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
            List list = this.f54636s.f54727e;
            for (int i7 = 0; i7 < list.size(); i7++) {
                if (uri.equals(((o) list.get(i7)).f54720a)) {
                    m mVar = this.G;
                    if (mVar == null || !mVar.f54708o) {
                        this.F = uri;
                        c cVar = (c) this.d.get(uri);
                        cVar.getClass();
                        m a10 = c.a(cVar, uri);
                        if (a10 != null && a10.f54708o) {
                            this.G = a10;
                            this.f54635r.v(a10);
                            return;
                        }
                        Uri d = d(uri);
                        b bVar = (b) f1.l(cVar.f54627b, uri, uri);
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
            b bVar = (b) f1.l(cVar.f54627b, uri, uri);
            bVar.getClass();
            bVar.f54617c.a();
            IOException iOException = bVar.f54623w;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final b3.i o0(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        boolean z9;
        long min;
        b3.r rVar = (b3.r) lVar;
        long j11 = rVar.f2965a;
        j2.m mVar = rVar.f2966b;
        c0 c0Var = rVar.d;
        x2.t tVar = new x2.t(mVar, c0Var.f16417c, c0Var.d, j3, j10, c0Var.f16416b);
        int i10 = rVar.f2967c;
        this.f54631c.getClass();
        Throwable th2 = iOException;
        while (true) {
            z9 = true;
            if (th2 != null) {
                if ((th2 instanceof t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.v) || (th2 instanceof b3.n) || ((th2 instanceof j2.j) && ((j2.j) th2).f16437a == 2008)) {
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
            z9 = false;
        }
        this.f54633f.r(tVar, i10, iOException, z9);
        if (z9) {
            return b3.o.f2961f;
        }
        return new b3.i(0, min, false);
    }

    @Override
    public final void o1(b3.l lVar, long j3, long j10) {
        p pVar;
        b3.r rVar = (b3.r) lVar;
        q qVar = (q) rVar.f2969f;
        boolean z9 = qVar instanceof m;
        if (z9) {
            String str = qVar.f54735a;
            p pVar2 = p.f54726n;
            Uri parse = Uri.parse(str);
            e2.t tVar = new e2.t();
            tVar.f10553a = "0";
            tVar.f10567q = s0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new o(parse, new e2.u(tVar), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            pVar = new p("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            pVar = (p) qVar;
        }
        this.f54636s = pVar;
        try {
            this.f54638x = w.b(pVar.f54727e);
            this.f54639y = w.a(pVar.f54728f);
            this.D = w.a(pVar.f54729g);
            this.E = w.a(pVar.h);
            this.F = ((w) this.f54638x.get(0)).c();
            this.f54632e.add(new a(this));
            a(this.f54638x);
            a(this.f54639y);
            a(this.D);
            a(this.E);
            j2.m mVar = rVar.f2966b;
            c0 c0Var = rVar.d;
            x2.t tVar2 = new x2.t(mVar, c0Var.f16417c, c0Var.d, j3, j10, c0Var.f16416b);
            c cVar = (c) this.d.get(this.F);
            cVar.getClass();
            if (z9) {
                Uri uri = rVar.d.f16417c;
                b bVar = (b) f1.l(cVar.f54627b, uri, uri);
                bVar.getClass();
                bVar.d((m) qVar, tVar2);
            } else {
                c.b(cVar, this.F, false);
            }
            this.f54631c.getClass();
            this.f54633f.p(tVar2, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (t0 e10) {
            this.f54637w = e10;
        }
    }

    @Override
    public final void q0(b3.l lVar, long j3, long j10, boolean z9) {
        b3.r rVar = (b3.r) lVar;
        long j11 = rVar.f2965a;
        j2.m mVar = rVar.f2966b;
        c0 c0Var = rVar.d;
        x2.t tVar = new x2.t(mVar, c0Var.f16417c, c0Var.d, j3, j10, c0Var.f16416b);
        this.f54631c.getClass();
        this.f54633f.o(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}

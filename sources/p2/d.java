package p2;

import a8.ng;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import b2.w0;
import b2.x;
import b2.x0;
import e2.n0;
import f9.g2;
import f9.i0;
import f9.t0;
import g2.b0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import li.e3;
import org.telegram.ui.li1;
public final class d implements y2.g {
    public static final li1 J = new li1(4);
    public i0 E;
    public Uri F;
    public m G;
    public boolean H;
    public final e3 f46534a;
    public final t f46535b;
    public final u7.s f46536c;
    public ng f46537f;
    public y2.l h;
    public Handler f46538n;
    public o2.l f46539r;
    public p f46540s;
    public x0 v;
    public i0 f46541w;
    public i0 f46542x;
    public i0 f46543y;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long I = -9223372036854775807L;

    public d(e3 e3Var, u7.s sVar, t tVar) {
        this.f46534a = e3Var;
        this.f46535b = tVar;
        this.f46536c = sVar;
    }

    @Override
    public final void B(y2.i iVar, long j10, long j11) {
        p pVar;
        y2.o oVar = (y2.o) iVar;
        q qVar = (q) oVar.f52028f;
        boolean z10 = qVar instanceof m;
        if (z10) {
            String str = qVar.f46631a;
            p pVar2 = p.f46623n;
            Uri parse = Uri.parse(str);
            b2.w wVar = new b2.w();
            wVar.f3519a = "0";
            wVar.f3532q = w0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new o(parse, new x(wVar), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            pVar = new p("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            pVar = (p) qVar;
        }
        this.f46540s = pVar;
        try {
            this.f46541w = w.b(pVar.e);
            this.f46542x = w.a(pVar.f46624f);
            this.f46543y = w.a(pVar.f46625g);
            this.E = w.a(pVar.h);
            this.F = ((w) this.f46541w.get(0)).c();
            this.e.add(new a(this));
            a(this.f46541w);
            a(this.f46542x);
            a(this.f46543y);
            a(this.E);
            g2.m mVar = oVar.f52026b;
            b0 b0Var = oVar.d;
            u2.u uVar = new u2.u(mVar, b0Var.f12230c, b0Var.d, j10, j11, b0Var.f12229b);
            c cVar = (c) this.d.get(this.F);
            cVar.getClass();
            if (z10) {
                Uri uri = oVar.d.f12230c;
                b bVar = (b) ic.a.h(cVar.f46532b, uri, uri);
                bVar.getClass();
                bVar.d((m) qVar, uVar);
            } else {
                c.b(cVar, this.F, false);
            }
            this.f46536c.getClass();
            this.f46537f.q(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (x0 e) {
            this.v = e;
        }
    }

    public final void a(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            w wVar = (w) list.get(i10);
            c cVar = new c(this, wVar);
            g2 it = t0.u(wVar.f46673b.values()).iterator();
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
            HashMap hashMap2 = cVar2.f46532b;
            b bVar = (b) ic.a.h(hashMap2, uri, uri);
            bVar.getClass();
            if (!bVar.f46529w) {
                b bVar2 = (b) ic.a.h(hashMap2, uri, uri);
                bVar2.getClass();
                bVar2.f46529w = true;
                m a10 = c.a(cVar2, uri);
                if (a10 != null && !a10.f46606o) {
                    c.b(cVar2, uri, true);
                }
            }
        }
        return a2;
    }

    public final i0 c(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return this.E;
                }
                return this.f46543y;
            }
            return this.f46542x;
        }
        return this.f46541w;
    }

    public final Uri d(Uri uri) {
        i iVar;
        m mVar = this.G;
        if (mVar != null && mVar.v.e && (iVar = (i) mVar.f46611t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar.f46584b));
            int i10 = iVar.f46585c;
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
        Iterator it = cVar.f46532b.values().iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            if (j10 <= ((b) it.next()).f46527r) {
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
            b bVar = (b) ic.a.h(cVar.f46532b, uri, uri);
            bVar.getClass();
            if (bVar.e != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long max = Math.max(30000L, n0.h0(bVar.e.f46612u));
                m mVar = bVar.e;
                if (mVar.f46606o || (i10 = mVar.d) == 2 || i10 == 1 || bVar.f46525f + max > elapsedRealtime) {
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
            List list = this.f46540s.e;
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (uri.equals(((o) list.get(i10)).f46618a)) {
                    m mVar = this.G;
                    if (mVar == null || !mVar.f46606o) {
                        this.F = uri;
                        c cVar = (c) this.d.get(uri);
                        cVar.getClass();
                        m a2 = c.a(cVar, uri);
                        if (a2 != null && a2.f46606o) {
                            this.G = a2;
                            this.f46539r.v(a2);
                            return;
                        }
                        Uri d = d(uri);
                        b bVar = (b) ic.a.h(cVar.f46532b, uri, uri);
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
            b bVar = (b) ic.a.h(cVar.f46532b, uri, uri);
            bVar.getClass();
            bVar.f46524c.d();
            IOException iOException = bVar.v;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void l0(y2.i iVar, long j10, long j11, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f52025a;
        g2.m mVar = oVar.f52026b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f12230c, b0Var.d, j10, j11, b0Var.f12229b);
        this.f46536c.getClass();
        this.f46537f.p(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final k4.d w(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        long min;
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f52025a;
        g2.m mVar = oVar.f52026b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f12230c, b0Var.d, j10, j11, b0Var.f12229b);
        int i11 = oVar.f52027c;
        this.f46536c.getClass();
        Throwable th2 = iOException;
        while (true) {
            z10 = true;
            if (th2 != null) {
                if ((th2 instanceof x0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).f12247a == 2008)) {
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
        this.f46537f.s(uVar, i11, iOException, z10);
        if (z10) {
            return y2.l.f52021f;
        }
        return new k4.d(0, min, false);
    }

    @Override
    public final void z(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j12 = oVar.f52025a;
            uVar = new u2.u(oVar.f52026b, j10);
        } else {
            long j13 = oVar.f52025a;
            g2.m mVar = oVar.f52026b;
            b0 b0Var = oVar.d;
            uVar = new u2.u(mVar, b0Var.f12230c, b0Var.d, j10, j11, b0Var.f12229b);
        }
        this.f46537f.u(uVar, oVar.f52027c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }
}

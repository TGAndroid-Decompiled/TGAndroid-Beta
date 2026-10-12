package p2;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import b2.r0;
import e2.d0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.c80;
public final class d implements y2.g {
    public static final c80 E = new c80(23);
    public final n4.l f45055a;
    public final t f45056b;
    public final t7.t f45057c;
    public a5.a f45059f;
    public y2.l h;
    public Handler f45060n;
    public o2.l f45061r;
    public p f45062s;
    public Uri v;
    public m f45063w;
    public boolean f45064x;
    public final CopyOnWriteArrayList f45058e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long f45065y = -9223372036854775807L;

    public d(n4.l lVar, t7.t tVar, t tVar2) {
        this.f45055a = lVar;
        this.f45056b = tVar2;
        this.f45057c = tVar;
    }

    @Override
    public final void C(y2.i iVar, long j3, long j10) {
        p pVar;
        y2.o oVar = (y2.o) iVar;
        q qVar = (q) oVar.f51927f;
        boolean z10 = qVar instanceof m;
        if (z10) {
            String str = qVar.f45152a;
            p pVar2 = p.f45143n;
            Uri parse = Uri.parse(str);
            b2.r rVar = new b2.r();
            rVar.f3569a = "0";
            rVar.f3582p = r0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new o(parse, new b2.s(rVar), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            pVar = new p("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            pVar = (p) qVar;
        }
        this.f45062s = pVar;
        this.v = ((o) pVar.f45144e.get(0)).f45138a;
        this.f45058e.add(new a(this));
        List list2 = pVar.d;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list2.get(i10);
            this.d.put(uri, new c(this, uri));
        }
        Uri uri2 = oVar.d.f10233c;
        u2.t tVar = new u2.t(j10);
        c cVar = (c) this.d.get(this.v);
        if (z10) {
            cVar.f((m) qVar, tVar);
        } else {
            cVar.c(false);
        }
        this.f45057c.getClass();
        this.f45059f.q(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void H(y2.i iVar, long j3, long j10, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j11 = oVar.f51923a;
        Uri uri = oVar.d.f10233c;
        u2.t tVar = new u2.t(j10);
        this.f45057c.getClass();
        this.f45059f.p(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final m a(Uri uri, boolean z10) {
        HashMap hashMap = this.d;
        m mVar = ((c) hashMap.get(uri)).d;
        if (mVar != null && z10) {
            if (!uri.equals(this.v)) {
                List list = this.f45062s.f45144e;
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        break;
                    } else if (uri.equals(((o) list.get(i10)).f45138a)) {
                        m mVar2 = this.f45063w;
                        if (mVar2 == null || !mVar2.f45127o) {
                            this.v = uri;
                            c cVar = (c) hashMap.get(uri);
                            m mVar3 = cVar.d;
                            if (mVar3 != null && mVar3.f45127o) {
                                this.f45063w = mVar3;
                                this.f45061r.v(mVar3);
                            } else {
                                cVar.e(b(uri));
                            }
                        }
                    } else {
                        i10++;
                    }
                }
            }
            c cVar2 = (c) hashMap.get(uri);
            m mVar4 = cVar2.d;
            if (!cVar2.v) {
                cVar2.v = true;
                if (mVar4 != null && !mVar4.f45127o) {
                    cVar2.c(true);
                }
            }
        }
        return mVar;
    }

    public final Uri b(Uri uri) {
        i iVar;
        m mVar = this.f45063w;
        if (mVar != null && mVar.v.f45117e && (iVar = (i) mVar.f45132t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar.f45102b));
            int i10 = iVar.f45103c;
            if (i10 != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
            }
            return buildUpon.build();
        }
        return uri;
    }

    public final boolean c(Uri uri) {
        int i10;
        c cVar = (c) this.d.get(uri);
        if (cVar.d != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, d0.d0(cVar.d.f45133u));
            m mVar = cVar.d;
            if (mVar.f45127o || (i10 = mVar.d) == 2 || i10 == 1 || cVar.f45049e + max > elapsedRealtime) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final k4.d x(y2.i r5, long r6, long r8, java.io.IOException r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: p2.d.x(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void y(y2.i iVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j11 = oVar.f51923a;
            tVar = new u2.t(oVar.f51924b);
        } else {
            long j12 = oVar.f51923a;
            Uri uri = oVar.d.f10233c;
            tVar = new u2.t(j10);
        }
        this.f45059f.u(tVar, oVar.f51925c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }
}

package p2;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import b2.r0;
import e2.d0;
import ii.n4;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.web.w;
public final class c implements y2.g {
    public static final w E = new w(3);
    public final n4 f44006a;
    public final s f44007b;
    public final qb.b f44008c;
    public a5.a f44010f;
    public y2.l h;
    public Handler f44011n;
    public o2.l f44012r;
    public o f44013s;
    public Uri v;
    public l f44014w;
    public boolean f44015x;
    public final CopyOnWriteArrayList f44009e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long f44016y = -9223372036854775807L;

    public c(n4 n4Var, qb.b bVar, s sVar) {
        this.f44006a = n4Var;
        this.f44007b = sVar;
        this.f44008c = bVar;
    }

    public final l a(Uri uri, boolean z10) {
        HashMap hashMap = this.d;
        l lVar = ((b) hashMap.get(uri)).d;
        if (lVar != null && z10) {
            if (!uri.equals(this.v)) {
                List list = this.f44013s.f44095e;
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        break;
                    } else if (uri.equals(((n) list.get(i10)).f44089a)) {
                        l lVar2 = this.f44014w;
                        if (lVar2 == null || !lVar2.f44078o) {
                            this.v = uri;
                            b bVar = (b) hashMap.get(uri);
                            l lVar3 = bVar.d;
                            if (lVar3 != null && lVar3.f44078o) {
                                this.f44014w = lVar3;
                                this.f44012r.v(lVar3);
                            } else {
                                bVar.e(b(uri));
                            }
                        }
                    } else {
                        i10++;
                    }
                }
            }
            b bVar2 = (b) hashMap.get(uri);
            l lVar4 = bVar2.d;
            if (!bVar2.v) {
                bVar2.v = true;
                if (lVar4 != null && !lVar4.f44078o) {
                    bVar2.c(true);
                }
            }
        }
        return lVar;
    }

    public final Uri b(Uri uri) {
        h hVar;
        l lVar = this.f44014w;
        if (lVar != null && lVar.v.f44068e && (hVar = (h) lVar.f44083t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(hVar.f44053b));
            int i10 = hVar.f44054c;
            if (i10 != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
            }
            return buildUpon.build();
        }
        return uri;
    }

    public final boolean c(Uri uri) {
        int i10;
        b bVar = (b) this.d.get(uri);
        if (bVar.d != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, d0.e0(bVar.d.f44084u));
            l lVar = bVar.d;
            if (lVar.f44078o || (i10 = lVar.d) == 2 || i10 == 1 || bVar.f44000e + max > elapsedRealtime) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final k4.d v(y2.i r5, long r6, long r8, java.io.IOException r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: p2.c.v(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void x(y2.i iVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j11 = oVar.f50418a;
            tVar = new u2.t(oVar.f50419b);
        } else {
            long j12 = oVar.f50418a;
            Uri uri = oVar.d.f10162c;
            tVar = new u2.t(j10);
        }
        this.f44010f.s(tVar, oVar.f50420c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void x0(y2.i iVar, long j3, long j10, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j11 = oVar.f50418a;
        Uri uri = oVar.d.f10162c;
        u2.t tVar = new u2.t(j10);
        this.f44008c.getClass();
        this.f44010f.o(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void y(y2.i iVar, long j3, long j10) {
        o oVar;
        y2.o oVar2 = (y2.o) iVar;
        p pVar = (p) oVar2.f50422f;
        boolean z10 = pVar instanceof l;
        if (z10) {
            String str = pVar.f44103a;
            o oVar3 = o.f44094n;
            Uri parse = Uri.parse(str);
            b2.r rVar = new b2.r();
            rVar.f3492a = "0";
            rVar.f3505p = r0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new n(parse, new b2.s(rVar), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            oVar = new o("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            oVar = (o) pVar;
        }
        this.f44013s = oVar;
        this.v = ((n) oVar.f44095e.get(0)).f44089a;
        this.f44009e.add(new a(this));
        List list2 = oVar.d;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list2.get(i10);
            this.d.put(uri, new b(this, uri));
        }
        Uri uri2 = oVar2.d.f10162c;
        u2.t tVar = new u2.t(j10);
        b bVar = (b) this.d.get(this.v);
        if (z10) {
            bVar.f((l) pVar, tVar);
        } else {
            bVar.c(false);
        }
        this.f44008c.getClass();
        this.f44010f.p(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}

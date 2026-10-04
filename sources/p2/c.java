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
    public final n4 f43992a;
    public final s f43993b;
    public final qb.b f43994c;
    public a5.a f43996f;
    public y2.l h;
    public Handler f43997n;
    public o2.l f43998r;
    public o f43999s;
    public Uri v;
    public l f44000w;
    public boolean f44001x;
    public final CopyOnWriteArrayList f43995e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long f44002y = -9223372036854775807L;

    public c(n4 n4Var, qb.b bVar, s sVar) {
        this.f43992a = n4Var;
        this.f43993b = sVar;
        this.f43994c = bVar;
    }

    public final l a(Uri uri, boolean z10) {
        HashMap hashMap = this.d;
        l lVar = ((b) hashMap.get(uri)).d;
        if (lVar != null && z10) {
            if (!uri.equals(this.v)) {
                List list = this.f43999s.f44081e;
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        break;
                    } else if (uri.equals(((n) list.get(i10)).f44075a)) {
                        l lVar2 = this.f44000w;
                        if (lVar2 == null || !lVar2.f44064o) {
                            this.v = uri;
                            b bVar = (b) hashMap.get(uri);
                            l lVar3 = bVar.d;
                            if (lVar3 != null && lVar3.f44064o) {
                                this.f44000w = lVar3;
                                this.f43998r.v(lVar3);
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
                if (lVar4 != null && !lVar4.f44064o) {
                    bVar2.c(true);
                }
            }
        }
        return lVar;
    }

    public final Uri b(Uri uri) {
        h hVar;
        l lVar = this.f44000w;
        if (lVar != null && lVar.v.f44054e && (hVar = (h) lVar.f44069t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(hVar.f44039b));
            int i10 = hVar.f44040c;
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
            long max = Math.max(30000L, d0.e0(bVar.d.f44070u));
            l lVar = bVar.d;
            if (lVar.f44064o || (i10 = lVar.d) == 2 || i10 == 1 || bVar.f43986e + max > elapsedRealtime) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final k4.d s(y2.i r5, long r6, long r8, java.io.IOException r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: p2.c.s(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void t(y2.i iVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j11 = oVar.f50403a;
            tVar = new u2.t(oVar.f50404b);
        } else {
            long j12 = oVar.f50403a;
            Uri uri = oVar.d.f10161c;
            tVar = new u2.t(j10);
        }
        this.f43996f.s(tVar, oVar.f50405c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void v(y2.i iVar, long j3, long j10) {
        o oVar;
        y2.o oVar2 = (y2.o) iVar;
        p pVar = (p) oVar2.f50407f;
        boolean z10 = pVar instanceof l;
        if (z10) {
            String str = pVar.f44089a;
            o oVar3 = o.f44080n;
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
        this.f43999s = oVar;
        this.v = ((n) oVar.f44081e.get(0)).f44075a;
        this.f43995e.add(new a(this));
        List list2 = oVar.d;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list2.get(i10);
            this.d.put(uri, new b(this, uri));
        }
        Uri uri2 = oVar2.d.f10161c;
        u2.t tVar = new u2.t(j10);
        b bVar = (b) this.d.get(this.v);
        if (z10) {
            bVar.f((l) pVar, tVar);
        } else {
            bVar.c(false);
        }
        this.f43994c.getClass();
        this.f43996f.p(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void x0(y2.i iVar, long j3, long j10, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j11 = oVar.f50403a;
        Uri uri = oVar.d.f10161c;
        u2.t tVar = new u2.t(j10);
        this.f43994c.getClass();
        this.f43996f.o(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}

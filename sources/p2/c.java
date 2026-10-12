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
public final class c implements y2.g {
    public static final c80 E = new c80(23);
    public final n4.l f45060a;
    public final s f45061b;
    public final t7.t f45062c;
    public a5.a f45064f;
    public y2.l h;
    public Handler f45065n;
    public o2.l f45066r;
    public o f45067s;
    public Uri v;
    public l f45068w;
    public boolean f45069x;
    public final CopyOnWriteArrayList f45063e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long f45070y = -9223372036854775807L;

    public c(n4.l lVar, t7.t tVar, s sVar) {
        this.f45060a = lVar;
        this.f45061b = sVar;
        this.f45062c = tVar;
    }

    @Override
    public final void C(y2.i iVar, long j3, long j10) {
        o oVar;
        y2.o oVar2 = (y2.o) iVar;
        p pVar = (p) oVar2.f51935f;
        boolean z10 = pVar instanceof l;
        if (z10) {
            String str = pVar.f45157a;
            o oVar3 = o.f45148n;
            Uri parse = Uri.parse(str);
            b2.r rVar = new b2.r();
            rVar.f3569a = "0";
            rVar.f3582p = r0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new n(parse, new b2.s(rVar), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            oVar = new o("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            oVar = (o) pVar;
        }
        this.f45067s = oVar;
        this.v = ((n) oVar.f45149e.get(0)).f45143a;
        this.f45063e.add(new a(this));
        List list2 = oVar.d;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list2.get(i10);
            this.d.put(uri, new b(this, uri));
        }
        Uri uri2 = oVar2.d.f10233c;
        u2.t tVar = new u2.t(j10);
        b bVar = (b) this.d.get(this.v);
        if (z10) {
            bVar.f((l) pVar, tVar);
        } else {
            bVar.c(false);
        }
        this.f45062c.getClass();
        this.f45064f.q(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void H(y2.i iVar, long j3, long j10, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j11 = oVar.f51931a;
        Uri uri = oVar.d.f10233c;
        u2.t tVar = new u2.t(j10);
        this.f45062c.getClass();
        this.f45064f.p(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final l a(Uri uri, boolean z10) {
        HashMap hashMap = this.d;
        l lVar = ((b) hashMap.get(uri)).d;
        if (lVar != null && z10) {
            if (!uri.equals(this.v)) {
                List list = this.f45067s.f45149e;
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        break;
                    } else if (uri.equals(((n) list.get(i10)).f45143a)) {
                        l lVar2 = this.f45068w;
                        if (lVar2 == null || !lVar2.f45132o) {
                            this.v = uri;
                            b bVar = (b) hashMap.get(uri);
                            l lVar3 = bVar.d;
                            if (lVar3 != null && lVar3.f45132o) {
                                this.f45068w = lVar3;
                                this.f45066r.v(lVar3);
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
                if (lVar4 != null && !lVar4.f45132o) {
                    bVar2.c(true);
                }
            }
        }
        return lVar;
    }

    public final Uri b(Uri uri) {
        h hVar;
        l lVar = this.f45068w;
        if (lVar != null && lVar.v.f45122e && (hVar = (h) lVar.f45137t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(hVar.f45107b));
            int i10 = hVar.f45108c;
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
            long max = Math.max(30000L, d0.d0(bVar.d.f45138u));
            l lVar = bVar.d;
            if (lVar.f45132o || (i10 = lVar.d) == 2 || i10 == 1 || bVar.f45054e + max > elapsedRealtime) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final k4.d x(y2.i r5, long r6, long r8, java.io.IOException r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: p2.c.x(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void y(y2.i iVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j11 = oVar.f51931a;
            tVar = new u2.t(oVar.f51932b);
        } else {
            long j12 = oVar.f51931a;
            Uri uri = oVar.d.f10233c;
            tVar = new u2.t(j10);
        }
        this.f45064f.u(tVar, oVar.f51933c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }
}

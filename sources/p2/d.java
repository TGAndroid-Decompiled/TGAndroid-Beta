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
import org.telegram.ui.bs0;
public final class d implements y2.h {
    public static final bs0 E = new bs0(12);
    public final k2.u f40429a;
    public final t f40430b;
    public final qb.b f40431c;
    public a5.a f40432f;
    public y2.m h;
    public Handler f40433n;
    public o2.l f40434r;
    public p f40435s;
    public Uri v;
    public m f40436w;
    public boolean f40437x;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long f40438y = -9223372036854775807L;

    public d(k2.u uVar, qb.b bVar, t tVar) {
        this.f40429a = uVar;
        this.f40430b = tVar;
        this.f40431c = bVar;
    }

    @Override
    public final void V(y2.j jVar, long j3, long j10, boolean z10) {
        y2.p pVar = (y2.p) jVar;
        long j11 = pVar.f46321a;
        Uri uri = pVar.d.f9352c;
        u2.t tVar = new u2.t(j10);
        this.f40431c.getClass();
        this.f40432f.o(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final m a(Uri uri, boolean z10) {
        HashMap hashMap = this.d;
        m mVar = ((c) hashMap.get(uri)).d;
        if (mVar != null && z10) {
            if (!uri.equals(this.v)) {
                List list = this.f40435s.e;
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        break;
                    } else if (uri.equals(((o) list.get(i10)).f40506a)) {
                        m mVar2 = this.f40436w;
                        if (mVar2 == null || !mVar2.f40495o) {
                            this.v = uri;
                            c cVar = (c) hashMap.get(uri);
                            m mVar3 = cVar.d;
                            if (mVar3 != null && mVar3.f40495o) {
                                this.f40436w = mVar3;
                                this.f40434r.v(mVar3);
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
                if (mVar4 != null && !mVar4.f40495o) {
                    cVar2.c(true);
                }
            }
        }
        return mVar;
    }

    public final Uri b(Uri uri) {
        i iVar;
        m mVar = this.f40436w;
        if (mVar != null && mVar.v.e && (iVar = (i) mVar.f40500t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar.f40473b));
            int i10 = iVar.f40474c;
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
            long max = Math.max(30000L, d0.e0(cVar.d.f40501u));
            m mVar = cVar.d;
            if (mVar.f40495o || (i10 = mVar.d) == 2 || i10 == 1 || cVar.e + max > elapsedRealtime) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final k4.d n(y2.j r5, long r6, long r8, java.io.IOException r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: p2.d.n(y2.j, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void o(y2.j jVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.p pVar = (y2.p) jVar;
        if (i10 == 0) {
            long j11 = pVar.f46321a;
            tVar = new u2.t(pVar.f46322b);
        } else {
            long j12 = pVar.f46321a;
            Uri uri = pVar.d.f9352c;
            tVar = new u2.t(j10);
        }
        this.f40432f.s(tVar, pVar.f46323c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void q(y2.j jVar, long j3, long j10) {
        p pVar;
        y2.p pVar2 = (y2.p) jVar;
        q qVar = (q) pVar2.f46324f;
        boolean z10 = qVar instanceof m;
        if (z10) {
            String str = qVar.f40518a;
            p pVar3 = p.f40510n;
            Uri parse = Uri.parse(str);
            b2.r rVar = new b2.r();
            rVar.f3240a = "0";
            rVar.f3252p = r0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new o(parse, new b2.s(rVar), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            pVar = new p("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            pVar = (p) qVar;
        }
        this.f40435s = pVar;
        this.v = ((o) pVar.e.get(0)).f40506a;
        this.e.add(new a(this));
        List list2 = pVar.d;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list2.get(i10);
            this.d.put(uri, new c(this, uri));
        }
        Uri uri2 = pVar2.d.f9352c;
        u2.t tVar = new u2.t(j10);
        c cVar = (c) this.d.get(this.v);
        if (z10) {
            cVar.f((m) qVar, tVar);
        } else {
            cVar.c(false);
        }
        this.f40431c.getClass();
        this.f40432f.p(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}

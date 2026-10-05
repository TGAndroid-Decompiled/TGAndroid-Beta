package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class l extends p {
    public final int d;
    public final long f44069e;
    public final boolean f44070f;
    public final boolean f44071g;
    public final long h;
    public final boolean f44072i;
    public final int f44073j;
    public final long f44074k;
    public final int f44075l;
    public final long f44076m;
    public final long f44077n;
    public final boolean f44078o;
    public final boolean f44079p;
    public final b2.o f44080q;
    public final i0 f44081r;
    public final i0 f44082s;
    public final k0 f44083t;
    public final long f44084u;
    public final k v;
    public final i0 f44085w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f44071g = z10;
        this.f44072i = z11;
        this.f44073j = i11;
        this.f44074k = j11;
        this.f44075l = i12;
        this.f44076m = j12;
        this.f44077n = j13;
        this.f44078o = z13;
        this.f44079p = z14;
        this.f44080q = oVar;
        this.f44081r = i0.v(list2);
        this.f44082s = i0.v(list3);
        this.f44083t = k0.a(map);
        this.f44085w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.f44084u = gVar.f44060e + gVar.f44059c;
        } else if (!list2.isEmpty()) {
            i iVar = (i) e9.q.l(list2);
            this.f44084u = iVar.f44060e + iVar.f44059c;
        } else {
            this.f44084u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f44084u, j3);
            } else {
                j14 = Math.max(0L, this.f44084u + j3);
            }
        }
        this.f44069e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f44070f = z15;
        this.v = kVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

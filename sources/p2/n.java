package p2;

import e9.n0;
import e9.q0;
import java.util.List;
import java.util.Map;
public final class n extends r {
    public final int d;
    public final long e;
    public final boolean f44006f;
    public final boolean f44007g;
    public final long h;
    public final boolean f44008i;
    public final int f44009j;
    public final long f44010k;
    public final int f44011l;
    public final long f44012m;
    public final long f44013n;
    public final boolean f44014o;
    public final boolean f44015p;
    public final b2.s f44016q;
    public final n0 f44017r;
    public final n0 f44018s;
    public final q0 f44019t;
    public final long f44020u;
    public final m v;
    public final n0 f44021w;
    public final k f44022x;

    public n(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, b2.s sVar, List list2, List list3, m mVar, Map map, List list4, k kVar) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j11;
        this.f44007g = z10;
        this.f44008i = z11;
        this.f44009j = i11;
        this.f44010k = j12;
        this.f44011l = i12;
        this.f44012m = j13;
        this.f44013n = j14;
        this.f44014o = z13;
        this.f44015p = z14;
        this.f44016q = sVar;
        this.f44017r = n0.u(list2);
        this.f44018s = n0.u(list3);
        this.f44019t = q0.a(map);
        this.f44021w = n0.u(list4);
        this.f44022x = kVar;
        if (!list3.isEmpty()) {
            i iVar = (i) e9.s.m(list3);
            this.f44020u = iVar.e + iVar.f43998c;
        } else if (!list2.isEmpty()) {
            k kVar2 = (k) e9.s.m(list2);
            this.f44020u = kVar2.e + kVar2.f43998c;
        } else {
            this.f44020u = 0L;
        }
        long j15 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 0) {
                j15 = Math.min(this.f44020u, j10);
            } else {
                j15 = Math.max(0L, this.f44020u + j10);
            }
        }
        this.e = j15;
        if (j10 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f44006f = z15;
        this.v = mVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

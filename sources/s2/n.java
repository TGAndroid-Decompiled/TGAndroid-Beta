package s2;

import h9.i0;
import h9.l0;
import java.util.List;
import java.util.Map;
public final class n extends r {
    public final int d;
    public final long f56953e;
    public final boolean f56954f;
    public final boolean f56955g;
    public final long h;
    public final boolean f56956i;
    public final int f56957j;
    public final long f56958k;
    public final int f56959l;
    public final long f56960m;
    public final long f56961n;
    public final boolean f56962o;
    public final boolean f56963p;
    public final e2.r f56964q;
    public final i0 f56965r;
    public final i0 f56966s;
    public final l0 f56967t;
    public final long f56968u;
    public final m v;
    public final i0 f56969w;
    public final k f56970x;

    public n(int i7, String str, List list, long j3, boolean z10, long j10, boolean z11, int i10, long j11, int i11, long j12, long j13, boolean z12, boolean z13, boolean z14, e2.r rVar, List list2, List list3, m mVar, Map map, List list4, k kVar) {
        super(str, list, z12);
        this.d = i7;
        this.h = j10;
        this.f56955g = z10;
        this.f56956i = z11;
        this.f56957j = i10;
        this.f56958k = j11;
        this.f56959l = i11;
        this.f56960m = j12;
        this.f56961n = j13;
        this.f56962o = z13;
        this.f56963p = z14;
        this.f56964q = rVar;
        this.f56965r = i0.q(list2);
        this.f56966s = i0.q(list3);
        this.f56967t = l0.b(map);
        this.f56969w = i0.q(list4);
        this.f56970x = kVar;
        if (!list3.isEmpty()) {
            i iVar = (i) h9.o.n(list3);
            this.f56968u = iVar.f56943e + iVar.f56942c;
        } else if (!list2.isEmpty()) {
            k kVar2 = (k) h9.o.n(list2);
            this.f56968u = kVar2.f56943e + kVar2.f56942c;
        } else {
            this.f56968u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f56968u, j3);
            } else {
                j14 = Math.max(0L, this.f56968u + j3);
            }
        }
        this.f56953e = j14;
        this.f56954f = j3 >= 0;
        this.v = mVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

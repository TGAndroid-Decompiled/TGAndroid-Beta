package p2;

import e9.n0;
import e9.q0;
import java.util.List;
import java.util.Map;
public final class n extends r {
    public final int d;
    public final long e;
    public final boolean f44002f;
    public final boolean f44003g;
    public final long h;
    public final boolean f44004i;
    public final int f44005j;
    public final long f44006k;
    public final int f44007l;
    public final long f44008m;
    public final long f44009n;
    public final boolean f44010o;
    public final boolean f44011p;
    public final b2.s f44012q;
    public final n0 f44013r;
    public final n0 f44014s;
    public final q0 f44015t;
    public final long f44016u;
    public final m v;
    public final n0 f44017w;
    public final k f44018x;

    public n(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, b2.s sVar, List list2, List list3, m mVar, Map map, List list4, k kVar) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j11;
        this.f44003g = z10;
        this.f44004i = z11;
        this.f44005j = i11;
        this.f44006k = j12;
        this.f44007l = i12;
        this.f44008m = j13;
        this.f44009n = j14;
        this.f44010o = z13;
        this.f44011p = z14;
        this.f44012q = sVar;
        this.f44013r = n0.u(list2);
        this.f44014s = n0.u(list3);
        this.f44015t = q0.a(map);
        this.f44017w = n0.u(list4);
        this.f44018x = kVar;
        if (!list3.isEmpty()) {
            i iVar = (i) e9.s.m(list3);
            this.f44016u = iVar.e + iVar.f43994c;
        } else if (!list2.isEmpty()) {
            k kVar2 = (k) e9.s.m(list2);
            this.f44016u = kVar2.e + kVar2.f43994c;
        } else {
            this.f44016u = 0L;
        }
        long j15 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 0) {
                j15 = Math.min(this.f44016u, j10);
            } else {
                j15 = Math.max(0L, this.f44016u + j10);
            }
        }
        this.e = j15;
        if (j10 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f44002f = z15;
        this.v = mVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class l extends p {
    public final int d;
    public final long f43714e;
    public final boolean f43715f;
    public final boolean f43716g;
    public final long h;
    public final boolean f43717i;
    public final int f43718j;
    public final long f43719k;
    public final int f43720l;
    public final long f43721m;
    public final long f43722n;
    public final boolean f43723o;
    public final boolean f43724p;
    public final b2.o f43725q;
    public final i0 f43726r;
    public final i0 f43727s;
    public final k0 f43728t;
    public final long f43729u;
    public final k v;
    public final i0 f43730w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f43716g = z10;
        this.f43717i = z11;
        this.f43718j = i11;
        this.f43719k = j11;
        this.f43720l = i12;
        this.f43721m = j12;
        this.f43722n = j13;
        this.f43723o = z13;
        this.f43724p = z14;
        this.f43725q = oVar;
        this.f43726r = i0.v(list2);
        this.f43727s = i0.v(list3);
        this.f43728t = k0.a(map);
        this.f43730w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.f43729u = gVar.f43705e + gVar.f43704c;
        } else if (!list2.isEmpty()) {
            i iVar = (i) e9.q.l(list2);
            this.f43729u = iVar.f43705e + iVar.f43704c;
        } else {
            this.f43729u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f43729u, j3);
            } else {
                j14 = Math.max(0L, this.f43729u + j3);
            }
        }
        this.f43714e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f43715f = z15;
        this.v = kVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

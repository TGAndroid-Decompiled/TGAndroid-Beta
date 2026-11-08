package s2;

import h9.i0;
import h9.l0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long f54688e;
    public final boolean f54689f;
    public final boolean f54690g;
    public final long h;
    public final boolean f54691i;
    public final int f54692j;
    public final long f54693k;
    public final int f54694l;
    public final long f54695m;
    public final long f54696n;
    public final boolean f54697o;
    public final boolean f54698p;
    public final e2.r f54699q;
    public final i0 f54700r;
    public final i0 f54701s;
    public final l0 f54702t;
    public final long f54703u;
    public final l v;
    public final i0 f54704w;
    public final j f54705x;

    public m(int i7, String str, List list, long j3, boolean z9, long j10, boolean z10, int i10, long j11, int i11, long j12, long j13, boolean z11, boolean z12, boolean z13, e2.r rVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z11);
        this.d = i7;
        this.h = j10;
        this.f54690g = z9;
        this.f54691i = z10;
        this.f54692j = i10;
        this.f54693k = j11;
        this.f54694l = i11;
        this.f54695m = j12;
        this.f54696n = j13;
        this.f54697o = z12;
        this.f54698p = z13;
        this.f54699q = rVar;
        this.f54700r = i0.q(list2);
        this.f54701s = i0.q(list3);
        this.f54702t = l0.b(map);
        this.f54704w = i0.q(list4);
        this.f54705x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) h9.o.n(list3);
            this.f54703u = hVar.f54678e + hVar.f54677c;
        } else if (!list2.isEmpty()) {
            j jVar2 = (j) h9.o.n(list2);
            this.f54703u = jVar2.f54678e + jVar2.f54677c;
        } else {
            this.f54703u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f54703u, j3);
            } else {
                j14 = Math.max(0L, this.f54703u + j3);
            }
        }
        this.f54688e = j14;
        this.f54689f = j3 >= 0;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

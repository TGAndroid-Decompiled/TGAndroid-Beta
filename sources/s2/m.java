package s2;

import h9.i0;
import h9.l0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long f56872e;
    public final boolean f56873f;
    public final boolean f56874g;
    public final long h;
    public final boolean f56875i;
    public final int f56876j;
    public final long f56877k;
    public final int f56878l;
    public final long f56879m;
    public final long f56880n;
    public final boolean f56881o;
    public final boolean f56882p;
    public final e2.r f56883q;
    public final i0 f56884r;
    public final i0 f56885s;
    public final l0 f56886t;
    public final long f56887u;
    public final l v;
    public final i0 f56888w;
    public final j f56889x;

    public m(int i7, String str, List list, long j3, boolean z10, long j10, boolean z11, int i10, long j11, int i11, long j12, long j13, boolean z12, boolean z13, boolean z14, e2.r rVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z12);
        this.d = i7;
        this.h = j10;
        this.f56874g = z10;
        this.f56875i = z11;
        this.f56876j = i10;
        this.f56877k = j11;
        this.f56878l = i11;
        this.f56879m = j12;
        this.f56880n = j13;
        this.f56881o = z13;
        this.f56882p = z14;
        this.f56883q = rVar;
        this.f56884r = i0.q(list2);
        this.f56885s = i0.q(list3);
        this.f56886t = l0.b(map);
        this.f56888w = i0.q(list4);
        this.f56889x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) h9.o.n(list3);
            this.f56887u = hVar.f56862e + hVar.f56861c;
        } else if (!list2.isEmpty()) {
            j jVar2 = (j) h9.o.n(list2);
            this.f56887u = jVar2.f56862e + jVar2.f56861c;
        } else {
            this.f56887u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f56887u, j3);
            } else {
                j14 = Math.max(0L, this.f56887u + j3);
            }
        }
        this.f56872e = j14;
        this.f56873f = j3 >= 0;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

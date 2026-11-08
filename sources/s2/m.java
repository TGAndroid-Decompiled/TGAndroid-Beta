package s2;

import h9.i0;
import h9.l0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long f54687e;
    public final boolean f54688f;
    public final boolean f54689g;
    public final long h;
    public final boolean f54690i;
    public final int f54691j;
    public final long f54692k;
    public final int f54693l;
    public final long f54694m;
    public final long f54695n;
    public final boolean f54696o;
    public final boolean f54697p;
    public final e2.r f54698q;
    public final i0 f54699r;
    public final i0 f54700s;
    public final l0 f54701t;
    public final long f54702u;
    public final l v;
    public final i0 f54703w;
    public final j f54704x;

    public m(int i7, String str, List list, long j3, boolean z9, long j10, boolean z10, int i10, long j11, int i11, long j12, long j13, boolean z11, boolean z12, boolean z13, e2.r rVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z11);
        this.d = i7;
        this.h = j10;
        this.f54689g = z9;
        this.f54690i = z10;
        this.f54691j = i10;
        this.f54692k = j11;
        this.f54693l = i11;
        this.f54694m = j12;
        this.f54695n = j13;
        this.f54696o = z12;
        this.f54697p = z13;
        this.f54698q = rVar;
        this.f54699r = i0.q(list2);
        this.f54700s = i0.q(list3);
        this.f54701t = l0.b(map);
        this.f54703w = i0.q(list4);
        this.f54704x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) h9.o.n(list3);
            this.f54702u = hVar.f54677e + hVar.f54676c;
        } else if (!list2.isEmpty()) {
            j jVar2 = (j) h9.o.n(list2);
            this.f54702u = jVar2.f54677e + jVar2.f54676c;
        } else {
            this.f54702u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f54702u, j3);
            } else {
                j14 = Math.max(0L, this.f54702u + j3);
            }
        }
        this.f54687e = j14;
        this.f54688f = j3 >= 0;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

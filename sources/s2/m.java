package s2;

import h9.i0;
import h9.l0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long f56868e;
    public final boolean f56869f;
    public final boolean f56870g;
    public final long h;
    public final boolean f56871i;
    public final int f56872j;
    public final long f56873k;
    public final int f56874l;
    public final long f56875m;
    public final long f56876n;
    public final boolean f56877o;
    public final boolean f56878p;
    public final e2.r f56879q;
    public final i0 f56880r;
    public final i0 f56881s;
    public final l0 f56882t;
    public final long f56883u;
    public final l v;
    public final i0 f56884w;
    public final j f56885x;

    public m(int i7, String str, List list, long j3, boolean z10, long j10, boolean z11, int i10, long j11, int i11, long j12, long j13, boolean z12, boolean z13, boolean z14, e2.r rVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z12);
        this.d = i7;
        this.h = j10;
        this.f56870g = z10;
        this.f56871i = z11;
        this.f56872j = i10;
        this.f56873k = j11;
        this.f56874l = i11;
        this.f56875m = j12;
        this.f56876n = j13;
        this.f56877o = z13;
        this.f56878p = z14;
        this.f56879q = rVar;
        this.f56880r = i0.q(list2);
        this.f56881s = i0.q(list3);
        this.f56882t = l0.b(map);
        this.f56884w = i0.q(list4);
        this.f56885x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) h9.o.n(list3);
            this.f56883u = hVar.f56858e + hVar.f56857c;
        } else if (!list2.isEmpty()) {
            j jVar2 = (j) h9.o.n(list2);
            this.f56883u = jVar2.f56858e + jVar2.f56857c;
        } else {
            this.f56883u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f56883u, j3);
            } else {
                j14 = Math.max(0L, this.f56883u + j3);
            }
        }
        this.f56868e = j14;
        this.f56869f = j3 >= 0;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

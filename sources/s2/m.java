package s2;

import h9.i0;
import h9.l0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long f54699e;
    public final boolean f54700f;
    public final boolean f54701g;
    public final long h;
    public final boolean f54702i;
    public final int f54703j;
    public final long f54704k;
    public final int f54705l;
    public final long f54706m;
    public final long f54707n;
    public final boolean f54708o;
    public final boolean f54709p;
    public final e2.r f54710q;
    public final i0 f54711r;
    public final i0 f54712s;
    public final l0 f54713t;
    public final long f54714u;
    public final l v;
    public final i0 f54715w;
    public final j f54716x;

    public m(int i7, String str, List list, long j3, boolean z9, long j10, boolean z10, int i10, long j11, int i11, long j12, long j13, boolean z11, boolean z12, boolean z13, e2.r rVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z11);
        this.d = i7;
        this.h = j10;
        this.f54701g = z9;
        this.f54702i = z10;
        this.f54703j = i10;
        this.f54704k = j11;
        this.f54705l = i11;
        this.f54706m = j12;
        this.f54707n = j13;
        this.f54708o = z12;
        this.f54709p = z13;
        this.f54710q = rVar;
        this.f54711r = i0.q(list2);
        this.f54712s = i0.q(list3);
        this.f54713t = l0.b(map);
        this.f54715w = i0.q(list4);
        this.f54716x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) h9.o.n(list3);
            this.f54714u = hVar.f54689e + hVar.f54688c;
        } else if (!list2.isEmpty()) {
            j jVar2 = (j) h9.o.n(list2);
            this.f54714u = jVar2.f54689e + jVar2.f54688c;
        } else {
            this.f54714u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f54714u, j3);
            } else {
                j14 = Math.max(0L, this.f54714u + j3);
            }
        }
        this.f54699e = j14;
        this.f54700f = j3 >= 0;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

package s2;

import h9.i0;
import h9.l0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long f54700e;
    public final boolean f54701f;
    public final boolean f54702g;
    public final long h;
    public final boolean f54703i;
    public final int f54704j;
    public final long f54705k;
    public final int f54706l;
    public final long f54707m;
    public final long f54708n;
    public final boolean f54709o;
    public final boolean f54710p;
    public final e2.r f54711q;
    public final i0 f54712r;
    public final i0 f54713s;
    public final l0 f54714t;
    public final long f54715u;
    public final l v;
    public final i0 f54716w;
    public final j f54717x;

    public m(int i7, String str, List list, long j3, boolean z9, long j10, boolean z10, int i10, long j11, int i11, long j12, long j13, boolean z11, boolean z12, boolean z13, e2.r rVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z11);
        this.d = i7;
        this.h = j10;
        this.f54702g = z9;
        this.f54703i = z10;
        this.f54704j = i10;
        this.f54705k = j11;
        this.f54706l = i11;
        this.f54707m = j12;
        this.f54708n = j13;
        this.f54709o = z12;
        this.f54710p = z13;
        this.f54711q = rVar;
        this.f54712r = i0.q(list2);
        this.f54713s = i0.q(list3);
        this.f54714t = l0.b(map);
        this.f54716w = i0.q(list4);
        this.f54717x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) h9.o.n(list3);
            this.f54715u = hVar.f54690e + hVar.f54689c;
        } else if (!list2.isEmpty()) {
            j jVar2 = (j) h9.o.n(list2);
            this.f54715u = jVar2.f54690e + jVar2.f54689c;
        } else {
            this.f54715u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f54715u, j3);
            } else {
                j14 = Math.max(0L, this.f54715u + j3);
            }
        }
        this.f54700e = j14;
        this.f54701f = j3 >= 0;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

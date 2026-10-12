package p2;

import e9.n0;
import e9.q0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long e;
    public final boolean f42910f;
    public final boolean f42911g;
    public final long h;
    public final boolean f42912i;
    public final int f42913j;
    public final long f42914k;
    public final int f42915l;
    public final long f42916m;
    public final long f42917n;
    public final boolean f42918o;
    public final boolean f42919p;
    public final b2.t f42920q;
    public final n0 f42921r;
    public final n0 f42922s;
    public final q0 f42923t;
    public final long f42924u;
    public final l v;
    public final n0 f42925w;
    public final j f42926x;

    public m(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, b2.t tVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j11;
        this.f42911g = z10;
        this.f42912i = z11;
        this.f42913j = i11;
        this.f42914k = j12;
        this.f42915l = i12;
        this.f42916m = j13;
        this.f42917n = j14;
        this.f42918o = z13;
        this.f42919p = z14;
        this.f42920q = tVar;
        this.f42921r = n0.u(list2);
        this.f42922s = n0.u(list3);
        this.f42923t = q0.a(map);
        this.f42925w = n0.u(list4);
        this.f42926x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) e9.s.m(list3);
            this.f42924u = hVar.e + hVar.f42902c;
        } else if (!list2.isEmpty()) {
            j jVar2 = (j) e9.s.m(list2);
            this.f42924u = jVar2.e + jVar2.f42902c;
        } else {
            this.f42924u = 0L;
        }
        long j15 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 0) {
                j15 = Math.min(this.f42924u, j10);
            } else {
                j15 = Math.max(0L, this.f42924u + j10);
            }
        }
        this.e = j15;
        if (j10 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f42910f = z15;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

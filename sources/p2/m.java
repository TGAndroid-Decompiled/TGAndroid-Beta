package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long f45118e;
    public final boolean f45119f;
    public final boolean f45120g;
    public final long h;
    public final boolean f45121i;
    public final int f45122j;
    public final long f45123k;
    public final int f45124l;
    public final long f45125m;
    public final long f45126n;
    public final boolean f45127o;
    public final boolean f45128p;
    public final b2.o f45129q;
    public final i0 f45130r;
    public final i0 f45131s;
    public final k0 f45132t;
    public final long f45133u;
    public final l v;
    public final i0 f45134w;

    public m(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, l lVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f45120g = z10;
        this.f45121i = z11;
        this.f45122j = i11;
        this.f45123k = j11;
        this.f45124l = i12;
        this.f45125m = j12;
        this.f45126n = j13;
        this.f45127o = z13;
        this.f45128p = z14;
        this.f45129q = oVar;
        this.f45130r = i0.v(list2);
        this.f45131s = i0.v(list3);
        this.f45132t = k0.a(map);
        this.f45134w = i0.v(list4);
        if (!list3.isEmpty()) {
            h hVar = (h) e9.q.l(list3);
            this.f45133u = hVar.f45109e + hVar.f45108c;
        } else if (!list2.isEmpty()) {
            j jVar = (j) e9.q.l(list2);
            this.f45133u = jVar.f45109e + jVar.f45108c;
        } else {
            this.f45133u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f45133u, j3);
            } else {
                j14 = Math.max(0L, this.f45133u + j3);
            }
        }
        this.f45118e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f45119f = z15;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

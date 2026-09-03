package u4;

import java.util.List;
import java.util.Map;
import s8.v;
import s8.x;
public final class i extends m {
    public final int d;
    public final long f48317e;
    public final boolean f48318f;
    public final boolean f48319g;
    public final long h;
    public final boolean f48320i;
    public final int f48321j;
    public final long f48322k;
    public final int f48323l;
    public final long f48324m;
    public final long f48325n;
    public final boolean f48326o;
    public final boolean f48327p;
    public final o3.g f48328q;
    public final v f48329r;
    public final v f48330s;
    public final x f48331t;
    public final long f48332u;
    public final h v;

    public i(int i10, String str, List list, long j10, boolean z4, long j11, boolean z10, int i11, long j12, int i12, long j13, long j14, boolean z11, boolean z12, boolean z13, o3.g gVar, List list2, List list3, h hVar, Map map) {
        super(str, list, z11);
        boolean z14;
        this.d = i10;
        this.h = j11;
        this.f48319g = z4;
        this.f48320i = z10;
        this.f48321j = i11;
        this.f48322k = j12;
        this.f48323l = i12;
        this.f48324m = j13;
        this.f48325n = j14;
        this.f48326o = z12;
        this.f48327p = z13;
        this.f48328q = gVar;
        this.f48329r = v.t(list2);
        this.f48330s = v.t(list3);
        this.f48331t = x.a(map);
        if (!list3.isEmpty()) {
            d dVar = (d) s8.l.h(list3);
            this.f48332u = dVar.f48308e + dVar.f48307c;
        } else if (!list2.isEmpty()) {
            f fVar = (f) s8.l.h(list2);
            this.f48332u = fVar.f48308e + fVar.f48307c;
        } else {
            this.f48332u = 0L;
        }
        long j15 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 0) {
                j15 = Math.min(this.f48332u, j10);
            } else {
                j15 = Math.max(0L, this.f48332u + j10);
            }
        }
        this.f48317e = j15;
        if (j10 >= 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f48318f = z14;
        this.v = hVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

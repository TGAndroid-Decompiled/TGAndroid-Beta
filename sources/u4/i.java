package u4;

import java.util.List;
import java.util.Map;
import s8.v;
import s8.x;
public final class i extends m {
    public final int d;
    public final long e;
    public final boolean f45096f;
    public final boolean f45097g;
    public final long h;
    public final boolean f45098i;
    public final int f45099j;
    public final long f45100k;
    public final int f45101l;
    public final long f45102m;
    public final long f45103n;
    public final boolean f45104o;
    public final boolean f45105p;
    public final o3.h f45106q;
    public final v f45107r;
    public final v f45108s;
    public final x f45109t;
    public final long f45110u;
    public final h v;

    public i(int i10, String str, List list, long j10, boolean z4, long j11, boolean z10, int i11, long j12, int i12, long j13, long j14, boolean z11, boolean z12, boolean z13, o3.h hVar, List list2, List list3, h hVar2, Map map) {
        super(str, list, z11);
        boolean z14;
        this.d = i10;
        this.h = j11;
        this.f45097g = z4;
        this.f45098i = z10;
        this.f45099j = i11;
        this.f45100k = j12;
        this.f45101l = i12;
        this.f45102m = j13;
        this.f45103n = j14;
        this.f45104o = z12;
        this.f45105p = z13;
        this.f45106q = hVar;
        this.f45107r = v.t(list2);
        this.f45108s = v.t(list3);
        this.f45109t = x.a(map);
        if (!list3.isEmpty()) {
            d dVar = (d) s8.l.h(list3);
            this.f45110u = dVar.e + dVar.f45088c;
        } else if (!list2.isEmpty()) {
            f fVar = (f) s8.l.h(list2);
            this.f45110u = fVar.e + fVar.f45088c;
        } else {
            this.f45110u = 0L;
        }
        long j15 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 0) {
                j15 = Math.min(this.f45110u, j10);
            } else {
                j15 = Math.max(0L, this.f45110u + j10);
            }
        }
        this.e = j15;
        if (j10 >= 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f45096f = z14;
        this.v = hVar2;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

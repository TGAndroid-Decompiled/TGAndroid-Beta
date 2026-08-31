package u4;

import java.util.List;
import java.util.Map;
import s8.v;
import s8.x;
public final class i extends m {
    public final int d;
    public final long f48281e;
    public final boolean f48282f;
    public final boolean f48283g;
    public final long h;
    public final boolean f48284i;
    public final int f48285j;
    public final long f48286k;
    public final int f48287l;
    public final long f48288m;
    public final long f48289n;
    public final boolean f48290o;
    public final boolean f48291p;
    public final o3.g f48292q;
    public final v f48293r;
    public final v f48294s;
    public final x f48295t;
    public final long f48296u;
    public final h v;

    public i(int i10, String str, List list, long j10, boolean z4, long j11, boolean z10, int i11, long j12, int i12, long j13, long j14, boolean z11, boolean z12, boolean z13, o3.g gVar, List list2, List list3, h hVar, Map map) {
        super(str, list, z11);
        boolean z14;
        this.d = i10;
        this.h = j11;
        this.f48283g = z4;
        this.f48284i = z10;
        this.f48285j = i11;
        this.f48286k = j12;
        this.f48287l = i12;
        this.f48288m = j13;
        this.f48289n = j14;
        this.f48290o = z12;
        this.f48291p = z13;
        this.f48292q = gVar;
        this.f48293r = v.t(list2);
        this.f48294s = v.t(list3);
        this.f48295t = x.a(map);
        if (!list3.isEmpty()) {
            d dVar = (d) s8.l.h(list3);
            this.f48296u = dVar.f48272e + dVar.f48271c;
        } else if (!list2.isEmpty()) {
            f fVar = (f) s8.l.h(list2);
            this.f48296u = fVar.f48272e + fVar.f48271c;
        } else {
            this.f48296u = 0L;
        }
        long j15 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 0) {
                j15 = Math.min(this.f48296u, j10);
            } else {
                j15 = Math.max(0L, this.f48296u + j10);
            }
        }
        this.f48281e = j15;
        if (j10 >= 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f48282f = z14;
        this.v = hVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

package u4;

import java.util.List;
import java.util.Map;
import s8.v;
import s8.x;
public final class i extends m {
    public final int d;
    public final long e;
    public final boolean f45034f;
    public final boolean f45035g;
    public final long h;
    public final boolean f45036i;
    public final int f45037j;
    public final long f45038k;
    public final int f45039l;
    public final long f45040m;
    public final long f45041n;
    public final boolean f45042o;
    public final boolean f45043p;
    public final o3.g f45044q;
    public final v f45045r;
    public final v f45046s;
    public final x f45047t;
    public final long f45048u;
    public final h v;

    public i(int i10, String str, List list, long j10, boolean z4, long j11, boolean z10, int i11, long j12, int i12, long j13, long j14, boolean z11, boolean z12, boolean z13, o3.g gVar, List list2, List list3, h hVar, Map map) {
        super(str, list, z11);
        boolean z14;
        this.d = i10;
        this.h = j11;
        this.f45035g = z4;
        this.f45036i = z10;
        this.f45037j = i11;
        this.f45038k = j12;
        this.f45039l = i12;
        this.f45040m = j13;
        this.f45041n = j14;
        this.f45042o = z12;
        this.f45043p = z13;
        this.f45044q = gVar;
        this.f45045r = v.t(list2);
        this.f45046s = v.t(list3);
        this.f45047t = x.a(map);
        if (!list3.isEmpty()) {
            d dVar = (d) s8.l.h(list3);
            this.f45048u = dVar.e + dVar.f45026c;
        } else if (!list2.isEmpty()) {
            f fVar = (f) s8.l.h(list2);
            this.f45048u = fVar.e + fVar.f45026c;
        } else {
            this.f45048u = 0L;
        }
        long j15 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 0) {
                j15 = Math.min(this.f45048u, j10);
            } else {
                j15 = Math.max(0L, this.f45048u + j10);
            }
        }
        this.e = j15;
        if (j10 >= 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f45034f = z14;
        this.v = hVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

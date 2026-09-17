package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class l extends p {
    public final int d;
    public final long f43741e;
    public final boolean f43742f;
    public final boolean f43743g;
    public final long h;
    public final boolean f43744i;
    public final int f43745j;
    public final long f43746k;
    public final int f43747l;
    public final long f43748m;
    public final long f43749n;
    public final boolean f43750o;
    public final boolean f43751p;
    public final b2.o f43752q;
    public final i0 f43753r;
    public final i0 f43754s;
    public final k0 f43755t;
    public final long f43756u;
    public final k v;
    public final i0 f43757w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f43743g = z10;
        this.f43744i = z11;
        this.f43745j = i11;
        this.f43746k = j11;
        this.f43747l = i12;
        this.f43748m = j12;
        this.f43749n = j13;
        this.f43750o = z13;
        this.f43751p = z14;
        this.f43752q = oVar;
        this.f43753r = i0.v(list2);
        this.f43754s = i0.v(list3);
        this.f43755t = k0.a(map);
        this.f43757w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.f43756u = gVar.f43732e + gVar.f43731c;
        } else if (!list2.isEmpty()) {
            i iVar = (i) e9.q.l(list2);
            this.f43756u = iVar.f43732e + iVar.f43731c;
        } else {
            this.f43756u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f43756u, j3);
            } else {
                j14 = Math.max(0L, this.f43756u + j3);
            }
        }
        this.f43741e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f43742f = z15;
        this.v = kVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class l extends p {
    public final int d;
    public final long f43740e;
    public final boolean f43741f;
    public final boolean f43742g;
    public final long h;
    public final boolean f43743i;
    public final int f43744j;
    public final long f43745k;
    public final int f43746l;
    public final long f43747m;
    public final long f43748n;
    public final boolean f43749o;
    public final boolean f43750p;
    public final b2.o f43751q;
    public final i0 f43752r;
    public final i0 f43753s;
    public final k0 f43754t;
    public final long f43755u;
    public final k v;
    public final i0 f43756w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f43742g = z10;
        this.f43743i = z11;
        this.f43744j = i11;
        this.f43745k = j11;
        this.f43746l = i12;
        this.f43747m = j12;
        this.f43748n = j13;
        this.f43749o = z13;
        this.f43750p = z14;
        this.f43751q = oVar;
        this.f43752r = i0.v(list2);
        this.f43753s = i0.v(list3);
        this.f43754t = k0.a(map);
        this.f43756w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.f43755u = gVar.f43731e + gVar.f43730c;
        } else if (!list2.isEmpty()) {
            i iVar = (i) e9.q.l(list2);
            this.f43755u = iVar.f43731e + iVar.f43730c;
        } else {
            this.f43755u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f43755u, j3);
            } else {
                j14 = Math.max(0L, this.f43755u + j3);
            }
        }
        this.f43740e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f43741f = z15;
        this.v = kVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

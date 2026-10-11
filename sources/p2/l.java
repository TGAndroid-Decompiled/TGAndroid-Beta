package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class l extends p {
    public final int d;
    public final long f45269e;
    public final boolean f45270f;
    public final boolean f45271g;
    public final long h;
    public final boolean f45272i;
    public final int f45273j;
    public final long f45274k;
    public final int f45275l;
    public final long f45276m;
    public final long f45277n;
    public final boolean f45278o;
    public final boolean f45279p;
    public final b2.o f45280q;
    public final i0 f45281r;
    public final i0 f45282s;
    public final k0 f45283t;
    public final long f45284u;
    public final k v;
    public final i0 f45285w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f45271g = z10;
        this.f45272i = z11;
        this.f45273j = i11;
        this.f45274k = j11;
        this.f45275l = i12;
        this.f45276m = j12;
        this.f45277n = j13;
        this.f45278o = z13;
        this.f45279p = z14;
        this.f45280q = oVar;
        this.f45281r = i0.v(list2);
        this.f45282s = i0.v(list3);
        this.f45283t = k0.a(map);
        this.f45285w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.f45284u = gVar.f45260e + gVar.f45259c;
        } else if (!list2.isEmpty()) {
            i iVar = (i) e9.q.l(list2);
            this.f45284u = iVar.f45260e + iVar.f45259c;
        } else {
            this.f45284u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f45284u, j3);
            } else {
                j14 = Math.max(0L, this.f45284u + j3);
            }
        }
        this.f45269e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f45270f = z15;
        this.v = kVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

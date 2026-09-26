package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class l extends p {
    public final int d;
    public final long e;
    public final boolean f40731f;
    public final boolean f40732g;
    public final long h;
    public final boolean f40733i;
    public final int f40734j;
    public final long f40735k;
    public final int f40736l;
    public final long f40737m;
    public final long f40738n;
    public final boolean f40739o;
    public final boolean f40740p;
    public final b2.o f40741q;
    public final i0 f40742r;
    public final i0 f40743s;
    public final k0 f40744t;
    public final long f40745u;
    public final k v;
    public final i0 f40746w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f40732g = z10;
        this.f40733i = z11;
        this.f40734j = i11;
        this.f40735k = j11;
        this.f40736l = i12;
        this.f40737m = j12;
        this.f40738n = j13;
        this.f40739o = z13;
        this.f40740p = z14;
        this.f40741q = oVar;
        this.f40742r = i0.v(list2);
        this.f40743s = i0.v(list3);
        this.f40744t = k0.a(map);
        this.f40746w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.f40745u = gVar.e + gVar.f40723c;
        } else if (!list2.isEmpty()) {
            i iVar = (i) e9.q.l(list2);
            this.f40745u = iVar.e + iVar.f40723c;
        } else {
            this.f40745u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f40745u, j3);
            } else {
                j14 = Math.max(0L, this.f40745u + j3);
            }
        }
        this.e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f40731f = z15;
        this.v = kVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

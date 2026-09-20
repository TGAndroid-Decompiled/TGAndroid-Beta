package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class l extends p {
    public final int d;
    public final long e;
    public final boolean f40759f;
    public final boolean f40760g;
    public final long h;
    public final boolean f40761i;
    public final int f40762j;
    public final long f40763k;
    public final int f40764l;
    public final long f40765m;
    public final long f40766n;
    public final boolean f40767o;
    public final boolean f40768p;
    public final b2.o f40769q;
    public final i0 f40770r;
    public final i0 f40771s;
    public final k0 f40772t;
    public final long f40773u;
    public final k v;
    public final i0 f40774w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f40760g = z10;
        this.f40761i = z11;
        this.f40762j = i11;
        this.f40763k = j11;
        this.f40764l = i12;
        this.f40765m = j12;
        this.f40766n = j13;
        this.f40767o = z13;
        this.f40768p = z14;
        this.f40769q = oVar;
        this.f40770r = i0.v(list2);
        this.f40771s = i0.v(list3);
        this.f40772t = k0.a(map);
        this.f40774w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.f40773u = gVar.e + gVar.f40751c;
        } else if (!list2.isEmpty()) {
            i iVar = (i) e9.q.l(list2);
            this.f40773u = iVar.e + iVar.f40751c;
        } else {
            this.f40773u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f40773u, j3);
            } else {
                j14 = Math.max(0L, this.f40773u + j3);
            }
        }
        this.e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f40759f = z15;
        this.v = kVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

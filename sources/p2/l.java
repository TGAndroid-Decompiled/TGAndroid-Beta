package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class l extends p {
    public final int d;
    public final long f44062e;
    public final boolean f44063f;
    public final boolean f44064g;
    public final long h;
    public final boolean f44065i;
    public final int f44066j;
    public final long f44067k;
    public final int f44068l;
    public final long f44069m;
    public final long f44070n;
    public final boolean f44071o;
    public final boolean f44072p;
    public final b2.o f44073q;
    public final i0 f44074r;
    public final i0 f44075s;
    public final k0 f44076t;
    public final long f44077u;
    public final k v;
    public final i0 f44078w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f44064g = z10;
        this.f44065i = z11;
        this.f44066j = i11;
        this.f44067k = j11;
        this.f44068l = i12;
        this.f44069m = j12;
        this.f44070n = j13;
        this.f44071o = z13;
        this.f44072p = z14;
        this.f44073q = oVar;
        this.f44074r = i0.v(list2);
        this.f44075s = i0.v(list3);
        this.f44076t = k0.a(map);
        this.f44078w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.f44077u = gVar.f44053e + gVar.f44052c;
        } else if (!list2.isEmpty()) {
            i iVar = (i) e9.q.l(list2);
            this.f44077u = iVar.f44053e + iVar.f44052c;
        } else {
            this.f44077u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f44077u, j3);
            } else {
                j14 = Math.max(0L, this.f44077u + j3);
            }
        }
        this.f44062e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f44063f = z15;
        this.v = kVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

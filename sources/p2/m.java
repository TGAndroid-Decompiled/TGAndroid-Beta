package p2;

import e9.n0;
import e9.q0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long e;
    public final boolean f44612f;
    public final boolean f44613g;
    public final long h;
    public final boolean f44614i;
    public final int f44615j;
    public final long f44616k;
    public final int f44617l;
    public final long f44618m;
    public final long f44619n;
    public final boolean f44620o;
    public final boolean f44621p;
    public final b2.t f44622q;
    public final n0 f44623r;
    public final n0 f44624s;
    public final q0 f44625t;
    public final long f44626u;
    public final l v;
    public final n0 f44627w;
    public final j f44628x;

    public m(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, b2.t tVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z12);
        this.d = i10;
        this.h = j11;
        this.f44613g = z10;
        this.f44614i = z11;
        this.f44615j = i11;
        this.f44616k = j12;
        this.f44617l = i12;
        this.f44618m = j13;
        this.f44619n = j14;
        this.f44620o = z13;
        this.f44621p = z14;
        this.f44622q = tVar;
        this.f44623r = n0.u(list2);
        this.f44624s = n0.u(list3);
        this.f44625t = q0.a(map);
        this.f44627w = n0.u(list4);
        this.f44628x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) e9.s.m(list3);
            this.f44626u = hVar.e + hVar.f44603c;
        } else if (!list2.isEmpty()) {
            j jVar2 = (j) e9.s.m(list2);
            this.f44626u = jVar2.e + jVar2.f44603c;
        } else {
            this.f44626u = 0L;
        }
        long j15 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 0) {
                j15 = Math.min(this.f44626u, j10);
            } else {
                j15 = Math.max(0L, this.f44626u + j10);
            }
        }
        this.e = j15;
        this.f44612f = j10 >= 0;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

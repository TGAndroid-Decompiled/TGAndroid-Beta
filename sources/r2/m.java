package r2;

import g9.i0;
import g9.l0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long f54153e;
    public final boolean f54154f;
    public final boolean f54155g;
    public final long h;
    public final boolean f54156i;
    public final int f54157j;
    public final long f54158k;
    public final int f54159l;
    public final long f54160m;
    public final long f54161n;
    public final boolean f54162o;
    public final boolean f54163p;
    public final d2.s f54164q;
    public final i0 f54165r;
    public final i0 f54166s;
    public final l0 f54167t;
    public final long f54168u;
    public final l v;
    public final i0 f54169w;
    public final j f54170x;

    public m(int i3, String str, List list, long j10, boolean z10, long j11, boolean z11, int i10, long j12, int i11, long j13, long j14, boolean z12, boolean z13, boolean z14, d2.s sVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z12);
        this.d = i3;
        this.h = j11;
        this.f54155g = z10;
        this.f54156i = z11;
        this.f54157j = i10;
        this.f54158k = j12;
        this.f54159l = i11;
        this.f54160m = j13;
        this.f54161n = j14;
        this.f54162o = z13;
        this.f54163p = z14;
        this.f54164q = sVar;
        this.f54165r = i0.q(list2);
        this.f54166s = i0.q(list3);
        this.f54167t = l0.b(map);
        this.f54169w = i0.q(list4);
        this.f54170x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) g9.o.n(list3);
            this.f54168u = hVar.f54143e + hVar.f54142c;
        } else if (!list2.isEmpty()) {
            j jVar2 = (j) g9.o.n(list2);
            this.f54168u = jVar2.f54143e + jVar2.f54142c;
        } else {
            this.f54168u = 0L;
        }
        long j15 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 0) {
                j15 = Math.min(this.f54168u, j10);
            } else {
                j15 = Math.max(0L, this.f54168u + j10);
            }
        }
        this.f54153e = j15;
        this.f54154f = j10 >= 0;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

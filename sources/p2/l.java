package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class l extends p {
    public final int d;
    public final long f45279e;
    public final boolean f45280f;
    public final boolean f45281g;
    public final long h;
    public final boolean f45282i;
    public final int f45283j;
    public final long f45284k;
    public final int f45285l;
    public final long f45286m;
    public final long f45287n;
    public final boolean f45288o;
    public final boolean f45289p;
    public final b2.o f45290q;
    public final i0 f45291r;
    public final i0 f45292s;
    public final k0 f45293t;
    public final long f45294u;
    public final k v;
    public final i0 f45295w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f45281g = z10;
        this.f45282i = z11;
        this.f45283j = i11;
        this.f45284k = j11;
        this.f45285l = i12;
        this.f45286m = j12;
        this.f45287n = j13;
        this.f45288o = z13;
        this.f45289p = z14;
        this.f45290q = oVar;
        this.f45291r = i0.v(list2);
        this.f45292s = i0.v(list3);
        this.f45293t = k0.a(map);
        this.f45295w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.f45294u = gVar.f45270e + gVar.f45269c;
        } else if (!list2.isEmpty()) {
            i iVar = (i) e9.q.l(list2);
            this.f45294u = iVar.f45270e + iVar.f45269c;
        } else {
            this.f45294u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f45294u, j3);
            } else {
                j14 = Math.max(0L, this.f45294u + j3);
            }
        }
        this.f45279e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f45280f = z15;
        this.v = kVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

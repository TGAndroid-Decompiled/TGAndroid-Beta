package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class l extends p {
    public final int d;
    public final long e;
    public final boolean f40831f;
    public final boolean f40832g;
    public final long h;
    public final boolean f40833i;
    public final int f40834j;
    public final long f40835k;
    public final int f40836l;
    public final long f40837m;
    public final long f40838n;
    public final boolean f40839o;
    public final boolean f40840p;
    public final b2.o f40841q;
    public final i0 f40842r;
    public final i0 f40843s;
    public final k0 f40844t;
    public final long f40845u;
    public final k v;
    public final i0 f40846w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f40832g = z10;
        this.f40833i = z11;
        this.f40834j = i11;
        this.f40835k = j11;
        this.f40836l = i12;
        this.f40837m = j12;
        this.f40838n = j13;
        this.f40839o = z13;
        this.f40840p = z14;
        this.f40841q = oVar;
        this.f40842r = i0.v(list2);
        this.f40843s = i0.v(list3);
        this.f40844t = k0.a(map);
        this.f40846w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.f40845u = gVar.e + gVar.f40823c;
        } else if (!list2.isEmpty()) {
            i iVar = (i) e9.q.l(list2);
            this.f40845u = iVar.e + iVar.f40823c;
        } else {
            this.f40845u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f40845u, j3);
            } else {
                j14 = Math.max(0L, this.f40845u + j3);
            }
        }
        this.e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f40831f = z15;
        this.v = kVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

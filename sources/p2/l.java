package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class l extends p {
    public final int d;
    public final long f44054e;
    public final boolean f44055f;
    public final boolean f44056g;
    public final long h;
    public final boolean f44057i;
    public final int f44058j;
    public final long f44059k;
    public final int f44060l;
    public final long f44061m;
    public final long f44062n;
    public final boolean f44063o;
    public final boolean f44064p;
    public final b2.o f44065q;
    public final i0 f44066r;
    public final i0 f44067s;
    public final k0 f44068t;
    public final long f44069u;
    public final k v;
    public final i0 f44070w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f44056g = z10;
        this.f44057i = z11;
        this.f44058j = i11;
        this.f44059k = j11;
        this.f44060l = i12;
        this.f44061m = j12;
        this.f44062n = j13;
        this.f44063o = z13;
        this.f44064p = z14;
        this.f44065q = oVar;
        this.f44066r = i0.v(list2);
        this.f44067s = i0.v(list3);
        this.f44068t = k0.a(map);
        this.f44070w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.f44069u = gVar.f44045e + gVar.f44044c;
        } else if (!list2.isEmpty()) {
            i iVar = (i) e9.q.l(list2);
            this.f44069u = iVar.f44045e + iVar.f44044c;
        } else {
            this.f44069u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f44069u, j3);
            } else {
                j14 = Math.max(0L, this.f44069u + j3);
            }
        }
        this.f44054e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f44055f = z15;
        this.v = kVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

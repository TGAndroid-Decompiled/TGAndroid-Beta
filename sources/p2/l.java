package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class l extends p {
    public final int d;
    public final long f44055e;
    public final boolean f44056f;
    public final boolean f44057g;
    public final long h;
    public final boolean f44058i;
    public final int f44059j;
    public final long f44060k;
    public final int f44061l;
    public final long f44062m;
    public final long f44063n;
    public final boolean f44064o;
    public final boolean f44065p;
    public final b2.o f44066q;
    public final i0 f44067r;
    public final i0 f44068s;
    public final k0 f44069t;
    public final long f44070u;
    public final k v;
    public final i0 f44071w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f44057g = z10;
        this.f44058i = z11;
        this.f44059j = i11;
        this.f44060k = j11;
        this.f44061l = i12;
        this.f44062m = j12;
        this.f44063n = j13;
        this.f44064o = z13;
        this.f44065p = z14;
        this.f44066q = oVar;
        this.f44067r = i0.v(list2);
        this.f44068s = i0.v(list3);
        this.f44069t = k0.a(map);
        this.f44071w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.f44070u = gVar.f44046e + gVar.f44045c;
        } else if (!list2.isEmpty()) {
            i iVar = (i) e9.q.l(list2);
            this.f44070u = iVar.f44046e + iVar.f44045c;
        } else {
            this.f44070u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f44070u, j3);
            } else {
                j14 = Math.max(0L, this.f44070u + j3);
            }
        }
        this.f44055e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f44056f = z15;
        this.v = kVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

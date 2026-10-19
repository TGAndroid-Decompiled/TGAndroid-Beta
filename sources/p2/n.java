package p2;

import e9.n0;
import e9.q0;
import java.util.List;
import java.util.Map;
public final class n extends r {
    public final int d;
    public final long e;
    public final boolean f43994f;
    public final boolean f43995g;
    public final long h;
    public final boolean f43996i;
    public final int f43997j;
    public final long f43998k;
    public final int f43999l;
    public final long f44000m;
    public final long f44001n;
    public final boolean f44002o;
    public final boolean f44003p;
    public final b2.s f44004q;
    public final n0 f44005r;
    public final n0 f44006s;
    public final q0 f44007t;
    public final long f44008u;
    public final m v;
    public final n0 f44009w;
    public final k f44010x;

    public n(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, b2.s sVar, List list2, List list3, m mVar, Map map, List list4, k kVar) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j11;
        this.f43995g = z10;
        this.f43996i = z11;
        this.f43997j = i11;
        this.f43998k = j12;
        this.f43999l = i12;
        this.f44000m = j13;
        this.f44001n = j14;
        this.f44002o = z13;
        this.f44003p = z14;
        this.f44004q = sVar;
        this.f44005r = n0.u(list2);
        this.f44006s = n0.u(list3);
        this.f44007t = q0.a(map);
        this.f44009w = n0.u(list4);
        this.f44010x = kVar;
        if (!list3.isEmpty()) {
            i iVar = (i) e9.s.m(list3);
            this.f44008u = iVar.e + iVar.f43986c;
        } else if (!list2.isEmpty()) {
            k kVar2 = (k) e9.s.m(list2);
            this.f44008u = kVar2.e + kVar2.f43986c;
        } else {
            this.f44008u = 0L;
        }
        long j15 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 0) {
                j15 = Math.min(this.f44008u, j10);
            } else {
                j15 = Math.max(0L, this.f44008u + j10);
            }
        }
        this.e = j15;
        if (j10 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f43994f = z15;
        this.v = mVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

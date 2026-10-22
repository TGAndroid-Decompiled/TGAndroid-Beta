package p2;

import e9.n0;
import e9.q0;
import java.util.List;
import java.util.Map;
public final class n extends r {
    public final int d;
    public final long e;
    public final boolean f44005f;
    public final boolean f44006g;
    public final long h;
    public final boolean f44007i;
    public final int f44008j;
    public final long f44009k;
    public final int f44010l;
    public final long f44011m;
    public final long f44012n;
    public final boolean f44013o;
    public final boolean f44014p;
    public final b2.s f44015q;
    public final n0 f44016r;
    public final n0 f44017s;
    public final q0 f44018t;
    public final long f44019u;
    public final m v;
    public final n0 f44020w;
    public final k f44021x;

    public n(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, b2.s sVar, List list2, List list3, m mVar, Map map, List list4, k kVar) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j11;
        this.f44006g = z10;
        this.f44007i = z11;
        this.f44008j = i11;
        this.f44009k = j12;
        this.f44010l = i12;
        this.f44011m = j13;
        this.f44012n = j14;
        this.f44013o = z13;
        this.f44014p = z14;
        this.f44015q = sVar;
        this.f44016r = n0.u(list2);
        this.f44017s = n0.u(list3);
        this.f44018t = q0.a(map);
        this.f44020w = n0.u(list4);
        this.f44021x = kVar;
        if (!list3.isEmpty()) {
            i iVar = (i) e9.s.m(list3);
            this.f44019u = iVar.e + iVar.f43997c;
        } else if (!list2.isEmpty()) {
            k kVar2 = (k) e9.s.m(list2);
            this.f44019u = kVar2.e + kVar2.f43997c;
        } else {
            this.f44019u = 0L;
        }
        long j15 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 0) {
                j15 = Math.min(this.f44019u, j10);
            } else {
                j15 = Math.max(0L, this.f44019u + j10);
            }
        }
        this.e = j15;
        if (j10 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f44005f = z15;
        this.v = mVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}

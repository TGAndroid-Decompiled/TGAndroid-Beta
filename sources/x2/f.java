package x2;

import b2.p1;
import b2.w;
public final class f extends l implements Comparable {
    public final int e;
    public final int f49138f;

    public f(int i10, p1 p1Var, int i11, i iVar, int i12) {
        super(i10, p1Var, i11);
        int i13;
        this.e = i2.e.e(i12, iVar.B0) ? 1 : 0;
        w wVar = this.d;
        int i14 = wVar.f4136z;
        int i15 = -1;
        if (i14 != -1 && (i13 = wVar.A) != -1) {
            i15 = i14 * i13;
        }
        this.f49138f = i15;
    }

    @Override
    public final int a() {
        return this.e;
    }

    @Override
    public final boolean b(l lVar) {
        f fVar = (f) lVar;
        return false;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f49138f, ((f) obj).f49138f);
    }
}

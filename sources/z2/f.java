package z2;

import d2.o1;
import d2.v;
import k2.p1;
public final class f extends l implements Comparable {
    public final int f59602e;
    public final int f59603f;

    public f(int i3, o1 o1Var, int i10, i iVar, int i11) {
        super(i3, o1Var, i10);
        int i12;
        this.f59602e = p1.b(i11, iVar.B0) ? 1 : 0;
        v vVar = this.d;
        int i13 = vVar.f8495z;
        int i14 = -1;
        if (i13 != -1 && (i12 = vVar.A) != -1) {
            i14 = i13 * i12;
        }
        this.f59603f = i14;
    }

    @Override
    public final int a() {
        return this.f59602e;
    }

    @Override
    public final boolean b(l lVar) {
        f fVar = (f) lVar;
        return false;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f59603f, ((f) obj).f59603f);
    }
}

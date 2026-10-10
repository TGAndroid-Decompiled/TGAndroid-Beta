package zg;

import java.util.Comparator;
public final class k0 implements Comparator {
    public long f54621a;

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        l0 l0Var = (l0) obj;
        l0 l0Var2 = (l0) obj2;
        if (this.f54621a >= 0) {
            boolean z10 = l0Var.f54641m;
            if (z10 != l0Var2.f54641m) {
                if (z10) {
                    return -1;
                }
                return 1;
            }
            boolean z11 = l0Var.Q;
            if (z11 != l0Var2.Q) {
                if (z11) {
                    return -1;
                }
                return 1;
            } else if (z11 && (i12 = l0Var.f54639k) != (i13 = l0Var2.f54639k)) {
                return i12 - i13;
            } else {
                i10 = l0Var.f54624a.lastDrawnPosition;
                i11 = l0Var2.f54624a.lastDrawnPosition;
            }
        } else {
            boolean z12 = l0Var.f54641m;
            if (z12 != l0Var2.f54641m) {
                if (z12) {
                    return -1;
                }
                return 1;
            }
            int i14 = l0Var.f54638j;
            int i15 = l0Var2.f54638j;
            if (i14 != i15) {
                return i15 - i14;
            }
            i10 = l0Var.f54624a.lastDrawnPosition;
            i11 = l0Var2.f54624a.lastDrawnPosition;
        }
        return i10 - i11;
    }
}

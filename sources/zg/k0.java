package zg;

import java.util.Comparator;
public final class k0 implements Comparator {
    public long f54664a;

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        l0 l0Var = (l0) obj;
        l0 l0Var2 = (l0) obj2;
        if (this.f54664a >= 0) {
            boolean z10 = l0Var.f54684m;
            if (z10 != l0Var2.f54684m) {
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
            } else if (z11 && (i12 = l0Var.f54682k) != (i13 = l0Var2.f54682k)) {
                return i12 - i13;
            } else {
                i10 = l0Var.f54667a.lastDrawnPosition;
                i11 = l0Var2.f54667a.lastDrawnPosition;
            }
        } else {
            boolean z12 = l0Var.f54684m;
            if (z12 != l0Var2.f54684m) {
                if (z12) {
                    return -1;
                }
                return 1;
            }
            int i14 = l0Var.f54681j;
            int i15 = l0Var2.f54681j;
            if (i14 != i15) {
                return i15 - i14;
            }
            i10 = l0Var.f54667a.lastDrawnPosition;
            i11 = l0Var2.f54667a.lastDrawnPosition;
        }
        return i10 - i11;
    }
}

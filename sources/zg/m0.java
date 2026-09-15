package zg;

import java.util.Comparator;
public final class m0 implements Comparator {
    public long f49090a;

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        n0 n0Var = (n0) obj;
        n0 n0Var2 = (n0) obj2;
        if (this.f49090a >= 0) {
            boolean z10 = n0Var.f49108m;
            if (z10 != n0Var2.f49108m) {
                if (z10) {
                    return -1;
                }
                return 1;
            }
            boolean z11 = n0Var.Q;
            if (z11 != n0Var2.Q) {
                if (z11) {
                    return -1;
                }
                return 1;
            } else if (z11 && (i12 = n0Var.f49106k) != (i13 = n0Var2.f49106k)) {
                return i12 - i13;
            } else {
                i10 = n0Var.f49092a.lastDrawnPosition;
                i11 = n0Var2.f49092a.lastDrawnPosition;
            }
        } else {
            boolean z12 = n0Var.f49108m;
            if (z12 != n0Var2.f49108m) {
                if (z12) {
                    return -1;
                }
                return 1;
            }
            int i14 = n0Var.f49105j;
            int i15 = n0Var2.f49105j;
            if (i14 != i15) {
                return i15 - i14;
            }
            i10 = n0Var.f49092a.lastDrawnPosition;
            i11 = n0Var2.f49092a.lastDrawnPosition;
        }
        return i10 - i11;
    }
}

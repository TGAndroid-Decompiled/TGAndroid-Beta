package zg;

import java.util.Comparator;
public final class j0 implements Comparator {
    public long f53432a;

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        k0 k0Var = (k0) obj;
        k0 k0Var2 = (k0) obj2;
        if (this.f53432a >= 0) {
            boolean z10 = k0Var.f53451m;
            if (z10 != k0Var2.f53451m) {
                if (z10) {
                    return -1;
                }
                return 1;
            }
            boolean z11 = k0Var.Q;
            if (z11 != k0Var2.Q) {
                if (z11) {
                    return -1;
                }
                return 1;
            } else if (z11 && (i12 = k0Var.f53449k) != (i13 = k0Var2.f53449k)) {
                return i12 - i13;
            } else {
                i10 = k0Var.f53434a.lastDrawnPosition;
                i11 = k0Var2.f53434a.lastDrawnPosition;
            }
        } else {
            boolean z12 = k0Var.f53451m;
            if (z12 != k0Var2.f53451m) {
                if (z12) {
                    return -1;
                }
                return 1;
            }
            int i14 = k0Var.f53448j;
            int i15 = k0Var2.f53448j;
            if (i14 != i15) {
                return i15 - i14;
            }
            i10 = k0Var.f53434a.lastDrawnPosition;
            i11 = k0Var2.f53434a.lastDrawnPosition;
        }
        return i10 - i11;
    }
}

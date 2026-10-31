package sg;

import java.util.Comparator;
public final class l0 implements Comparator {
    public long f48388a;

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        m0 m0Var = (m0) obj;
        m0 m0Var2 = (m0) obj2;
        if (this.f48388a >= 0) {
            boolean z10 = m0Var.f48405l;
            if (z10 != m0Var2.f48405l) {
                if (z10) {
                    return -1;
                }
                return 1;
            }
            boolean z11 = m0Var.P;
            if (z11 != m0Var2.P) {
                if (z11) {
                    return -1;
                }
                return 1;
            } else if (z11 && (i12 = m0Var.f48403j) != (i13 = m0Var2.f48403j)) {
                return i12 - i13;
            } else {
                i10 = m0Var.f48391a.lastDrawnPosition;
                i11 = m0Var2.f48391a.lastDrawnPosition;
            }
        } else {
            boolean z12 = m0Var.f48405l;
            if (z12 != m0Var2.f48405l) {
                if (z12) {
                    return -1;
                }
                return 1;
            }
            int i14 = m0Var.f48402i;
            int i15 = m0Var2.f48402i;
            if (i14 != i15) {
                return i15 - i14;
            }
            i10 = m0Var.f48391a.lastDrawnPosition;
            i11 = m0Var2.f48391a.lastDrawnPosition;
        }
        return i10 - i11;
    }
}

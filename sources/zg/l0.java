package zg;

import java.util.Comparator;
public final class l0 implements Comparator {
    public long f49360a;

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        m0 m0Var = (m0) obj;
        m0 m0Var2 = (m0) obj2;
        if (this.f49360a >= 0) {
            boolean z10 = m0Var.f49378m;
            if (z10 != m0Var2.f49378m) {
                if (z10) {
                    return -1;
                }
                return 1;
            }
            boolean z11 = m0Var.Q;
            if (z11 != m0Var2.Q) {
                if (z11) {
                    return -1;
                }
                return 1;
            } else if (z11 && (i12 = m0Var.f49376k) != (i13 = m0Var2.f49376k)) {
                return i12 - i13;
            } else {
                i10 = m0Var.f49362a.lastDrawnPosition;
                i11 = m0Var2.f49362a.lastDrawnPosition;
            }
        } else {
            boolean z12 = m0Var.f49378m;
            if (z12 != m0Var2.f49378m) {
                if (z12) {
                    return -1;
                }
                return 1;
            }
            int i14 = m0Var.f49375j;
            int i15 = m0Var2.f49375j;
            if (i14 != i15) {
                return i15 - i14;
            }
            i10 = m0Var.f49362a.lastDrawnPosition;
            i11 = m0Var2.f49362a.lastDrawnPosition;
        }
        return i10 - i11;
    }
}

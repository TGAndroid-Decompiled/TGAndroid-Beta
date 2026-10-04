package p4;

import android.util.SparseArray;
public final class l0 implements Runnable {
    public final int f44206a;
    public final m0 f44207b;

    public l0(m0 m0Var, int i10) {
        this.f44206a = i10;
        this.f44207b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f44206a) {
            case 0:
                SparseArray sparseArray = this.f44207b.h;
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((o0) sparseArray.valueAt(i10)).getClass();
                    o0.a(null, null);
                }
                sparseArray.clear();
                return;
            default:
                m0 m0Var = this.f44207b;
                r0 r0Var = m0Var.f44215i;
                if (r0Var.f44248y == m0Var) {
                    r0Var.p();
                    return;
                }
                return;
        }
    }
}

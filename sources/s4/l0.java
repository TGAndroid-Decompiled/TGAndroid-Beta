package s4;

import android.util.SparseArray;
public final class l0 implements Runnable {
    public final int f54859a;
    public final m0 f54860b;

    public l0(m0 m0Var, int i7) {
        this.f54859a = i7;
        this.f54860b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f54859a) {
            case 0:
                SparseArray sparseArray = this.f54860b.h;
                int size = sparseArray.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((o0) sparseArray.valueAt(i7)).getClass();
                    o0.a(null, null);
                }
                sparseArray.clear();
                return;
            default:
                m0 m0Var = this.f54860b;
                r0 r0Var = m0Var.f54868i;
                if (r0Var.D == m0Var) {
                    r0Var.p();
                    return;
                }
                return;
        }
    }
}

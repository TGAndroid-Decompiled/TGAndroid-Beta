package s4;

import android.util.SparseArray;
public final class l0 implements Runnable {
    public final int f54731a;
    public final m0 f54732b;

    public l0(m0 m0Var, int i7) {
        this.f54731a = i7;
        this.f54732b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f54731a) {
            case 0:
                SparseArray sparseArray = this.f54732b.h;
                int size = sparseArray.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((o0) sparseArray.valueAt(i7)).getClass();
                    o0.a(null, null);
                }
                sparseArray.clear();
                return;
            default:
                m0 m0Var = this.f54732b;
                r0 r0Var = m0Var.f54740i;
                if (r0Var.D == m0Var) {
                    r0Var.p();
                    return;
                }
                return;
        }
    }
}

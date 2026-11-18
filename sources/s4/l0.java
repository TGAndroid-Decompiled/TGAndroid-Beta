package s4;

import android.util.SparseArray;
public final class l0 implements Runnable {
    public final int f56987a;
    public final m0 f56988b;

    public l0(m0 m0Var, int i7) {
        this.f56987a = i7;
        this.f56988b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f56987a) {
            case 0:
                SparseArray sparseArray = this.f56988b.f56995n;
                int size = sparseArray.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((o0) sparseArray.valueAt(i7)).getClass();
                    o0.a(null, null);
                }
                sparseArray.clear();
                return;
            default:
                m0 m0Var = this.f56988b;
                r0 r0Var = m0Var.f56996r;
                if (r0Var.E == m0Var) {
                    r0Var.p();
                    return;
                }
                return;
        }
    }
}

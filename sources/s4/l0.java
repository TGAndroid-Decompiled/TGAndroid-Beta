package s4;

import android.util.SparseArray;
public final class l0 implements Runnable {
    public final int f57113a;
    public final m0 f57114b;

    public l0(m0 m0Var, int i7) {
        this.f57113a = i7;
        this.f57114b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f57113a) {
            case 0:
                SparseArray sparseArray = this.f57114b.f57121n;
                int size = sparseArray.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((o0) sparseArray.valueAt(i7)).getClass();
                    o0.a(null, null);
                }
                sparseArray.clear();
                return;
            default:
                m0 m0Var = this.f57114b;
                r0 r0Var = m0Var.f57122r;
                if (r0Var.E == m0Var) {
                    r0Var.p();
                    return;
                }
                return;
        }
    }
}

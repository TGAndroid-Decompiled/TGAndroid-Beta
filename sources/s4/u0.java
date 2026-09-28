package s4;

import android.util.SparseArray;
public final class u0 {
    public final SparseArray f43088a = new SparseArray();
    public int f43089b = 0;

    public final void a() {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f43088a;
            if (i10 < sparseArray.size()) {
                ((t0) sparseArray.valueAt(i10)).f43075a.clear();
                i10++;
            } else {
                return;
            }
        }
    }

    public final t0 b(int i10) {
        SparseArray sparseArray = this.f43088a;
        t0 t0Var = (t0) sparseArray.get(i10);
        if (t0Var == null) {
            t0 t0Var2 = new t0();
            sparseArray.put(i10, t0Var2);
            return t0Var2;
        }
        return t0Var;
    }
}

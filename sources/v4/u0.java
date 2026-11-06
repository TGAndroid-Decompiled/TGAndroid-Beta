package v4;

import android.util.SparseArray;
public final class u0 {
    public final SparseArray f57055a = new SparseArray();
    public int f57056b = 0;

    public final void a() {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f57055a;
            if (i7 < sparseArray.size()) {
                ((t0) sparseArray.valueAt(i7)).f57041a.clear();
                i7++;
            } else {
                return;
            }
        }
    }

    public final t0 b(int i7) {
        SparseArray sparseArray = this.f57055a;
        t0 t0Var = (t0) sparseArray.get(i7);
        if (t0Var == null) {
            t0 t0Var2 = new t0();
            sparseArray.put(i7, t0Var2);
            return t0Var2;
        }
        return t0Var;
    }
}

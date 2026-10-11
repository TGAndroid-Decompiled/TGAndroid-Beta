package s4;

import android.util.SparseArray;
public final class v0 {
    public final SparseArray f47926a = new SparseArray();
    public int f47927b = 0;

    public final void a() {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f47926a;
            if (i10 < sparseArray.size()) {
                ((u0) sparseArray.valueAt(i10)).f47920a.clear();
                i10++;
            } else {
                return;
            }
        }
    }

    public final u0 b(int i10) {
        SparseArray sparseArray = this.f47926a;
        u0 u0Var = (u0) sparseArray.get(i10);
        if (u0Var == null) {
            u0 u0Var2 = new u0();
            sparseArray.put(i10, u0Var2);
            return u0Var2;
        }
        return u0Var;
    }
}

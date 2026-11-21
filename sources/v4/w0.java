package v4;

import android.util.SparseArray;
public final class w0 {
    public final SparseArray f59288a = new SparseArray();
    public int f59289b = 0;

    public final void a() {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f59288a;
            if (i7 < sparseArray.size()) {
                ((v0) sparseArray.valueAt(i7)).f59282a.clear();
                i7++;
            } else {
                return;
            }
        }
    }

    public final v0 b(int i7) {
        SparseArray sparseArray = this.f59288a;
        v0 v0Var = (v0) sparseArray.get(i7);
        if (v0Var == null) {
            v0 v0Var2 = new v0();
            sparseArray.put(i7, v0Var2);
            return v0Var2;
        }
        return v0Var;
    }
}

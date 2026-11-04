package u4;

import android.util.SparseArray;
public final class v0 {
    public final SparseArray f55672a = new SparseArray();
    public int f55673b = 0;

    public final void a() {
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f55672a;
            if (i3 < sparseArray.size()) {
                ((u0) sparseArray.valueAt(i3)).f55666a.clear();
                i3++;
            } else {
                return;
            }
        }
    }

    public final u0 b(int i3) {
        SparseArray sparseArray = this.f55672a;
        u0 u0Var = (u0) sparseArray.get(i3);
        if (u0Var == null) {
            u0 u0Var2 = new u0();
            sparseArray.put(i3, u0Var2);
            return u0Var2;
        }
        return u0Var;
    }
}

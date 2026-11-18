package p4;

import a8.la;
import android.util.SparseBooleanArray;
import h9.t1;
import java.util.HashSet;
public final class t {
    public static final l1 f55432e;
    public static final e2.y0 f55433f;
    public final l1 f55434a;
    public final e2.y0 f55435b;
    public final h9.i0 f55436c;
    public final h9.i0 d;

    static {
        int[] iArr;
        HashSet hashSet = new HashSet();
        t1 t1Var = k1.d;
        for (int i7 = 0; i7 < t1Var.d; i7++) {
            hashSet.add(new k1(((Integer) t1Var.get(i7)).intValue()));
        }
        f55432e = new l1(hashSet);
        HashSet hashSet2 = new HashSet();
        t1 t1Var2 = k1.f55317e;
        for (int i10 = 0; i10 < t1Var2.d; i10++) {
            hashSet2.add(new k1(((Integer) t1Var2.get(i10)).intValue()));
        }
        for (int i11 = 0; i11 < t1Var.d; i11++) {
            hashSet2.add(new k1(((Integer) t1Var.get(i11)).intValue()));
        }
        new l1(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i12 : e2.x0.f10795b) {
            la.p(!false);
            sparseBooleanArray.append(i12, true);
        }
        la.p(!false);
        f55433f = new e2.y0(new e2.s(sparseBooleanArray));
    }

    public t(l1 l1Var, e2.y0 y0Var, h9.i0 i0Var, h9.i0 i0Var2) {
        this.f55434a = l1Var;
        this.f55435b = y0Var;
        this.f55436c = i0Var;
        this.d = i0Var2;
    }
}

package p4;

import a8.ia;
import android.util.SparseBooleanArray;
import h9.t1;
import java.util.HashSet;
public final class t {
    public static final j1 f53456e;
    public static final e2.y0 f53457f;
    public final j1 f53458a;
    public final e2.y0 f53459b;
    public final h9.i0 f53460c;
    public final h9.i0 d;

    static {
        int[] iArr;
        HashSet hashSet = new HashSet();
        t1 t1Var = i1.d;
        for (int i7 = 0; i7 < t1Var.d; i7++) {
            hashSet.add(new i1(((Integer) t1Var.get(i7)).intValue()));
        }
        f53456e = new j1(hashSet);
        HashSet hashSet2 = new HashSet();
        t1 t1Var2 = i1.f53317e;
        for (int i10 = 0; i10 < t1Var2.d; i10++) {
            hashSet2.add(new i1(((Integer) t1Var2.get(i10)).intValue()));
        }
        for (int i11 = 0; i11 < t1Var.d; i11++) {
            hashSet2.add(new i1(((Integer) t1Var.get(i11)).intValue()));
        }
        new j1(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i12 : e2.x0.f10644b) {
            ia.p(!false);
            sparseBooleanArray.append(i12, true);
        }
        ia.p(!false);
        f53457f = new e2.y0(new e2.s(sparseBooleanArray));
    }

    public t(j1 j1Var, e2.y0 y0Var, h9.i0 i0Var, h9.i0 i0Var2) {
        this.f53458a = j1Var;
        this.f53459b = y0Var;
        this.f53460c = i0Var;
        this.d = i0Var2;
    }
}

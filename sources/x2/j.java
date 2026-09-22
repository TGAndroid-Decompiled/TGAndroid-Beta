package x2;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import b2.p1;
import b2.q1;
import e2.d0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Map;
import v7.z7;
public final class j extends q1 {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final String G0;
    public static final String H0;
    public static final String I0;
    public static final String J0;
    public static final String K0;
    public static final String L0;
    public static final String M0;
    public static final String N0;
    public static final String O0;
    public static final String P0;
    public static final String Q0;
    public static final j f45488x0 = new j(new i());
    public static final String f45489y0;
    public static final String f45490z0;
    public final boolean f45491o0;
    public final boolean f45492p0;
    public final boolean f45493q0;
    public final boolean f45494r0;
    public final boolean f45495s0;
    public final boolean f45496t0;
    public final boolean f45497u0;
    public final SparseArray f45498v0;
    public final SparseBooleanArray f45499w0;

    static {
        String str = d0.f7887a;
        f45489y0 = Integer.toString(1000, 36);
        f45490z0 = Integer.toString(1001, 36);
        A0 = Integer.toString(1002, 36);
        B0 = Integer.toString(1003, 36);
        C0 = Integer.toString(1004, 36);
        D0 = Integer.toString(1005, 36);
        E0 = Integer.toString(1006, 36);
        F0 = Integer.toString(1007, 36);
        G0 = Integer.toString(1008, 36);
        H0 = Integer.toString(1009, 36);
        I0 = Integer.toString(1010, 36);
        J0 = Integer.toString(1011, 36);
        K0 = Integer.toString(1012, 36);
        L0 = Integer.toString(1013, 36);
        M0 = Integer.toString(1014, 36);
        N0 = Integer.toString(1015, 36);
        O0 = Integer.toString(1016, 36);
        P0 = Integer.toString(1017, 36);
        Q0 = Integer.toString(1018, 36);
    }

    public j(i iVar) {
        super(iVar);
        this.f45491o0 = iVar.F;
        this.f45492p0 = iVar.G;
        this.f45493q0 = iVar.H;
        this.f45494r0 = iVar.I;
        this.f45495s0 = iVar.J;
        this.f45496t0 = iVar.K;
        this.f45497u0 = iVar.L;
        this.f45498v0 = iVar.M;
        this.f45499w0 = iVar.N;
    }

    @Override
    public final p1 a() {
        return new i(this);
    }

    @Override
    public final Bundle c() {
        Bundle c10 = super.c();
        c10.putBoolean(f45489y0, this.f45491o0);
        c10.putBoolean(f45490z0, false);
        c10.putBoolean(A0, this.f45492p0);
        c10.putBoolean(M0, false);
        c10.putBoolean(B0, this.f45493q0);
        c10.putBoolean(C0, false);
        c10.putBoolean(D0, false);
        c10.putBoolean(E0, false);
        c10.putBoolean(N0, false);
        c10.putBoolean(Q0, this.f45494r0);
        c10.putBoolean(O0, this.f45495s0);
        c10.putBoolean(F0, this.f45496t0);
        c10.putBoolean(G0, false);
        c10.putBoolean(H0, this.f45497u0);
        c10.putBoolean(P0, false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f45498v0;
            if (i10 < sparseArray2.size()) {
                int keyAt = sparseArray2.keyAt(i10);
                for (Map.Entry entry : ((Map) sparseArray2.valueAt(i10)).entrySet()) {
                    if (entry.getValue() == null) {
                        arrayList2.add((u2.p1) entry.getKey());
                        arrayList.add(Integer.valueOf(keyAt));
                    } else {
                        throw new ClassCastException();
                    }
                }
                c10.putIntArray(I0, z7.f(arrayList));
                c10.putParcelableArrayList(J0, e2.d.p(arrayList2, new h(0)));
                SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
                if (sparseArray.size() <= 0) {
                    c10.putSparseParcelableArray(K0, sparseArray3);
                    i10++;
                } else {
                    sparseArray.keyAt(0);
                    a4.a.y(sparseArray.valueAt(0));
                    throw null;
                }
            } else {
                SparseBooleanArray sparseBooleanArray = this.f45499w0;
                int[] iArr = new int[sparseBooleanArray.size()];
                for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
                    iArr[i11] = sparseBooleanArray.keyAt(i11);
                }
                c10.putIntArray(L0, iArr);
                return c10;
            }
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && j.class == obj.getClass()) {
                j jVar = (j) obj;
                if (super.equals(jVar) && this.f45491o0 == jVar.f45491o0 && this.f45492p0 == jVar.f45492p0 && this.f45493q0 == jVar.f45493q0 && this.f45494r0 == jVar.f45494r0 && this.f45495s0 == jVar.f45495s0 && this.f45496t0 == jVar.f45496t0 && this.f45497u0 == jVar.f45497u0) {
                    SparseBooleanArray sparseBooleanArray = jVar.f45499w0;
                    SparseBooleanArray sparseBooleanArray2 = this.f45499w0;
                    int size = sparseBooleanArray2.size();
                    if (sparseBooleanArray.size() == size) {
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i10)) < 0) {
                                    break;
                                }
                                i10++;
                            } else {
                                SparseArray sparseArray = jVar.f45498v0;
                                SparseArray sparseArray2 = this.f45498v0;
                                int size2 = sparseArray2.size();
                                if (sparseArray.size() == size2) {
                                    for (int i11 = 0; i11 < size2; i11++) {
                                        int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i11));
                                        if (indexOfKey >= 0) {
                                            Map map = (Map) sparseArray2.valueAt(i11);
                                            Map map2 = (Map) sparseArray.valueAt(indexOfKey);
                                            if (map2.size() == map.size()) {
                                                for (Map.Entry entry : map.entrySet()) {
                                                    u2.p1 p1Var = (u2.p1) entry.getKey();
                                                    if (map2.containsKey(p1Var)) {
                                                        if (!Objects.equals(entry.getValue(), map2.get(p1Var))) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f45491o0 ? 1 : 0)) * 961) + (this.f45492p0 ? 1 : 0)) * 961) + (this.f45493q0 ? 1 : 0)) * 28629151) + (this.f45494r0 ? 1 : 0)) * 31) + (this.f45495s0 ? 1 : 0)) * 31) + (this.f45496t0 ? 1 : 0)) * 961) + (this.f45497u0 ? 1 : 0)) * 31;
    }
}

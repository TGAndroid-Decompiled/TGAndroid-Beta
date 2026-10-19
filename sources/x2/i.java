package x2;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import b2.s1;
import b2.t1;
import e2.m0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Map;
import sg.y;
import u2.r1;
import v7.b8;
public final class i extends t1 {
    public static final i F0 = new i(new h());
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
    public static final String R0;
    public static final String S0;
    public static final String T0;
    public static final String U0;
    public static final String V0;
    public static final String W0;
    public static final String X0;
    public static final String Y0;
    public final boolean A0;
    public final boolean B0;
    public final boolean C0;
    public final SparseArray D0;
    public final SparseBooleanArray E0;
    public final boolean f49143w0;
    public final boolean f49144x0;
    public final boolean f49145y0;
    public final boolean f49146z0;

    static {
        String str = m0.f8252a;
        G0 = Integer.toString(1000, 36);
        H0 = Integer.toString(1001, 36);
        I0 = Integer.toString(1002, 36);
        J0 = Integer.toString(1003, 36);
        K0 = Integer.toString(1004, 36);
        L0 = Integer.toString(1005, 36);
        M0 = Integer.toString(1006, 36);
        N0 = Integer.toString(1007, 36);
        O0 = Integer.toString(1008, 36);
        P0 = Integer.toString(1009, 36);
        Q0 = Integer.toString(1010, 36);
        R0 = Integer.toString(1011, 36);
        S0 = Integer.toString(1012, 36);
        T0 = Integer.toString(1013, 36);
        U0 = Integer.toString(1014, 36);
        V0 = Integer.toString(1015, 36);
        W0 = Integer.toString(1016, 36);
        X0 = Integer.toString(1017, 36);
        Y0 = Integer.toString(1018, 36);
    }

    public i(h hVar) {
        super(hVar);
        this.f49143w0 = hVar.J;
        this.f49144x0 = hVar.K;
        this.f49145y0 = hVar.L;
        this.f49146z0 = hVar.M;
        this.A0 = hVar.N;
        this.B0 = hVar.O;
        this.C0 = hVar.P;
        this.D0 = hVar.Q;
        this.E0 = hVar.R;
    }

    @Override
    public final s1 a() {
        return new h(this);
    }

    @Override
    public final Bundle c() {
        Bundle c10 = super.c();
        c10.putBoolean(G0, this.f49143w0);
        c10.putBoolean(H0, false);
        c10.putBoolean(I0, this.f49144x0);
        c10.putBoolean(U0, false);
        c10.putBoolean(J0, this.f49145y0);
        c10.putBoolean(K0, false);
        c10.putBoolean(L0, false);
        c10.putBoolean(M0, false);
        c10.putBoolean(V0, false);
        c10.putBoolean(Y0, this.f49146z0);
        c10.putBoolean(W0, this.A0);
        c10.putBoolean(N0, this.B0);
        c10.putBoolean(O0, false);
        c10.putBoolean(P0, this.C0);
        c10.putBoolean(X0, false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray2 = this.D0;
            if (i10 < sparseArray2.size()) {
                int keyAt = sparseArray2.keyAt(i10);
                for (Map.Entry entry : ((Map) sparseArray2.valueAt(i10)).entrySet()) {
                    if (entry.getValue() == null) {
                        arrayList2.add((r1) entry.getKey());
                        arrayList.add(Integer.valueOf(keyAt));
                    } else {
                        throw new ClassCastException();
                    }
                }
                c10.putIntArray(Q0, b8.f(arrayList));
                c10.putParcelableArrayList(R0, e2.e.h(arrayList2, new y(26)));
                SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
                if (sparseArray.size() <= 0) {
                    c10.putSparseParcelableArray(S0, sparseArray3);
                    i10++;
                } else {
                    sparseArray.keyAt(0);
                    a1.g.z(sparseArray.valueAt(0));
                    throw null;
                }
            } else {
                SparseBooleanArray sparseBooleanArray = this.E0;
                int[] iArr = new int[sparseBooleanArray.size()];
                for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
                    iArr[i11] = sparseBooleanArray.keyAt(i11);
                }
                c10.putIntArray(T0, iArr);
                return c10;
            }
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && i.class == obj.getClass()) {
                i iVar = (i) obj;
                if (super.equals(iVar) && this.f49143w0 == iVar.f49143w0 && this.f49144x0 == iVar.f49144x0 && this.f49145y0 == iVar.f49145y0 && this.f49146z0 == iVar.f49146z0 && this.A0 == iVar.A0 && this.B0 == iVar.B0 && this.C0 == iVar.C0) {
                    SparseBooleanArray sparseBooleanArray = iVar.E0;
                    SparseBooleanArray sparseBooleanArray2 = this.E0;
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
                                SparseArray sparseArray = iVar.D0;
                                SparseArray sparseArray2 = this.D0;
                                int size2 = sparseArray2.size();
                                if (sparseArray.size() == size2) {
                                    for (int i11 = 0; i11 < size2; i11++) {
                                        int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i11));
                                        if (indexOfKey >= 0) {
                                            Map map = (Map) sparseArray2.valueAt(i11);
                                            Map map2 = (Map) sparseArray.valueAt(indexOfKey);
                                            if (map2.size() == map.size()) {
                                                for (Map.Entry entry : map.entrySet()) {
                                                    r1 r1Var = (r1) entry.getKey();
                                                    if (map2.containsKey(r1Var)) {
                                                        if (!Objects.equals(entry.getValue(), map2.get(r1Var))) {
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
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f49143w0 ? 1 : 0)) * 961) + (this.f49144x0 ? 1 : 0)) * 961) + (this.f49145y0 ? 1 : 0)) * 28629151) + (this.f49146z0 ? 1 : 0)) * 31) + (this.A0 ? 1 : 0)) * 31) + (this.B0 ? 1 : 0)) * 961) + (this.C0 ? 1 : 0)) * 31;
    }
}

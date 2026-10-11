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
import u2.n1;
import v7.v7;
public final class i extends q1 {
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
    public static final i f50581x0 = new i(new h());
    public static final String f50582y0;
    public static final String f50583z0;
    public final boolean f50584o0;
    public final boolean f50585p0;
    public final boolean f50586q0;
    public final boolean f50587r0;
    public final boolean f50588s0;
    public final boolean f50589t0;
    public final boolean f50590u0;
    public final SparseArray f50591v0;
    public final SparseBooleanArray f50592w0;

    static {
        String str = d0.f8531a;
        f50582y0 = Integer.toString(1000, 36);
        f50583z0 = Integer.toString(1001, 36);
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

    public i(h hVar) {
        super(hVar);
        this.f50584o0 = hVar.F;
        this.f50585p0 = hVar.G;
        this.f50586q0 = hVar.H;
        this.f50587r0 = hVar.I;
        this.f50588s0 = hVar.J;
        this.f50589t0 = hVar.K;
        this.f50590u0 = hVar.L;
        this.f50591v0 = hVar.M;
        this.f50592w0 = hVar.N;
    }

    @Override
    public final p1 a() {
        return new h(this);
    }

    @Override
    public final Bundle c() {
        Bundle c10 = super.c();
        c10.putBoolean(f50582y0, this.f50584o0);
        c10.putBoolean(f50583z0, false);
        c10.putBoolean(A0, this.f50585p0);
        c10.putBoolean(M0, false);
        c10.putBoolean(B0, this.f50586q0);
        c10.putBoolean(C0, false);
        c10.putBoolean(D0, false);
        c10.putBoolean(E0, false);
        c10.putBoolean(N0, false);
        c10.putBoolean(Q0, this.f50587r0);
        c10.putBoolean(O0, this.f50588s0);
        c10.putBoolean(F0, this.f50589t0);
        c10.putBoolean(G0, false);
        c10.putBoolean(H0, this.f50590u0);
        c10.putBoolean(P0, false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f50591v0;
            if (i10 < sparseArray2.size()) {
                int keyAt = sparseArray2.keyAt(i10);
                for (Map.Entry entry : ((Map) sparseArray2.valueAt(i10)).entrySet()) {
                    if (entry.getValue() == null) {
                        arrayList2.add((n1) entry.getKey());
                        arrayList.add(Integer.valueOf(keyAt));
                    } else {
                        throw new ClassCastException();
                    }
                }
                c10.putIntArray(I0, v7.f(arrayList));
                c10.putParcelableArrayList(J0, e2.d.p(arrayList2, new w9.v(1)));
                SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
                if (sparseArray.size() <= 0) {
                    c10.putSparseParcelableArray(K0, sparseArray3);
                    i10++;
                } else {
                    sparseArray.keyAt(0);
                    a1.g.z(sparseArray.valueAt(0));
                    throw null;
                }
            } else {
                SparseBooleanArray sparseBooleanArray = this.f50592w0;
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
            if (obj != null && i.class == obj.getClass()) {
                i iVar = (i) obj;
                if (super.equals(iVar) && this.f50584o0 == iVar.f50584o0 && this.f50585p0 == iVar.f50585p0 && this.f50586q0 == iVar.f50586q0 && this.f50587r0 == iVar.f50587r0 && this.f50588s0 == iVar.f50588s0 && this.f50589t0 == iVar.f50589t0 && this.f50590u0 == iVar.f50590u0) {
                    SparseBooleanArray sparseBooleanArray = iVar.f50592w0;
                    SparseBooleanArray sparseBooleanArray2 = this.f50592w0;
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
                                SparseArray sparseArray = iVar.f50591v0;
                                SparseArray sparseArray2 = this.f50591v0;
                                int size2 = sparseArray2.size();
                                if (sparseArray.size() == size2) {
                                    for (int i11 = 0; i11 < size2; i11++) {
                                        int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i11));
                                        if (indexOfKey >= 0) {
                                            Map map = (Map) sparseArray2.valueAt(i11);
                                            Map map2 = (Map) sparseArray.valueAt(indexOfKey);
                                            if (map2.size() == map.size()) {
                                                for (Map.Entry entry : map.entrySet()) {
                                                    n1 n1Var = (n1) entry.getKey();
                                                    if (map2.containsKey(n1Var)) {
                                                        if (!Objects.equals(entry.getValue(), map2.get(n1Var))) {
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
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f50584o0 ? 1 : 0)) * 961) + (this.f50585p0 ? 1 : 0)) * 961) + (this.f50586q0 ? 1 : 0)) * 28629151) + (this.f50587r0 ? 1 : 0)) * 31) + (this.f50588s0 ? 1 : 0)) * 31) + (this.f50589t0 ? 1 : 0)) * 961) + (this.f50590u0 ? 1 : 0)) * 31;
    }
}

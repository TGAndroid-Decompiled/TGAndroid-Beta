package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.Comparator;
public final class ut0 implements Comparator {
    public final int f42525a;
    public final org.telegram.messenger.vp f42526b;

    public ut0(org.telegram.messenger.vp vpVar, int i10) {
        this.f42525a = i10;
        this.f42526b = vpVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        eu0 eu0Var = (eu0) obj;
        eu0 eu0Var2 = (eu0) obj2;
        switch (this.f42525a) {
            case 0:
                SparseIntArray sparseIntArray = this.f42526b.O0;
                i10 = sparseIntArray.get(eu0Var.f37112a, Integer.MAX_VALUE);
                i11 = sparseIntArray.get(eu0Var2.f37112a, Integer.MAX_VALUE);
                break;
            default:
                SparseIntArray sparseIntArray2 = this.f42526b.N0;
                i10 = sparseIntArray2.get(eu0Var.f37112a, Integer.MAX_VALUE);
                i11 = sparseIntArray2.get(eu0Var2.f37112a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}

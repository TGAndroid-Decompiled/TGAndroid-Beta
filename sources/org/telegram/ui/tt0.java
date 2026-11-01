package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.Comparator;
public final class tt0 implements Comparator {
    public final int f41725a;
    public final org.telegram.messenger.wp f41726b;

    public tt0(org.telegram.messenger.wp wpVar, int i10) {
        this.f41725a = i10;
        this.f41726b = wpVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        du0 du0Var = (du0) obj;
        du0 du0Var2 = (du0) obj2;
        switch (this.f41725a) {
            case 0:
                SparseIntArray sparseIntArray = this.f41726b.O0;
                i10 = sparseIntArray.get(du0Var.f36680a, Integer.MAX_VALUE);
                i11 = sparseIntArray.get(du0Var2.f36680a, Integer.MAX_VALUE);
                break;
            default:
                SparseIntArray sparseIntArray2 = this.f41726b.N0;
                i10 = sparseIntArray2.get(du0Var.f36680a, Integer.MAX_VALUE);
                i11 = sparseIntArray2.get(du0Var2.f36680a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}

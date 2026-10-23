package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class y41 extends d51 {
    public final int f43712g3;
    public final b61 f43713h3;

    public y41(b61 b61Var, Context context, int i10) {
        super(b61Var, context);
        this.f43713h3 = b61Var;
        this.f43712g3 = i10;
    }

    @Override
    public final void j0(int i10) {
        int i11;
        b61 b61Var = this.f43713h3;
        s41 s41Var = b61Var.f35901f0;
        if (i10 == 0) {
            b61Var.f35941x1 = false;
            if (b61Var.f35887a != -1 && s41Var.getVisibility() == 0 && s41Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                if (s41Var.getTranslationY() > (-AndroidUtilities.dp(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                b61.a(b61Var, i11, 0);
            }
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        org.telegram.ui.Components.fy fyVar;
        int i13;
        int i14;
        b61 b61Var = this.f43713h3;
        b61Var.h();
        boolean z10 = false;
        if (!b61Var.f35941x1) {
            int I0 = b61Var.f35925r0.I0();
            ArrayList arrayList = b61Var.D0;
            SparseIntArray sparseIntArray = b61Var.f35937w0;
            if (I0 != -1) {
                int i15 = 40;
                if (arrayList.size() <= 40 || b61Var.C0) {
                    i15 = arrayList.size() + (b61Var.N0 ? 1 : 0);
                }
                if (I0 > i15 && I0 > b61Var.I0.size()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i16);
                        int valueAt = sparseIntArray.valueAt(i16);
                        if (valueAt >= 0) {
                            fyVar = (org.telegram.ui.Components.fy) b61Var.M0.get(valueAt);
                        } else {
                            fyVar = null;
                        }
                        if (fyVar != null) {
                            boolean z11 = fyVar.h;
                            int size = fyVar.f26470c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.kw kwVar = b61Var.f35896d0;
                                if (kwVar.f28171y != null) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                if (kwVar.E != null && kwVar.f28163b0) {
                                    i14 = 1;
                                } else {
                                    i14 = 0;
                                }
                                kwVar.j(i14 + i13 + valueAt, true);
                            }
                        }
                        i16++;
                    }
                } else {
                    b61Var.f35896d0.j(0, true);
                }
            }
        }
        b61Var.C();
        t41 t41Var = b61Var.f35898e0;
        if (b61Var.f35905h0.computeVerticalScrollOffset() != 0 || (i12 = this.f43712g3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6) {
            z10 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(t41Var, z10, 1.0f, true);
        b61Var.m();
    }
}

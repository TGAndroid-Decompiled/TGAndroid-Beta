package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class z41 extends e51 {
    public final int f46176n3;
    public final c61 f46177o3;

    public z41(c61 c61Var, Context context, int i10) {
        super(c61Var, context);
        this.f46177o3 = c61Var;
        this.f46176n3 = i10;
    }

    @Override
    public final void k0(int i10) {
        int i11;
        c61 c61Var = this.f46177o3;
        t41 t41Var = c61Var.f38295f0;
        if (i10 == 0) {
            c61Var.f38335x1 = false;
            if (c61Var.f38281a != -1 && t41Var.getVisibility() == 0 && t41Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                if (t41Var.getTranslationY() > (-AndroidUtilities.dp(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                c61.a(c61Var, i11, 0);
            }
        }
    }

    @Override
    public final void l0(int i10) {
        int i11;
        org.telegram.ui.Components.ey eyVar;
        int i12;
        int i13;
        c61 c61Var = this.f46177o3;
        c61Var.h();
        boolean z10 = false;
        if (!c61Var.f38335x1) {
            int I0 = c61Var.f38319r0.I0();
            ArrayList arrayList = c61Var.D0;
            SparseIntArray sparseIntArray = c61Var.f38331w0;
            if (I0 != -1) {
                int i14 = 40;
                if (arrayList.size() <= 40 || c61Var.C0) {
                    i14 = arrayList.size() + (c61Var.N0 ? 1 : 0);
                }
                if (I0 > i14 && I0 > c61Var.I0.size()) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i15);
                        int valueAt = sparseIntArray.valueAt(i15);
                        if (valueAt >= 0) {
                            eyVar = (org.telegram.ui.Components.ey) c61Var.M0.get(valueAt);
                        } else {
                            eyVar = null;
                        }
                        if (eyVar != null) {
                            boolean z11 = eyVar.h;
                            int size = eyVar.f28009c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.kw kwVar = c61Var.f38290d0;
                                if (kwVar.f29999y != null) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                if (kwVar.E != null && kwVar.f29991b0) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                kwVar.j(i13 + i12 + valueAt, true);
                            }
                        }
                        i15++;
                    }
                } else {
                    c61Var.f38290d0.j(0, true);
                }
            }
        }
        c61Var.C();
        u41 u41Var = c61Var.f38292e0;
        if (c61Var.f38299h0.computeVerticalScrollOffset() != 0 || (i11 = this.f46176n3) == 0 || i11 == 12 || i11 == 10 || i11 == 1 || i11 == 11 || i11 == 6) {
            z10 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(u41Var, z10, 1.0f, true);
        c61Var.m();
    }
}

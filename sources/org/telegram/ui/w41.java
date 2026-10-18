package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class w41 extends b51 {
    public final int f42382d3;
    public final z51 f42383e3;

    public w41(z51 z51Var, Context context, int i10) {
        super(z51Var, context);
        this.f42383e3 = z51Var;
        this.f42382d3 = i10;
    }

    @Override
    public final void j0(int i10) {
        int i11;
        z51 z51Var = this.f42383e3;
        q41 q41Var = z51Var.f43618f0;
        if (i10 == 0) {
            z51Var.f43655w1 = false;
            if (z51Var.f43604a != -1 && q41Var.getVisibility() == 0 && q41Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                if (q41Var.getTranslationY() > (-AndroidUtilities.dp(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                z51.a(z51Var, i11, 0);
            }
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        org.telegram.ui.Components.fy fyVar;
        int i13;
        int i14;
        z51 z51Var = this.f42383e3;
        z51Var.h();
        boolean z10 = false;
        if (!z51Var.f43655w1) {
            int I0 = z51Var.f43642r0.I0();
            ArrayList arrayList = z51Var.D0;
            SparseIntArray sparseIntArray = z51Var.f43654w0;
            if (I0 != -1) {
                int i15 = 40;
                if (arrayList.size() <= 40 || z51Var.C0) {
                    i15 = arrayList.size() + (z51Var.N0 ? 1 : 0);
                }
                if (I0 > i15 && I0 > z51Var.I0.size()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i16);
                        int valueAt = sparseIntArray.valueAt(i16);
                        if (valueAt >= 0) {
                            fyVar = (org.telegram.ui.Components.fy) z51Var.M0.get(valueAt);
                        } else {
                            fyVar = null;
                        }
                        if (fyVar != null) {
                            boolean z11 = fyVar.h;
                            int size = fyVar.f26412c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.kw kwVar = z51Var.f43613d0;
                                if (kwVar.f28018y != null) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                if (kwVar.E != null && kwVar.f28010b0) {
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
                    z51Var.f43613d0.j(0, true);
                }
            }
        }
        z51Var.C();
        r41 r41Var = z51Var.f43615e0;
        if (z51Var.f43622h0.computeVerticalScrollOffset() != 0 || (i12 = this.f42382d3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6) {
            z10 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(r41Var, z10, 1.0f, true);
        z51Var.m();
    }
}

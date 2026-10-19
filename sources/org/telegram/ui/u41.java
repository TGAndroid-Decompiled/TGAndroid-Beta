package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class u41 extends z41 {
    public final int f41815d3;
    public final x51 f41816e3;

    public u41(x51 x51Var, Context context, int i10) {
        super(x51Var, context);
        this.f41816e3 = x51Var;
        this.f41815d3 = i10;
    }

    @Override
    public final void j0(int i10) {
        int i11;
        x51 x51Var = this.f41816e3;
        o41 o41Var = x51Var.f43052f0;
        if (i10 == 0) {
            x51Var.f43089w1 = false;
            if (x51Var.f43038a != -1 && o41Var.getVisibility() == 0 && o41Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                if (o41Var.getTranslationY() > (-AndroidUtilities.dp(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                x51.a(x51Var, i11, 0);
            }
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        org.telegram.ui.Components.fy fyVar;
        int i13;
        int i14;
        x51 x51Var = this.f41816e3;
        x51Var.h();
        boolean z10 = false;
        if (!x51Var.f43089w1) {
            int I0 = x51Var.f43076r0.I0();
            ArrayList arrayList = x51Var.D0;
            SparseIntArray sparseIntArray = x51Var.f43088w0;
            if (I0 != -1) {
                int i15 = 40;
                if (arrayList.size() <= 40 || x51Var.C0) {
                    i15 = arrayList.size() + (x51Var.N0 ? 1 : 0);
                }
                if (I0 > i15 && I0 > x51Var.I0.size()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i16);
                        int valueAt = sparseIntArray.valueAt(i16);
                        if (valueAt >= 0) {
                            fyVar = (org.telegram.ui.Components.fy) x51Var.M0.get(valueAt);
                        } else {
                            fyVar = null;
                        }
                        if (fyVar != null) {
                            boolean z11 = fyVar.h;
                            int size = fyVar.f26397c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.kw kwVar = x51Var.f43047d0;
                                if (kwVar.f27992y != null) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                if (kwVar.E != null && kwVar.f27984b0) {
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
                    x51Var.f43047d0.j(0, true);
                }
            }
        }
        x51Var.C();
        p41 p41Var = x51Var.f43049e0;
        if (x51Var.f43056h0.computeVerticalScrollOffset() != 0 || (i12 = this.f41815d3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6) {
            z10 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(p41Var, z10, 1.0f, true);
        x51Var.m();
    }
}

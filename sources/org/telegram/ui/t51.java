package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class t51 extends y51 {
    public final int c3;
    public final w61 f41445d3;

    public t51(w61 w61Var, Context context, int i10) {
        super(w61Var, context);
        this.f41445d3 = w61Var;
        this.c3 = i10;
    }

    @Override
    public final void j0(int i10) {
        int i11;
        w61 w61Var = this.f41445d3;
        n51 n51Var = w61Var.f42309c0;
        if (i10 == 0) {
            w61Var.f42347t1 = false;
            if (w61Var.f42302a != -1 && n51Var.getVisibility() == 0 && n51Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                if (n51Var.getTranslationY() > (-AndroidUtilities.dp(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                w61.a(w61Var, i11, 0);
            }
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        org.telegram.ui.Components.xx xxVar;
        int i13;
        int i14;
        w61 w61Var = this.f41445d3;
        w61Var.h();
        boolean z4 = false;
        if (!w61Var.f42347t1) {
            int I0 = w61Var.f42334o0.I0();
            ArrayList arrayList = w61Var.A0;
            SparseIntArray sparseIntArray = w61Var.f42346t0;
            if (I0 != -1) {
                int i15 = 40;
                if (arrayList.size() <= 40 || w61Var.f42361z0) {
                    i15 = arrayList.size() + (w61Var.K0 ? 1 : 0);
                }
                if (I0 > i15 && I0 > w61Var.F0.size()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i16);
                        int valueAt = sparseIntArray.valueAt(i16);
                        if (valueAt >= 0) {
                            xxVar = (org.telegram.ui.Components.xx) w61Var.J0.get(valueAt);
                        } else {
                            xxVar = null;
                        }
                        if (xxVar != null) {
                            boolean z10 = xxVar.h;
                            int size = xxVar.f33213c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.zv zvVar = w61Var.f42303a0;
                                if (zvVar.f34026y != null) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                if (zvVar.B != null && zvVar.V) {
                                    i14 = 1;
                                } else {
                                    i14 = 0;
                                }
                                zvVar.j(i14 + i13 + valueAt, true);
                            }
                        }
                        i16++;
                    }
                } else {
                    w61Var.f42303a0.j(0, true);
                }
            }
        }
        w61Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(w61Var.f42306b0, (w61Var.f42314e0.computeVerticalScrollOffset() != 0 || (i12 = this.c3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6) ? true : true, 1.0f, true);
        w61Var.m();
    }
}

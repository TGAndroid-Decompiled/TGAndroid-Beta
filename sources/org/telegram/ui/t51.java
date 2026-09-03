package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class t51 extends y51 {
    public final int c3;
    public final x61 f38388d3;

    public t51(x61 x61Var, Context context, int i10) {
        super(x61Var, context);
        this.f38388d3 = x61Var;
        this.c3 = i10;
    }

    @Override
    public final void j0(int i10) {
        int i11;
        x61 x61Var = this.f38388d3;
        n51 n51Var = x61Var.f39858c0;
        if (i10 == 0) {
            x61Var.f39895t1 = false;
            if (x61Var.f39851a != -1 && n51Var.getVisibility() == 0 && n51Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                if (n51Var.getTranslationY() > (-AndroidUtilities.dp(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                x61.a(x61Var, i11, 0);
            }
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        org.telegram.ui.Components.vx vxVar;
        int i13;
        int i14;
        x61 x61Var = this.f38388d3;
        x61Var.h();
        boolean z4 = false;
        if (!x61Var.f39895t1) {
            int I0 = x61Var.f39882o0.I0();
            ArrayList arrayList = x61Var.A0;
            SparseIntArray sparseIntArray = x61Var.f39894t0;
            if (I0 != -1) {
                int i15 = 40;
                if (arrayList.size() <= 40 || x61Var.f39909z0) {
                    i15 = arrayList.size() + (x61Var.K0 ? 1 : 0);
                }
                if (I0 > i15 && I0 > x61Var.F0.size()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i16);
                        int valueAt = sparseIntArray.valueAt(i16);
                        if (valueAt >= 0) {
                            vxVar = (org.telegram.ui.Components.vx) x61Var.J0.get(valueAt);
                        } else {
                            vxVar = null;
                        }
                        if (vxVar != null) {
                            boolean z10 = vxVar.h;
                            int size = vxVar.f30065c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.wv wvVar = x61Var.f39852a0;
                                if (wvVar.f30360y != null) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                if (wvVar.B != null && wvVar.V) {
                                    i14 = 1;
                                } else {
                                    i14 = 0;
                                }
                                wvVar.j(i14 + i13 + valueAt, true);
                            }
                        }
                        i16++;
                    }
                } else {
                    x61Var.f39852a0.j(0, true);
                }
            }
        }
        x61Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(x61Var.f39855b0, (x61Var.f39862e0.computeVerticalScrollOffset() != 0 || (i12 = this.c3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6) ? true : true, 1.0f, true);
        x61Var.m();
    }
}

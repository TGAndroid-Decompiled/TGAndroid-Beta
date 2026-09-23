package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class w51 extends b61 {
    public final int f38545f3;
    public final z61 f38546g3;

    public w51(z61 z61Var, Context context, int i10) {
        super(z61Var, context);
        this.f38546g3 = z61Var;
        this.f38545f3 = i10;
    }

    @Override
    public final void j0(int i10) {
        int i11;
        z61 z61Var = this.f38546g3;
        q51 q51Var = z61Var.f40017f0;
        if (i10 == 0) {
            z61Var.f40054w1 = false;
            if (z61Var.f40003a != -1 && q51Var.getVisibility() == 0 && q51Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                if (q51Var.getTranslationY() > (-AndroidUtilities.dp(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                z61.a(z61Var, i11, 0);
            }
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        org.telegram.ui.Components.xx xxVar;
        int i13;
        int i14;
        z61 z61Var = this.f38546g3;
        z61Var.h();
        boolean z10 = false;
        if (!z61Var.f40054w1) {
            int I0 = z61Var.f40041r0.I0();
            ArrayList arrayList = z61Var.D0;
            SparseIntArray sparseIntArray = z61Var.f40053w0;
            if (I0 != -1) {
                int i15 = 40;
                if (arrayList.size() <= 40 || z61Var.C0) {
                    i15 = arrayList.size() + (z61Var.N0 ? 1 : 0);
                }
                if (I0 > i15 && I0 > z61Var.I0.size()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i16);
                        int valueAt = sparseIntArray.valueAt(i16);
                        if (valueAt >= 0) {
                            xxVar = (org.telegram.ui.Components.xx) z61Var.M0.get(valueAt);
                        } else {
                            xxVar = null;
                        }
                        if (xxVar != null) {
                            boolean z11 = xxVar.h;
                            int size = xxVar.f30089c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.dw dwVar = z61Var.f40012d0;
                                if (dwVar.f23478y != null) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                if (dwVar.E != null && dwVar.f23470b0) {
                                    i14 = 1;
                                } else {
                                    i14 = 0;
                                }
                                dwVar.j(i14 + i13 + valueAt, true);
                            }
                        }
                        i16++;
                    }
                } else {
                    z61Var.f40012d0.j(0, true);
                }
            }
        }
        z61Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(z61Var.f40014e0, (z61Var.f40021h0.computeVerticalScrollOffset() != 0 || (i12 = this.f38545f3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6) ? true : true, 1.0f, true);
        z61Var.m();
    }
}

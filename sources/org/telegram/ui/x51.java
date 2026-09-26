package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class x51 extends c61 {
    public final int f39839f3;
    public final a71 f39840g3;

    public x51(a71 a71Var, Context context, int i10) {
        super(a71Var, context);
        this.f39840g3 = a71Var;
        this.f39839f3 = i10;
    }

    @Override
    public final void j0(int i10) {
        int i11;
        a71 a71Var = this.f39840g3;
        r51 r51Var = a71Var.f32023f0;
        if (i10 == 0) {
            a71Var.f32060w1 = false;
            if (a71Var.f32009a != -1 && r51Var.getVisibility() == 0 && r51Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                if (r51Var.getTranslationY() > (-AndroidUtilities.dp(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                a71.a(a71Var, i11, 0);
            }
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        org.telegram.ui.Components.yx yxVar;
        int i13;
        int i14;
        a71 a71Var = this.f39840g3;
        a71Var.h();
        boolean z10 = false;
        if (!a71Var.f32060w1) {
            int I0 = a71Var.f32047r0.I0();
            ArrayList arrayList = a71Var.D0;
            SparseIntArray sparseIntArray = a71Var.f32059w0;
            if (I0 != -1) {
                int i15 = 40;
                if (arrayList.size() <= 40 || a71Var.C0) {
                    i15 = arrayList.size() + (a71Var.N0 ? 1 : 0);
                }
                if (I0 > i15 && I0 > a71Var.I0.size()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i16);
                        int valueAt = sparseIntArray.valueAt(i16);
                        if (valueAt >= 0) {
                            yxVar = (org.telegram.ui.Components.yx) a71Var.M0.get(valueAt);
                        } else {
                            yxVar = null;
                        }
                        if (yxVar != null) {
                            boolean z11 = yxVar.h;
                            int size = yxVar.f30716c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.dw dwVar = a71Var.f32018d0;
                                if (dwVar.f23748y != null) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                if (dwVar.E != null && dwVar.f23740b0) {
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
                    a71Var.f32018d0.j(0, true);
                }
            }
        }
        a71Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(a71Var.f32020e0, (a71Var.f32027h0.computeVerticalScrollOffset() != 0 || (i12 = this.f39839f3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6) ? true : true, 1.0f, true);
        a71Var.m();
    }
}

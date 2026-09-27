package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class z51 extends e61 {
    public final int f40406f3;
    public final c71 f40407g3;

    public z51(c71 c71Var, Context context, int i10) {
        super(c71Var, context);
        this.f40407g3 = c71Var;
        this.f40406f3 = i10;
    }

    @Override
    public final void k0(int i10) {
        int i11;
        c71 c71Var = this.f40407g3;
        t51 t51Var = c71Var.f32581f0;
        if (i10 == 0) {
            c71Var.f32618w1 = false;
            if (c71Var.f32567a != -1 && t51Var.getVisibility() == 0 && t51Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                if (t51Var.getTranslationY() > (-AndroidUtilities.dp(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                c71.a(c71Var, i11, 0);
            }
        }
    }

    @Override
    public final void l0(int i10) {
        int i11;
        org.telegram.ui.Components.yx yxVar;
        int i12;
        int i13;
        c71 c71Var = this.f40407g3;
        c71Var.h();
        boolean z10 = false;
        if (!c71Var.f32618w1) {
            int I0 = c71Var.f32605r0.I0();
            ArrayList arrayList = c71Var.D0;
            SparseIntArray sparseIntArray = c71Var.f32617w0;
            if (I0 != -1) {
                int i14 = 40;
                if (arrayList.size() <= 40 || c71Var.C0) {
                    i14 = arrayList.size() + (c71Var.N0 ? 1 : 0);
                }
                if (I0 > i14 && I0 > c71Var.I0.size()) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i15);
                        int valueAt = sparseIntArray.valueAt(i15);
                        if (valueAt >= 0) {
                            yxVar = (org.telegram.ui.Components.yx) c71Var.M0.get(valueAt);
                        } else {
                            yxVar = null;
                        }
                        if (yxVar != null) {
                            boolean z11 = yxVar.h;
                            int size = yxVar.f30796c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.ew ewVar = c71Var.f32576d0;
                                if (ewVar.f24145y != null) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                if (ewVar.E != null && ewVar.f24137b0) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                ewVar.j(i13 + i12 + valueAt, true);
                            }
                        }
                        i15++;
                    }
                } else {
                    c71Var.f32576d0.j(0, true);
                }
            }
        }
        c71Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(c71Var.f32578e0, (c71Var.f32585h0.computeVerticalScrollOffset() != 0 || (i11 = this.f40406f3) == 0 || i11 == 12 || i11 == 10 || i11 == 1 || i11 == 11 || i11 == 6) ? true : true, 1.0f, true);
        c71Var.m();
    }
}

package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class z51 extends e61 {
    public final int f43701m3;
    public final c71 f43702n3;

    public z51(c71 c71Var, Context context, int i10) {
        super(c71Var, context);
        this.f43702n3 = c71Var;
        this.f43701m3 = i10;
    }

    @Override
    public final void k0(int i10) {
        int i11;
        c71 c71Var = this.f43702n3;
        t51 t51Var = c71Var.f35310f0;
        if (i10 == 0) {
            c71Var.f35347w1 = false;
            if (c71Var.f35295a != -1 && t51Var.getVisibility() == 0 && t51Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
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
        org.telegram.ui.Components.ay ayVar;
        int i12;
        int i13;
        c71 c71Var = this.f43702n3;
        c71Var.h();
        boolean z10 = false;
        if (!c71Var.f35347w1) {
            int I0 = c71Var.f35334r0.I0();
            ArrayList arrayList = c71Var.D0;
            SparseIntArray sparseIntArray = c71Var.f35346w0;
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
                            ayVar = (org.telegram.ui.Components.ay) c71Var.M0.get(valueAt);
                        } else {
                            ayVar = null;
                        }
                        if (ayVar != null) {
                            boolean z11 = ayVar.h;
                            int size = ayVar.f24704c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.gw gwVar = c71Var.f35304d0;
                                if (gwVar.f26939y != null) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                if (gwVar.E != null && gwVar.f26931b0) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                gwVar.j(i13 + i12 + valueAt, true);
                            }
                        }
                        i15++;
                    }
                } else {
                    c71Var.f35304d0.j(0, true);
                }
            }
        }
        c71Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(c71Var.f35307e0, (c71Var.f35314h0.computeVerticalScrollOffset() != 0 || (i11 = this.f43701m3) == 0 || i11 == 12 || i11 == 10 || i11 == 1 || i11 == 11 || i11 == 6) ? true : true, 1.0f, true);
        c71Var.m();
    }
}

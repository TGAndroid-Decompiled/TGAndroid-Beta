package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class x51 extends c61 {
    public final int f42816m3;
    public final a71 f42817n3;

    public x51(a71 a71Var, Context context, int i10) {
        super(a71Var, context);
        this.f42817n3 = a71Var;
        this.f42816m3 = i10;
    }

    @Override
    public final void k0(int i10) {
        int i11;
        a71 a71Var = this.f42817n3;
        r51 r51Var = a71Var.f34735f0;
        if (i10 == 0) {
            a71Var.f34772w1 = false;
            if (a71Var.f34720a != -1 && r51Var.getVisibility() == 0 && r51Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
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
    public final void l0(int i10) {
        int i11;
        org.telegram.ui.Components.ay ayVar;
        int i12;
        int i13;
        a71 a71Var = this.f42817n3;
        a71Var.h();
        boolean z10 = false;
        if (!a71Var.f34772w1) {
            int I0 = a71Var.f34759r0.I0();
            ArrayList arrayList = a71Var.D0;
            SparseIntArray sparseIntArray = a71Var.f34771w0;
            if (I0 != -1) {
                int i14 = 40;
                if (arrayList.size() <= 40 || a71Var.C0) {
                    i14 = arrayList.size() + (a71Var.N0 ? 1 : 0);
                }
                if (I0 > i14 && I0 > a71Var.I0.size()) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i15);
                        int valueAt = sparseIntArray.valueAt(i15);
                        if (valueAt >= 0) {
                            ayVar = (org.telegram.ui.Components.ay) a71Var.M0.get(valueAt);
                        } else {
                            ayVar = null;
                        }
                        if (ayVar != null) {
                            boolean z11 = ayVar.h;
                            int size = ayVar.f24761c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.gw gwVar = a71Var.f34729d0;
                                if (gwVar.f27001y != null) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                if (gwVar.E != null && gwVar.f26993b0) {
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
                    a71Var.f34729d0.j(0, true);
                }
            }
        }
        a71Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(a71Var.f34732e0, (a71Var.f34739h0.computeVerticalScrollOffset() != 0 || (i11 = this.f42816m3) == 0 || i11 == 12 || i11 == 10 || i11 == 1 || i11 == 11 || i11 == 6) ? true : true, 1.0f, true);
        a71Var.m();
    }
}

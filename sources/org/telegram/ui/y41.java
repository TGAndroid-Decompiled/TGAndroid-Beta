package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class y41 extends d51 {
    public final int f44724b3;
    public final b61 f44725c3;

    public y41(b61 b61Var, Context context, int i9) {
        super(b61Var, context);
        this.f44725c3 = b61Var;
        this.f44724b3 = i9;
    }

    @Override
    public final void j0(int i9) {
        int i10;
        b61 b61Var = this.f44725c3;
        s41 s41Var = b61Var.f36664b0;
        if (i9 == 0) {
            b61Var.f36703s1 = false;
            if (b61Var.f36660a != -1 && s41Var.getVisibility() == 0 && s41Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                if (s41Var.getTranslationY() > (-AndroidUtilities.dp(16.0f))) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                b61.a(b61Var, i10, 0);
            }
        }
    }

    @Override
    public final void k0(int i9, int i10) {
        int i11;
        org.telegram.ui.Components.jx jxVar;
        int i12;
        int i13;
        b61 b61Var = this.f44725c3;
        b61Var.h();
        boolean z10 = false;
        if (!b61Var.f36703s1) {
            int I0 = b61Var.f36690n0.I0();
            ArrayList arrayList = b61Var.f36719z0;
            SparseIntArray sparseIntArray = b61Var.f36702s0;
            if (I0 != -1) {
                int i14 = 40;
                if (arrayList.size() <= 40 || b61Var.f36717y0) {
                    i14 = arrayList.size() + (b61Var.J0 ? 1 : 0);
                }
                if (I0 > i14 && I0 > b61Var.E0.size()) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i15);
                        int valueAt = sparseIntArray.valueAt(i15);
                        if (valueAt >= 0) {
                            jxVar = (org.telegram.ui.Components.jx) b61Var.I0.get(valueAt);
                        } else {
                            jxVar = null;
                        }
                        if (jxVar != null) {
                            boolean z11 = jxVar.h;
                            int size = jxVar.f29866c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.nv nvVar = b61Var.W;
                                if (nvVar.f31189y != null) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                if (nvVar.A != null && nvVar.U) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                nvVar.j(i13 + i12 + valueAt, true);
                            }
                        }
                        i15++;
                    }
                } else {
                    b61Var.W.j(0, true);
                }
            }
        }
        b61Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(b61Var.f36661a0, (b61Var.f36669d0.computeVerticalScrollOffset() != 0 || (i11 = this.f44724b3) == 0 || i11 == 12 || i11 == 10 || i11 == 1 || i11 == 11 || i11 == 6) ? true : true, 1.0f, true);
        b61Var.m();
    }
}

package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class x41 extends c51 {
    public final int f43470g3;
    public final a61 f43471h3;

    public x41(a61 a61Var, Context context, int i10) {
        super(a61Var, context);
        this.f43471h3 = a61Var;
        this.f43470g3 = i10;
    }

    @Override
    public final void j0(int i10) {
        int i11;
        a61 a61Var = this.f43471h3;
        r41 r41Var = a61Var.f35618f0;
        if (i10 == 0) {
            a61Var.f35658x1 = false;
            if (a61Var.f35604a != -1 && r41Var.getVisibility() == 0 && r41Var.getTranslationY() > (-AndroidUtilities.dp(51.0f))) {
                if (r41Var.getTranslationY() > (-AndroidUtilities.dp(16.0f))) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                a61.a(a61Var, i11, 0);
            }
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        org.telegram.ui.Components.dy dyVar;
        int i13;
        int i14;
        a61 a61Var = this.f43471h3;
        a61Var.h();
        boolean z10 = false;
        if (!a61Var.f35658x1) {
            int I0 = a61Var.f35642r0.I0();
            ArrayList arrayList = a61Var.D0;
            SparseIntArray sparseIntArray = a61Var.f35654w0;
            if (I0 != -1) {
                int i15 = 40;
                if (arrayList.size() <= 40 || a61Var.C0) {
                    i15 = arrayList.size() + (a61Var.N0 ? 1 : 0);
                }
                if (I0 > i15 && I0 > a61Var.I0.size()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i16);
                        int valueAt = sparseIntArray.valueAt(i16);
                        if (valueAt >= 0) {
                            dyVar = (org.telegram.ui.Components.dy) a61Var.M0.get(valueAt);
                        } else {
                            dyVar = null;
                        }
                        if (dyVar != null) {
                            boolean z11 = dyVar.h;
                            int size = dyVar.f25857c.size();
                            if (!z11) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.iw iwVar = a61Var.f35613d0;
                                if (iwVar.f27507y != null) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                if (iwVar.E != null && iwVar.f27499b0) {
                                    i14 = 1;
                                } else {
                                    i14 = 0;
                                }
                                iwVar.j(i14 + i13 + valueAt, true);
                            }
                        }
                        i16++;
                    }
                } else {
                    a61Var.f35613d0.j(0, true);
                }
            }
        }
        a61Var.C();
        s41 s41Var = a61Var.f35615e0;
        if (a61Var.f35622h0.computeVerticalScrollOffset() != 0 || (i12 = this.f43470g3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6) {
            z10 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(s41Var, z10, 1.0f, true);
        a61Var.m();
    }
}

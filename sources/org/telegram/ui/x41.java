package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public final class x41 extends c51 {

    public final int f44281b3;

    public final a61 f44282c3;

    public x41(a61 a61Var, Context context, int i10) {
        super(a61Var, context);
        this.f44282c3 = a61Var;
        this.f44281b3 = i10;
    }

    @Override
    public final void j0(int i10) {
        a61 a61Var = this.f44282c3;
        r41 r41Var = a61Var.f36387b0;
        if (i10 == 0) {
            a61Var.f36426s1 = false;
            if (a61Var.f36383a == -1 || r41Var.getVisibility() != 0 || r41Var.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                return;
            }
            a61.a(a61Var, r41Var.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        a61 a61Var = this.f44282c3;
        a61Var.h();
        if (!a61Var.f36426s1) {
            int iI0 = a61Var.f36413n0.I0();
            ArrayList arrayList = a61Var.f36442z0;
            SparseIntArray sparseIntArray = a61Var.f36425s0;
            if (iI0 != -1) {
                if (iI0 <= ((arrayList.size() <= 40 || a61Var.f36440y0) ? arrayList.size() + (a61Var.J0 ? 1 : 0) : 40) || iI0 <= a61Var.E0.size()) {
                    a61Var.W.j(0, true);
                } else {
                    for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                        int iKeyAt = sparseIntArray.keyAt(i13);
                        int iValueAt = sparseIntArray.valueAt(i13);
                        org.telegram.ui.Components.kx kxVar = iValueAt >= 0 ? (org.telegram.ui.Components.kx) a61Var.I0.get(iValueAt) : null;
                        if (kxVar != null) {
                            boolean z10 = kxVar.h;
                            int size = kxVar.f30206c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (iI0 > iKeyAt && iI0 <= iKeyAt + 1 + size) {
                                org.telegram.ui.Components.mv mvVar = a61Var.W;
                                mvVar.j(((mvVar.A == null || !mvVar.V) ? 0 : 1) + (mvVar.f30759y != null ? 1 : 0) + iValueAt, true);
                                break;
                            }
                        }
                    }
                }
            }
        }
        a61Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(a61Var.f36384a0, a61Var.f36392d0.computeVerticalScrollOffset() != 0 || (i12 = this.f44281b3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6, 1.0f, true);
        a61Var.m();
    }
}

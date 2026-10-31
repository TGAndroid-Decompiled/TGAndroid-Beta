package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class v71 extends org.telegram.ui.Cells.ga {
    public final int f42673q3 = 1;
    public final Object f42674r3;

    public v71(Context context, org.telegram.ui.ActionBar.k2 k2Var, ArrayList arrayList, ArrayList arrayList2, l2.f fVar) {
        super(context, k2Var, 2, arrayList, arrayList2);
        this.f42674r3 = fVar;
    }

    @Override
    public void C1(org.telegram.ui.ActionBar.s6 s6Var) {
        boolean z10;
        String L0;
        String str;
        char c10;
        String str2;
        int[] iArr;
        boolean z11;
        CharSequence[] charSequenceArr;
        switch (this.f42673q3) {
            case 0:
                x71 x71Var = ((x71) this.f42674r3).e.f34087a;
                ThemeActivity themeActivity = x71Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((s6Var.F == null || s6Var.U) && themeActivity.f34095f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (s6Var.f20803b == null) {
                            charSequenceArr = new CharSequence[]{null, org.telegram.messenger.cd.L0(2131750859, "ExportTheme")};
                            iArr = new int[]{0, 2131232364};
                            z11 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = s6Var.F;
                            if (tL_theme != null && tL_theme.isDefault) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            String L02 = org.telegram.messenger.cd.L0(2131745477, "ShareFile");
                            String L03 = org.telegram.messenger.cd.L0(2131750859, "ExportTheme");
                            TLRPC.TL_theme tL_theme2 = s6Var.F;
                            if (tL_theme2 != null && (tL_theme2.isDefault || !tL_theme2.creator)) {
                                L0 = null;
                            } else {
                                L0 = org.telegram.messenger.cd.L0(2131751336, "Edit");
                            }
                            TLRPC.TL_theme tL_theme3 = s6Var.F;
                            if (tL_theme3 != null && tL_theme3.creator) {
                                str = org.telegram.messenger.cd.L0(2131744170, "ThemeSetUrl");
                            } else {
                                str = null;
                            }
                            if (z10) {
                                c10 = 1;
                                str2 = org.telegram.messenger.cd.L0(2131751599, "Delete");
                            } else {
                                c10 = 1;
                                str2 = null;
                            }
                            CharSequence[] charSequenceArr2 = new CharSequence[5];
                            charSequenceArr2[0] = L02;
                            charSequenceArr2[c10] = L03;
                            charSequenceArr2[2] = L0;
                            charSequenceArr2[3] = str;
                            charSequenceArr2[4] = str2;
                            int[] iArr2 = new int[5];
                            iArr2[0] = 2131232362;
                            iArr2[c10] = 2131232364;
                            iArr2[2] = 2131232115;
                            iArr2[3] = 2131232202;
                            iArr2[4] = 2131232107;
                            iArr = iArr2;
                            z11 = z10;
                            charSequenceArr = charSequenceArr2;
                        }
                        eg.j jVar = new eg.j(14, x71Var, s6Var);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        x1Var.P = charSequenceArr;
                        x1Var.Q = iArr;
                        x1Var.M = jVar;
                        themeActivity.showDialog(x1Var);
                        if (z11) {
                            x1Var.m(x1Var.P0.size() - 1, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21170q7, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21153p7, false));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void D1() {
        switch (this.f42673q3) {
            case 0:
                ((x71) this.f42674r3).e.E0(false);
                return;
            default:
                ((org.telegram.ui.ActionBar.z2) ((l2.f) this.f42674r3).f11587b).f21621x0.run();
                return;
        }
    }

    public v71(x71 x71Var, Context context, org.telegram.ui.ActionBar.k2 k2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, k2Var, i10, arrayList, arrayList2);
        this.f42674r3 = x71Var;
    }
}

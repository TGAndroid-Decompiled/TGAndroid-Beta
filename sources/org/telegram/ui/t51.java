package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class t51 extends org.telegram.ui.Cells.ga {
    public final int f49711r3 = 1;
    public final Object f49712s3;

    public t51(Context context, org.telegram.ui.ActionBar.d2 d2Var, ArrayList arrayList, ArrayList arrayList2, hi.d dVar) {
        super(context, d2Var, 2, arrayList, arrayList2);
        this.f49712s3 = dVar;
    }

    @Override
    public void C1(org.telegram.ui.ActionBar.j6 j6Var) {
        boolean z10;
        String M0;
        String str;
        char c2;
        String str2;
        int[] iArr;
        boolean z11;
        CharSequence[] charSequenceArr;
        switch (this.f49711r3) {
            case 0:
                v51 v51Var = ((v51) this.f49712s3).f50398e.f42041a;
                ThemeActivity themeActivity = v51Var.f50398e;
                if (themeActivity.getParentActivity() != null) {
                    if ((j6Var.G == null || j6Var.V) && themeActivity.f42050f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (j6Var.f27677b == null) {
                            charSequenceArr = new CharSequence[]{null, org.telegram.messenger.bd.M0(2131750859, "ExportTheme")};
                            iArr = new int[]{0, 2131232365};
                            z11 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = j6Var.G;
                            if (tL_theme != null && tL_theme.isDefault) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            String M02 = org.telegram.messenger.bd.M0(2131745469, "ShareFile");
                            String M03 = org.telegram.messenger.bd.M0(2131750859, "ExportTheme");
                            TLRPC.TL_theme tL_theme2 = j6Var.G;
                            if (tL_theme2 != null && (tL_theme2.isDefault || !tL_theme2.creator)) {
                                M0 = null;
                            } else {
                                M0 = org.telegram.messenger.bd.M0(2131751336, "Edit");
                            }
                            TLRPC.TL_theme tL_theme3 = j6Var.G;
                            if (tL_theme3 != null && tL_theme3.creator) {
                                str = org.telegram.messenger.bd.M0(2131744155, "ThemeSetUrl");
                            } else {
                                str = null;
                            }
                            if (z10) {
                                c2 = 1;
                                str2 = org.telegram.messenger.bd.M0(2131751599, "Delete");
                            } else {
                                c2 = 1;
                                str2 = null;
                            }
                            CharSequence[] charSequenceArr2 = new CharSequence[5];
                            charSequenceArr2[0] = M02;
                            charSequenceArr2[c2] = M03;
                            charSequenceArr2[2] = M0;
                            charSequenceArr2[3] = str;
                            charSequenceArr2[4] = str2;
                            int[] iArr2 = new int[5];
                            iArr2[0] = 2131232363;
                            iArr2[c2] = 2131232365;
                            iArr2[2] = 2131232116;
                            iArr2[3] = 2131232203;
                            iArr2[4] = 2131232108;
                            iArr = iArr2;
                            z11 = z10;
                            charSequenceArr = charSequenceArr2;
                        }
                        u uVar = new u(12, v51Var, j6Var);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.Q = charSequenceArr;
                        s1Var.R = iArr;
                        s1Var.N = uVar;
                        themeActivity.showDialog(s1Var);
                        if (z11) {
                            s1Var.m(s1Var.Q0.size() - 1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28122q7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28102p7, false));
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
        switch (this.f49711r3) {
            case 0:
                ((v51) this.f49712s3).f50398e.F0(false);
                return;
            default:
                ((org.telegram.ui.ActionBar.t2) ((hi.d) this.f49712s3).f14429b).f28625y0.run();
                return;
        }
    }

    public t51(v51 v51Var, Context context, org.telegram.ui.ActionBar.d2 d2Var, int i3, ArrayList arrayList, ArrayList arrayList2) {
        super(context, d2Var, i3, arrayList, arrayList2);
        this.f49712s3 = v51Var;
    }
}

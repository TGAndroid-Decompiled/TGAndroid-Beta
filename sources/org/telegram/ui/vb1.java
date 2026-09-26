package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vb1 extends org.telegram.ui.Cells.pa {
    public final int j3 = 1;
    public final Object f38686k3;

    public vb1(Context context, org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList, ArrayList arrayList2, org.telegram.ui.ActionBar.z2 z2Var) {
        super(context, m2Var, 2, arrayList, arrayList2);
        this.f38686k3 = z2Var;
    }

    @Override
    public final void A1() {
        Runnable runnable;
        switch (this.j3) {
            case 0:
                ((yb1) this.f38686k3).e.A0(false);
                return;
            default:
                runnable = ((org.telegram.ui.ActionBar.z2) this.f38686k3).f19949a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    @Override
    public void z1(org.telegram.ui.ActionBar.g6 g6Var) {
        boolean z10;
        String string;
        String str;
        String str2;
        CharSequence[] charSequenceArr;
        boolean z11;
        int[] iArr;
        switch (this.j3) {
            case 0:
                yb1 yb1Var = ((yb1) this.f38686k3).e.f31834a;
                ThemeActivity themeActivity = yb1Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((g6Var.F == null || g6Var.U) && themeActivity.f31842f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (g6Var.f18934b == null) {
                            charSequenceArr = new CharSequence[]{null, LocaleController.getString("ExportTheme", R.string.ExportTheme)};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z11 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = g6Var.F;
                            if (tL_theme != null && tL_theme.isDefault) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            String string2 = LocaleController.getString("ShareFile", R.string.ShareFile);
                            String string3 = LocaleController.getString("ExportTheme", R.string.ExportTheme);
                            TLRPC.TL_theme tL_theme2 = g6Var.F;
                            if (tL_theme2 != null && (tL_theme2.isDefault || !tL_theme2.creator)) {
                                string = null;
                            } else {
                                string = LocaleController.getString("Edit", R.string.Edit);
                            }
                            TLRPC.TL_theme tL_theme3 = g6Var.F;
                            if (tL_theme3 != null && tL_theme3.creator) {
                                str = LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl);
                            } else {
                                str = null;
                            }
                            if (z10) {
                                str2 = LocaleController.getString("Delete", R.string.Delete);
                            } else {
                                str2 = null;
                            }
                            boolean z12 = z10;
                            charSequenceArr = new CharSequence[]{string2, string3, string, str, str2};
                            z11 = z12;
                            iArr = new int[]{R.drawable.msg_share, R.drawable.msg_shareout, R.drawable.msg_edit, R.drawable.msg_link, R.drawable.msg_delete};
                        }
                        lg.j jVar = new lg.j(13, yb1Var, g6Var);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
                        a2Var.P = charSequenceArr;
                        a2Var.Q = iArr;
                        a2Var.M = jVar;
                        themeActivity.showDialog(a2Var);
                        if (z11) {
                            a2Var.l(a2Var.N0.size() - 1, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19298q7, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19279p7, false));
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

    public vb1(yb1 yb1Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, m2Var, i10, arrayList, arrayList2);
        this.f38686k3 = yb1Var;
    }
}

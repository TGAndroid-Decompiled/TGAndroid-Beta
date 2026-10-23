package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wa1 extends org.telegram.ui.Cells.na {
    public final int f42987k3 = 1;
    public final Object f42988l3;

    public wa1(Context context, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList, ArrayList arrayList2, org.telegram.ui.ActionBar.b3 b3Var) {
        super(context, o2Var, 2, arrayList, arrayList2);
        this.f42988l3 = b3Var;
    }

    @Override
    public void F1(org.telegram.ui.ActionBar.j6 j6Var) {
        boolean z10;
        String string;
        String str;
        String str2;
        CharSequence[] charSequenceArr;
        boolean z11;
        int[] iArr;
        switch (this.f42987k3) {
            case 0:
                za1 za1Var = ((za1) this.f42988l3).e.f34198a;
                ThemeActivity themeActivity = za1Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((j6Var.F == null || j6Var.U) && themeActivity.f34206f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (j6Var.f21021b == null) {
                            charSequenceArr = new CharSequence[]{null, LocaleController.getString("ExportTheme", R.string.ExportTheme)};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z11 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = j6Var.F;
                            if (tL_theme != null && tL_theme.isDefault) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            String string2 = LocaleController.getString("ShareFile", R.string.ShareFile);
                            String string3 = LocaleController.getString("ExportTheme", R.string.ExportTheme);
                            TLRPC.TL_theme tL_theme2 = j6Var.F;
                            if (tL_theme2 != null && (tL_theme2.isDefault || !tL_theme2.creator)) {
                                string = null;
                            } else {
                                string = LocaleController.getString("Edit", R.string.Edit);
                            }
                            TLRPC.TL_theme tL_theme3 = j6Var.F;
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
                        mg.j jVar = new mg.j(13, za1Var, j6Var);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                        c2Var.P = charSequenceArr;
                        c2Var.Q = iArr;
                        c2Var.M = jVar;
                        themeActivity.showDialog(c2Var);
                        if (z11) {
                            c2Var.m(c2Var.P0.size() - 1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21421q7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21404p7, false));
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
    public final void G1() {
        Runnable runnable;
        switch (this.f42987k3) {
            case 0:
                ((za1) this.f42988l3).e.A0(false);
                return;
            default:
                runnable = ((org.telegram.ui.ActionBar.b3) this.f42988l3).f20728a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public wa1(za1 za1Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, o2Var, i10, arrayList, arrayList2);
        this.f42988l3 = za1Var;
    }
}

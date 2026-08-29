package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class va1 extends org.telegram.ui.Cells.ja {
    public final int f43492f3 = 1;
    public final Object f43493g3;

    public va1(Context context, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList, ArrayList arrayList2, org.telegram.ui.ActionBar.a3 a3Var) {
        super(context, o2Var, 2, arrayList, arrayList2);
        this.f43493g3 = a3Var;
    }

    @Override
    public final void A1() {
        Runnable runnable;
        switch (this.f43492f3) {
            case 0:
                ((ya1) this.f43493g3).f44825e.A0(false);
                return;
            default:
                runnable = ((org.telegram.ui.ActionBar.a3) this.f43493g3).f22729a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    @Override
    public void z1(org.telegram.ui.ActionBar.f6 f6Var) {
        boolean z10;
        String string;
        String str;
        String str2;
        CharSequence[] charSequenceArr;
        boolean z11;
        int[] iArr;
        switch (this.f43492f3) {
            case 0:
                ya1 ya1Var = ((ya1) this.f43493g3).f44825e.f36290a;
                ThemeActivity themeActivity = ya1Var.f44825e;
                if (themeActivity.getParentActivity() != null) {
                    if ((f6Var.B == null || f6Var.Q) && themeActivity.f36299f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (f6Var.f22943b == null) {
                            charSequenceArr = new CharSequence[]{null, LocaleController.getString("ExportTheme", R.string.ExportTheme)};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z11 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = f6Var.B;
                            if (tL_theme != null && tL_theme.isDefault) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            String string2 = LocaleController.getString("ShareFile", R.string.ShareFile);
                            String string3 = LocaleController.getString("ExportTheme", R.string.ExportTheme);
                            TLRPC.TL_theme tL_theme2 = f6Var.B;
                            if (tL_theme2 != null && (tL_theme2.isDefault || !tL_theme2.creator)) {
                                string = null;
                            } else {
                                string = LocaleController.getString("Edit", R.string.Edit);
                            }
                            TLRPC.TL_theme tL_theme3 = f6Var.B;
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
                        ag.y1 y1Var = new ag.y1(12, ya1Var, f6Var);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                        c2Var.L = charSequenceArr;
                        c2Var.M = iArr;
                        c2Var.I = y1Var;
                        themeActivity.showDialog(c2Var);
                        if (z11) {
                            c2Var.l(c2Var.J0.size() - 1, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23279p7, false));
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

    public va1(ya1 ya1Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, o2Var, i10, arrayList, arrayList2);
        this.f43493g3 = ya1Var;
    }
}

package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class sa1 extends org.telegram.ui.Cells.ia {

    public final int f42564f3 = 1;

    public final Object f42565g3;

    public sa1(Context context, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, ArrayList arrayList2, org.telegram.ui.ActionBar.z2 z2Var) {
        super(context, n2Var, 2, arrayList, arrayList2);
        this.f42565g3 = z2Var;
    }

    @Override
    public final void A1() {
        switch (this.f42564f3) {
            case 0:
                ((va1) this.f42565g3).f43398e.A0(false);
                break;
            default:
                ((org.telegram.ui.ActionBar.z2) this.f42565g3).f23994a.dismissRunnable.run();
                break;
        }
    }

    @Override
    public void z1(org.telegram.ui.ActionBar.f6 f6Var) {
        CharSequence[] charSequenceArr;
        boolean z10;
        int[] iArr;
        switch (this.f42564f3) {
            case 0:
                va1 va1Var = ((va1) this.f42565g3).f43398e.f36228a;
                ThemeActivity themeActivity = va1Var.f43398e;
                if (themeActivity.getParentActivity() != null) {
                    if ((f6Var.B == null || f6Var.Q) && themeActivity.f36237f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (f6Var.f22943b == null) {
                            charSequenceArr = new CharSequence[]{null, LocaleController.getString("ExportTheme", R.string.ExportTheme)};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z10 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = f6Var.B;
                            boolean z11 = tL_theme == null || !tL_theme.isDefault;
                            String string = LocaleController.getString("ShareFile", R.string.ShareFile);
                            String string2 = LocaleController.getString("ExportTheme", R.string.ExportTheme);
                            TLRPC.TL_theme tL_theme2 = f6Var.B;
                            String string3 = (tL_theme2 == null || (!tL_theme2.isDefault && tL_theme2.creator)) ? LocaleController.getString("Edit", R.string.Edit) : null;
                            TLRPC.TL_theme tL_theme3 = f6Var.B;
                            boolean z12 = z11;
                            charSequenceArr = new CharSequence[]{string, string2, string3, (tL_theme3 == null || !tL_theme3.creator) ? null : LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl), z11 ? LocaleController.getString("Delete", R.string.Delete) : null};
                            z10 = z12;
                            iArr = new int[]{R.drawable.msg_share, R.drawable.msg_shareout, R.drawable.msg_edit, R.drawable.msg_link, R.drawable.msg_delete};
                        }
                        w wVar = new w(11, va1Var, f6Var);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                        b2Var.L = charSequenceArr;
                        b2Var.M = iArr;
                        b2Var.I = wVar;
                        themeActivity.showDialog(b2Var);
                        if (z10) {
                            b2Var.l(b2Var.J0.size() - 1, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false));
                        }
                    }
                }
                break;
        }
    }

    public sa1(va1 va1Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, n2Var, i10, arrayList, arrayList2);
        this.f42565g3 = va1Var;
    }
}

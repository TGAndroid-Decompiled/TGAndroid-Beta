package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uj1 {
    public org.telegram.ui.Cells.a2 f40419a;
    public org.telegram.ui.ActionBar.a2 f40420b;
    public TextView f40421c;

    public static void a(Context context, Utilities.Callback callback, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout e = org.telegram.messenger.sk.e(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19707j5, false));
        textView.setTextSize(1, 14.0f);
        e.addView(textView, w7.z5.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1, null);
        obj.f40419a = a2Var;
        a2Var.getTextView().getLayoutParams().width = -1;
        obj.f40419a.getTextView().setTextSize(1, 14.0f);
        e.addView(obj.f40419a, w7.z5.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.g0.n(R.string.BotWebAppDisclaimerSubtitle, textView);
        obj.f40419a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new tv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(e);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new org.telegram.ui.Components.d3(1, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ps0(12));
        org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f19248a;
        obj.f40420b = a2Var2;
        a2Var2.show();
        TextView textView2 = (TextView) obj.f40420b.d(-1);
        obj.f40421c = textView2;
        textView2.setEnabled(false);
        obj.f40421c.setAlpha(0.5f);
        obj.f40419a.setOnClickListener(new v41(obj, 8));
        obj.f40419a.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19690i6, false), 7, -1));
        obj.f40420b.setOnDismissListener(new org.telegram.ui.Components.p2(zArr, runnable));
    }
}

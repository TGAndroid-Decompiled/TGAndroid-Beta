package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vi1 {
    public org.telegram.ui.Cells.z1 f42244a;
    public org.telegram.ui.ActionBar.d2 f42245b;
    public TextView f42246c;

    public static void a(Context context, h5.d dVar, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21766j5, false));
        textView.setTextSize(1, 14.0f);
        f10.addView(textView, k7.c6.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1, null);
        obj.f42244a = z1Var;
        z1Var.getTextView().getLayoutParams().width = -1;
        obj.f42244a.getTextView().setTextSize(1, 14.0f);
        f10.addView(obj.f42244a, k7.c6.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.y3.q(R.string.BotWebAppDisclaimerSubtitle, textView);
        obj.f42244a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new mv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new vl0(29, dVar, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new cl0(9));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        obj.f42245b = d2Var;
        d2Var.show();
        TextView textView2 = (TextView) obj.f42245b.d(-1);
        obj.f42246c = textView2;
        textView2.setEnabled(false);
        obj.f42246c.setAlpha(0.5f);
        obj.f42244a.setOnClickListener(new k31(obj, 10));
        obj.f42244a.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21750i6, false), 7, -1));
        obj.f42245b.setOnDismissListener(new org.telegram.ui.Components.m2(zArr, runnable));
    }
}

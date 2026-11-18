package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zc1 {
    public org.telegram.ui.Cells.c2 f54481a;
    public org.telegram.ui.ActionBar.u1 f54482b;
    public TextView f54483c;

    public static void a(Context context, org.telegram.messenger.x10 x10Var, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String M0 = org.telegram.messenger.gd.M0(2131743960, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = M0;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29504j5, null);
        textView.setTextSize(1, 14.0f);
        g10.addView(textView, c8.ma.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context, null);
        obj.f54481a = c2Var;
        c2Var.getTextView().getLayoutParams().width = -1;
        obj.f54481a.getTextView().setTextSize(1, 14.0f);
        g10.addView(obj.f54481a, c8.ma.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        textView.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131752908, null)));
        obj.f54481a.e(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131752909, null), new fu(context, 8)), "", false, false, false);
        alertDialog$Builder.o(g10);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751760, null), new org.telegram.ui.Components.a3(1, x10Var, zArr));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new l60(21));
        obj.f54482b = u1Var;
        u1Var.show();
        TextView textView2 = (TextView) obj.f54482b.d(-1);
        obj.f54483c = textView2;
        textView2.setEnabled(false);
        obj.f54483c.setAlpha(0.5f);
        obj.f54481a.setOnClickListener(new oy0(obj, 11));
        obj.f54481a.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29488i6, false), 7, -1));
        obj.f54482b.setOnDismissListener(new org.telegram.ui.Components.h2(zArr, runnable));
    }
}

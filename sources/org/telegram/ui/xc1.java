package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xc1 {
    public org.telegram.ui.Cells.d2 f53915a;
    public org.telegram.ui.ActionBar.t1 f53916b;
    public TextView f53917c;

    public static void a(Context context, org.telegram.messenger.w10 w10Var, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String N0 = org.telegram.messenger.gd.N0(2131743950, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, null);
        textView.setTextSize(1, 14.0f);
        g10.addView(textView, c8.na.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, context, null);
        obj.f53915a = d2Var;
        d2Var.getTextView().getLayoutParams().width = -1;
        obj.f53915a.getTextView().setTextSize(1, 14.0f);
        g10.addView(obj.f53915a, c8.na.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        textView.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131752907, null)));
        obj.f53915a.e(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131752908, null), new eu(context, 8)), "", false, false, false);
        alertDialog$Builder.o(g10);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751759, null), new org.telegram.ui.Components.a3(1, w10Var, zArr));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new l60(21));
        obj.f53916b = t1Var;
        t1Var.show();
        TextView textView2 = (TextView) obj.f53916b.d(-1);
        obj.f53917c = textView2;
        textView2.setEnabled(false);
        obj.f53917c.setAlpha(0.5f);
        obj.f53915a.setOnClickListener(new ny0(obj, 11));
        obj.f53915a.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29543i6, false), 7, -1));
        obj.f53916b.setOnDismissListener(new org.telegram.ui.Components.h2(zArr, runnable));
    }
}

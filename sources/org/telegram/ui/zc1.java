package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zc1 {
    public org.telegram.ui.Cells.d2 f54527a;
    public org.telegram.ui.ActionBar.t1 f54528b;
    public TextView f54529c;

    public static void a(Context context, org.telegram.messenger.y10 y10Var, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String N0 = org.telegram.messenger.hd.N0(2131743952, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
        t1Var.S = N0;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29489j5, null);
        textView.setTextSize(1, 14.0f);
        g10.addView(textView, c8.ma.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, context, null);
        obj.f54527a = d2Var;
        d2Var.getTextView().getLayoutParams().width = -1;
        obj.f54527a.getTextView().setTextSize(1, 14.0f);
        g10.addView(obj.f54527a, c8.ma.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        textView.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131752907, null)));
        obj.f54527a.e(org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131752908, null), new fu(context, 8)), "", false, false, false);
        alertDialog$Builder.o(g10);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751759, null), new org.telegram.ui.Components.b3(1, y10Var, zArr));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new m60(21));
        obj.f54528b = t1Var;
        t1Var.show();
        TextView textView2 = (TextView) obj.f54528b.d(-1);
        obj.f54529c = textView2;
        textView2.setEnabled(false);
        obj.f54529c.setAlpha(0.5f);
        obj.f54527a.setOnClickListener(new oy0(obj, 11));
        obj.f54527a.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29473i6, false), 7, -1));
        obj.f54528b.setOnDismissListener(new org.telegram.ui.Components.i2(zArr, runnable));
    }
}

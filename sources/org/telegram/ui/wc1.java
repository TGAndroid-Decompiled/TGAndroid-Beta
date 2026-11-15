package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wc1 {
    public org.telegram.ui.Cells.c2 f52545a;
    public org.telegram.ui.ActionBar.t1 f52546b;
    public TextView f52547c;

    public static void a(Context context, org.telegram.messenger.z10 z10Var, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String M0 = org.telegram.messenger.hd.M0(2131744195, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, null);
        textView.setTextSize(1, 14.0f);
        f10.addView(textView, c8.ja.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context, null);
        obj.f52545a = c2Var;
        c2Var.getTextView().getLayoutParams().width = -1;
        obj.f52545a.getTextView().setTextSize(1, 14.0f);
        f10.addView(obj.f52545a, c8.ja.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131752919, null)));
        obj.f52545a.e(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752920, null), new du(context, 8)), "", false, false, false);
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751771, null), new org.telegram.ui.Components.s2(1, z10Var, zArr));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new t70(20));
        obj.f52546b = t1Var;
        t1Var.show();
        TextView textView2 = (TextView) obj.f52546b.d(-1);
        obj.f52547c = textView2;
        textView2.setEnabled(false);
        obj.f52547c.setAlpha(0.5f);
        obj.f52545a.setOnClickListener(new ky0(obj, 11));
        obj.f52545a.setBackground(org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28941i6, false), 7, -1));
        obj.f52546b.setOnDismissListener(new org.telegram.ui.Components.x1(zArr, runnable));
    }
}

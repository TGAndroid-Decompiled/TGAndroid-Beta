package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rc1 {
    public org.telegram.ui.Cells.c2 f49196a;
    public org.telegram.ui.ActionBar.s1 f49197b;
    public TextView f49198c;

    public static void a(Context context, org.telegram.messenger.u10 u10Var, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String M0 = org.telegram.messenger.bd.M0(2131744205, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, null);
        textView.setTextSize(1, 14.0f);
        f10.addView(textView, b8.mf.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context, null);
        obj.f49196a = c2Var;
        c2Var.getTextView().getLayoutParams().width = -1;
        obj.f49196a.getTextView().setTextSize(1, 14.0f);
        f10.addView(obj.f49196a, b8.mf.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131752919, null)));
        obj.f49196a.e(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131752920, null), new zt(context, 8)), "", false, false, false);
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751771, null), new org.telegram.ui.Components.s2(1, u10Var, zArr));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new u70(20));
        obj.f49197b = s1Var;
        s1Var.show();
        TextView textView2 = (TextView) obj.f49197b.d(-1);
        obj.f49198c = textView2;
        textView2.setEnabled(false);
        obj.f49198c.setAlpha(0.5f);
        obj.f49196a.setOnClickListener(new cy0(obj, 11));
        obj.f49196a.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27972i6, false), 7, -1));
        obj.f49197b.setOnDismissListener(new org.telegram.ui.Components.y1(zArr, runnable));
    }
}

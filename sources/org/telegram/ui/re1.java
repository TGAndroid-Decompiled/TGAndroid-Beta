package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class re1 {
    public org.telegram.ui.Cells.c2 f41075a;
    public org.telegram.ui.ActionBar.x1 f41076b;
    public TextView f41077c;

    public static void a(Context context, org.telegram.messenger.r20 r20Var, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String L0 = org.telegram.messenger.dd.L0(2131744220, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = L0;
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21038j5, null);
        textView.setTextSize(1, 14.0f);
        f7.addView(textView, w7.b6.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context, null);
        obj.f41075a = c2Var;
        c2Var.getTextView().getLayoutParams().width = -1;
        obj.f41075a.getTextView().setTextSize(1, 14.0f);
        f7.addView(obj.f41075a, w7.b6.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        textView.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131752919, null)));
        obj.f41075a.e(org.telegram.messenger.i0.T2(org.telegram.messenger.dd.L0(2131752920, null), new dv(context, 8)), "", false, false, false);
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751771, null), new org.telegram.ui.Components.u2(1, r20Var, zArr));
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new pa1(5));
        obj.f41076b = x1Var;
        x1Var.show();
        TextView textView2 = (TextView) obj.f41076b.d(-1);
        obj.f41077c = textView2;
        textView2.setEnabled(false);
        obj.f41077c.setAlpha(0.5f);
        obj.f41075a.setOnClickListener(new zz0(obj, 11));
        obj.f41075a.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21021i6, false), 7, -1));
        obj.f41076b.setOnDismissListener(new org.telegram.ui.Components.y1(zArr, runnable));
    }
}

package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zc1 {
    public org.telegram.ui.Cells.c2 f52499a;
    public org.telegram.ui.ActionBar.u1 f52500b;
    public TextView f52501c;

    public static void a(Context context, org.telegram.messenger.c20 c20Var, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String M0 = org.telegram.messenger.id.M0(2131744195, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = M0;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f27973j5, null);
        textView.setTextSize(1, 14.0f);
        f10.addView(textView, c8.ha.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context, null);
        obj.f52499a = c2Var;
        c2Var.getTextView().getLayoutParams().width = -1;
        obj.f52499a.getTextView().setTextSize(1, 14.0f);
        f10.addView(obj.f52499a, c8.ha.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131752919, null)));
        obj.f52499a.e(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131752920, null), new du(context, 8)), "", false, false, false);
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, null), new org.telegram.ui.Components.u2(1, c20Var, zArr));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new io0(15));
        obj.f52500b = u1Var;
        u1Var.show();
        TextView textView2 = (TextView) obj.f52500b.d(-1);
        obj.f52501c = textView2;
        textView2.setEnabled(false);
        obj.f52501c.setAlpha(0.5f);
        obj.f52499a.setOnClickListener(new py0(obj, 11));
        obj.f52499a.setBackground(org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27957i6, false), 7, -1));
        obj.f52500b.setOnDismissListener(new org.telegram.ui.Components.z1(zArr, runnable));
    }
}

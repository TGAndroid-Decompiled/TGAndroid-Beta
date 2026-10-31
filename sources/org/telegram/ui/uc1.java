package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class uc1 extends FrameLayout {
    public final int f42114a = 0;
    public final Object f42115b;

    public uc1(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, w7.b6.e(-1, -2, 80));
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.a7.W(textView, org.telegram.ui.ActionBar.a7.h(org.telegram.ui.ActionBar.t6.G6, 100), p6Var);
        textView.setTextSize(1, 13.0f);
        org.telegram.messenger.m5.l(textView, 17, null, 2131743881);
        linearLayout.addView(textView, w7.b6.t(-1, -2, 0, 16, 17, 17, 16));
        kg.x0 x0Var = new kg.x0(context, p6Var, false);
        this.f42115b = x0Var;
        String L0 = org.telegram.messenger.cd.L0(2131743882, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").setSpan(new org.telegram.ui.Components.dq(0, context.getDrawable(2131232308)), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) L0);
        x0Var.f11327f.setText(spannableStringBuilder);
        linearLayout.addView(x0Var, w7.b6.t(-1, 48, 0, 16, 0, 16, 16));
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f42114a) {
            case 1:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((tc1) this.f42115b).L.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(16.0f) + org.telegram.messenger.i0.f16020m;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public uc1(tc1 tc1Var, Context context) {
        super(context);
        this.f42115b = tc1Var;
    }
}

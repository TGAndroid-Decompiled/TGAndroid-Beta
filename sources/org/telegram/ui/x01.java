package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class x01 extends FrameLayout {
    public final TextView f53497a;
    public final org.telegram.ui.Components.rh0 f53498b;
    public final ImageView f53499c;
    public float d;
    public ValueAnimator f53500e;
    public final r11 f53501f;

    public x01(r11 r11Var, Context context, boolean z10) {
        super(context);
        int i7;
        this.f53501f = r11Var;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
        if (z10) {
            i7 = 3;
        } else {
            i7 = 17;
        }
        addView(g10, c8.na.e(-2, -2, i7));
        ?? imageView = new ImageView(context);
        this.f53498b = imageView;
        imageView.f(2131624315, 20, 20, null);
        int i10 = org.telegram.ui.ActionBar.m6.Lf;
        org.telegram.ui.ActionBar.h6 h6Var = r11Var.f51402a1;
        org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, PorterDuff.Mode.SRC_ATOP);
        g10.addView((View) imageView, c8.na.o(20, 20));
        TextView textView = new TextView(context);
        this.f53497a = textView;
        org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        g10.addView(textView, c8.na.r(-2, -2, 17));
        ImageView imageView2 = new ImageView(context);
        this.f53499c = imageView2;
        imageView2.setImageResource(2131232098);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.Nf, h6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, c8.na.e(24, 24, 21));
    }

    public final void a(String str, boolean z10) {
        this.f53497a.setText(str);
        b(z10);
    }

    public final void b(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.f53500e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f53500e = null;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = f10;
        float L = (1.0f - this.d) * org.telegram.messenger.g0.L(-8.0f);
        org.telegram.ui.Components.rh0 rh0Var = this.f53498b;
        rh0Var.setTranslationX(L);
        this.f53497a.setTranslationX((1.0f - this.d) * org.telegram.messenger.g0.L(-8.0f));
        rh0Var.setAlpha(this.d);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
    }
}

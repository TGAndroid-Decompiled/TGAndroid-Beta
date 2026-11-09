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
public final class y01 extends FrameLayout {
    public final TextView f51807a;
    public final org.telegram.ui.Components.dh0 f51808b;
    public final ImageView f51809c;
    public float d;
    public ValueAnimator f51810e;
    public final s11 f51811f;

    public y01(s11 s11Var, Context context, boolean z9) {
        super(context);
        int i7;
        this.f51811f = s11Var;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        if (z9) {
            i7 = 3;
        } else {
            i7 = 17;
        }
        addView(f10, c8.ha.e(-2, -2, i7));
        ?? imageView = new ImageView(context);
        this.f51808b = imageView;
        imageView.f(2131624314, 20, 20, null);
        int i10 = org.telegram.ui.ActionBar.l6.If;
        org.telegram.ui.ActionBar.g6 g6Var = s11Var.Z0;
        org.telegram.ui.ActionBar.s6.s(imageView, i10, g6Var, PorterDuff.Mode.SRC_ATOP);
        f10.addView((View) imageView, c8.ha.o(20, 20));
        TextView textView = new TextView(context);
        this.f51807a = textView;
        org.telegram.ui.ActionBar.s6.U(textView, i10, g6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        f10.addView(textView, c8.ha.r(-2, -2, 17));
        ImageView imageView2 = new ImageView(context);
        this.f51809c = imageView2;
        imageView2.setImageResource(2131232096);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.s6.s(imageView2, org.telegram.ui.ActionBar.l6.Kf, g6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, c8.ha.e(24, 24, 21));
    }

    public final void a(String str, boolean z9) {
        this.f51807a.setText(str);
        b(z9);
    }

    public final void b(boolean z9) {
        float f10;
        ValueAnimator valueAnimator = this.f51810e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f51810e = null;
        }
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = f10;
        float L = (1.0f - this.d) * org.telegram.messenger.g0.L(-8.0f);
        org.telegram.ui.Components.dh0 dh0Var = this.f51808b;
        dh0Var.setTranslationX(L);
        this.f51807a.setTranslationX((1.0f - this.d) * org.telegram.messenger.g0.L(-8.0f));
        dh0Var.setAlpha(this.d);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
    }
}

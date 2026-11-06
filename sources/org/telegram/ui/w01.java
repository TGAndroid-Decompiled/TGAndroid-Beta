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
public final class w01 extends FrameLayout {
    public final TextView f50873a;
    public final org.telegram.ui.Components.ch0 f50874b;
    public final ImageView f50875c;
    public float d;
    public ValueAnimator f50876e;
    public final q11 f50877f;

    public w01(q11 q11Var, Context context, boolean z9) {
        super(context);
        int i7;
        this.f50877f = q11Var;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        if (z9) {
            i7 = 3;
        } else {
            i7 = 17;
        }
        addView(f10, c8.ha.e(-2, -2, i7));
        ?? imageView = new ImageView(context);
        this.f50874b = imageView;
        imageView.f(2131624314, 20, 20, null);
        int i10 = org.telegram.ui.ActionBar.k6.If;
        org.telegram.ui.ActionBar.f6 f6Var = q11Var.Z0;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, f6Var, PorterDuff.Mode.SRC_ATOP);
        f10.addView((View) imageView, c8.ha.o(20, 20));
        TextView textView = new TextView(context);
        this.f50873a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, i10, f6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        f10.addView(textView, c8.ha.r(-2, -2, 17));
        ImageView imageView2 = new ImageView(context);
        this.f50875c = imageView2;
        imageView2.setImageResource(2131232096);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.Kf, f6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, c8.ha.e(24, 24, 21));
    }

    public final void a(String str, boolean z9) {
        this.f50873a.setText(str);
        b(z9);
    }

    public final void b(boolean z9) {
        float f10;
        ValueAnimator valueAnimator = this.f50876e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f50876e = null;
        }
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = f10;
        float L = (1.0f - this.d) * org.telegram.messenger.g0.L(-8.0f);
        org.telegram.ui.Components.ch0 ch0Var = this.f50874b;
        ch0Var.setTranslationX(L);
        this.f50873a.setTranslationX((1.0f - this.d) * org.telegram.messenger.g0.L(-8.0f));
        ch0Var.setAlpha(this.d);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
    }
}

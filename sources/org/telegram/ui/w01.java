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
    public final TextView f53067a;
    public final org.telegram.ui.Components.qh0 f53068b;
    public final ImageView f53069c;
    public float d;
    public ValueAnimator f53070e;
    public final q11 f53071f;

    public w01(q11 q11Var, Context context, boolean z10) {
        super(context);
        int i7;
        this.f53071f = q11Var;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
        if (z10) {
            i7 = 3;
        } else {
            i7 = 17;
        }
        addView(g10, c8.na.e(-2, -2, i7));
        ?? imageView = new ImageView(context);
        this.f53068b = imageView;
        imageView.f(2131624315, 20, 20, null);
        int i10 = org.telegram.ui.ActionBar.n6.Lf;
        org.telegram.ui.ActionBar.i6 i6Var = q11Var.f51227a1;
        org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, PorterDuff.Mode.SRC_ATOP);
        g10.addView((View) imageView, c8.na.o(20, 20));
        TextView textView = new TextView(context);
        this.f53067a = textView;
        org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        g10.addView(textView, c8.na.r(-2, -2, 17));
        ImageView imageView2 = new ImageView(context);
        this.f53069c = imageView2;
        imageView2.setImageResource(2131232101);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.Nf, i6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, c8.na.e(24, 24, 21));
    }

    public final void a(String str, boolean z10) {
        this.f53067a.setText(str);
        b(z10);
    }

    public final void b(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.f53070e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f53070e = null;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = f10;
        float L = (1.0f - this.d) * org.telegram.messenger.g0.L(-8.0f);
        org.telegram.ui.Components.qh0 qh0Var = this.f53068b;
        qh0Var.setTranslationX(L);
        this.f53067a.setTranslationX((1.0f - this.d) * org.telegram.messenger.g0.L(-8.0f));
        qh0Var.setAlpha(this.d);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
    }
}

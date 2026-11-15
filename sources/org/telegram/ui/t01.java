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
public final class t01 extends FrameLayout {
    public final TextView f51314a;
    public final org.telegram.ui.Components.fh0 f51315b;
    public final ImageView f51316c;
    public float d;
    public ValueAnimator f51317e;
    public final n11 f51318f;

    public t01(n11 n11Var, Context context, boolean z10) {
        super(context);
        int i7;
        this.f51318f = n11Var;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        if (z10) {
            i7 = 3;
        } else {
            i7 = 17;
        }
        addView(f10, c8.ja.e(-2, -2, i7));
        ?? imageView = new ImageView(context);
        this.f51315b = imageView;
        imageView.f(2131624315, 20, 20, null);
        int i10 = org.telegram.ui.ActionBar.j6.Lf;
        org.telegram.ui.ActionBar.e6 e6Var = n11Var.f49365a1;
        org.telegram.ui.ActionBar.q6.s(imageView, i10, e6Var, PorterDuff.Mode.SRC_ATOP);
        f10.addView((View) imageView, c8.ja.o(20, 20));
        TextView textView = new TextView(context);
        this.f51314a = textView;
        org.telegram.ui.ActionBar.q6.U(textView, i10, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        f10.addView(textView, c8.ja.r(-2, -2, 17));
        ImageView imageView2 = new ImageView(context);
        this.f51316c = imageView2;
        imageView2.setImageResource(2131232097);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.q6.s(imageView2, org.telegram.ui.ActionBar.j6.Nf, e6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, c8.ja.e(24, 24, 21));
    }

    public final void a(String str, boolean z10) {
        this.f51314a.setText(str);
        b(z10);
    }

    public final void b(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.f51317e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f51317e = null;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = f10;
        float L = (1.0f - this.d) * org.telegram.messenger.g0.L(-8.0f);
        org.telegram.ui.Components.fh0 fh0Var = this.f51315b;
        fh0Var.setTranslationX(L);
        this.f51314a.setTranslationX((1.0f - this.d) * org.telegram.messenger.g0.L(-8.0f));
        fh0Var.setAlpha(this.d);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
    }
}

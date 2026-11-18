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
    public final TextView f53579a;
    public final org.telegram.ui.Components.ph0 f53580b;
    public final ImageView f53581c;
    public float d;
    public ValueAnimator f53582e;
    public final r11 f53583f;

    public x01(r11 r11Var, Context context, boolean z10) {
        super(context);
        int i7;
        this.f53583f = r11Var;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
        if (z10) {
            i7 = 3;
        } else {
            i7 = 17;
        }
        addView(g10, c8.ma.e(-2, -2, i7));
        ?? imageView = new ImageView(context);
        this.f53580b = imageView;
        imageView.f(2131624315, 20, 20, null);
        int i10 = org.telegram.ui.ActionBar.n6.Lf;
        org.telegram.ui.ActionBar.i6 i6Var = r11Var.f51418a1;
        org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, PorterDuff.Mode.SRC_ATOP);
        g10.addView((View) imageView, c8.ma.o(20, 20));
        TextView textView = new TextView(context);
        this.f53579a = textView;
        org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        g10.addView(textView, c8.ma.r(-2, -2, 17));
        ImageView imageView2 = new ImageView(context);
        this.f53581c = imageView2;
        imageView2.setImageResource(2131232098);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.Nf, i6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, c8.ma.e(24, 24, 21));
    }

    public final void a(String str, boolean z10) {
        this.f53579a.setText(str);
        b(z10);
    }

    public final void b(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.f53582e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f53582e = null;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = f10;
        float L = (1.0f - this.d) * org.telegram.messenger.g0.L(-8.0f);
        org.telegram.ui.Components.ph0 ph0Var = this.f53580b;
        ph0Var.setTranslationX(L);
        this.f53579a.setTranslationX((1.0f - this.d) * org.telegram.messenger.g0.L(-8.0f));
        ph0Var.setAlpha(this.d);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
    }
}

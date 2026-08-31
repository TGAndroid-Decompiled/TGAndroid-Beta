package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class w51 extends FrameLayout {
    public final TextView f42381a;
    public final org.telegram.ui.Components.lj0 f42382b;
    public final ImageView f42383c;
    public float d;
    public ValueAnimator f42384e;
    public final r61 f42385f;

    public w51(r61 r61Var, Context context, boolean z4) {
        super(context);
        int i10;
        this.f42385f = r61Var;
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 0);
        if (z4) {
            i10 = 3;
        } else {
            i10 = 17;
        }
        addView(f10, k7.c6.e(-2, -2, i10));
        ?? imageView = new ImageView(context);
        this.f42382b = imageView;
        imageView.f(R.raw.unlock_icon, 20, 20, null);
        int i11 = org.telegram.ui.ActionBar.k6.Te;
        org.telegram.ui.ActionBar.g6 g6Var = r61Var.W0;
        imageView.setColorFilter(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        f10.addView((View) imageView, k7.c6.n(20, 20));
        TextView textView = new TextView(context);
        this.f42381a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        f10.addView(textView, k7.c6.q(-2, -2, 17));
        ImageView imageView2 = new ImageView(context);
        this.f42383c = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ve, g6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView2, k7.c6.e(24, 24, 21));
    }

    public final void a(String str, boolean z4) {
        this.f42381a.setText(str);
        b(z4);
    }

    public final void b(boolean z4) {
        float f10;
        ValueAnimator valueAnimator = this.f42384e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f42384e = null;
        }
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = f10;
        float dp = (1.0f - this.d) * AndroidUtilities.dp(-8.0f);
        org.telegram.ui.Components.lj0 lj0Var = this.f42382b;
        lj0Var.setTranslationX(dp);
        this.f42381a.setTranslationX((1.0f - this.d) * AndroidUtilities.dp(-8.0f));
        lj0Var.setAlpha(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }
}

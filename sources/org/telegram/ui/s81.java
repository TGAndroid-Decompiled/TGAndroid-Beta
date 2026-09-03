package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class s81 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f41053a;
    public final org.telegram.ui.Components.tb0 f41054b;
    public final FrameLayout f41055c;
    public final ImageView d;
    public final TextView f41056e;
    public final TextView f41057f;
    public final TextView h;
    public boolean f41058n;

    public s81(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f41053a = g6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f41055c = frameLayout;
        org.telegram.ui.Components.tb0 tb0Var = new org.telegram.ui.Components.tb0(1);
        this.f41054b = tb0Var;
        frameLayout.setBackground(tb0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, k7.c6.e(24, 24, 17));
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        TextView textView = new TextView(context);
        this.f41056e = textView;
        textView.setTextSize(1, 16.0f);
        TextView i10 = yh.i(f10, textView, k7.c6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f41057f = i10;
        i10.setTextSize(1, 13.0f);
        TextView i11 = yh.i(f10, i10, k7.c6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = i11;
        i11.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(i11, k7.c6.t(-2, -2, 16, 20, 0, 0, 0));
            addView(f10, k7.c6.p(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, k7.c6.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, k7.c6.t(28, 28, 19, 18, 0, 0, 0));
            addView(f10, k7.c6.p(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(i11, k7.c6.t(-2, -2, 16, 0, 0, 20, 0));
        }
        e();
    }

    @Override
    public final void e() {
        boolean q10;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f41053a;
        this.f41056e.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        this.f41057f.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22038y6, g6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21841n6, g6Var));
        if (g6Var != null) {
            q10 = g6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.k6.I.q();
        }
        this.f41054b.f31328b = q10;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f41058n) {
            f10 = 60.0f;
        } else {
            f10 = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
    }

    public void setValue(CharSequence charSequence) {
        int i10;
        if (!TextUtils.isEmpty(charSequence)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        TextView textView = this.h;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }
}

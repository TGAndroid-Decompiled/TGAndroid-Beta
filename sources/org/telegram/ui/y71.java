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
public final class y71 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f44763a;
    public final org.telegram.ui.Components.mb0 f44764b;
    public final FrameLayout f44765c;
    public final ImageView d;
    public final TextView f44766e;
    public final TextView f44767f;
    public final TextView h;
    public boolean f44768n;

    public y71(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f44763a = c6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44765c = frameLayout;
        org.telegram.ui.Components.mb0 mb0Var = new org.telegram.ui.Components.mb0(1);
        this.f44764b = mb0Var;
        frameLayout.setBackground(mb0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, i7.f6.e(24, 24, 17));
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        TextView textView = new TextView(context);
        this.f44766e = textView;
        textView.setTextSize(1, 16.0f);
        TextView i10 = th.i(g10, textView, i7.f6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f44767f = i10;
        i10.setTextSize(1, 13.0f);
        TextView i11 = th.i(g10, i10, i7.f6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = i11;
        i11.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(i11, i7.f6.t(-2, -2, 16, 20, 0, 0, 0));
            addView(g10, i7.f6.p(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, i7.f6.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, i7.f6.t(28, 28, 19, 18, 0, 0, 0));
            addView(g10, i7.f6.p(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(i11, i7.f6.t(-2, -2, 16, 0, 0, 20, 0));
        }
        e();
    }

    @Override
    public final void e() {
        boolean q6;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f44763a;
        this.f44766e.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        this.f44767f.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23433y6, c6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23241n6, c6Var));
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.g6.I.q();
        }
        this.f44764b.f30641b = q6;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f44768n) {
            f9 = 60.0f;
        } else {
            f9 = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f9), 1073741824));
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

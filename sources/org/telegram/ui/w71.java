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
public final class w71 extends LinearLayout implements org.telegram.ui.ActionBar.w5 {
    public final org.telegram.ui.ActionBar.b6 f43696a;
    public final org.telegram.ui.Components.xa0 f43697b;
    public final FrameLayout f43698c;
    public final ImageView d;
    public final TextView f43699e;
    public final TextView f43700f;
    public final TextView h;
    public boolean f43701n;

    public w71(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f43696a = b6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43698c = frameLayout;
        org.telegram.ui.Components.xa0 xa0Var = new org.telegram.ui.Components.xa0(1);
        this.f43697b = xa0Var;
        frameLayout.setBackground(xa0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, g7.e6.e(24, 24, 17));
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        TextView textView = new TextView(context);
        this.f43699e = textView;
        textView.setTextSize(1, 16.0f);
        TextView h = j3.r0.h(f10, textView, g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f43700f = h;
        h.setTextSize(1, 13.0f);
        TextView h10 = j3.r0.h(f10, h, g7.e6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = h10;
        h10.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(h10, g7.e6.t(-2, -2, 16, 20, 0, 0, 0));
            addView(f10, g7.e6.p(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, g7.e6.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, g7.e6.t(28, 28, 19, 18, 0, 0, 0));
            addView(f10, g7.e6.p(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(h10, g7.e6.t(-2, -2, 16, 0, 0, 20, 0));
        }
        d();
    }

    @Override
    public final void d() {
        boolean q10;
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.b6 b6Var = this.f43696a;
        this.f43699e.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        this.f43700f.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23369y6, b6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23179n6, b6Var));
        if (b6Var != null) {
            q10 = b6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.f6.I.q();
        }
        this.f43697b.f34630b = q10;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824);
        if (this.f43701n) {
            f10 = 60.0f;
        } else {
            f10 = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
    }

    public void setValue(CharSequence charSequence) {
        int i9;
        if (!TextUtils.isEmpty(charSequence)) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        TextView textView = this.h;
        textView.setVisibility(i9);
        textView.setText(charSequence);
    }
}

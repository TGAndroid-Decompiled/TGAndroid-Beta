package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class z41 extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f43820a;
    public final org.telegram.ui.Components.va0 f43821b;
    public final FrameLayout f43822c;
    public final ImageView d;
    public final TextView e;
    public final TextView f43823f;
    public final TextView h;
    public boolean f43824n;
    public boolean f43825r;

    public z41(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f43824n = true;
        this.f43820a = p6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43822c = frameLayout;
        org.telegram.ui.Components.va0 va0Var = new org.telegram.ui.Components.va0(1);
        this.f43821b = va0Var;
        frameLayout.setBackground(va0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, w7.b6.e(24, 24, 17));
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView f10 = org.telegram.messenger.a30.f(f7, textView, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f43823f = f10;
        f10.setTextSize(1, 13.0f);
        TextView f11 = org.telegram.messenger.a30.f(f7, f10, w7.b6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = f11;
        f11.setTextSize(1, 16.0f);
        if (org.telegram.messenger.dd.X) {
            addView(f11, w7.b6.t(-2, -2, 16, 20, 0, 0, 0));
            addView(f7, w7.b6.q(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, w7.b6.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, w7.b6.t(28, 28, 19, 18, 0, 0, 0));
            addView(f7, w7.b6.q(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(f11, w7.b6.t(-2, -2, 16, 0, 0, 20, 0));
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21312y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21116n6));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f43825r) {
            f7 = 60.0f;
        } else {
            f7 = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f7), 1073741824));
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

    @Override
    public final void updateColors() {
        boolean z10;
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.f43820a;
        this.e.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.f43823f.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21312y6, p6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21116n6, p6Var));
        if (this.f43824n && (p6Var == null ? org.telegram.ui.ActionBar.t6.I.q() : p6Var.a())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43821b.f31239b = z10;
    }
}

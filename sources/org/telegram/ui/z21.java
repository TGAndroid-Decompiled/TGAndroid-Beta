package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class z21 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f52509a;
    public final org.telegram.ui.Components.y90 f52510b;
    public final FrameLayout f52511c;
    public final ImageView d;
    public final TextView f52512e;
    public final TextView f52513f;
    public final TextView h;
    public boolean f52514n;
    public boolean f52515r;

    public z21(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f52514n = true;
        this.f52509a = e6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f52511c = frameLayout;
        org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(1);
        this.f52510b = y90Var;
        frameLayout.setBackground(y90Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, b8.mf.e(24, 24, 17));
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        TextView textView = new TextView(context);
        this.f52512e = textView;
        textView.setTextSize(1, 16.0f);
        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView, b8.mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f52513f = f11;
        f11.setTextSize(1, 13.0f);
        TextView f12 = org.telegram.messenger.camera.q.f(f10, f11, b8.mf.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = f12;
        f12.setTextSize(1, 16.0f);
        if (org.telegram.messenger.bd.f21784a0) {
            addView(f12, b8.mf.t(-2, -2, 16, 20, 0, 0, 0));
            addView(f10, b8.mf.q(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, b8.mf.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, b8.mf.t(28, 28, 19, 18, 0, 0, 0));
            addView(f10, b8.mf.q(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(f12, b8.mf.t(-2, -2, 16, 0, 0, 20, 0));
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28273y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28062n6));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        if (this.f52515r) {
            f10 = 60.0f;
        } else {
            f10 = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }

    public void setValue(CharSequence charSequence) {
        int i3;
        if (!TextUtils.isEmpty(charSequence)) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        TextView textView = this.h;
        textView.setVisibility(i3);
        textView.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        boolean z10;
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f52509a;
        this.f52512e.setTextColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        this.f52513f.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28273y6, e6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28062n6, e6Var));
        if (this.f52514n && (e6Var == null ? org.telegram.ui.ActionBar.k6.I.q() : e6Var.a())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f52510b.f40668b = z10;
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class x21 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f51697a;
    public final org.telegram.ui.Components.u8 f51698b;
    public final org.telegram.ui.Components.k9 f51699c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final TextView f51700e;
    public final ImageView f51701f;
    public final org.telegram.ui.Components.e5 h;
    public final org.telegram.ui.Components.e5 f51702n;
    public int f51703r;

    public x21(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f51697a = e6Var;
        setOrientation(0);
        this.f51698b = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f51699c = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        k5Var.setTextSize(15);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, e6Var);
        this.h = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), 7, k5Var, false);
        this.f51702n = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), 7, k5Var, false);
        k5Var.addOnAttachStateChangeListener(new g5(this, 5));
        TextView textView = new TextView(context);
        this.f51700e = textView;
        textView.setPadding(org.telegram.messenger.g0.L(6.66f), 0, org.telegram.messenger.g0.L(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, e6Var);
        int L = org.telegram.messenger.g0.L(10.0f);
        int i3 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(textView, d02, N, null, e6Var);
        ImageView imageView = new ImageView(context);
        this.f51701f = imageView;
        imageView.setImageResource(2131232059);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f28043m6, e6Var, PorterDuff.Mode.SRC_IN);
        if (org.telegram.messenger.bd.f21784a0) {
            k5Var.setGravity(21);
            imageView.setScaleX(-1.0f);
            addView(imageView, b8.mf.q(24, 24, 0.0f, 19, 12, 0, 0, 0));
            addView(textView, b8.mf.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(k5Var, b8.mf.q(0, -1, 1.0f, 119, 18, 0, 0, 0));
            addView(k9Var, b8.mf.t(28, 28, 21, 18, 0, 18, 0));
            return;
        }
        k5Var.setGravity(19);
        addView(k9Var, b8.mf.t(28, 28, 19, 18, 0, 18, 0));
        addView(k5Var, b8.mf.q(0, -1, 1.0f, 119, 0, 0, 18, 0));
        addView(textView, b8.mf.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(imageView, b8.mf.q(24, 24, 0.0f, 21, 0, 0, 12, 0));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28073ni));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }

    public void set(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x21.set(int):void");
    }

    @Override
    public final void updateColors() {
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f51697a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        k5Var.setTextColor(w02);
        TextView textView = this.f51700e;
        org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var), textView.getBackground());
        textView.invalidate();
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28043m6, e6Var);
        int i10 = this.f51703r;
        ImageView imageView = this.f51701f;
        if (w03 != i10 || imageView.getColorFilter() == null) {
            this.f51703r = w03;
            imageView.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        }
        int i11 = org.telegram.ui.ActionBar.k6.f28073ni;
        this.f51702n.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i11, e6Var)));
        try {
            org.telegram.ui.Components.e5 e5Var = this.h;
            if (e5Var != null) {
                e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i11, e6Var)));
                k5Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}

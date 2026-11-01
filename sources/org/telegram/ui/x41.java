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
public final class x41 extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f43237a;
    public final org.telegram.ui.Components.r8 f43238b;
    public final org.telegram.ui.Components.g9 f43239c;
    public final org.telegram.ui.ActionBar.u5 d;
    public final TextView e;
    public final ImageView f43240f;
    public final org.telegram.ui.Components.d5 h;
    public final org.telegram.ui.Components.d5 f43241n;
    public int f43242r;

    public x41(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f43237a = p6Var;
        setOrientation(0);
        this.f43238b = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f43239c = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(14.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.d = u5Var;
        u5Var.setTextSize(15);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        this.h = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(24.0f), 7, u5Var, false);
        this.f43241n = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(24.0f), 7, u5Var, false);
        u5Var.addOnAttachStateChangeListener(new d5(this, 5));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setPadding(org.telegram.messenger.i0.L(6.66f), 0, org.telegram.messenger.i0.L(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, p6Var);
        int L = org.telegram.messenger.i0.L(10.0f);
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(textView, d02, N, null, p6Var);
        ImageView imageView = new ImageView(context);
        this.f43240f = imageView;
        imageView.setImageResource(2131232058);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.f21096m6, p6Var, PorterDuff.Mode.SRC_IN);
        if (org.telegram.messenger.dd.X) {
            u5Var.setGravity(21);
            imageView.setScaleX(-1.0f);
            addView(imageView, w7.b6.q(24, 24, 0.0f, 19, 12, 0, 0, 0));
            addView(textView, w7.b6.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(u5Var, w7.b6.q(0, -1, 1.0f, 119, 18, 0, 0, 0));
            addView(g9Var, w7.b6.t(28, 28, 21, 18, 0, 18, 0));
            return;
        }
        u5Var.setGravity(19);
        addView(g9Var, w7.b6.t(28, 28, 19, 18, 0, 18, 0));
        addView(u5Var, w7.b6.q(0, -1, 1.0f, 119, 0, 0, 18, 0));
        addView(textView, w7.b6.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(imageView, w7.b6.q(24, 24, 0.0f, 21, 0, 0, 12, 0));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ni));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
    }

    public void set(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x41.set(int):void");
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.f43237a;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        u5Var.setTextColor(w02);
        TextView textView = this.e;
        org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var), textView.getBackground());
        textView.invalidate();
        int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21096m6, p6Var);
        int i11 = this.f43242r;
        ImageView imageView = this.f43240f;
        if (w03 != i11 || imageView.getColorFilter() == null) {
            this.f43242r = w03;
            imageView.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        }
        int i12 = org.telegram.ui.ActionBar.t6.ni;
        this.f43241n.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(i12, p6Var)));
        try {
            org.telegram.ui.Components.d5 d5Var = this.h;
            if (d5Var != null) {
                d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(i12, p6Var)));
                u5Var.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}

package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tf0 extends FrameLayout {
    public static final int F = 0;
    public int E;
    public final eg0 f43822a;
    public final ViewGroup f43823b;
    public final View f43824c;
    public final View d;
    public final View e;
    public final org.telegram.ui.Components.m41 f43825f;
    public final org.telegram.ui.Components.j20 h;
    public final TextView f43826n;
    public final TextView f43827r;
    public final TextView f43828s;
    public final TextView v;
    public final FrameLayout f43829w;
    public boolean f43830x;
    public final PointF f43831y;

    public tf0(Context context, ViewGroup viewGroup, View view, String str, final eg0 eg0Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        PointF pointF = new PointF();
        this.f43831y = pointF;
        this.f43823b = viewGroup;
        this.f43824c = view;
        this.f43822a = eg0Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new qf0(this));
        addView(view2, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        org.telegram.ui.Components.m41 m41Var = new org.telegram.ui.Components.m41(getContext());
        this.f43825f = m41Var;
        m41Var.setTransformType(1);
        m41Var.setDrawBackground(false);
        org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20(context, null, false);
        this.h = j20Var;
        j20Var.addView(m41Var, org.telegram.ui.Components.gb1.i(56, 56, 17));
        j20Var.a(m41Var);
        j20Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        eg0Var.a(this);
                        return;
                    default:
                        eg0Var.a(this);
                        return;
                }
            }
        });
        j20Var.setContentDescription(LocaleController.getString(R.string.Done));
        addView(j20Var, org.telegram.ui.Components.gb1.i(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43829w = frameLayout;
        addView(frameLayout, org.telegram.ui.Components.gb1.h(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f43826n = textView;
        textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        TextView k10 = d3.k(frameLayout, textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, i10, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.f43827r = k10;
        k10.setText(str);
        k10.setTextSize(1, 18.0f);
        k10.setTypeface(AndroidUtilities.bold());
        k10.setSingleLine();
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(k10, org.telegram.ui.Components.gb1.h(-1, -2.0f, i11, 24.0f, 48.0f, 24.0f, 0.0f));
        int dp = AndroidUtilities.dp(16.0f);
        TextView textView2 = new TextView(context);
        this.f43828s = textView2;
        textView2.setText(LocaleController.getString(R.string.Edit));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i14 = org.telegram.ui.ActionBar.y6.Wh;
        textView2.setBackground(org.telegram.ui.ActionBar.y6.I0(dp2, org.telegram.ui.ActionBar.y6.x0(null, i14, false)));
        textView2.setOnClickListener(new qf0(this, eg0Var));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i15 = dp / 2;
        textView2.setPadding(dp, i15, dp, i15);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        float f7 = 8;
        TextView k11 = d3.k(frameLayout, textView2, org.telegram.ui.Components.gb1.h(-2, -2.0f, i12 | 80, f7, f7, f7, f7), context);
        this.v = k11;
        k11.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        k11.setSingleLine();
        k11.setTextSize(1, 16.0f);
        k11.setBackground(org.telegram.ui.ActionBar.y6.I0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.y6.x0(null, i14, false)));
        k11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        eg0Var.a(this);
                        return;
                    default:
                        eg0Var.a(this);
                        return;
                }
            }
        });
        k11.setTypeface(typeface);
        k11.setPadding(dp, i15, dp, i15);
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        frameLayout.addView(k11, org.telegram.ui.Components.gb1.h(-2, -2.0f, i13 | 80, f7, f7, f7, f7));
        jh.k.b(view, viewGroup, pointF);
        j20Var.setTranslationX(pointF.x);
        j20Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.f43830x) {
            return;
        }
        this.f43830x = true;
        this.f43822a.f39105a.f39362a0.f39654b0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new sf0(this, 1));
        duration.addUpdateListener(new pf0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.ds.f27586f);
        duration.start();
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.O9, false);
        org.telegram.ui.Components.m41 m41Var = this.f43825f;
        m41Var.setColor(x02);
        m41Var.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.P9, false));
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23427h5, false);
        FrameLayout frameLayout = this.f43829w;
        if (frameLayout.getBackground() == null) {
            frameLayout.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(12.0f), x03));
        } else if (x03 != this.E) {
            org.telegram.ui.ActionBar.y6.z1(x03, frameLayout.getBackground());
            frameLayout.invalidate();
        }
        this.E = x03;
        this.f43826n.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.q5, false));
        this.f43827r.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23464j5, false));
        int i10 = org.telegram.ui.ActionBar.y6.Wh;
        this.f43828s.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        this.v.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        this.h.updateColors();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        FrameLayout frameLayout = this.f43829w;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - AndroidUtilities.dp(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}

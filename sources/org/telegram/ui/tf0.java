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
    public static final int E = 0;
    public final dg0 f41732a;
    public final ViewGroup f41733b;
    public final View f41734c;
    public final View d;
    public final View e;
    public final org.telegram.ui.Components.z31 f41735f;
    public final org.telegram.ui.Components.h20 h;
    public final TextView f41736n;
    public final TextView f41737r;
    public final TextView f41738s;
    public final TextView v;
    public final FrameLayout f41739w;
    public boolean f41740x;
    public final PointF f41741y;

    public tf0(Context context, ViewGroup viewGroup, View view, String str, final dg0 dg0Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        PointF pointF = new PointF();
        this.f41741y = pointF;
        this.f41733b = viewGroup;
        this.f41734c = view;
        this.f41732a = dg0Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new qf0(this));
        addView(view2, w7.z5.d(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, w7.z5.d(-1.0f, -1));
        org.telegram.ui.Components.z31 z31Var = new org.telegram.ui.Components.z31(getContext());
        this.f41735f = z31Var;
        z31Var.setTransformType(1);
        z31Var.setDrawBackground(false);
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, null, false);
        this.h = h20Var;
        h20Var.addView(z31Var, w7.z5.e(56, 56, 17));
        h20Var.a(z31Var);
        h20Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        dg0Var.a(this);
                        return;
                    default:
                        dg0Var.a(this);
                        return;
                }
            }
        });
        h20Var.setContentDescription(LocaleController.getString(R.string.Done));
        addView(h20Var, w7.z5.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f41739w = frameLayout;
        addView(frameLayout, w7.z5.a(140.0f, 24.0f, 0.0f, 24.0f, 0.0f, -1, 49));
        TextView textView = new TextView(context);
        this.f41736n = textView;
        textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        TextView k10 = org.telegram.ui.Cells.t0.k(frameLayout, textView, w7.z5.a(-2.0f, 24.0f, 20.0f, 24.0f, 0.0f, -1, i10), context);
        this.f41737r = k10;
        k10.setText(str);
        k10.setTextSize(1, 18.0f);
        k10.setTypeface(AndroidUtilities.bold());
        k10.setSingleLine();
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(k10, w7.z5.a(-2.0f, 24.0f, 48.0f, 24.0f, 0.0f, -1, i11));
        int dp = AndroidUtilities.dp(16.0f);
        TextView textView2 = new TextView(context);
        this.f41738s = textView2;
        textView2.setText(LocaleController.getString(R.string.Edit));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i14 = org.telegram.ui.ActionBar.h6.Wh;
        textView2.setBackground(org.telegram.ui.ActionBar.h6.H0(dp2, org.telegram.ui.ActionBar.h6.x0(null, i14, false)));
        textView2.setOnClickListener(new qf0(this, dg0Var));
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
        TextView k11 = org.telegram.ui.Cells.t0.k(frameLayout, textView2, w7.z5.a(-2.0f, f7, f7, f7, f7, -2, i12 | 80), context);
        this.v = k11;
        k11.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        k11.setSingleLine();
        k11.setTextSize(1, 16.0f);
        k11.setBackground(org.telegram.ui.ActionBar.h6.H0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.h6.x0(null, i14, false)));
        k11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        dg0Var.a(this);
                        return;
                    default:
                        dg0Var.a(this);
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
        frameLayout.addView(k11, w7.z5.a(-2.0f, f7, f7, f7, f7, -2, i13 | 80));
        ih.j.b(view, viewGroup, pointF);
        h20Var.setTranslationX(pointF.x);
        h20Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.f41740x) {
            return;
        }
        this.f41740x = true;
        this.f41732a.f36194a.V.f36906b0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new sf0(this, 1));
        duration.addUpdateListener(new pf0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.bs.f25030f);
        duration.start();
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.O9, false);
        org.telegram.ui.Components.z31 z31Var = this.f41735f;
        z31Var.setColor(x02);
        z31Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.P9, false));
        this.f41739w.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21057h5, false)));
        this.f41736n.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21223q5, false));
        this.f41737r.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21092j5, false));
        int i10 = org.telegram.ui.ActionBar.h6.Wh;
        this.f41738s.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.v.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.h.g();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        FrameLayout frameLayout = this.f41739w;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - AndroidUtilities.dp(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}

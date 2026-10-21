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
public final class rf0 extends FrameLayout {
    public static final int E = 0;
    public final bg0 f41201a;
    public final ViewGroup f41202b;
    public final View f41203c;
    public final View d;
    public final View e;
    public final org.telegram.ui.Components.b41 f41204f;
    public final org.telegram.ui.Components.h20 h;
    public final TextView f41205n;
    public final TextView f41206r;
    public final TextView f41207s;
    public final TextView v;
    public final FrameLayout f41208w;
    public boolean f41209x;
    public final PointF f41210y;

    public rf0(Context context, ViewGroup viewGroup, View view, String str, final bg0 bg0Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        PointF pointF = new PointF();
        this.f41210y = pointF;
        this.f41202b = viewGroup;
        this.f41203c = view;
        this.f41201a = bg0Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new of0(this));
        addView(view2, w7.z5.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.b41 b41Var = new org.telegram.ui.Components.b41(getContext());
        this.f41204f = b41Var;
        b41Var.setTransformType(1);
        b41Var.setDrawBackground(false);
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, null, false);
        this.h = h20Var;
        h20Var.addView(b41Var, w7.z5.e(56, 56, 17));
        h20Var.a(b41Var);
        h20Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        bg0Var.a(this);
                        return;
                    default:
                        bg0Var.a(this);
                        return;
                }
            }
        });
        h20Var.setContentDescription(LocaleController.getString(R.string.Done));
        addView(h20Var, w7.z5.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f41208w = frameLayout;
        addView(frameLayout, w7.z5.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f41205n = textView;
        textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        TextView j10 = org.telegram.ui.Cells.c1.j(frameLayout, textView, w7.z5.d(-1, -2.0f, i10, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.f41206r = j10;
        j10.setText(str);
        j10.setTextSize(1, 18.0f);
        j10.setTypeface(AndroidUtilities.bold());
        j10.setSingleLine();
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(j10, w7.z5.d(-1, -2.0f, i11, 24.0f, 48.0f, 24.0f, 0.0f));
        int dp = AndroidUtilities.dp(16.0f);
        TextView textView2 = new TextView(context);
        this.f41207s = textView2;
        textView2.setText(LocaleController.getString(R.string.Edit));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i14 = org.telegram.ui.ActionBar.h6.Wh;
        textView2.setBackground(org.telegram.ui.ActionBar.h6.H0(dp2, org.telegram.ui.ActionBar.h6.x0(null, i14, false)));
        textView2.setOnClickListener(new of0(this, bg0Var));
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
        TextView j11 = org.telegram.ui.Cells.c1.j(frameLayout, textView2, w7.z5.d(-2, -2.0f, i12 | 80, f7, f7, f7, f7), context);
        this.v = j11;
        j11.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        j11.setSingleLine();
        j11.setTextSize(1, 16.0f);
        j11.setBackground(org.telegram.ui.ActionBar.h6.H0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.h6.x0(null, i14, false)));
        j11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        bg0Var.a(this);
                        return;
                    default:
                        bg0Var.a(this);
                        return;
                }
            }
        });
        j11.setTypeface(typeface);
        j11.setPadding(dp, i15, dp, i15);
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        frameLayout.addView(j11, w7.z5.d(-2, -2.0f, i13 | 80, f7, f7, f7, f7));
        ih.j.b(view, viewGroup, pointF);
        h20Var.setTranslationX(pointF.x);
        h20Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.f41209x) {
            return;
        }
        this.f41209x = true;
        this.f41201a.f35631a.V.f36370b0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new qf0(this, 1));
        duration.addUpdateListener(new nf0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.bs.f25021f);
        duration.start();
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.O9, false);
        org.telegram.ui.Components.b41 b41Var = this.f41204f;
        b41Var.setColor(x02);
        b41Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.P9, false));
        this.f41208w.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21061h5, false)));
        this.f41205n.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21227q5, false));
        this.f41206r.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21096j5, false));
        int i10 = org.telegram.ui.ActionBar.h6.Wh;
        this.f41207s.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.v.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.h.g();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        FrameLayout frameLayout = this.f41208w;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - AndroidUtilities.dp(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}

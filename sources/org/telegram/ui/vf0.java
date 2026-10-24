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
public final class vf0 extends FrameLayout {
    public static final int F = 0;
    public int E;
    public final fg0 f42722a;
    public final ViewGroup f42723b;
    public final View f42724c;
    public final View d;
    public final View e;
    public final org.telegram.ui.Components.e41 f42725f;
    public final org.telegram.ui.Components.f20 h;
    public final TextView f42726n;
    public final TextView f42727r;
    public final TextView f42728s;
    public final TextView v;
    public final FrameLayout f42729w;
    public boolean f42730x;
    public final PointF f42731y;

    public vf0(Context context, ViewGroup viewGroup, View view, String str, final fg0 fg0Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        PointF pointF = new PointF();
        this.f42731y = pointF;
        this.f42723b = viewGroup;
        this.f42724c = view;
        this.f42722a = fg0Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new sf0(this));
        addView(view2, w7.z5.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.e41 e41Var = new org.telegram.ui.Components.e41(getContext());
        this.f42725f = e41Var;
        e41Var.setTransformType(1);
        e41Var.setDrawBackground(false);
        org.telegram.ui.Components.f20 f20Var = new org.telegram.ui.Components.f20(context, null, false);
        this.h = f20Var;
        f20Var.addView(e41Var, w7.z5.e(56, 56, 17));
        f20Var.a(e41Var);
        f20Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        fg0Var.a(this);
                        return;
                    default:
                        fg0Var.a(this);
                        return;
                }
            }
        });
        f20Var.setContentDescription(LocaleController.getString(R.string.Done));
        addView(f20Var, w7.z5.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42729w = frameLayout;
        addView(frameLayout, w7.z5.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f42726n = textView;
        textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        TextView j10 = org.telegram.ui.Cells.b1.j(frameLayout, textView, w7.z5.d(-1, -2.0f, i10, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.f42727r = j10;
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
        this.f42728s = textView2;
        textView2.setText(LocaleController.getString(R.string.Edit));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i14 = org.telegram.ui.ActionBar.k6.Wh;
        textView2.setBackground(org.telegram.ui.ActionBar.k6.I0(dp2, org.telegram.ui.ActionBar.k6.x0(null, i14, false)));
        textView2.setOnClickListener(new sf0(this, fg0Var));
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
        TextView j11 = org.telegram.ui.Cells.b1.j(frameLayout, textView2, w7.z5.d(-2, -2.0f, i12 | 80, f7, f7, f7, f7), context);
        this.v = j11;
        j11.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        j11.setSingleLine();
        j11.setTextSize(1, 16.0f);
        j11.setBackground(org.telegram.ui.ActionBar.k6.I0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.k6.x0(null, i14, false)));
        j11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        fg0Var.a(this);
                        return;
                    default:
                        fg0Var.a(this);
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
        ih.k.b(view, viewGroup, pointF);
        f20Var.setTranslationX(pointF.x);
        f20Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.f42730x) {
            return;
        }
        this.f42730x = true;
        this.f42722a.f37332a.f37562a0.f37836b0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new uf0(this, 1));
        duration.addUpdateListener(new rf0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.zr.f33337f);
        duration.start();
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false);
        org.telegram.ui.Components.e41 e41Var = this.f42725f;
        e41Var.setColor(x02);
        e41Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P9, false));
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21255h5, false);
        FrameLayout frameLayout = this.f42729w;
        if (frameLayout.getBackground() == null) {
            frameLayout.setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(12.0f), x03));
        } else if (x03 != this.E) {
            org.telegram.ui.ActionBar.k6.z1(x03, frameLayout.getBackground());
            frameLayout.invalidate();
        }
        this.E = x03;
        this.f42726n.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21421q5, false));
        this.f42727r.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21290j5, false));
        int i10 = org.telegram.ui.ActionBar.k6.Wh;
        this.f42728s.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.v.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.h.updateColors();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        FrameLayout frameLayout = this.f42729w;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - AndroidUtilities.dp(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}

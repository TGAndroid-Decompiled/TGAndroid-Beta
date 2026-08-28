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
    public static final int A = 0;
    public final dg0 f42976a;
    public final ViewGroup f42977b;
    public final View f42978c;
    public final View d;
    public final View f42979e;
    public final org.telegram.ui.Components.j21 f42980f;
    public final org.telegram.ui.Components.j10 h;
    public final TextView f42981n;
    public final TextView f42982r;
    public final TextView f42983s;
    public final TextView v;
    public final FrameLayout f42984w;
    public boolean f42985x;
    public final PointF f42986y;

    public tf0(Context context, ViewGroup viewGroup, View view, String str, final dg0 dg0Var) {
        super(context);
        int i9;
        int i10;
        int i11;
        int i12;
        PointF pointF = new PointF();
        this.f42986y = pointF;
        this.f42977b = viewGroup;
        this.f42978c = view;
        this.f42976a = dg0Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new qf0(this));
        addView(view2, g7.e6.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.f42979e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, g7.e6.c(-1.0f, -1));
        org.telegram.ui.Components.j21 j21Var = new org.telegram.ui.Components.j21(getContext());
        this.f42980f = j21Var;
        j21Var.setTransformType(1);
        j21Var.setDrawBackground(false);
        org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(context, null, false);
        this.h = j10Var;
        j10Var.addView(j21Var, g7.e6.e(56, 56, 17));
        j10Var.a(j21Var);
        j10Var.setOnClickListener(new View.OnClickListener() {
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
        j10Var.setContentDescription(LocaleController.getString(R.string.Done));
        addView(j10Var, g7.e6.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42984w = frameLayout;
        addView(frameLayout, g7.e6.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f42981n = textView;
        textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        TextView g10 = org.telegram.ui.Cells.j2.g(frameLayout, textView, g7.e6.d(-1, -2.0f, i9, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.f42982r = g10;
        g10.setText(str);
        g10.setTextSize(1, 18.0f);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setSingleLine();
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(g10, g7.e6.d(-1, -2.0f, i10, 24.0f, 48.0f, 24.0f, 0.0f));
        int dp = AndroidUtilities.dp(16.0f);
        TextView textView2 = new TextView(context);
        this.f42983s = textView2;
        textView2.setText(LocaleController.getString(R.string.Edit));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i13 = org.telegram.ui.ActionBar.f6.Wh;
        textView2.setBackground(org.telegram.ui.ActionBar.f6.G0(dp2, org.telegram.ui.ActionBar.f6.w0(null, i13, false)));
        textView2.setOnClickListener(new qf0(this, dg0Var));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i14 = dp / 2;
        textView2.setPadding(dp, i14, dp, i14);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        float f10 = 8;
        TextView g11 = org.telegram.ui.Cells.j2.g(frameLayout, textView2, g7.e6.d(-2, -2.0f, i11 | 80, f10, f10, f10, f10), context);
        this.v = g11;
        g11.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        g11.setSingleLine();
        g11.setTextSize(1, 16.0f);
        g11.setBackground(org.telegram.ui.ActionBar.f6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.f6.w0(null, i13, false)));
        g11.setOnClickListener(new View.OnClickListener() {
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
        g11.setTypeface(typeface);
        g11.setPadding(dp, i14, dp, i14);
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        frameLayout.addView(g11, g7.e6.d(-2, -2.0f, i12 | 80, f10, f10, f10, f10));
        pg.i.b(view, viewGroup, pointF);
        j10Var.setTranslationX(pointF.x);
        j10Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.f42985x) {
            return;
        }
        this.f42985x = true;
        this.f42976a.f37537a.R.X = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new sf0(this, 1));
        duration.addUpdateListener(new pf0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.gr.f28844f);
        duration.start();
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.O9, false);
        org.telegram.ui.Components.j21 j21Var = this.f42980f;
        j21Var.setColor(w02);
        j21Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.P9, false));
        this.f42984w.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false)));
        this.f42981n.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23228q5, false));
        this.f42982r.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false));
        int i9 = org.telegram.ui.ActionBar.f6.Wh;
        this.f42983s.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.v.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.h.g();
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        FrameLayout frameLayout = this.f42984w;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - AndroidUtilities.dp(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}

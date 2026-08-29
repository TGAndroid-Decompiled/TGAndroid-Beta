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
    public final dg0 f42690a;
    public final ViewGroup f42691b;
    public final View f42692c;
    public final View d;
    public final View f42693e;
    public final org.telegram.ui.Components.u21 f42694f;
    public final org.telegram.ui.Components.u10 h;
    public final TextView f42695n;
    public final TextView f42696r;
    public final TextView f42697s;
    public final TextView v;
    public final FrameLayout f42698w;
    public boolean f42699x;
    public final PointF f42700y;

    public tf0(Context context, ViewGroup viewGroup, View view, String str, final dg0 dg0Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        PointF pointF = new PointF();
        this.f42700y = pointF;
        this.f42691b = viewGroup;
        this.f42692c = view;
        this.f42690a = dg0Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new qf0(this));
        addView(view2, i7.f6.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.f42693e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, i7.f6.c(-1.0f, -1));
        org.telegram.ui.Components.u21 u21Var = new org.telegram.ui.Components.u21(getContext());
        this.f42694f = u21Var;
        u21Var.setTransformType(1);
        u21Var.setDrawBackground(false);
        org.telegram.ui.Components.u10 u10Var = new org.telegram.ui.Components.u10(context, null, false);
        this.h = u10Var;
        u10Var.addView(u21Var, i7.f6.e(56, 56, 17));
        u10Var.a(u21Var);
        u10Var.setOnClickListener(new View.OnClickListener() {
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
        u10Var.setContentDescription(LocaleController.getString(R.string.Done));
        addView(u10Var, i7.f6.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42698w = frameLayout;
        addView(frameLayout, i7.f6.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f42695n = textView;
        textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        TextView h = th.h(frameLayout, textView, i7.f6.d(-1, -2.0f, i10, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.f42696r = h;
        h.setText(str);
        h.setTextSize(1, 18.0f);
        h.setTypeface(AndroidUtilities.bold());
        h.setSingleLine();
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(h, i7.f6.d(-1, -2.0f, i11, 24.0f, 48.0f, 24.0f, 0.0f));
        int dp = AndroidUtilities.dp(16.0f);
        TextView textView2 = new TextView(context);
        this.f42697s = textView2;
        textView2.setText(LocaleController.getString(R.string.Edit));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i14 = org.telegram.ui.ActionBar.g6.Wh;
        textView2.setBackground(org.telegram.ui.ActionBar.g6.G0(dp2, org.telegram.ui.ActionBar.g6.w0(null, i14, false)));
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
        float f9 = 8;
        TextView h10 = th.h(frameLayout, textView2, i7.f6.d(-2, -2.0f, i12 | 80, f9, f9, f9, f9), context);
        this.v = h10;
        h10.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        h10.setSingleLine();
        h10.setTextSize(1, 16.0f);
        h10.setBackground(org.telegram.ui.ActionBar.g6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.w0(null, i14, false)));
        h10.setOnClickListener(new View.OnClickListener() {
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
        h10.setTypeface(typeface);
        h10.setPadding(dp, i15, dp, i15);
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        frameLayout.addView(h10, i7.f6.d(-2, -2.0f, i13 | 80, f9, f9, f9, f9));
        sg.i.b(view, viewGroup, pointF);
        u10Var.setTranslationX(pointF.x);
        u10Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.f42699x) {
            return;
        }
        this.f42699x = true;
        this.f42690a.f37540a.R.X = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new sf0(this, 1));
        duration.addUpdateListener(new pf0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.jr.f29800f);
        duration.start();
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.O9, false);
        org.telegram.ui.Components.u21 u21Var = this.f42694f;
        u21Var.setColor(w02);
        u21Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.P9, false));
        this.f42698w.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false)));
        this.f42695n.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23294q5, false));
        this.f42696r.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false));
        int i10 = org.telegram.ui.ActionBar.g6.Wh;
        this.f42697s.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.v.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.h.g();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        FrameLayout frameLayout = this.f42698w;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - AndroidUtilities.dp(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}

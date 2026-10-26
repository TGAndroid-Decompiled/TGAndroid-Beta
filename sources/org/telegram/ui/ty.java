package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ty extends LinearLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f43934a;
    public final FrameLayout f43935b;
    public final org.telegram.ui.Components.y9 f43936c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.y9 f43937f;
    public final FrameLayout h;
    public ValueAnimator f43938n;
    public float f43939r;
    public int f43940s;
    public int v;

    public ty(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f43934a = u6Var;
        setOrientation(0);
        setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43935b = frameLayout;
        org.telegram.ui.Components.gb1.c(frameLayout, 0.05f, 1.25f);
        addView(frameLayout, org.telegram.ui.Components.gb1.s(-1, 226, 1.0f, 119));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f43936c = y9Var;
        y9Var.setImageDrawable(new org.telegram.ui.Components.xj0(R.raw.topics_tabs, AndroidUtilities.dp(160.0f), AndroidUtilities.dp(160.0f)));
        frameLayout.addView(y9Var, org.telegram.ui.Components.gb1.h(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i10 = org.telegram.ui.ActionBar.y6.f23767z6;
        TextView L = org.telegram.ui.Components.gb1.L(context, 14.0f, i10, true, null);
        L.setPadding(d3.h(12.0f, R.string.TopicsLayoutTabs, L), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(L, org.telegram.ui.Components.gb1.i(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.d = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int dp = AndroidUtilities.dp(13.0f);
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        frameLayout3.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(frameLayout3, c02, N, null, u6Var);
        frameLayout2.addView(frameLayout3, org.telegram.ui.Components.gb1.i(-2, 26, 17));
        int i12 = org.telegram.ui.ActionBar.y6.f23412g6;
        TextView L2 = org.telegram.ui.Components.gb1.L(context, 14.0f, i12, true, null);
        L2.setText(LocaleController.getString(R.string.TopicsLayoutTabs));
        frameLayout3.addView(L2, org.telegram.ui.Components.gb1.i(-2, -2, 17));
        frameLayout.addView(frameLayout2, org.telegram.ui.Components.gb1.h(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.e = frameLayout4;
        org.telegram.ui.Components.gb1.c(frameLayout4, 0.05f, 1.25f);
        addView(frameLayout4, org.telegram.ui.Components.gb1.s(-1, 226, 1.0f, 119));
        org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
        this.f43937f = y9Var2;
        y9Var2.setImageDrawable(new org.telegram.ui.Components.xj0(R.raw.topics_list, AndroidUtilities.dp(160.0f), AndroidUtilities.dp(160.0f)));
        frameLayout4.addView(y9Var2, org.telegram.ui.Components.gb1.h(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        TextView L3 = org.telegram.ui.Components.gb1.L(context, 14.0f, i10, true, null);
        L3.setPadding(d3.h(12.0f, R.string.TopicsLayoutList, L3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout5.addView(L3, org.telegram.ui.Components.gb1.i(-2, -2, 17));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.h = frameLayout6;
        frameLayout6.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        ShapeDrawable c03 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i11);
        frameLayout6.setBackground(c03);
        org.telegram.ui.ActionBar.f7.k(frameLayout6, c03, N2, null, u6Var);
        frameLayout5.addView(frameLayout6, org.telegram.ui.Components.gb1.i(-2, 26, 17));
        TextView L4 = org.telegram.ui.Components.gb1.L(context, 14.0f, i12, true, null);
        L4.setText(LocaleController.getString(R.string.TopicsLayoutList));
        frameLayout6.addView(L4, org.telegram.ui.Components.gb1.i(-2, -2, 17));
        frameLayout4.addView(frameLayout5, org.telegram.ui.Components.gb1.h(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
        a(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        ValueAnimator valueAnimator = this.f43938n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f43938n = null;
        }
        org.telegram.ui.Components.y9 y9Var = this.f43937f;
        org.telegram.ui.Components.y9 y9Var2 = this.f43936c;
        FrameLayout frameLayout = this.h;
        FrameLayout frameLayout2 = this.d;
        float f23 = 1.0f;
        if (z11) {
            ViewPropertyAnimator animate = frameLayout2.animate();
            if (!z10) {
                f17 = 0.0f;
            } else {
                f17 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f17);
            if (!z10) {
                f18 = 0.0f;
            } else {
                f18 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f18);
            if (!z10) {
                f19 = 0.0f;
            } else {
                f19 = 1.0f;
            }
            ViewPropertyAnimator alpha = scaleY.alpha(f19);
            org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
            alpha.setInterpolator(dsVar).setDuration(320L).start();
            ViewPropertyAnimator animate2 = frameLayout.animate();
            if (z10) {
                f20 = 0.0f;
            } else {
                f20 = 1.0f;
            }
            ViewPropertyAnimator scaleX2 = animate2.scaleX(f20);
            if (z10) {
                f21 = 0.0f;
            } else {
                f21 = 1.0f;
            }
            ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f21);
            if (z10) {
                f22 = 0.0f;
            } else {
                f22 = 1.0f;
            }
            scaleY2.alpha(f22).setInterpolator(dsVar).setDuration(320L).start();
            float f24 = this.f43939r;
            if (!z10) {
                f23 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f24, f23);
            this.f43938n = ofFloat;
            ofFloat.addUpdateListener(new b3(this, 10));
            this.f43938n.addListener(new jo(28, this, z10));
            this.f43938n.setInterpolator(dsVar);
            this.f43938n.setDuration(320L);
            this.f43938n.start();
        } else {
            frameLayout2.animate().cancel();
            frameLayout.animate().cancel();
            if (!z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            frameLayout2.setScaleX(f7);
            if (!z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            frameLayout2.setScaleY(f10);
            if (!z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            frameLayout2.setAlpha(f11);
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = 1.0f;
            }
            frameLayout.setScaleX(f12);
            if (z10) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            frameLayout.setScaleY(f13);
            if (z10) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            frameLayout.setAlpha(f14);
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            this.f43939r = f15;
            int i10 = org.telegram.ui.ActionBar.y6.C6;
            org.telegram.ui.ActionBar.u6 u6Var = this.f43934a;
            int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
            int i11 = org.telegram.ui.ActionBar.y6.Oh;
            int f25 = i0.a.f(this.f43939r, w02, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            y9Var2.setColorFilter(new PorterDuffColorFilter(f25, mode));
            y9Var2.invalidate();
            y9Var.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - this.f43939r, org.telegram.ui.ActionBar.y6.w0(i10, u6Var), org.telegram.ui.ActionBar.y6.w0(i11, u6Var)), mode));
            y9Var.invalidate();
        }
        if (z10) {
            y9Var = y9Var2;
        }
        org.telegram.ui.Components.xj0 lottieAnimation = y9Var.getImageReceiver().getLottieAnimation();
        if (lottieAnimation != null) {
            float t10 = lottieAnimation.t();
            if (z10) {
                f16 = 0.85f;
            } else {
                f16 = 0.8f;
            }
            if (t10 > f16) {
                lottieAnimation.T(0.0f, false);
            }
            lottieAnimation.H(true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.C6));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.y9 y9Var;
        org.telegram.ui.Components.y9 y9Var2;
        org.telegram.ui.ActionBar.u6 u6Var = this.f43934a;
        try {
            ValueAnimator valueAnimator = this.f43938n;
            if ((valueAnimator == null || !valueAnimator.isRunning()) && (y9Var = this.f43936c) != null && (y9Var2 = this.f43937f) != null) {
                int i10 = org.telegram.ui.ActionBar.y6.C6;
                int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
                int i11 = org.telegram.ui.ActionBar.y6.Oh;
                int f7 = i0.a.f(this.f43939r, w02, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
                int f10 = i0.a.f(1.0f - this.f43939r, org.telegram.ui.ActionBar.y6.w0(i10, u6Var), org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
                if (f7 != this.f43940s) {
                    this.f43940s = f7;
                    y9Var.setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
                    y9Var.invalidate();
                }
                if (f10 != this.v) {
                    this.v = f10;
                    y9Var2.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
                    y9Var2.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}

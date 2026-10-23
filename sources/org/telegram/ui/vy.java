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
public final class vy extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f42856a;
    public final FrameLayout f42857b;
    public final org.telegram.ui.Components.w9 f42858c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.w9 f42859f;
    public final FrameLayout h;
    public ValueAnimator f42860n;
    public float f42861r;
    public int f42862s;
    public int v;

    public vy(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f42856a = g6Var;
        setOrientation(0);
        setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42857b = frameLayout;
        w7.b6.b(frameLayout, 0.05f, 1.25f);
        addView(frameLayout, w7.z5.o(-1, 226, 1.0f, 119));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f42858c = w9Var;
        w9Var.setImageDrawable(new org.telegram.ui.Components.yj0(R.raw.topics_tabs, AndroidUtilities.dp(160.0f), AndroidUtilities.dp(160.0f)));
        frameLayout.addView(w9Var, w7.z5.d(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i10 = org.telegram.ui.ActionBar.k6.f21588z6;
        TextView b10 = w7.d6.b(context, 14.0f, i10, true, null);
        b10.setPadding(org.telegram.ui.Cells.b1.e(12.0f, R.string.TopicsLayoutTabs, b10), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(b10, w7.z5.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.d = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int dp = AndroidUtilities.dp(13.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
        frameLayout3.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(frameLayout3, c02, O, null, g6Var);
        frameLayout2.addView(frameLayout3, w7.z5.e(-2, 26, 17));
        int i12 = org.telegram.ui.ActionBar.k6.f21236g6;
        TextView b11 = w7.d6.b(context, 14.0f, i12, true, null);
        b11.setText(LocaleController.getString(R.string.TopicsLayoutTabs));
        frameLayout3.addView(b11, w7.z5.e(-2, -2, 17));
        frameLayout.addView(frameLayout2, w7.z5.d(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.e = frameLayout4;
        w7.b6.b(frameLayout4, 0.05f, 1.25f);
        addView(frameLayout4, w7.z5.o(-1, 226, 1.0f, 119));
        org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(context);
        this.f42859f = w9Var2;
        w9Var2.setImageDrawable(new org.telegram.ui.Components.yj0(R.raw.topics_list, AndroidUtilities.dp(160.0f), AndroidUtilities.dp(160.0f)));
        frameLayout4.addView(w9Var2, w7.z5.d(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        TextView b12 = w7.d6.b(context, 14.0f, i10, true, null);
        b12.setPadding(org.telegram.ui.Cells.b1.e(12.0f, R.string.TopicsLayoutList, b12), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout5.addView(b12, w7.z5.e(-2, -2, 17));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.h = frameLayout6;
        frameLayout6.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        ShapeDrawable c03 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i11);
        frameLayout6.setBackground(c03);
        org.telegram.ui.ActionBar.r6.k(frameLayout6, c03, O2, null, g6Var);
        frameLayout5.addView(frameLayout6, w7.z5.e(-2, 26, 17));
        TextView b13 = w7.d6.b(context, 14.0f, i12, true, null);
        b13.setText(LocaleController.getString(R.string.TopicsLayoutList));
        frameLayout6.addView(b13, w7.z5.e(-2, -2, 17));
        frameLayout4.addView(frameLayout5, w7.z5.d(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
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
        ValueAnimator valueAnimator = this.f42860n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f42860n = null;
        }
        org.telegram.ui.Components.w9 w9Var = this.f42859f;
        org.telegram.ui.Components.w9 w9Var2 = this.f42858c;
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
            org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
            alpha.setInterpolator(bsVar).setDuration(320L).start();
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
            scaleY2.alpha(f22).setInterpolator(bsVar).setDuration(320L).start();
            float f24 = this.f42861r;
            if (!z10) {
                f23 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f24, f23);
            this.f42860n = ofFloat;
            ofFloat.addUpdateListener(new d3(this, 11));
            this.f42860n.addListener(new ho(28, this, z10));
            this.f42860n.setInterpolator(bsVar);
            this.f42860n.setDuration(320L);
            this.f42860n.start();
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
            this.f42861r = f15;
            int i10 = org.telegram.ui.ActionBar.k6.C6;
            org.telegram.ui.ActionBar.g6 g6Var = this.f42856a;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
            int i11 = org.telegram.ui.ActionBar.k6.Oh;
            int f25 = i0.a.f(this.f42861r, w02, org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            w9Var2.setColorFilter(new PorterDuffColorFilter(f25, mode));
            w9Var2.invalidate();
            w9Var.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - this.f42861r, org.telegram.ui.ActionBar.k6.w0(i10, g6Var), org.telegram.ui.ActionBar.k6.w0(i11, g6Var)), mode));
            w9Var.invalidate();
        }
        if (z10) {
            w9Var = w9Var2;
        }
        org.telegram.ui.Components.yj0 lottieAnimation = w9Var.getImageReceiver().getLottieAnimation();
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.C6));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.w9 w9Var;
        org.telegram.ui.Components.w9 w9Var2;
        org.telegram.ui.ActionBar.g6 g6Var = this.f42856a;
        try {
            ValueAnimator valueAnimator = this.f42860n;
            if ((valueAnimator == null || !valueAnimator.isRunning()) && (w9Var = this.f42858c) != null && (w9Var2 = this.f42859f) != null) {
                int i10 = org.telegram.ui.ActionBar.k6.C6;
                int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
                int i11 = org.telegram.ui.ActionBar.k6.Oh;
                int f7 = i0.a.f(this.f42861r, w02, org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
                int f10 = i0.a.f(1.0f - this.f42861r, org.telegram.ui.ActionBar.k6.w0(i10, g6Var), org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
                if (f7 != this.f42862s) {
                    this.f42862s = f7;
                    w9Var.setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
                    w9Var.invalidate();
                }
                if (f10 != this.v) {
                    this.v = f10;
                    w9Var2.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
                    w9Var2.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}

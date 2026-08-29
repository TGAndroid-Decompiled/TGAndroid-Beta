package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wy extends LinearLayout {
    public final org.telegram.ui.ActionBar.c6 f44398a;
    public final FrameLayout f44399b;
    public final org.telegram.ui.Components.t9 f44400c;
    public final FrameLayout d;
    public final FrameLayout f44401e;
    public final org.telegram.ui.Components.t9 f44402f;
    public final FrameLayout h;
    public ValueAnimator f44403n;
    public float f44404r;

    public wy(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f44398a = c6Var;
        setOrientation(0);
        setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44399b = frameLayout;
        i7.h6.b(frameLayout, 0.05f, 1.25f);
        addView(frameLayout, i7.f6.o(-1, 226, 1.0f, 119));
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f44400c = t9Var;
        t9Var.setImageDrawable(new org.telegram.ui.Components.xi0(R.raw.topics_tabs, AndroidUtilities.dp(160.0f), "topics_tabs", AndroidUtilities.dp(160.0f)));
        frameLayout.addView(t9Var, i7.f6.d(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i10 = org.telegram.ui.ActionBar.g6.f23450z6;
        TextView b10 = i7.j6.b(context, 14.0f, i10, true, null);
        b10.setPadding(b.e(12.0f, R.string.TopicsLayoutTabs, b10), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(b10, i7.f6.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.d = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int dp = AndroidUtilities.dp(13.0f);
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.b0(dp, org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        frameLayout2.addView(frameLayout3, i7.f6.e(-2, 26, 17));
        int i12 = org.telegram.ui.ActionBar.g6.f23117g6;
        TextView b11 = i7.j6.b(context, 14.0f, i12, true, null);
        b11.setText(LocaleController.getString(R.string.TopicsLayoutTabs));
        frameLayout3.addView(b11, i7.f6.e(-2, -2, 17));
        frameLayout.addView(frameLayout2, i7.f6.d(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f44401e = frameLayout4;
        i7.h6.b(frameLayout4, 0.05f, 1.25f);
        addView(frameLayout4, i7.f6.o(-1, 226, 1.0f, 119));
        org.telegram.ui.Components.t9 t9Var2 = new org.telegram.ui.Components.t9(context);
        this.f44402f = t9Var2;
        t9Var2.setImageDrawable(new org.telegram.ui.Components.xi0(R.raw.topics_list, AndroidUtilities.dp(160.0f), "topics_list", AndroidUtilities.dp(160.0f)));
        frameLayout4.addView(t9Var2, i7.f6.d(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        TextView b12 = i7.j6.b(context, 14.0f, i10, true, null);
        b12.setPadding(b.e(12.0f, R.string.TopicsLayoutList, b12), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout5.addView(b12, i7.f6.e(-2, -2, 17));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.h = frameLayout6;
        frameLayout6.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout6.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        frameLayout5.addView(frameLayout6, i7.f6.e(-2, 26, 17));
        TextView b13 = i7.j6.b(context, 14.0f, i12, true, null);
        b13.setText(LocaleController.getString(R.string.TopicsLayoutList));
        frameLayout6.addView(b13, i7.f6.e(-2, -2, 17));
        frameLayout4.addView(frameLayout5, i7.f6.d(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
        a(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        float f9;
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
        ValueAnimator valueAnimator = this.f44403n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f44403n = null;
        }
        org.telegram.ui.Components.t9 t9Var = this.f44402f;
        org.telegram.ui.Components.t9 t9Var2 = this.f44400c;
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
            org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
            alpha.setInterpolator(jrVar).setDuration(320L).start();
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
            scaleY2.alpha(f22).setInterpolator(jrVar).setDuration(320L).start();
            float f24 = this.f44404r;
            if (!z10) {
                f23 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f24, f23);
            this.f44403n = ofFloat;
            ofFloat.addUpdateListener(new g3(this, 11));
            this.f44403n.addListener(new org.telegram.ui.Components.z9(27, this, z10));
            this.f44403n.setInterpolator(jrVar);
            this.f44403n.setDuration(320L);
            this.f44403n.start();
        } else {
            frameLayout2.animate().cancel();
            frameLayout.animate().cancel();
            if (!z10) {
                f9 = 0.0f;
            } else {
                f9 = 1.0f;
            }
            frameLayout2.setScaleX(f9);
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
            this.f44404r = f15;
            int i10 = org.telegram.ui.ActionBar.g6.C6;
            org.telegram.ui.ActionBar.c6 c6Var = this.f44398a;
            int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
            int i11 = org.telegram.ui.ActionBar.g6.Oh;
            int d = i0.a.d(this.f44404r, v02, org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            t9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
            t9Var2.invalidate();
            t9Var.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - this.f44404r, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(i11, c6Var)), mode));
            t9Var.invalidate();
        }
        if (z10) {
            t9Var = t9Var2;
        }
        org.telegram.ui.Components.xi0 lottieAnimation = t9Var.getImageReceiver().getLottieAnimation();
        if (lottieAnimation != null) {
            float r6 = lottieAnimation.r();
            if (z10) {
                f16 = 0.85f;
            } else {
                f16 = 0.8f;
            }
            if (r6 > f16) {
                lottieAnimation.Q(0.0f, false);
            }
            lottieAnimation.F(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}

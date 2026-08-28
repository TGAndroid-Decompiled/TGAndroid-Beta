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
public final class uy extends LinearLayout {
    public final org.telegram.ui.ActionBar.b6 f43334a;
    public final FrameLayout f43335b;
    public final org.telegram.ui.Components.o9 f43336c;
    public final FrameLayout d;
    public final FrameLayout f43337e;
    public final org.telegram.ui.Components.o9 f43338f;
    public final FrameLayout h;
    public ValueAnimator f43339n;
    public float f43340r;

    public uy(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f43334a = b6Var;
        setOrientation(0);
        setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43335b = frameLayout;
        g7.g6.b(frameLayout, 0.05f, 1.25f);
        addView(frameLayout, g7.e6.o(-1, 226, 1.0f, 119));
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f43336c = o9Var;
        o9Var.setImageDrawable(new org.telegram.ui.Components.mi0(R.raw.topics_tabs, AndroidUtilities.dp(160.0f), "topics_tabs", AndroidUtilities.dp(160.0f)));
        frameLayout.addView(o9Var, g7.e6.d(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i9 = org.telegram.ui.ActionBar.f6.f23386z6;
        TextView b10 = g7.i6.b(context, 14.0f, i9, true, null);
        b10.setPadding(org.telegram.ui.Cells.j2.c(12.0f, R.string.TopicsLayoutTabs, b10), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(b10, g7.e6.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.d = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int dp = AndroidUtilities.dp(13.0f);
        int i10 = org.telegram.ui.ActionBar.f6.Oh;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.f6.b0(dp, org.telegram.ui.ActionBar.f6.v0(i10, b6Var)));
        frameLayout2.addView(frameLayout3, g7.e6.e(-2, 26, 17));
        int i11 = org.telegram.ui.ActionBar.f6.f23055g6;
        TextView b11 = g7.i6.b(context, 14.0f, i11, true, null);
        b11.setText(LocaleController.getString(R.string.TopicsLayoutTabs));
        frameLayout3.addView(b11, g7.e6.e(-2, -2, 17));
        frameLayout.addView(frameLayout2, g7.e6.d(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f43337e = frameLayout4;
        g7.g6.b(frameLayout4, 0.05f, 1.25f);
        addView(frameLayout4, g7.e6.o(-1, 226, 1.0f, 119));
        org.telegram.ui.Components.o9 o9Var2 = new org.telegram.ui.Components.o9(context);
        this.f43338f = o9Var2;
        o9Var2.setImageDrawable(new org.telegram.ui.Components.mi0(R.raw.topics_list, AndroidUtilities.dp(160.0f), "topics_list", AndroidUtilities.dp(160.0f)));
        frameLayout4.addView(o9Var2, g7.e6.d(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        TextView b12 = g7.i6.b(context, 14.0f, i9, true, null);
        b12.setPadding(org.telegram.ui.Cells.j2.c(12.0f, R.string.TopicsLayoutList, b12), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout5.addView(b12, g7.e6.e(-2, -2, 17));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.h = frameLayout6;
        frameLayout6.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout6.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.f6.v0(i10, b6Var)));
        frameLayout5.addView(frameLayout6, g7.e6.e(-2, 26, 17));
        TextView b13 = g7.i6.b(context, 14.0f, i11, true, null);
        b13.setText(LocaleController.getString(R.string.TopicsLayoutList));
        frameLayout6.addView(b13, g7.e6.e(-2, -2, 17));
        frameLayout4.addView(frameLayout5, g7.e6.d(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
        a(false, false);
    }

    public final void a(boolean z10, boolean z11) {
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
        float f23;
        ValueAnimator valueAnimator = this.f43339n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f43339n = null;
        }
        org.telegram.ui.Components.o9 o9Var = this.f43338f;
        org.telegram.ui.Components.o9 o9Var2 = this.f43336c;
        FrameLayout frameLayout = this.h;
        FrameLayout frameLayout2 = this.d;
        float f24 = 1.0f;
        if (z11) {
            ViewPropertyAnimator animate = frameLayout2.animate();
            if (!z10) {
                f18 = 0.0f;
            } else {
                f18 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f18);
            if (!z10) {
                f19 = 0.0f;
            } else {
                f19 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f19);
            if (!z10) {
                f20 = 0.0f;
            } else {
                f20 = 1.0f;
            }
            ViewPropertyAnimator alpha = scaleY.alpha(f20);
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
            alpha.setInterpolator(grVar).setDuration(320L).start();
            ViewPropertyAnimator animate2 = frameLayout.animate();
            if (z10) {
                f21 = 0.0f;
            } else {
                f21 = 1.0f;
            }
            ViewPropertyAnimator scaleX2 = animate2.scaleX(f21);
            if (z10) {
                f22 = 0.0f;
            } else {
                f22 = 1.0f;
            }
            ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f22);
            if (z10) {
                f23 = 0.0f;
            } else {
                f23 = 1.0f;
            }
            scaleY2.alpha(f23).setInterpolator(grVar).setDuration(320L).start();
            float f25 = this.f43340r;
            if (!z10) {
                f24 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f25, f24);
            this.f43339n = ofFloat;
            ofFloat.addUpdateListener(new f3(this, 11));
            this.f43339n.addListener(new org.telegram.ui.Components.u9(27, this, z10));
            this.f43339n.setInterpolator(grVar);
            this.f43339n.setDuration(320L);
            this.f43339n.start();
        } else {
            frameLayout2.animate().cancel();
            frameLayout.animate().cancel();
            if (!z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            frameLayout2.setScaleX(f10);
            if (!z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            frameLayout2.setScaleY(f11);
            if (!z10) {
                f12 = 0.0f;
            } else {
                f12 = 1.0f;
            }
            frameLayout2.setAlpha(f12);
            if (z10) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            frameLayout.setScaleX(f13);
            if (z10) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            frameLayout.setScaleY(f14);
            if (z10) {
                f15 = 0.0f;
            } else {
                f15 = 1.0f;
            }
            frameLayout.setAlpha(f15);
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            this.f43340r = f16;
            int i9 = org.telegram.ui.ActionBar.f6.C6;
            org.telegram.ui.ActionBar.b6 b6Var = this.f43334a;
            int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
            int i10 = org.telegram.ui.ActionBar.f6.Oh;
            int d = i0.a.d(this.f43340r, v02, org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            o9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
            o9Var2.invalidate();
            o9Var.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - this.f43340r, org.telegram.ui.ActionBar.f6.v0(i9, b6Var), org.telegram.ui.ActionBar.f6.v0(i10, b6Var)), mode));
            o9Var.invalidate();
        }
        if (z10) {
            o9Var = o9Var2;
        }
        org.telegram.ui.Components.mi0 lottieAnimation = o9Var.getImageReceiver().getLottieAnimation();
        if (lottieAnimation != null) {
            float r10 = lottieAnimation.r();
            if (z10) {
                f17 = 0.85f;
            } else {
                f17 = 0.8f;
            }
            if (r10 > f17) {
                lottieAnimation.Q(0.0f, false);
            }
            lottieAnimation.F(true);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
    }
}

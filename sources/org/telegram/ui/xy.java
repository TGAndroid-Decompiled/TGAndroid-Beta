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

public final class xy extends LinearLayout {

    public final org.telegram.ui.ActionBar.c6 f44638a;

    public final FrameLayout f44639b;

    public final org.telegram.ui.Components.n9 f44640c;
    public final FrameLayout d;

    public final FrameLayout f44641e;

    public final org.telegram.ui.Components.n9 f44642f;
    public final FrameLayout h;

    public ValueAnimator f44643n;

    public float f44644r;

    public xy(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f44638a = c6Var;
        setOrientation(0);
        setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44639b = frameLayout;
        h7.b6.b(frameLayout, 0.05f, 1.25f);
        addView(frameLayout, h7.z5.o(-1, 226, 1.0f, 119));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f44640c = n9Var;
        n9Var.setImageDrawable(new org.telegram.ui.Components.oi0(R.raw.topics_tabs, AndroidUtilities.dp(160.0f), "topics_tabs", AndroidUtilities.dp(160.0f)));
        frameLayout.addView(n9Var, h7.z5.d(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i10 = org.telegram.ui.ActionBar.g6.f23441z6;
        TextView textViewB = h7.d6.b(context, 14.0f, i10, true, null);
        textViewB.setPadding(org.telegram.ui.Cells.pa.c(12.0f, R.string.TopicsLayoutTabs, textViewB), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textViewB, h7.z5.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.d = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int iDp = AndroidUtilities.dp(13.0f);
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.b0(iDp, org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        frameLayout2.addView(frameLayout3, h7.z5.e(-2, 26, 17));
        int i12 = org.telegram.ui.ActionBar.g6.f23108g6;
        TextView textViewB2 = h7.d6.b(context, 14.0f, i12, true, null);
        textViewB2.setText(LocaleController.getString(R.string.TopicsLayoutTabs));
        frameLayout3.addView(textViewB2, h7.z5.e(-2, -2, 17));
        frameLayout.addView(frameLayout2, h7.z5.d(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f44641e = frameLayout4;
        h7.b6.b(frameLayout4, 0.05f, 1.25f);
        addView(frameLayout4, h7.z5.o(-1, 226, 1.0f, 119));
        org.telegram.ui.Components.n9 n9Var2 = new org.telegram.ui.Components.n9(context);
        this.f44642f = n9Var2;
        n9Var2.setImageDrawable(new org.telegram.ui.Components.oi0(R.raw.topics_list, AndroidUtilities.dp(160.0f), "topics_list", AndroidUtilities.dp(160.0f)));
        frameLayout4.addView(n9Var2, h7.z5.d(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        TextView textViewB3 = h7.d6.b(context, 14.0f, i10, true, null);
        textViewB3.setPadding(org.telegram.ui.Cells.pa.c(12.0f, R.string.TopicsLayoutList, textViewB3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout5.addView(textViewB3, h7.z5.e(-2, -2, 17));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.h = frameLayout6;
        frameLayout6.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout6.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        frameLayout5.addView(frameLayout6, h7.z5.e(-2, 26, 17));
        TextView textViewB4 = h7.d6.b(context, 14.0f, i12, true, null);
        textViewB4.setText(LocaleController.getString(R.string.TopicsLayoutList));
        frameLayout6.addView(textViewB4, h7.z5.e(-2, -2, 17));
        frameLayout4.addView(frameLayout5, h7.z5.d(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
        a(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f44643n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f44643n = null;
        }
        org.telegram.ui.Components.n9 n9Var = this.f44642f;
        org.telegram.ui.Components.n9 n9Var2 = this.f44640c;
        FrameLayout frameLayout = this.h;
        FrameLayout frameLayout2 = this.d;
        if (z11) {
            ViewPropertyAnimator viewPropertyAnimatorAlpha = frameLayout2.animate().scaleX(!z10 ? 0.0f : 1.0f).scaleY(!z10 ? 0.0f : 1.0f).alpha(!z10 ? 0.0f : 1.0f);
            org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
            viewPropertyAnimatorAlpha.setInterpolator(erVar).setDuration(320L).start();
            frameLayout.animate().scaleX(z10 ? 0.0f : 1.0f).scaleY(z10 ? 0.0f : 1.0f).alpha(z10 ? 0.0f : 1.0f).setInterpolator(erVar).setDuration(320L).start();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f44644r, z10 ? 1.0f : 0.0f);
            this.f44643n = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new g3(this, 11));
            this.f44643n.addListener(new go(28, this, z10));
            this.f44643n.setInterpolator(erVar);
            this.f44643n.setDuration(320L);
            this.f44643n.start();
        } else {
            frameLayout2.animate().cancel();
            frameLayout.animate().cancel();
            frameLayout2.setScaleX(!z10 ? 0.0f : 1.0f);
            frameLayout2.setScaleY(!z10 ? 0.0f : 1.0f);
            frameLayout2.setAlpha(!z10 ? 0.0f : 1.0f);
            frameLayout.setScaleX(z10 ? 0.0f : 1.0f);
            frameLayout.setScaleY(z10 ? 0.0f : 1.0f);
            frameLayout.setAlpha(z10 ? 0.0f : 1.0f);
            this.f44644r = z10 ? 1.0f : 0.0f;
            int i10 = org.telegram.ui.ActionBar.g6.C6;
            org.telegram.ui.ActionBar.c6 c6Var = this.f44638a;
            int iV0 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
            int i11 = org.telegram.ui.ActionBar.g6.Oh;
            int iD = i0.b.d(this.f44644r, iV0, org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            n9Var2.setColorFilter(new PorterDuffColorFilter(iD, mode));
            n9Var2.invalidate();
            n9Var.setColorFilter(new PorterDuffColorFilter(i0.b.d(1.0f - this.f44644r, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(i11, c6Var)), mode));
            n9Var.invalidate();
        }
        if (z10) {
            n9Var = n9Var2;
        }
        org.telegram.ui.Components.oi0 lottieAnimation = n9Var.getImageReceiver().getLottieAnimation();
        if (lottieAnimation != null) {
            if (lottieAnimation.r() > (z10 ? 0.85f : 0.8f)) {
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

package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class vb0 extends FrameLayout {

    public final org.telegram.ui.Components.p9 f43402a;

    public final SpannableStringBuilder f43403b;

    public final org.telegram.ui.Cells.v1 f43404c;
    public final TextView d;

    public final org.telegram.ui.Cells.v1 f43405e;

    public final TextView f43406f;
    public final org.telegram.ui.Components.qn0 h;

    public final tb0 f43407n;

    public boolean f43408r;

    public float f43409s;
    public ValueAnimator v;

    public float f43410w;

    public ValueAnimator f43411x;

    public final xb0 f43412y;

    public vb0(xb0 xb0Var, Context context) {
        super(context);
        this.f43412y = xb0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        boolean z10 = true;
        org.telegram.ui.Cells.pa.m(15.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.g6.L6;
        boolean z11 = false;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setText(LocaleController.getString("LiteBatteryTitle"));
        linearLayout.addView(textView, h7.z5.q(-2, -2, 16));
        org.telegram.ui.Cells.v1 v1Var = new org.telegram.ui.Cells.v1(context, z10, z11, z11);
        v1Var.v = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        this.f43404c = v1Var;
        v1Var.setTypeface(AndroidUtilities.bold());
        v1Var.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f));
        v1Var.setTextSize(AndroidUtilities.dp(12.0f));
        v1Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        linearLayout.addView(v1Var, h7.z5.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, h7.z5.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.qn0 qn0Var = new org.telegram.ui.Components.qn0(context, null, true);
        this.h = qn0Var;
        qn0Var.setReportChanges(true);
        qn0Var.setDelegate(new g(this, 23));
        qn0Var.setProgress(LiteMode.getPowerSaverLevel() / 100.0f);
        qn0Var.setImportantForAccessibility(2);
        addView(qn0Var, h7.z5.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i11 = org.telegram.ui.ActionBar.g6.f23423y6;
        org.telegram.ui.Cells.pa.s(i11, null, false, textView2, 3);
        textView2.setText(LocaleController.getString(R.string.LiteBatteryDisabled));
        frameLayout.addView(textView2, h7.z5.e(-2, -2, 19));
        org.telegram.ui.Cells.v1 v1Var2 = new org.telegram.ui.Cells.v1(this, context);
        this.f43405e = v1Var2;
        v1Var2.b(0.45f, 240L, org.telegram.ui.Components.er.h);
        v1Var2.setGravity(1);
        v1Var2.setTextSize(AndroidUtilities.dp(13.0f));
        v1Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23234n6, false));
        frameLayout.addView(v1Var2, h7.z5.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.f43403b = spannableStringBuilder;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9();
        this.f43402a = p9Var;
        p9Var.f31564a = v1Var2.getPaint();
        p9Var.f31568f = AndroidUtilities.dp(1.5f);
        p9Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(-20.0f), AndroidUtilities.dp(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(p9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f43406f = textView3;
        textView3.setTextSize(1, 13.0f);
        org.telegram.ui.Cells.pa.s(i11, null, false, textView3, 5);
        textView3.setText(LocaleController.getString(R.string.LiteBatteryEnabled));
        frameLayout.addView(textView3, h7.z5.e(-2, -2, 21));
        addView(frameLayout, h7.z5.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.f43407n = new tb0(this);
        a();
    }

    public final void a() {
        int powerSaverLevel = LiteMode.getPowerSaverLevel();
        org.telegram.ui.Cells.v1 v1Var = this.f43405e;
        v1Var.a();
        final int i10 = 0;
        final int i11 = 1;
        if (powerSaverLevel <= 0) {
            v1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysDisabled), !LocaleController.isRTL, true);
        } else if (powerSaverLevel >= 100) {
            v1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysEnabled), !LocaleController.isRTL, true);
        } else {
            float f10 = powerSaverLevel;
            this.f43402a.a(f10 / 100.0f, true);
            v1Var.c(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.LiteBatteryWhenBelow), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f10))), this.f43403b)), !LocaleController.isRTL, true);
        }
        String upperCase = LocaleController.getString(LiteMode.isPowerSaverApplied() ? R.string.LiteBatteryEnabled : R.string.LiteBatteryDisabled).toUpperCase();
        org.telegram.ui.Cells.v1 v1Var2 = this.f43404c;
        v1Var2.setText(upperCase);
        boolean z10 = powerSaverLevel > 0 && powerSaverLevel < 100;
        if (z10 != this.f43408r) {
            this.f43408r = z10;
            v1Var2.clearAnimation();
            org.telegram.messenger.rl.o(v1Var2.animate().alpha(z10 ? 1.0f : 0.0f), org.telegram.ui.Components.er.h, 220L);
        }
        float f11 = powerSaverLevel >= 100 ? 1.0f : 0.0f;
        if (this.f43409s != f11) {
            this.f43409s = f11;
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f43409s, f11);
            this.v = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                public final vb0 f42571b;

                {
                    this.f42571b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (i10) {
                        case 0:
                            vb0 vb0Var = this.f42571b;
                            TextView textView = vb0Var.f43406f;
                            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23423y6, false);
                            int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23234n6, false);
                            float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            vb0Var.f43409s = fFloatValue;
                            textView.setTextColor(i0.b.d(fFloatValue, iW0, iW1));
                            break;
                        default:
                            vb0 vb0Var2 = this.f42571b;
                            TextView textView2 = vb0Var2.d;
                            int iW2 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23423y6, false);
                            int iW3 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23234n6, false);
                            float fFloatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            vb0Var2.f43410w = fFloatValue2;
                            textView2.setTextColor(i0.b.d(fFloatValue2, iW2, iW3));
                            break;
                    }
                }
            });
            this.v.addListener(new ub0(this, f11, 0));
            this.v.setInterpolator(org.telegram.ui.Components.er.h);
            this.v.setDuration(320L);
            this.v.start();
        }
        float f12 = powerSaverLevel <= 0 ? 1.0f : 0.0f;
        if (this.f43410w != f12) {
            this.f43410w = f12;
            ValueAnimator valueAnimator2 = this.f43411x;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f43411x = null;
            }
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.f43410w, f12);
            this.f43411x = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                public final vb0 f42571b;

                {
                    this.f42571b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    switch (i11) {
                        case 0:
                            vb0 vb0Var = this.f42571b;
                            TextView textView = vb0Var.f43406f;
                            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23423y6, false);
                            int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23234n6, false);
                            float fFloatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                            vb0Var.f43409s = fFloatValue;
                            textView.setTextColor(i0.b.d(fFloatValue, iW0, iW1));
                            break;
                        default:
                            vb0 vb0Var2 = this.f42571b;
                            TextView textView2 = vb0Var2.d;
                            int iW2 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23423y6, false);
                            int iW3 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23234n6, false);
                            float fFloatValue2 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                            vb0Var2.f43410w = fFloatValue2;
                            textView2.setTextColor(i0.b.d(fFloatValue2, iW2, iW3));
                            break;
                    }
                }
            });
            this.f43411x.addListener(new ub0(this, f12, 1));
            this.f43411x.setInterpolator(org.telegram.ui.Components.er.h);
            this.f43411x.setDuration(320L);
            this.f43411x.start();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f43407n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(112.0f), 1073741824));
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.f43407n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f43407n.performAccessibilityAction(this, i10, bundle);
    }
}

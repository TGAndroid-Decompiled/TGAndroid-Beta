package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sb0 extends FrameLayout {
    public final org.telegram.ui.Components.v9 f42341a;
    public final SpannableStringBuilder f42342b;
    public final org.telegram.ui.Cells.v1 f42343c;
    public final TextView d;
    public final org.telegram.ui.Cells.v1 f42344e;
    public final TextView f42345f;
    public final org.telegram.ui.Components.ao0 h;
    public final qb0 f42346n;
    public boolean f42347r;
    public float f42348s;
    public ValueAnimator v;
    public float f42349w;
    public ValueAnimator f42350x;
    public final ub0 f42351y;

    public sb0(ub0 ub0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.f42351y = ub0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        linearLayout.setGravity(i10);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        th.n(15.0f, 1, textView);
        int i12 = org.telegram.ui.ActionBar.g6.L6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11);
        textView.setText(LocaleController.getString("LiteBatteryTitle"));
        linearLayout.addView(textView, i7.f6.q(-2, -2, 16));
        org.telegram.ui.Cells.v1 v1Var = new org.telegram.ui.Cells.v1(context, true, false, false);
        v1Var.v = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, org.telegram.ui.ActionBar.g6.w0(null, i12, false)));
        this.f42343c = v1Var;
        v1Var.setTypeface(AndroidUtilities.bold());
        v1Var.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f));
        v1Var.setTextSize(AndroidUtilities.dp(12.0f));
        v1Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        linearLayout.addView(v1Var, i7.f6.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, i7.f6.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.ao0 ao0Var = new org.telegram.ui.Components.ao0(context, null, true);
        this.h = ao0Var;
        ao0Var.setReportChanges(true);
        ao0Var.setDelegate(new h(this, 23));
        ao0Var.setProgress(LiteMode.getPowerSaverLevel() / 100.0f);
        ao0Var.setImportantForAccessibility(2);
        addView(ao0Var, i7.f6.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i13 = org.telegram.ui.ActionBar.g6.f23433y6;
        th.s(i13, null, false, textView2, 3);
        textView2.setText(LocaleController.getString(R.string.LiteBatteryDisabled));
        frameLayout.addView(textView2, i7.f6.e(-2, -2, 19));
        org.telegram.ui.Cells.v1 v1Var2 = new org.telegram.ui.Cells.v1(this, context);
        this.f42344e = v1Var2;
        v1Var2.b(0.45f, 240L, org.telegram.ui.Components.jr.h);
        v1Var2.setGravity(1);
        v1Var2.setTextSize(AndroidUtilities.dp(13.0f));
        v1Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23241n6, false));
        frameLayout.addView(v1Var2, i7.f6.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.f42342b = spannableStringBuilder;
        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9();
        this.f42341a = v9Var;
        v9Var.f33496a = v1Var2.getPaint();
        v9Var.f33500f = AndroidUtilities.dp(1.5f);
        v9Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(-20.0f), AndroidUtilities.dp(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(v9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f42345f = textView3;
        textView3.setTextSize(1, 13.0f);
        th.s(i13, null, false, textView3, 5);
        textView3.setText(LocaleController.getString(R.string.LiteBatteryEnabled));
        frameLayout.addView(textView3, i7.f6.e(-2, -2, 21));
        addView(frameLayout, i7.f6.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.f42346n = new qb0(this);
        a();
    }

    public final void a() {
        int i10;
        boolean z10;
        float f9;
        float f10;
        int powerSaverLevel = LiteMode.getPowerSaverLevel();
        org.telegram.ui.Cells.v1 v1Var = this.f42344e;
        v1Var.a();
        if (powerSaverLevel <= 0) {
            v1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysDisabled), !LocaleController.isRTL, true);
        } else if (powerSaverLevel >= 100) {
            v1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysEnabled), !LocaleController.isRTL, true);
        } else {
            float f11 = powerSaverLevel;
            this.f42341a.a(f11 / 100.0f, true);
            v1Var.c(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.LiteBatteryWhenBelow), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f11))), this.f42342b)), !LocaleController.isRTL, true);
        }
        if (LiteMode.isPowerSaverApplied()) {
            i10 = R.string.LiteBatteryEnabled;
        } else {
            i10 = R.string.LiteBatteryDisabled;
        }
        String upperCase = LocaleController.getString(i10).toUpperCase();
        org.telegram.ui.Cells.v1 v1Var2 = this.f42343c;
        v1Var2.setText(upperCase);
        if (powerSaverLevel > 0 && powerSaverLevel < 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f12 = 0.0f;
        if (z10 != this.f42347r) {
            this.f42347r = z10;
            v1Var2.clearAnimation();
            ViewPropertyAnimator animate = v1Var2.animate();
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            b.q(animate.alpha(f10), org.telegram.ui.Components.jr.h, 220L);
        }
        if (powerSaverLevel >= 100) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        if (this.f42348s != f9) {
            this.f42348s = f9;
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f42348s, f9);
            this.v = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final sb0 f41353b;

                {
                    this.f41353b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            sb0 sb0Var = this.f41353b;
                            TextView textView = sb0Var.f42345f;
                            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23433y6, false);
                            int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23241n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            sb0Var.f42348s = floatValue;
                            textView.setTextColor(i0.a.d(floatValue, w02, w03));
                            return;
                        default:
                            sb0 sb0Var2 = this.f41353b;
                            TextView textView2 = sb0Var2.d;
                            int w04 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23433y6, false);
                            int w05 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23241n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            sb0Var2.f42349w = floatValue2;
                            textView2.setTextColor(i0.a.d(floatValue2, w04, w05));
                            return;
                    }
                }
            });
            this.v.addListener(new rb0(this, f9, 0));
            this.v.setInterpolator(org.telegram.ui.Components.jr.h);
            this.v.setDuration(320L);
            this.v.start();
        }
        if (powerSaverLevel <= 0) {
            f12 = 1.0f;
        }
        if (this.f42349w != f12) {
            this.f42349w = f12;
            ValueAnimator valueAnimator2 = this.f42350x;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f42350x = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f42349w, f12);
            this.f42350x = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final sb0 f41353b;

                {
                    this.f41353b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            sb0 sb0Var = this.f41353b;
                            TextView textView = sb0Var.f42345f;
                            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23433y6, false);
                            int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23241n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            sb0Var.f42348s = floatValue;
                            textView.setTextColor(i0.a.d(floatValue, w02, w03));
                            return;
                        default:
                            sb0 sb0Var2 = this.f41353b;
                            TextView textView2 = sb0Var2.d;
                            int w04 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23433y6, false);
                            int w05 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23241n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            sb0Var2.f42349w = floatValue2;
                            textView2.setTextColor(i0.a.d(floatValue2, w04, w05));
                            return;
                    }
                }
            });
            this.f42350x.addListener(new rb0(this, f12, 1));
            this.f42350x.setInterpolator(org.telegram.ui.Components.jr.h);
            this.f42350x.setDuration(320L);
            this.f42350x.start();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f42346n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(112.0f), 1073741824));
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.f42346n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f42346n.performAccessibilityAction(this, i10, bundle);
    }
}

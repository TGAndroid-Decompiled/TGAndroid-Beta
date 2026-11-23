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
import java.util.HashSet;
public final class w90 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final y90 E;
    public final org.telegram.ui.Components.r9 f53204a;
    public final SpannableStringBuilder f53205b;
    public final org.telegram.ui.Cells.b2 f53206c;
    public final TextView d;
    public final org.telegram.ui.Cells.b2 f53207e;
    public final TextView f53208f;
    public final org.telegram.ui.Components.an0 h;
    public final org.telegram.ui.Components.eu0 f53209n;
    public boolean f53210r;
    public float f53211s;
    public ValueAnimator f53212w;
    public float f53213x;
    public ValueAnimator f53214y;

    public w90(y90 y90Var, Context context) {
        super(context);
        int i7;
        int i10;
        this.E = y90Var;
        LinearLayout linearLayout = new LinearLayout(context);
        if (org.telegram.messenger.gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        linearLayout.setGravity(i7);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        i5.c.x(textView, 1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.n6.L6;
        org.telegram.ui.ActionBar.u6.U(textView, i11, null);
        if (org.telegram.messenger.gd.f24314a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setText(org.telegram.messenger.gd.O0("LiteBatteryTitle"));
        linearLayout.addView(textView, c8.na.r(-2, -2, 16));
        org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(context, true, false, false);
        b2Var.f30510w = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, org.telegram.ui.ActionBar.n6.x0(null, i11, false)));
        this.f53206c = b2Var;
        b2Var.setTypeface(org.telegram.messenger.g0.o());
        b2Var.setPadding(org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f));
        b2Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.ActionBar.u6.Y(b2Var, i11, null);
        linearLayout.addView(b2Var, c8.na.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, c8.na.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.an0 an0Var = new org.telegram.ui.Components.an0(context, null, true);
        this.h = an0Var;
        an0Var.setReportChanges(true);
        an0Var.setDelegate(new f(this, 20));
        an0Var.setProgress(org.telegram.messenger.pc.c() / 100.0f);
        an0Var.setImportantForAccessibility(2);
        addView(an0Var, c8.na.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i12 = org.telegram.ui.ActionBar.n6.f29843y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
        textView2.setGravity(3);
        textView2.setText(org.telegram.messenger.gd.N0(2131748681, null));
        frameLayout.addView(textView2, c8.na.e(-2, -2, 19));
        org.telegram.ui.Cells.b2 b2Var2 = new org.telegram.ui.Cells.b2(this, context);
        this.f53207e = b2Var2;
        b2Var2.b(0.45f, 240L, org.telegram.ui.Components.kr.h);
        b2Var2.setGravity(1);
        b2Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.u6.Y(b2Var2, org.telegram.ui.ActionBar.n6.f29633n6, null);
        frameLayout.addView(b2Var2, c8.na.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.f53205b = spannableStringBuilder;
        org.telegram.ui.Components.r9 r9Var = new org.telegram.ui.Components.r9();
        this.f53204a = r9Var;
        r9Var.f39234a = b2Var2.getPaint();
        r9Var.f39238f = org.telegram.messenger.g0.L(1.5f);
        r9Var.setBounds(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(-20.0f), org.telegram.messenger.g0.L(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(r9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f53208f = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
        textView3.setGravity(5);
        textView3.setText(org.telegram.messenger.gd.N0(2131748680, null));
        frameLayout.addView(textView3, c8.na.e(-2, -2, 21));
        addView(frameLayout, c8.na.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.f53209n = new org.telegram.ui.Components.eu0(1, this);
        a();
    }

    public final void a() {
        int i7;
        boolean z10;
        float f10;
        float f11;
        int c10 = org.telegram.messenger.pc.c();
        org.telegram.ui.Cells.b2 b2Var = this.f53207e;
        b2Var.a();
        if (c10 <= 0) {
            b2Var.c(org.telegram.messenger.gd.N0(2131748683, null), !org.telegram.messenger.gd.f24314a0, true);
        } else if (c10 >= 100) {
            b2Var.c(org.telegram.messenger.gd.N0(2131748682, null), !org.telegram.messenger.gd.f24314a0, true);
        } else {
            float f12 = c10;
            this.f53204a.a(true, f12 / 100.0f);
            b2Var.c(org.telegram.messenger.g0.K2(org.telegram.messenger.gd.N0(2131748674, null), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f12))), this.f53205b), "%s"), !org.telegram.messenger.gd.f24314a0, true);
        }
        if (org.telegram.messenger.pc.f()) {
            i7 = 2131748680;
        } else {
            i7 = 2131748681;
        }
        String upperCase = org.telegram.messenger.gd.N0(i7, null).toUpperCase();
        org.telegram.ui.Cells.b2 b2Var2 = this.f53206c;
        b2Var2.setText(upperCase);
        if (c10 > 0 && c10 < 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f13 = 0.0f;
        if (z10 != this.f53210r) {
            this.f53210r = z10;
            b2Var2.clearAnimation();
            ViewPropertyAnimator animate = b2Var2.animate();
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            org.telegram.messenger.m10.o(animate.alpha(f11), org.telegram.ui.Components.kr.h, 220L);
        }
        if (c10 >= 100) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (this.f53211s != f10) {
            this.f53211s = f10;
            ValueAnimator valueAnimator = this.f53212w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f53212w = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f53211s, f10);
            this.f53212w = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final w90 f52596b;

                {
                    this.f52596b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            w90 w90Var = this.f52596b;
                            TextView textView = w90Var.f53208f;
                            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29843y6, false);
                            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29633n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            w90Var.f53211s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            return;
                        default:
                            w90 w90Var2 = this.f52596b;
                            TextView textView2 = w90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29843y6, false);
                            int x05 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29633n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            w90Var2.f53213x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.f53212w.addListener(new v90(this, f10, 0));
            this.f53212w.setInterpolator(org.telegram.ui.Components.kr.h);
            this.f53212w.setDuration(320L);
            this.f53212w.start();
        }
        if (c10 <= 0) {
            f13 = 1.0f;
        }
        if (this.f53213x != f13) {
            this.f53213x = f13;
            ValueAnimator valueAnimator2 = this.f53214y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f53214y = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f53213x, f13);
            this.f53214y = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final w90 f52596b;

                {
                    this.f52596b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            w90 w90Var = this.f52596b;
                            TextView textView = w90Var.f53208f;
                            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29843y6, false);
                            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29633n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            w90Var.f53211s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            return;
                        default:
                            w90 w90Var2 = this.f52596b;
                            TextView textView2 = w90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29843y6, false);
                            int x05 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29633n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            w90Var2.f53213x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.f53214y.addListener(new v90(this, f13, 1));
            this.f53214y.setInterpolator(org.telegram.ui.Components.kr.h);
            this.f53214y.setDuration(320L);
            this.f53214y.start();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29843y6));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f53209n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(112.0f), 1073741824));
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.f53209n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        return this.f53209n.performAccessibilityAction(this, i7, bundle);
    }

    @Override
    public final void updateColors() {
        ValueAnimator valueAnimator;
        TextView textView = this.f53208f;
        if (textView != null) {
            try {
                ValueAnimator valueAnimator2 = this.f53212w;
                if (valueAnimator2 != null) {
                    if (!valueAnimator2.isRunning()) {
                    }
                }
                textView.setTextColor(i0.a.f(this.f53211s, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29843y6, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29633n6, false)));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null && ((valueAnimator = this.f53214y) == null || !valueAnimator.isRunning())) {
            textView2.setTextColor(i0.a.f(this.f53213x, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29843y6, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29633n6, false)));
        }
        org.telegram.ui.Cells.b2 b2Var = this.f53206c;
        if (b2Var != null) {
            b2Var.invalidate();
        }
    }
}

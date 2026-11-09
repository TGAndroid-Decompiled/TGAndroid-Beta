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
public final class w90 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final y90 D;
    public final org.telegram.ui.Components.n9 f50988a;
    public final SpannableStringBuilder f50989b;
    public final org.telegram.ui.Cells.a2 f50990c;
    public final TextView d;
    public final org.telegram.ui.Cells.a2 f50991e;
    public final TextView f50992f;
    public final org.telegram.ui.Components.nm0 h;
    public final org.telegram.ui.Components.vt0 f50993n;
    public boolean f50994r;
    public float f50995s;
    public ValueAnimator f50996w;
    public float f50997x;
    public ValueAnimator f50998y;

    public w90(y90 y90Var, Context context) {
        super(context);
        int i7;
        int i10;
        this.D = y90Var;
        LinearLayout linearLayout = new LinearLayout(context);
        if (org.telegram.messenger.id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        linearLayout.setGravity(i7);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        com.google.android.recaptcha.internal.a.q(textView, 1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.l6.L6;
        org.telegram.ui.ActionBar.s6.U(textView, i11, null);
        if (org.telegram.messenger.id.f23157a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setText(org.telegram.messenger.id.N0("LiteBatteryTitle"));
        linearLayout.addView(textView, c8.ha.r(-2, -2, 16));
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, true, false, false);
        a2Var.f28875w = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.l6.r1(0.15f, org.telegram.ui.ActionBar.l6.x0(null, i11, false)));
        this.f50990c = a2Var;
        a2Var.setTypeface(org.telegram.messenger.g0.o());
        a2Var.setPadding(org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f));
        a2Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.ActionBar.s6.Y(a2Var, i11, null);
        linearLayout.addView(a2Var, c8.ha.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, c8.ha.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null, true);
        this.h = nm0Var;
        nm0Var.setReportChanges(true);
        nm0Var.setDelegate(new f(this, 20));
        nm0Var.setProgress(org.telegram.messenger.sc.c() / 100.0f);
        nm0Var.setImportantForAccessibility(2);
        addView(nm0Var, c8.ha.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i12 = org.telegram.ui.ActionBar.l6.f28257y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, i12, false));
        textView2.setGravity(3);
        textView2.setText(org.telegram.messenger.id.M0(2131748874, null));
        frameLayout.addView(textView2, c8.ha.e(-2, -2, 19));
        org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(this, context);
        this.f50991e = a2Var2;
        a2Var2.b(0.45f, 240L, org.telegram.ui.Components.xq.h);
        a2Var2.setGravity(1);
        a2Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.s6.Y(a2Var2, org.telegram.ui.ActionBar.l6.f28047n6, null);
        frameLayout.addView(a2Var2, c8.ha.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.f50989b = spannableStringBuilder;
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9();
        this.f50988a = n9Var;
        n9Var.f36292a = a2Var2.getPaint();
        n9Var.f36296f = org.telegram.messenger.g0.L(1.5f);
        n9Var.setBounds(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(-20.0f), org.telegram.messenger.g0.L(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(n9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f50992f = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, i12, false));
        textView3.setGravity(5);
        textView3.setText(org.telegram.messenger.id.M0(2131748873, null));
        frameLayout.addView(textView3, c8.ha.e(-2, -2, 21));
        addView(frameLayout, c8.ha.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.f50993n = new org.telegram.ui.Components.vt0(1, this);
        a();
    }

    public final void a() {
        int i7;
        boolean z9;
        float f10;
        float f11;
        int c10 = org.telegram.messenger.sc.c();
        org.telegram.ui.Cells.a2 a2Var = this.f50991e;
        a2Var.a();
        if (c10 <= 0) {
            a2Var.c(org.telegram.messenger.id.M0(2131748876, null), !org.telegram.messenger.id.f23157a0, true);
        } else if (c10 >= 100) {
            a2Var.c(org.telegram.messenger.id.M0(2131748875, null), !org.telegram.messenger.id.f23157a0, true);
        } else {
            float f12 = c10;
            this.f50988a.a(true, f12 / 100.0f);
            a2Var.c(org.telegram.messenger.g0.K2(org.telegram.messenger.id.M0(2131748867, null), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f12))), this.f50989b), "%s"), !org.telegram.messenger.id.f23157a0, true);
        }
        if (org.telegram.messenger.sc.f()) {
            i7 = 2131748873;
        } else {
            i7 = 2131748874;
        }
        String upperCase = org.telegram.messenger.id.M0(i7, null).toUpperCase();
        org.telegram.ui.Cells.a2 a2Var2 = this.f50990c;
        a2Var2.setText(upperCase);
        if (c10 > 0 && c10 < 100) {
            z9 = true;
        } else {
            z9 = false;
        }
        float f13 = 0.0f;
        if (z9 != this.f50994r) {
            this.f50994r = z9;
            a2Var2.clearAnimation();
            ViewPropertyAnimator animate = a2Var2.animate();
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            org.telegram.messenger.camera.q.l(animate.alpha(f11), org.telegram.ui.Components.xq.h, 220L);
        }
        if (c10 >= 100) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (this.f50995s != f10) {
            this.f50995s = f10;
            ValueAnimator valueAnimator = this.f50996w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f50996w = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f50995s, f10);
            this.f50996w = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final w90 f50323b;

                {
                    this.f50323b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            w90 w90Var = this.f50323b;
                            TextView textView = w90Var.f50992f;
                            int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28257y6, false);
                            int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28047n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            w90Var.f50995s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            return;
                        default:
                            w90 w90Var2 = this.f50323b;
                            TextView textView2 = w90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28257y6, false);
                            int x05 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28047n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            w90Var2.f50997x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.f50996w.addListener(new v90(this, f10, 0));
            this.f50996w.setInterpolator(org.telegram.ui.Components.xq.h);
            this.f50996w.setDuration(320L);
            this.f50996w.start();
        }
        if (c10 <= 0) {
            f13 = 1.0f;
        }
        if (this.f50997x != f13) {
            this.f50997x = f13;
            ValueAnimator valueAnimator2 = this.f50998y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f50998y = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f50997x, f13);
            this.f50998y = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final w90 f50323b;

                {
                    this.f50323b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            w90 w90Var = this.f50323b;
                            TextView textView = w90Var.f50992f;
                            int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28257y6, false);
                            int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28047n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            w90Var.f50995s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            return;
                        default:
                            w90 w90Var2 = this.f50323b;
                            TextView textView2 = w90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28257y6, false);
                            int x05 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28047n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            w90Var2.f50997x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.f50998y.addListener(new v90(this, f13, 1));
            this.f50998y.setInterpolator(org.telegram.ui.Components.xq.h);
            this.f50998y.setDuration(320L);
            this.f50998y.start();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28257y6));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f50993n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(112.0f), 1073741824));
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.f50993n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        return this.f50993n.performAccessibilityAction(this, i7, bundle);
    }

    @Override
    public final void updateColors() {
        ValueAnimator valueAnimator;
        TextView textView = this.f50992f;
        if (textView != null) {
            try {
                ValueAnimator valueAnimator2 = this.f50996w;
                if (valueAnimator2 != null) {
                    if (!valueAnimator2.isRunning()) {
                    }
                }
                textView.setTextColor(i0.a.f(this.f50995s, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28257y6, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28047n6, false)));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null && ((valueAnimator = this.f50998y) == null || !valueAnimator.isRunning())) {
            textView2.setTextColor(i0.a.f(this.f50997x, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28257y6, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28047n6, false)));
        }
        org.telegram.ui.Cells.a2 a2Var = this.f50990c;
        if (a2Var != null) {
            a2Var.invalidate();
        }
    }
}

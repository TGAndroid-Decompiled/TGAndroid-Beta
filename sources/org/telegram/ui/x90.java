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
public final class x90 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final z90 D;
    public final org.telegram.ui.Components.m9 f51643a;
    public final SpannableStringBuilder f51644b;
    public final org.telegram.ui.Cells.a2 f51645c;
    public final TextView d;
    public final org.telegram.ui.Cells.a2 f51646e;
    public final TextView f51647f;
    public final org.telegram.ui.Components.mm0 h;
    public final org.telegram.ui.Components.ut0 f51648n;
    public boolean f51649r;
    public float f51650s;
    public ValueAnimator f51651w;
    public float f51652x;
    public ValueAnimator f51653y;

    public x90(z90 z90Var, Context context) {
        super(context);
        int i7;
        int i10;
        this.D = z90Var;
        LinearLayout linearLayout = new LinearLayout(context);
        if (org.telegram.messenger.id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        linearLayout.setGravity(i7);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        com.google.android.recaptcha.internal.a.q(textView, 1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.m6.L6;
        org.telegram.ui.ActionBar.t6.U(textView, i11, null);
        if (org.telegram.messenger.id.f23161a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setText(org.telegram.messenger.id.N0("LiteBatteryTitle"));
        linearLayout.addView(textView, c8.ha.r(-2, -2, 16));
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, true, false, false);
        a2Var.f28886w = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.m6.r1(0.15f, org.telegram.ui.ActionBar.m6.x0(null, i11, false)));
        this.f51645c = a2Var;
        a2Var.setTypeface(org.telegram.messenger.g0.o());
        a2Var.setPadding(org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f));
        a2Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.ActionBar.t6.Y(a2Var, i11, null);
        linearLayout.addView(a2Var, c8.ha.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, c8.ha.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null, true);
        this.h = mm0Var;
        mm0Var.setReportChanges(true);
        mm0Var.setDelegate(new f(this, 20));
        mm0Var.setProgress(org.telegram.messenger.sc.c() / 100.0f);
        mm0Var.setImportantForAccessibility(2);
        addView(mm0Var, c8.ha.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i12 = org.telegram.ui.ActionBar.m6.f28282y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
        textView2.setGravity(3);
        textView2.setText(org.telegram.messenger.id.M0(2131748874, null));
        frameLayout.addView(textView2, c8.ha.e(-2, -2, 19));
        org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(this, context);
        this.f51646e = a2Var2;
        a2Var2.b(0.45f, 240L, org.telegram.ui.Components.wq.h);
        a2Var2.setGravity(1);
        a2Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.t6.Y(a2Var2, org.telegram.ui.ActionBar.m6.f28072n6, null);
        frameLayout.addView(a2Var2, c8.ha.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.f51644b = spannableStringBuilder;
        org.telegram.ui.Components.m9 m9Var = new org.telegram.ui.Components.m9();
        this.f51643a = m9Var;
        m9Var.f35892a = a2Var2.getPaint();
        m9Var.f35896f = org.telegram.messenger.g0.L(1.5f);
        m9Var.setBounds(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(-20.0f), org.telegram.messenger.g0.L(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(m9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f51647f = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
        textView3.setGravity(5);
        textView3.setText(org.telegram.messenger.id.M0(2131748873, null));
        frameLayout.addView(textView3, c8.ha.e(-2, -2, 21));
        addView(frameLayout, c8.ha.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.f51648n = new org.telegram.ui.Components.ut0(1, this);
        a();
    }

    public final void a() {
        int i7;
        boolean z9;
        float f10;
        float f11;
        int c10 = org.telegram.messenger.sc.c();
        org.telegram.ui.Cells.a2 a2Var = this.f51646e;
        a2Var.a();
        if (c10 <= 0) {
            a2Var.c(org.telegram.messenger.id.M0(2131748876, null), !org.telegram.messenger.id.f23161a0, true);
        } else if (c10 >= 100) {
            a2Var.c(org.telegram.messenger.id.M0(2131748875, null), !org.telegram.messenger.id.f23161a0, true);
        } else {
            float f12 = c10;
            this.f51643a.a(true, f12 / 100.0f);
            a2Var.c(org.telegram.messenger.g0.K2(org.telegram.messenger.id.M0(2131748867, null), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f12))), this.f51644b), "%s"), !org.telegram.messenger.id.f23161a0, true);
        }
        if (org.telegram.messenger.sc.f()) {
            i7 = 2131748873;
        } else {
            i7 = 2131748874;
        }
        String upperCase = org.telegram.messenger.id.M0(i7, null).toUpperCase();
        org.telegram.ui.Cells.a2 a2Var2 = this.f51645c;
        a2Var2.setText(upperCase);
        if (c10 > 0 && c10 < 100) {
            z9 = true;
        } else {
            z9 = false;
        }
        float f13 = 0.0f;
        if (z9 != this.f51649r) {
            this.f51649r = z9;
            a2Var2.clearAnimation();
            ViewPropertyAnimator animate = a2Var2.animate();
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            org.telegram.messenger.camera.q.l(animate.alpha(f11), org.telegram.ui.Components.wq.h, 220L);
        }
        if (c10 >= 100) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (this.f51650s != f10) {
            this.f51650s = f10;
            ValueAnimator valueAnimator = this.f51651w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f51651w = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f51650s, f10);
            this.f51651w = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final x90 f50661b;

                {
                    this.f50661b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            x90 x90Var = this.f50661b;
                            TextView textView = x90Var.f51647f;
                            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28282y6, false);
                            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28072n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            x90Var.f51650s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            return;
                        default:
                            x90 x90Var2 = this.f50661b;
                            TextView textView2 = x90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28282y6, false);
                            int x05 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28072n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            x90Var2.f51652x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.f51651w.addListener(new w90(this, f10, 0));
            this.f51651w.setInterpolator(org.telegram.ui.Components.wq.h);
            this.f51651w.setDuration(320L);
            this.f51651w.start();
        }
        if (c10 <= 0) {
            f13 = 1.0f;
        }
        if (this.f51652x != f13) {
            this.f51652x = f13;
            ValueAnimator valueAnimator2 = this.f51653y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f51653y = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f51652x, f13);
            this.f51653y = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final x90 f50661b;

                {
                    this.f50661b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            x90 x90Var = this.f50661b;
                            TextView textView = x90Var.f51647f;
                            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28282y6, false);
                            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28072n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            x90Var.f51650s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            return;
                        default:
                            x90 x90Var2 = this.f50661b;
                            TextView textView2 = x90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28282y6, false);
                            int x05 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28072n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            x90Var2.f51652x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.f51653y.addListener(new w90(this, f13, 1));
            this.f51653y.setInterpolator(org.telegram.ui.Components.wq.h);
            this.f51653y.setDuration(320L);
            this.f51653y.start();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28282y6));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f51648n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(112.0f), 1073741824));
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.f51648n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        return this.f51648n.performAccessibilityAction(this, i7, bundle);
    }

    @Override
    public final void updateColors() {
        ValueAnimator valueAnimator;
        TextView textView = this.f51647f;
        if (textView != null) {
            try {
                ValueAnimator valueAnimator2 = this.f51651w;
                if (valueAnimator2 != null) {
                    if (!valueAnimator2.isRunning()) {
                    }
                }
                textView.setTextColor(i0.a.f(this.f51650s, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28282y6, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28072n6, false)));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null && ((valueAnimator = this.f51653y) == null || !valueAnimator.isRunning())) {
            textView2.setTextColor(i0.a.f(this.f51652x, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28282y6, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28072n6, false)));
        }
        org.telegram.ui.Cells.a2 a2Var = this.f51645c;
        if (a2Var != null) {
            a2Var.invalidate();
        }
    }
}

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
public final class u90 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final w90 D;
    public final org.telegram.ui.Components.n9 f50349a;
    public final SpannableStringBuilder f50350b;
    public final org.telegram.ui.Cells.a2 f50351c;
    public final TextView d;
    public final org.telegram.ui.Cells.a2 f50352e;
    public final TextView f50353f;
    public final org.telegram.ui.Components.mm0 h;
    public final org.telegram.ui.Components.tt0 f50354n;
    public boolean f50355r;
    public float f50356s;
    public ValueAnimator f50357w;
    public float f50358x;
    public ValueAnimator f50359y;

    public u90(w90 w90Var, Context context) {
        super(context);
        int i7;
        int i10;
        this.D = w90Var;
        LinearLayout linearLayout = new LinearLayout(context);
        if (org.telegram.messenger.hd.f22871a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        linearLayout.setGravity(i7);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        com.google.android.recaptcha.internal.a.q(textView, 1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.k6.L6;
        org.telegram.ui.ActionBar.r6.V(textView, i11, null);
        if (org.telegram.messenger.hd.f22871a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setText(org.telegram.messenger.hd.N0("LiteBatteryTitle"));
        linearLayout.addView(textView, c8.ha.r(-2, -2, 16));
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, true, false, false);
        a2Var.f28867w = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, org.telegram.ui.ActionBar.k6.x0(null, i11, false)));
        this.f50351c = a2Var;
        a2Var.setTypeface(org.telegram.messenger.g0.o());
        a2Var.setPadding(org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f));
        a2Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.ActionBar.r6.Z(a2Var, i11, null);
        linearLayout.addView(a2Var, c8.ha.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, c8.ha.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null, true);
        this.h = mm0Var;
        mm0Var.setReportChanges(true);
        mm0Var.setDelegate(new f(this, 20));
        mm0Var.setProgress(org.telegram.messenger.rc.c() / 100.0f);
        mm0Var.setImportantForAccessibility(2);
        addView(mm0Var, c8.ha.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i12 = org.telegram.ui.ActionBar.k6.f28240y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        textView2.setGravity(3);
        textView2.setText(org.telegram.messenger.hd.M0(2131748873, null));
        frameLayout.addView(textView2, c8.ha.e(-2, -2, 19));
        org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(this, context);
        this.f50352e = a2Var2;
        a2Var2.b(0.45f, 240L, org.telegram.ui.Components.xq.h);
        a2Var2.setGravity(1);
        a2Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.r6.Z(a2Var2, org.telegram.ui.ActionBar.k6.f28030n6, null);
        frameLayout.addView(a2Var2, c8.ha.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.f50350b = spannableStringBuilder;
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9();
        this.f50349a = n9Var;
        n9Var.f36213a = a2Var2.getPaint();
        n9Var.f36217f = org.telegram.messenger.g0.L(1.5f);
        n9Var.setBounds(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(-20.0f), org.telegram.messenger.g0.L(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(n9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f50353f = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        textView3.setGravity(5);
        textView3.setText(org.telegram.messenger.hd.M0(2131748872, null));
        frameLayout.addView(textView3, c8.ha.e(-2, -2, 21));
        addView(frameLayout, c8.ha.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.f50354n = new org.telegram.ui.Components.tt0(1, this);
        a();
    }

    public final void a() {
        int i7;
        boolean z9;
        float f10;
        float f11;
        int c10 = org.telegram.messenger.rc.c();
        org.telegram.ui.Cells.a2 a2Var = this.f50352e;
        a2Var.a();
        if (c10 <= 0) {
            a2Var.c(org.telegram.messenger.hd.M0(2131748875, null), !org.telegram.messenger.hd.f22871a0, true);
        } else if (c10 >= 100) {
            a2Var.c(org.telegram.messenger.hd.M0(2131748874, null), !org.telegram.messenger.hd.f22871a0, true);
        } else {
            float f12 = c10;
            this.f50349a.a(true, f12 / 100.0f);
            a2Var.c(org.telegram.messenger.g0.K2(org.telegram.messenger.hd.M0(2131748866, null), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f12))), this.f50350b), "%s"), !org.telegram.messenger.hd.f22871a0, true);
        }
        if (org.telegram.messenger.rc.f()) {
            i7 = 2131748872;
        } else {
            i7 = 2131748873;
        }
        String upperCase = org.telegram.messenger.hd.M0(i7, null).toUpperCase();
        org.telegram.ui.Cells.a2 a2Var2 = this.f50351c;
        a2Var2.setText(upperCase);
        if (c10 > 0 && c10 < 100) {
            z9 = true;
        } else {
            z9 = false;
        }
        float f13 = 0.0f;
        if (z9 != this.f50355r) {
            this.f50355r = z9;
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
        if (this.f50356s != f10) {
            this.f50356s = f10;
            ValueAnimator valueAnimator = this.f50357w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f50357w = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f50356s, f10);
            this.f50357w = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final u90 f49704b;

                {
                    this.f49704b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            u90 u90Var = this.f49704b;
                            TextView textView = u90Var.f50353f;
                            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28240y6, false);
                            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28030n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            u90Var.f50356s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            return;
                        default:
                            u90 u90Var2 = this.f49704b;
                            TextView textView2 = u90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28240y6, false);
                            int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28030n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            u90Var2.f50358x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.f50357w.addListener(new t90(this, f10, 0));
            this.f50357w.setInterpolator(org.telegram.ui.Components.xq.h);
            this.f50357w.setDuration(320L);
            this.f50357w.start();
        }
        if (c10 <= 0) {
            f13 = 1.0f;
        }
        if (this.f50358x != f13) {
            this.f50358x = f13;
            ValueAnimator valueAnimator2 = this.f50359y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f50359y = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f50358x, f13);
            this.f50359y = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final u90 f49704b;

                {
                    this.f49704b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            u90 u90Var = this.f49704b;
                            TextView textView = u90Var.f50353f;
                            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28240y6, false);
                            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28030n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            u90Var.f50356s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            return;
                        default:
                            u90 u90Var2 = this.f49704b;
                            TextView textView2 = u90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28240y6, false);
                            int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28030n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            u90Var2.f50358x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.f50359y.addListener(new t90(this, f13, 1));
            this.f50359y.setInterpolator(org.telegram.ui.Components.xq.h);
            this.f50359y.setDuration(320L);
            this.f50359y.start();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28240y6));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f50354n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(112.0f), 1073741824));
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.f50354n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        return this.f50354n.performAccessibilityAction(this, i7, bundle);
    }

    @Override
    public final void updateColors() {
        ValueAnimator valueAnimator;
        TextView textView = this.f50353f;
        if (textView != null) {
            try {
                ValueAnimator valueAnimator2 = this.f50357w;
                if (valueAnimator2 != null) {
                    if (!valueAnimator2.isRunning()) {
                    }
                }
                textView.setTextColor(i0.a.f(this.f50356s, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28240y6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28030n6, false)));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null && ((valueAnimator = this.f50359y) == null || !valueAnimator.isRunning())) {
            textView2.setTextColor(i0.a.f(this.f50358x, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28240y6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28030n6, false)));
        }
        org.telegram.ui.Cells.a2 a2Var = this.f50351c;
        if (a2Var != null) {
            a2Var.invalidate();
        }
    }
}

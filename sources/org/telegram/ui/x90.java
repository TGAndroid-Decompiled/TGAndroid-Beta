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
    public final z90 E;
    public final org.telegram.ui.Components.s9 f53744a;
    public final SpannableStringBuilder f53745b;
    public final org.telegram.ui.Cells.b2 f53746c;
    public final TextView d;
    public final org.telegram.ui.Cells.b2 f53747e;
    public final TextView f53748f;
    public final org.telegram.ui.Components.ym0 h;
    public final org.telegram.ui.Components.cu0 f53749n;
    public boolean f53750r;
    public float f53751s;
    public ValueAnimator f53752w;
    public float f53753x;
    public ValueAnimator f53754y;

    public x90(z90 z90Var, Context context) {
        super(context);
        int i7;
        int i10;
        this.E = z90Var;
        LinearLayout linearLayout = new LinearLayout(context);
        if (org.telegram.messenger.gd.f24213a0) {
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
        if (org.telegram.messenger.gd.f24213a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setText(org.telegram.messenger.gd.N0("LiteBatteryTitle"));
        linearLayout.addView(textView, c8.ma.r(-2, -2, 16));
        org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(context, true, false, false);
        b2Var.f30425w = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, org.telegram.ui.ActionBar.n6.x0(null, i11, false)));
        this.f53746c = b2Var;
        b2Var.setTypeface(org.telegram.messenger.g0.o());
        b2Var.setPadding(org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f));
        b2Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.ActionBar.u6.Y(b2Var, i11, null);
        linearLayout.addView(b2Var, c8.ma.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, c8.ma.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.ym0 ym0Var = new org.telegram.ui.Components.ym0(context, null, true);
        this.h = ym0Var;
        ym0Var.setReportChanges(true);
        ym0Var.setDelegate(new f(this, 20));
        ym0Var.setProgress(org.telegram.messenger.pc.c() / 100.0f);
        ym0Var.setImportantForAccessibility(2);
        addView(ym0Var, c8.ma.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i12 = org.telegram.ui.ActionBar.n6.f29786y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
        textView2.setGravity(3);
        textView2.setText(org.telegram.messenger.gd.M0(2131748682, null));
        frameLayout.addView(textView2, c8.ma.e(-2, -2, 19));
        org.telegram.ui.Cells.b2 b2Var2 = new org.telegram.ui.Cells.b2(this, context);
        this.f53747e = b2Var2;
        b2Var2.b(0.45f, 240L, org.telegram.ui.Components.lr.h);
        b2Var2.setGravity(1);
        b2Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.u6.Y(b2Var2, org.telegram.ui.ActionBar.n6.f29576n6, null);
        frameLayout.addView(b2Var2, c8.ma.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.f53745b = spannableStringBuilder;
        org.telegram.ui.Components.s9 s9Var = new org.telegram.ui.Components.s9();
        this.f53744a = s9Var;
        s9Var.f39522a = b2Var2.getPaint();
        s9Var.f39526f = org.telegram.messenger.g0.L(1.5f);
        s9Var.setBounds(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(-20.0f), org.telegram.messenger.g0.L(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(s9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f53748f = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
        textView3.setGravity(5);
        textView3.setText(org.telegram.messenger.gd.M0(2131748681, null));
        frameLayout.addView(textView3, c8.ma.e(-2, -2, 21));
        addView(frameLayout, c8.ma.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.f53749n = new org.telegram.ui.Components.cu0(1, this);
        a();
    }

    public final void a() {
        int i7;
        boolean z10;
        float f10;
        float f11;
        int c10 = org.telegram.messenger.pc.c();
        org.telegram.ui.Cells.b2 b2Var = this.f53747e;
        b2Var.a();
        if (c10 <= 0) {
            b2Var.c(org.telegram.messenger.gd.M0(2131748684, null), !org.telegram.messenger.gd.f24213a0, true);
        } else if (c10 >= 100) {
            b2Var.c(org.telegram.messenger.gd.M0(2131748683, null), !org.telegram.messenger.gd.f24213a0, true);
        } else {
            float f12 = c10;
            this.f53744a.a(true, f12 / 100.0f);
            b2Var.c(org.telegram.messenger.g0.K2(org.telegram.messenger.gd.M0(2131748675, null), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f12))), this.f53745b), "%s"), !org.telegram.messenger.gd.f24213a0, true);
        }
        if (org.telegram.messenger.pc.f()) {
            i7 = 2131748681;
        } else {
            i7 = 2131748682;
        }
        String upperCase = org.telegram.messenger.gd.M0(i7, null).toUpperCase();
        org.telegram.ui.Cells.b2 b2Var2 = this.f53746c;
        b2Var2.setText(upperCase);
        if (c10 > 0 && c10 < 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f13 = 0.0f;
        if (z10 != this.f53750r) {
            this.f53750r = z10;
            b2Var2.clearAnimation();
            ViewPropertyAnimator animate = b2Var2.animate();
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            org.telegram.messenger.n10.o(animate.alpha(f11), org.telegram.ui.Components.lr.h, 220L);
        }
        if (c10 >= 100) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (this.f53751s != f10) {
            this.f53751s = f10;
            ValueAnimator valueAnimator = this.f53752w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f53752w = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f53751s, f10);
            this.f53752w = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final x90 f52715b;

                {
                    this.f52715b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            x90 x90Var = this.f52715b;
                            TextView textView = x90Var.f53748f;
                            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29786y6, false);
                            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29576n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            x90Var.f53751s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            return;
                        default:
                            x90 x90Var2 = this.f52715b;
                            TextView textView2 = x90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29786y6, false);
                            int x05 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29576n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            x90Var2.f53753x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.f53752w.addListener(new w90(this, f10, 0));
            this.f53752w.setInterpolator(org.telegram.ui.Components.lr.h);
            this.f53752w.setDuration(320L);
            this.f53752w.start();
        }
        if (c10 <= 0) {
            f13 = 1.0f;
        }
        if (this.f53753x != f13) {
            this.f53753x = f13;
            ValueAnimator valueAnimator2 = this.f53754y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f53754y = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f53753x, f13);
            this.f53754y = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final x90 f52715b;

                {
                    this.f52715b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            x90 x90Var = this.f52715b;
                            TextView textView = x90Var.f53748f;
                            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29786y6, false);
                            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29576n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            x90Var.f53751s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            return;
                        default:
                            x90 x90Var2 = this.f52715b;
                            TextView textView2 = x90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29786y6, false);
                            int x05 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29576n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            x90Var2.f53753x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.f53754y.addListener(new w90(this, f13, 1));
            this.f53754y.setInterpolator(org.telegram.ui.Components.lr.h);
            this.f53754y.setDuration(320L);
            this.f53754y.start();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29786y6));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f53749n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(112.0f), 1073741824));
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.f53749n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        return this.f53749n.performAccessibilityAction(this, i7, bundle);
    }

    @Override
    public final void updateColors() {
        ValueAnimator valueAnimator;
        TextView textView = this.f53748f;
        if (textView != null) {
            try {
                ValueAnimator valueAnimator2 = this.f53752w;
                if (valueAnimator2 != null) {
                    if (!valueAnimator2.isRunning()) {
                    }
                }
                textView.setTextColor(i0.a.f(this.f53751s, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29786y6, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29576n6, false)));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null && ((valueAnimator = this.f53754y) == null || !valueAnimator.isRunning())) {
            textView2.setTextColor(i0.a.f(this.f53753x, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29786y6, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29576n6, false)));
        }
        org.telegram.ui.Cells.b2 b2Var = this.f53746c;
        if (b2Var != null) {
            b2Var.invalidate();
        }
    }
}

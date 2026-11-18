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
    public final org.telegram.ui.Components.s9 f53022a;
    public final SpannableStringBuilder f53023b;
    public final org.telegram.ui.Cells.a2 f53024c;
    public final TextView d;
    public final org.telegram.ui.Cells.a2 f53025e;
    public final TextView f53026f;
    public final org.telegram.ui.Components.ym0 h;
    public final org.telegram.ui.Components.cu0 f53027n;
    public boolean f53028r;
    public float f53029s;
    public ValueAnimator f53030w;
    public float f53031x;
    public ValueAnimator f53032y;

    public w90(y90 y90Var, Context context) {
        super(context);
        int i7;
        int i10;
        this.E = y90Var;
        LinearLayout linearLayout = new LinearLayout(context);
        if (org.telegram.messenger.gd.f24216a0) {
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
        if (org.telegram.messenger.gd.f24216a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setText(org.telegram.messenger.gd.N0("LiteBatteryTitle"));
        linearLayout.addView(textView, c8.ma.r(-2, -2, 16));
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, true, false, false);
        a2Var.f30366w = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, org.telegram.ui.ActionBar.n6.x0(null, i11, false)));
        this.f53024c = a2Var;
        a2Var.setTypeface(org.telegram.messenger.g0.o());
        a2Var.setPadding(org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f));
        a2Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.ActionBar.u6.Y(a2Var, i11, null);
        linearLayout.addView(a2Var, c8.ma.t(-2, 17, 16, 6, 1, 0, 0));
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
        int i12 = org.telegram.ui.ActionBar.n6.f29788y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
        textView2.setGravity(3);
        textView2.setText(org.telegram.messenger.gd.M0(2131748682, null));
        frameLayout.addView(textView2, c8.ma.e(-2, -2, 19));
        org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(this, context);
        this.f53025e = a2Var2;
        a2Var2.b(0.45f, 240L, org.telegram.ui.Components.lr.h);
        a2Var2.setGravity(1);
        a2Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.u6.Y(a2Var2, org.telegram.ui.ActionBar.n6.f29578n6, null);
        frameLayout.addView(a2Var2, c8.ma.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.f53023b = spannableStringBuilder;
        org.telegram.ui.Components.s9 s9Var = new org.telegram.ui.Components.s9();
        this.f53022a = s9Var;
        s9Var.f39522a = a2Var2.getPaint();
        s9Var.f39526f = org.telegram.messenger.g0.L(1.5f);
        s9Var.setBounds(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(-20.0f), org.telegram.messenger.g0.L(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(s9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f53026f = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
        textView3.setGravity(5);
        textView3.setText(org.telegram.messenger.gd.M0(2131748681, null));
        frameLayout.addView(textView3, c8.ma.e(-2, -2, 21));
        addView(frameLayout, c8.ma.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.f53027n = new org.telegram.ui.Components.cu0(1, this);
        a();
    }

    public final void a() {
        int i7;
        boolean z10;
        float f10;
        float f11;
        int c10 = org.telegram.messenger.pc.c();
        org.telegram.ui.Cells.a2 a2Var = this.f53025e;
        a2Var.a();
        if (c10 <= 0) {
            a2Var.c(org.telegram.messenger.gd.M0(2131748684, null), !org.telegram.messenger.gd.f24216a0, true);
        } else if (c10 >= 100) {
            a2Var.c(org.telegram.messenger.gd.M0(2131748683, null), !org.telegram.messenger.gd.f24216a0, true);
        } else {
            float f12 = c10;
            this.f53022a.a(true, f12 / 100.0f);
            a2Var.c(org.telegram.messenger.g0.K2(org.telegram.messenger.gd.M0(2131748675, null), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f12))), this.f53023b), "%s"), !org.telegram.messenger.gd.f24216a0, true);
        }
        if (org.telegram.messenger.pc.f()) {
            i7 = 2131748681;
        } else {
            i7 = 2131748682;
        }
        String upperCase = org.telegram.messenger.gd.M0(i7, null).toUpperCase();
        org.telegram.ui.Cells.a2 a2Var2 = this.f53024c;
        a2Var2.setText(upperCase);
        if (c10 > 0 && c10 < 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f13 = 0.0f;
        if (z10 != this.f53028r) {
            this.f53028r = z10;
            a2Var2.clearAnimation();
            ViewPropertyAnimator animate = a2Var2.animate();
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
        if (this.f53029s != f10) {
            this.f53029s = f10;
            ValueAnimator valueAnimator = this.f53030w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f53030w = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f53029s, f10);
            this.f53030w = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final w90 f52476b;

                {
                    this.f52476b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            w90 w90Var = this.f52476b;
                            TextView textView = w90Var.f53026f;
                            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29788y6, false);
                            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29578n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            w90Var.f53029s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            return;
                        default:
                            w90 w90Var2 = this.f52476b;
                            TextView textView2 = w90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29788y6, false);
                            int x05 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29578n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            w90Var2.f53031x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.f53030w.addListener(new v90(this, f10, 0));
            this.f53030w.setInterpolator(org.telegram.ui.Components.lr.h);
            this.f53030w.setDuration(320L);
            this.f53030w.start();
        }
        if (c10 <= 0) {
            f13 = 1.0f;
        }
        if (this.f53031x != f13) {
            this.f53031x = f13;
            ValueAnimator valueAnimator2 = this.f53032y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f53032y = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f53031x, f13);
            this.f53032y = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final w90 f52476b;

                {
                    this.f52476b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            w90 w90Var = this.f52476b;
                            TextView textView = w90Var.f53026f;
                            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29788y6, false);
                            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29578n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            w90Var.f53029s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            return;
                        default:
                            w90 w90Var2 = this.f52476b;
                            TextView textView2 = w90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29788y6, false);
                            int x05 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29578n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            w90Var2.f53031x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.f53032y.addListener(new v90(this, f13, 1));
            this.f53032y.setInterpolator(org.telegram.ui.Components.lr.h);
            this.f53032y.setDuration(320L);
            this.f53032y.start();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788y6));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f53027n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(112.0f), 1073741824));
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.f53027n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        return this.f53027n.performAccessibilityAction(this, i7, bundle);
    }

    @Override
    public final void updateColors() {
        ValueAnimator valueAnimator;
        TextView textView = this.f53026f;
        if (textView != null) {
            try {
                ValueAnimator valueAnimator2 = this.f53030w;
                if (valueAnimator2 != null) {
                    if (!valueAnimator2.isRunning()) {
                    }
                }
                textView.setTextColor(i0.a.f(this.f53029s, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29788y6, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29578n6, false)));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null && ((valueAnimator = this.f53032y) == null || !valueAnimator.isRunning())) {
            textView2.setTextColor(i0.a.f(this.f53031x, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29788y6, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29578n6, false)));
        }
        org.telegram.ui.Cells.a2 a2Var = this.f53024c;
        if (a2Var != null) {
            a2Var.invalidate();
        }
    }
}

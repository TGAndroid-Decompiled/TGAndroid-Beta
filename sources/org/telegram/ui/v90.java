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
public final class v90 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final x90 E;
    public final org.telegram.ui.Components.k9 f52164a;
    public final SpannableStringBuilder f52165b;
    public final org.telegram.ui.Cells.a2 f52166c;
    public final TextView d;
    public final org.telegram.ui.Cells.a2 f52167e;
    public final TextView f52168f;
    public final org.telegram.ui.Components.qm0 h;
    public final org.telegram.ui.Components.ut0 f52169n;
    public boolean f52170r;
    public float f52171s;
    public ValueAnimator f52172w;
    public float f52173x;
    public ValueAnimator f52174y;

    public v90(x90 x90Var, Context context) {
        super(context);
        int i7;
        int i10;
        this.E = x90Var;
        LinearLayout linearLayout = new LinearLayout(context);
        if (org.telegram.messenger.hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        linearLayout.setGravity(i7);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        i5.c.v(textView, 1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.j6.L6;
        org.telegram.ui.ActionBar.q6.U(textView, i11, null);
        if (org.telegram.messenger.hd.f24104a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setText(org.telegram.messenger.hd.N0("LiteBatteryTitle"));
        linearLayout.addView(textView, c8.ja.r(-2, -2, 16));
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, true, false, false);
        a2Var.f29989w = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.j6.r1(0.15f, org.telegram.ui.ActionBar.j6.x0(null, i11, false)));
        this.f52166c = a2Var;
        a2Var.setTypeface(org.telegram.messenger.g0.o());
        a2Var.setPadding(org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f));
        a2Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.ActionBar.q6.Y(a2Var, i11, null);
        linearLayout.addView(a2Var, c8.ja.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, c8.ja.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(context, null, true);
        this.h = qm0Var;
        qm0Var.setReportChanges(true);
        qm0Var.setDelegate(new f(this, 20));
        qm0Var.setProgress(org.telegram.messenger.qc.c() / 100.0f);
        qm0Var.setImportantForAccessibility(2);
        addView(qm0Var, c8.ja.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i12 = org.telegram.ui.ActionBar.j6.f29241y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i12, false));
        textView2.setGravity(3);
        textView2.setText(org.telegram.messenger.hd.M0(2131748874, null));
        frameLayout.addView(textView2, c8.ja.e(-2, -2, 19));
        org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(this, context);
        this.f52167e = a2Var2;
        a2Var2.b(0.45f, 240L, org.telegram.ui.Components.er.h);
        a2Var2.setGravity(1);
        a2Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.q6.Y(a2Var2, org.telegram.ui.ActionBar.j6.f29031n6, null);
        frameLayout.addView(a2Var2, c8.ja.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.f52165b = spannableStringBuilder;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9();
        this.f52164a = k9Var;
        k9Var.f36323a = a2Var2.getPaint();
        k9Var.f36327f = org.telegram.messenger.g0.L(1.5f);
        k9Var.setBounds(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(-20.0f), org.telegram.messenger.g0.L(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(k9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f52168f = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i12, false));
        textView3.setGravity(5);
        textView3.setText(org.telegram.messenger.hd.M0(2131748873, null));
        frameLayout.addView(textView3, c8.ja.e(-2, -2, 21));
        addView(frameLayout, c8.ja.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.f52169n = new org.telegram.ui.Components.ut0(1, this);
        a();
    }

    public final void a() {
        int i7;
        boolean z10;
        float f10;
        float f11;
        int c10 = org.telegram.messenger.qc.c();
        org.telegram.ui.Cells.a2 a2Var = this.f52167e;
        a2Var.a();
        if (c10 <= 0) {
            a2Var.c(org.telegram.messenger.hd.M0(2131748876, null), !org.telegram.messenger.hd.f24104a0, true);
        } else if (c10 >= 100) {
            a2Var.c(org.telegram.messenger.hd.M0(2131748875, null), !org.telegram.messenger.hd.f24104a0, true);
        } else {
            float f12 = c10;
            this.f52164a.a(true, f12 / 100.0f);
            a2Var.c(org.telegram.messenger.g0.K2(org.telegram.messenger.hd.M0(2131748867, null), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f12))), this.f52165b), "%s"), !org.telegram.messenger.hd.f24104a0, true);
        }
        if (org.telegram.messenger.qc.f()) {
            i7 = 2131748873;
        } else {
            i7 = 2131748874;
        }
        String upperCase = org.telegram.messenger.hd.M0(i7, null).toUpperCase();
        org.telegram.ui.Cells.a2 a2Var2 = this.f52166c;
        a2Var2.setText(upperCase);
        if (c10 > 0 && c10 < 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f13 = 0.0f;
        if (z10 != this.f52170r) {
            this.f52170r = z10;
            a2Var2.clearAnimation();
            ViewPropertyAnimator animate = a2Var2.animate();
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            org.telegram.messenger.i20.n(animate.alpha(f11), org.telegram.ui.Components.er.h, 220L);
        }
        if (c10 >= 100) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (this.f52171s != f10) {
            this.f52171s = f10;
            ValueAnimator valueAnimator = this.f52172w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f52172w = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f52171s, f10);
            this.f52172w = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final v90 f51512b;

                {
                    this.f51512b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            v90 v90Var = this.f51512b;
                            TextView textView = v90Var.f52168f;
                            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29241y6, false);
                            int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29031n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            v90Var.f52171s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            return;
                        default:
                            v90 v90Var2 = this.f51512b;
                            TextView textView2 = v90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29241y6, false);
                            int x05 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29031n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            v90Var2.f52173x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.f52172w.addListener(new u90(this, f10, 0));
            this.f52172w.setInterpolator(org.telegram.ui.Components.er.h);
            this.f52172w.setDuration(320L);
            this.f52172w.start();
        }
        if (c10 <= 0) {
            f13 = 1.0f;
        }
        if (this.f52173x != f13) {
            this.f52173x = f13;
            ValueAnimator valueAnimator2 = this.f52174y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f52174y = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f52173x, f13);
            this.f52174y = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final v90 f51512b;

                {
                    this.f51512b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            v90 v90Var = this.f51512b;
                            TextView textView = v90Var.f52168f;
                            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29241y6, false);
                            int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29031n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            v90Var.f52171s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            return;
                        default:
                            v90 v90Var2 = this.f51512b;
                            TextView textView2 = v90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29241y6, false);
                            int x05 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29031n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            v90Var2.f52173x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.f52174y.addListener(new u90(this, f13, 1));
            this.f52174y.setInterpolator(org.telegram.ui.Components.er.h);
            this.f52174y.setDuration(320L);
            this.f52174y.start();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29241y6));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f52169n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(112.0f), 1073741824));
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.f52169n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        return this.f52169n.performAccessibilityAction(this, i7, bundle);
    }

    @Override
    public final void updateColors() {
        ValueAnimator valueAnimator;
        TextView textView = this.f52168f;
        if (textView != null) {
            try {
                ValueAnimator valueAnimator2 = this.f52172w;
                if (valueAnimator2 != null) {
                    if (!valueAnimator2.isRunning()) {
                    }
                }
                textView.setTextColor(i0.a.f(this.f52171s, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29241y6, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29031n6, false)));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null && ((valueAnimator = this.f52174y) == null || !valueAnimator.isRunning())) {
            textView2.setTextColor(i0.a.f(this.f52173x, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29241y6, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29031n6, false)));
        }
        org.telegram.ui.Cells.a2 a2Var = this.f52166c;
        if (a2Var != null) {
            a2Var.invalidate();
        }
    }
}

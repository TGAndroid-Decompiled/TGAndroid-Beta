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
public final class x90 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final z90 E;
    public final org.telegram.ui.Components.s9 f53791a;
    public final SpannableStringBuilder f53792b;
    public final org.telegram.ui.Cells.b2 f53793c;
    public final TextView d;
    public final org.telegram.ui.Cells.b2 f53794e;
    public final TextView f53795f;
    public final org.telegram.ui.Components.bn0 h;
    public final org.telegram.ui.Components.fu0 f53796n;
    public boolean f53797r;
    public float f53798s;
    public ValueAnimator f53799w;
    public float f53800x;
    public ValueAnimator f53801y;

    public x90(z90 z90Var, Context context) {
        super(context);
        int i7;
        int i10;
        this.E = z90Var;
        LinearLayout linearLayout = new LinearLayout(context);
        if (org.telegram.messenger.hd.f24444a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        linearLayout.setGravity(i7);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        i5.c.x(textView, 1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.m6.L6;
        org.telegram.ui.ActionBar.t6.U(textView, i11, null);
        if (org.telegram.messenger.hd.f24444a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setText(org.telegram.messenger.hd.O0("LiteBatteryTitle"));
        linearLayout.addView(textView, c8.ma.r(-2, -2, 16));
        org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(context, true, false, false);
        b2Var.f30456w = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.m6.r1(0.15f, org.telegram.ui.ActionBar.m6.x0(null, i11, false)));
        this.f53793c = b2Var;
        b2Var.setTypeface(org.telegram.messenger.g0.o());
        b2Var.setPadding(org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f));
        b2Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.ActionBar.t6.Y(b2Var, i11, null);
        linearLayout.addView(b2Var, c8.ma.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, c8.ma.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.bn0 bn0Var = new org.telegram.ui.Components.bn0(context, null, true);
        this.h = bn0Var;
        bn0Var.setReportChanges(true);
        bn0Var.setDelegate(new f(this, 20));
        bn0Var.setProgress(org.telegram.messenger.qc.c() / 100.0f);
        bn0Var.setImportantForAccessibility(2);
        addView(bn0Var, c8.ma.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i12 = org.telegram.ui.ActionBar.m6.f29773y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
        textView2.setGravity(3);
        textView2.setText(org.telegram.messenger.hd.N0(2131748681, null));
        frameLayout.addView(textView2, c8.ma.e(-2, -2, 19));
        org.telegram.ui.Cells.b2 b2Var2 = new org.telegram.ui.Cells.b2(this, context);
        this.f53794e = b2Var2;
        b2Var2.b(0.45f, 240L, org.telegram.ui.Components.nr.h);
        b2Var2.setGravity(1);
        b2Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.t6.Y(b2Var2, org.telegram.ui.ActionBar.m6.f29563n6, null);
        frameLayout.addView(b2Var2, c8.ma.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.f53792b = spannableStringBuilder;
        org.telegram.ui.Components.s9 s9Var = new org.telegram.ui.Components.s9();
        this.f53791a = s9Var;
        s9Var.f39524a = b2Var2.getPaint();
        s9Var.f39528f = org.telegram.messenger.g0.L(1.5f);
        s9Var.setBounds(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(-20.0f), org.telegram.messenger.g0.L(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(s9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f53795f = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
        textView3.setGravity(5);
        textView3.setText(org.telegram.messenger.hd.N0(2131748680, null));
        frameLayout.addView(textView3, c8.ma.e(-2, -2, 21));
        addView(frameLayout, c8.ma.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.f53796n = new org.telegram.ui.Components.fu0(1, this);
        a();
    }

    public final void a() {
        int i7;
        boolean z10;
        float f10;
        float f11;
        int c10 = org.telegram.messenger.qc.c();
        org.telegram.ui.Cells.b2 b2Var = this.f53794e;
        b2Var.a();
        if (c10 <= 0) {
            b2Var.c(org.telegram.messenger.hd.N0(2131748683, null), !org.telegram.messenger.hd.f24444a0, true);
        } else if (c10 >= 100) {
            b2Var.c(org.telegram.messenger.hd.N0(2131748682, null), !org.telegram.messenger.hd.f24444a0, true);
        } else {
            float f12 = c10;
            this.f53791a.a(true, f12 / 100.0f);
            b2Var.c(org.telegram.messenger.g0.K2(org.telegram.messenger.hd.N0(2131748674, null), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f12))), this.f53792b), "%s"), !org.telegram.messenger.hd.f24444a0, true);
        }
        if (org.telegram.messenger.qc.f()) {
            i7 = 2131748680;
        } else {
            i7 = 2131748681;
        }
        String upperCase = org.telegram.messenger.hd.N0(i7, null).toUpperCase();
        org.telegram.ui.Cells.b2 b2Var2 = this.f53793c;
        b2Var2.setText(upperCase);
        if (c10 > 0 && c10 < 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f13 = 0.0f;
        if (z10 != this.f53797r) {
            this.f53797r = z10;
            b2Var2.clearAnimation();
            ViewPropertyAnimator animate = b2Var2.animate();
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            org.telegram.messenger.o10.o(animate.alpha(f11), org.telegram.ui.Components.nr.h, 220L);
        }
        if (c10 >= 100) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (this.f53798s != f10) {
            this.f53798s = f10;
            ValueAnimator valueAnimator = this.f53799w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f53799w = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f53798s, f10);
            this.f53799w = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final x90 f52761b;

                {
                    this.f52761b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            x90 x90Var = this.f52761b;
                            TextView textView = x90Var.f53795f;
                            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29773y6, false);
                            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29563n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            x90Var.f53798s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            return;
                        default:
                            x90 x90Var2 = this.f52761b;
                            TextView textView2 = x90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29773y6, false);
                            int x05 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29563n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            x90Var2.f53800x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.f53799w.addListener(new w90(this, f10, 0));
            this.f53799w.setInterpolator(org.telegram.ui.Components.nr.h);
            this.f53799w.setDuration(320L);
            this.f53799w.start();
        }
        if (c10 <= 0) {
            f13 = 1.0f;
        }
        if (this.f53800x != f13) {
            this.f53800x = f13;
            ValueAnimator valueAnimator2 = this.f53801y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f53801y = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f53800x, f13);
            this.f53801y = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final x90 f52761b;

                {
                    this.f52761b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            x90 x90Var = this.f52761b;
                            TextView textView = x90Var.f53795f;
                            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29773y6, false);
                            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29563n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            x90Var.f53798s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            return;
                        default:
                            x90 x90Var2 = this.f52761b;
                            TextView textView2 = x90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29773y6, false);
                            int x05 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29563n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            x90Var2.f53800x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.f53801y.addListener(new w90(this, f13, 1));
            this.f53801y.setInterpolator(org.telegram.ui.Components.nr.h);
            this.f53801y.setDuration(320L);
            this.f53801y.start();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29773y6));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f53796n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(112.0f), 1073741824));
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.f53796n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        return this.f53796n.performAccessibilityAction(this, i7, bundle);
    }

    @Override
    public final void updateColors() {
        ValueAnimator valueAnimator;
        TextView textView = this.f53795f;
        if (textView != null) {
            try {
                ValueAnimator valueAnimator2 = this.f53799w;
                if (valueAnimator2 != null) {
                    if (!valueAnimator2.isRunning()) {
                    }
                }
                textView.setTextColor(i0.a.f(this.f53798s, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29773y6, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29563n6, false)));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null && ((valueAnimator = this.f53801y) == null || !valueAnimator.isRunning())) {
            textView2.setTextColor(i0.a.f(this.f53800x, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29773y6, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29563n6, false)));
        }
        org.telegram.ui.Cells.b2 b2Var = this.f53793c;
        if (b2Var != null) {
            b2Var.invalidate();
        }
    }
}

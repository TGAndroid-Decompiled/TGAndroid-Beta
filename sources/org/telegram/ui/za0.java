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
public final class za0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final bb0 D;
    public final org.telegram.ui.Components.i9 f44059a;
    public final SpannableStringBuilder f44060b;
    public final org.telegram.ui.Cells.a2 f44061c;
    public final TextView d;
    public final org.telegram.ui.Cells.a2 e;
    public final TextView f44062f;
    public final org.telegram.ui.Components.nn0 h;
    public final org.telegram.ui.Components.wu0 f44063n;
    public boolean f44064r;
    public float f44065s;
    public ValueAnimator f44066w;
    public float f44067x;
    public ValueAnimator f44068y;

    public za0(bb0 bb0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.D = bb0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        if (org.telegram.messenger.cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        linearLayout.setGravity(i10);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        sc.e.t(textView, 1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.t6.L6;
        org.telegram.ui.ActionBar.a7.V(textView, i12, null);
        if (org.telegram.messenger.cd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11);
        textView.setText(org.telegram.messenger.cd.M0("LiteBatteryTitle"));
        linearLayout.addView(textView, w7.b6.r(-2, -2, 16));
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, true, false, false);
        a2Var.f21664w = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(4.0f), org.telegram.ui.ActionBar.t6.r1(0.15f, org.telegram.ui.ActionBar.t6.x0(null, i12, false)));
        this.f44061c = a2Var;
        a2Var.setTypeface(org.telegram.messenger.i0.o());
        a2Var.setPadding(org.telegram.messenger.i0.L(5.33f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(5.33f), org.telegram.messenger.i0.L(2.0f));
        a2Var.setTextSize(org.telegram.messenger.i0.L(12.0f));
        org.telegram.ui.ActionBar.a7.Z(a2Var, i12, null);
        linearLayout.addView(a2Var, w7.b6.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, w7.b6.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.nn0 nn0Var = new org.telegram.ui.Components.nn0(context, null, true);
        this.h = nn0Var;
        nn0Var.setReportChanges(true);
        nn0Var.setDelegate(new e(this, 20));
        nn0Var.setProgress(org.telegram.messenger.sc.c() / 100.0f);
        nn0Var.setImportantForAccessibility(2);
        addView(nn0Var, w7.b6.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i13 = org.telegram.ui.ActionBar.t6.f21311y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
        textView2.setGravity(3);
        textView2.setText(org.telegram.messenger.cd.L0(2131748884, null));
        frameLayout.addView(textView2, w7.b6.e(-2, -2, 19));
        org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(this, context);
        this.e = a2Var2;
        a2Var2.b(0.45f, 240L, org.telegram.ui.Components.gr.h);
        a2Var2.setGravity(1);
        a2Var2.setTextSize(org.telegram.messenger.i0.L(13.0f));
        org.telegram.ui.ActionBar.a7.Z(a2Var2, org.telegram.ui.ActionBar.t6.f21115n6, null);
        frameLayout.addView(a2Var2, w7.b6.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.f44060b = spannableStringBuilder;
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9();
        this.f44059a = i9Var;
        i9Var.f26914a = a2Var2.getPaint();
        i9Var.f26917f = org.telegram.messenger.i0.L(1.5f);
        i9Var.setBounds(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(-20.0f), org.telegram.messenger.i0.L(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(i9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f44062f = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
        textView3.setGravity(5);
        textView3.setText(org.telegram.messenger.cd.L0(2131748883, null));
        frameLayout.addView(textView3, w7.b6.e(-2, -2, 21));
        addView(frameLayout, w7.b6.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.f44063n = new org.telegram.ui.Components.wu0(1, this);
        a();
    }

    public final void a() {
        int i10;
        boolean z10;
        float f7;
        float f10;
        int c10 = org.telegram.messenger.sc.c();
        org.telegram.ui.Cells.a2 a2Var = this.e;
        a2Var.a();
        if (c10 <= 0) {
            a2Var.c(org.telegram.messenger.cd.L0(2131748886, null), !org.telegram.messenger.cd.X, true);
        } else if (c10 >= 100) {
            a2Var.c(org.telegram.messenger.cd.L0(2131748885, null), !org.telegram.messenger.cd.X, true);
        } else {
            float f11 = c10;
            this.f44059a.a(true, f11 / 100.0f);
            a2Var.c(org.telegram.messenger.i0.J2(org.telegram.messenger.cd.L0(2131748877, null), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f11))), this.f44060b), "%s"), !org.telegram.messenger.cd.X, true);
        }
        if (org.telegram.messenger.sc.f()) {
            i10 = 2131748883;
        } else {
            i10 = 2131748884;
        }
        String upperCase = org.telegram.messenger.cd.L0(i10, null).toUpperCase();
        org.telegram.ui.Cells.a2 a2Var2 = this.f44061c;
        a2Var2.setText(upperCase);
        if (c10 > 0 && c10 < 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f12 = 0.0f;
        if (z10 != this.f44064r) {
            this.f44064r = z10;
            a2Var2.clearAnimation();
            ViewPropertyAnimator animate = a2Var2.animate();
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            org.telegram.messenger.z20.m(animate.alpha(f10), org.telegram.ui.Components.gr.h, 220L);
        }
        if (c10 >= 100) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (this.f44065s != f7) {
            this.f44065s = f7;
            ValueAnimator valueAnimator = this.f44066w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f44066w = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f44065s, f7);
            this.f44066w = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final za0 f43525b;

                {
                    this.f43525b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            za0 za0Var = this.f43525b;
                            TextView textView = za0Var.f44062f;
                            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21311y6, false);
                            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21115n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            za0Var.f44065s = floatValue;
                            textView.setTextColor(i0.b.f(floatValue, x02, x03));
                            return;
                        default:
                            za0 za0Var2 = this.f43525b;
                            TextView textView2 = za0Var2.d;
                            int x04 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21311y6, false);
                            int x05 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21115n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            za0Var2.f44067x = floatValue2;
                            textView2.setTextColor(i0.b.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.f44066w.addListener(new ya0(this, f7, 0));
            this.f44066w.setInterpolator(org.telegram.ui.Components.gr.h);
            this.f44066w.setDuration(320L);
            this.f44066w.start();
        }
        if (c10 <= 0) {
            f12 = 1.0f;
        }
        if (this.f44067x != f12) {
            this.f44067x = f12;
            ValueAnimator valueAnimator2 = this.f44068y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f44068y = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f44067x, f12);
            this.f44068y = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final za0 f43525b;

                {
                    this.f43525b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            za0 za0Var = this.f43525b;
                            TextView textView = za0Var.f44062f;
                            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21311y6, false);
                            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21115n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            za0Var.f44065s = floatValue;
                            textView.setTextColor(i0.b.f(floatValue, x02, x03));
                            return;
                        default:
                            za0 za0Var2 = this.f43525b;
                            TextView textView2 = za0Var2.d;
                            int x04 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21311y6, false);
                            int x05 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21115n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            za0Var2.f44067x = floatValue2;
                            textView2.setTextColor(i0.b.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.f44068y.addListener(new ya0(this, f12, 1));
            this.f44068y.setInterpolator(org.telegram.ui.Components.gr.h);
            this.f44068y.setDuration(320L);
            this.f44068y.start();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21311y6));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f44063n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(112.0f), 1073741824));
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.f44063n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f44063n.performAccessibilityAction(this, i10, bundle);
    }

    @Override
    public final void updateColors() {
        ValueAnimator valueAnimator;
        TextView textView = this.f44062f;
        if (textView != null) {
            try {
                ValueAnimator valueAnimator2 = this.f44066w;
                if (valueAnimator2 != null) {
                    if (!valueAnimator2.isRunning()) {
                    }
                }
                textView.setTextColor(i0.b.f(this.f44065s, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21311y6, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21115n6, false)));
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null && ((valueAnimator = this.f44068y) == null || !valueAnimator.isRunning())) {
            textView2.setTextColor(i0.b.f(this.f44067x, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21311y6, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21115n6, false)));
        }
        org.telegram.ui.Cells.a2 a2Var = this.f44061c;
        if (a2Var != null) {
            a2Var.invalidate();
        }
    }
}

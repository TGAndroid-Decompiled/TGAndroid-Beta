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
public final class r90 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final t90 E;
    public final org.telegram.ui.Components.m9 f49137a;
    public final SpannableStringBuilder f49138b;
    public final org.telegram.ui.Cells.a2 f49139c;
    public final TextView d;
    public final org.telegram.ui.Cells.a2 f49140e;
    public final TextView f49141f;
    public final org.telegram.ui.Components.pm0 h;
    public final org.telegram.ui.Components.st0 f49142n;
    public boolean f49143r;
    public float f49144s;
    public ValueAnimator f49145w;
    public float f49146x;
    public ValueAnimator f49147y;

    public r90(t90 t90Var, Context context) {
        super(context);
        int i3;
        int i10;
        this.E = t90Var;
        LinearLayout linearLayout = new LinearLayout(context);
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        linearLayout.setGravity(i3);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        k2.p1.t(textView, 1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.k6.L6;
        org.telegram.ui.ActionBar.r6.V(textView, i11, null);
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setText(org.telegram.messenger.bd.N0("LiteBatteryTitle"));
        linearLayout.addView(textView, b8.mf.r(-2, -2, 16));
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, true, false, false);
        a2Var.f28930w = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, org.telegram.ui.ActionBar.k6.x0(null, i11, false)));
        this.f49139c = a2Var;
        a2Var.setTypeface(org.telegram.messenger.g0.o());
        a2Var.setPadding(org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f));
        a2Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.ActionBar.r6.Z(a2Var, i11, null);
        linearLayout.addView(a2Var, b8.mf.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, b8.mf.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.pm0 pm0Var = new org.telegram.ui.Components.pm0(context, null, true);
        this.h = pm0Var;
        pm0Var.setReportChanges(true);
        pm0Var.setDelegate(new f(this, 20));
        pm0Var.setProgress(org.telegram.messenger.lc.c() / 100.0f);
        pm0Var.setImportantForAccessibility(2);
        addView(pm0Var, b8.mf.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i12 = org.telegram.ui.ActionBar.k6.f28273y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        textView2.setGravity(3);
        textView2.setText(org.telegram.messenger.bd.M0(2131748882, null));
        frameLayout.addView(textView2, b8.mf.e(-2, -2, 19));
        org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(this, context);
        this.f49140e = a2Var2;
        a2Var2.b(0.45f, 240L, org.telegram.ui.Components.xq.h);
        a2Var2.setGravity(1);
        a2Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.r6.Z(a2Var2, org.telegram.ui.ActionBar.k6.f28062n6, null);
        frameLayout.addView(a2Var2, b8.mf.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.f49138b = spannableStringBuilder;
        org.telegram.ui.Components.m9 m9Var = new org.telegram.ui.Components.m9();
        this.f49137a = m9Var;
        m9Var.f36092a = a2Var2.getPaint();
        m9Var.f36096f = org.telegram.messenger.g0.L(1.5f);
        m9Var.setBounds(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(-20.0f), org.telegram.messenger.g0.L(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(m9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f49141f = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        textView3.setGravity(5);
        textView3.setText(org.telegram.messenger.bd.M0(2131748881, null));
        frameLayout.addView(textView3, b8.mf.e(-2, -2, 21));
        addView(frameLayout, b8.mf.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.f49142n = new org.telegram.ui.Components.st0(1, this);
        a();
    }

    public final void a() {
        int i3;
        boolean z10;
        float f10;
        float f11;
        int c2 = org.telegram.messenger.lc.c();
        org.telegram.ui.Cells.a2 a2Var = this.f49140e;
        a2Var.a();
        if (c2 <= 0) {
            a2Var.c(org.telegram.messenger.bd.M0(2131748884, null), !org.telegram.messenger.bd.f21784a0, true);
        } else if (c2 >= 100) {
            a2Var.c(org.telegram.messenger.bd.M0(2131748883, null), !org.telegram.messenger.bd.f21784a0, true);
        } else {
            float f12 = c2;
            this.f49137a.a(true, f12 / 100.0f);
            a2Var.c(org.telegram.messenger.g0.K2(org.telegram.messenger.bd.M0(2131748875, null), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f12))), this.f49138b), "%s"), !org.telegram.messenger.bd.f21784a0, true);
        }
        if (org.telegram.messenger.lc.f()) {
            i3 = 2131748881;
        } else {
            i3 = 2131748882;
        }
        String upperCase = org.telegram.messenger.bd.M0(i3, null).toUpperCase();
        org.telegram.ui.Cells.a2 a2Var2 = this.f49139c;
        a2Var2.setText(upperCase);
        if (c2 > 0 && c2 < 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f13 = 0.0f;
        if (z10 != this.f49143r) {
            this.f49143r = z10;
            a2Var2.clearAnimation();
            ViewPropertyAnimator animate = a2Var2.animate();
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            org.telegram.messenger.camera.q.l(animate.alpha(f11), org.telegram.ui.Components.xq.h, 220L);
        }
        if (c2 >= 100) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (this.f49144s != f10) {
            this.f49144s = f10;
            ValueAnimator valueAnimator = this.f49145w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f49145w = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f49144s, f10);
            this.f49145w = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final r90 f48497b;

                {
                    this.f48497b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            r90 r90Var = this.f48497b;
                            TextView textView = r90Var.f49141f;
                            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28273y6, false);
                            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28062n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            r90Var.f49144s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            return;
                        default:
                            r90 r90Var2 = this.f48497b;
                            TextView textView2 = r90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28273y6, false);
                            int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28062n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            r90Var2.f49146x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.f49145w.addListener(new q90(this, f10, 0));
            this.f49145w.setInterpolator(org.telegram.ui.Components.xq.h);
            this.f49145w.setDuration(320L);
            this.f49145w.start();
        }
        if (c2 <= 0) {
            f13 = 1.0f;
        }
        if (this.f49146x != f13) {
            this.f49146x = f13;
            ValueAnimator valueAnimator2 = this.f49147y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f49147y = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f49146x, f13);
            this.f49147y = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final r90 f48497b;

                {
                    this.f48497b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            r90 r90Var = this.f48497b;
                            TextView textView = r90Var.f49141f;
                            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28273y6, false);
                            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28062n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            r90Var.f49144s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            return;
                        default:
                            r90 r90Var2 = this.f48497b;
                            TextView textView2 = r90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28273y6, false);
                            int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28062n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            r90Var2.f49146x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.f49147y.addListener(new q90(this, f13, 1));
            this.f49147y.setInterpolator(org.telegram.ui.Components.xq.h);
            this.f49147y.setDuration(320L);
            this.f49147y.start();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28273y6));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f49142n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(112.0f), 1073741824));
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.f49142n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        return this.f49142n.performAccessibilityAction(this, i3, bundle);
    }

    @Override
    public final void updateColors() {
        ValueAnimator valueAnimator;
        TextView textView = this.f49141f;
        if (textView != null) {
            try {
                ValueAnimator valueAnimator2 = this.f49145w;
                if (valueAnimator2 != null) {
                    if (!valueAnimator2.isRunning()) {
                    }
                }
                textView.setTextColor(i0.a.f(this.f49144s, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28273y6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28062n6, false)));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null && ((valueAnimator = this.f49147y) == null || !valueAnimator.isRunning())) {
            textView2.setTextColor(i0.a.f(this.f49146x, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28273y6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28062n6, false)));
        }
        org.telegram.ui.Cells.a2 a2Var = this.f49139c;
        if (a2Var != null) {
            a2Var.invalidate();
        }
    }
}

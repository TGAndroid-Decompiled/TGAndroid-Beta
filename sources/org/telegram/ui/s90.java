package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.ui.Components.Switch;
public final class s90 extends FrameLayout {
    public final t90 E;
    public final ImageView f49440a;
    public final LinearLayout f49441b;
    public final ci.ec f49442c;
    public final org.telegram.ui.Components.h6 d;
    public final ImageView f49443e;
    public final Switch f49444f;
    public final org.telegram.ui.Components.wo h;
    public boolean f49445n;
    public boolean f49446r;
    public boolean f49447s;
    public boolean f49448w;
    public int f49449x;
    public int f49450y;

    public s90(t90 t90Var, Context context) {
        super(context);
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        float f11;
        this.E = t90Var;
        setImportantForAccessibility(1);
        ImageView imageView = new ImageView(context);
        this.f49440a = imageView;
        int i15 = org.telegram.ui.ActionBar.k6.f28043m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i15, null, mode);
        imageView.setVisibility(8);
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        addView(imageView, b8.mf.d(24, 24.0f, i3 | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        ci.ec ecVar = new ci.ec(context, 29);
        this.f49442c = ecVar;
        ecVar.setLines(1);
        ecVar.setSingleLine(true);
        ecVar.setEllipsize(TextUtils.TruncateAt.END);
        ecVar.setTextSize(1, 16.0f);
        int i16 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(ecVar, i16, null);
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        ecVar.setGravity(i10);
        ecVar.setImportantForAccessibility(2);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, true);
        this.d = h6Var;
        h6Var.b(0.35f, 200L, org.telegram.ui.Components.xq.h);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.r6.Z(h6Var, i16, null);
        h6Var.setImportantForAccessibility(2);
        ImageView imageView2 = new ImageView(context);
        this.f49443e = imageView2;
        imageView2.setVisibility(8);
        org.telegram.ui.ActionBar.r6.t(imageView2, i16, null, mode);
        imageView2.setImageResource(2131230871);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f49441b = linearLayout;
        linearLayout.setOrientation(0);
        if (org.telegram.messenger.bd.f21784a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        linearLayout.setGravity(i11);
        if (org.telegram.messenger.bd.f21784a0) {
            linearLayout.addView(imageView2, b8.mf.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(h6Var, b8.mf.q(-2, -2, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(ecVar, b8.mf.p(-2, -2, 1.0f, 16));
        } else {
            linearLayout.addView(ecVar, b8.mf.p(-2, -2, 1.0f, 16));
            linearLayout.addView(h6Var, b8.mf.q(-2, -2, 0.0f, 16, 6, 0, 0, 0));
            linearLayout.addView(imageView2, b8.mf.q(16, 16, 0.0f, 16, 2, 0, 0, 0));
        }
        if (org.telegram.messenger.bd.f21784a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(linearLayout, b8.mf.d(-1, -2.0f, i12 | 16, 64.0f, 0.0f, 8.0f, 0.0f));
        Switch r32 = new Switch(context, null);
        this.f49444f = r32;
        r32.setVisibility(8);
        int i17 = org.telegram.ui.ActionBar.k6.M6;
        int i18 = org.telegram.ui.ActionBar.k6.N6;
        int i19 = org.telegram.ui.ActionBar.k6.f27878d6;
        r32.d(i17, i18, i19, i19);
        r32.setImportantForAccessibility(2);
        if (org.telegram.messenger.bd.f21784a0) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(r32, b8.mf.d(37, 50.0f, i13 | 16, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.wo woVar = new org.telegram.ui.Components.wo(21, context, null);
        this.h = woVar;
        woVar.b(org.telegram.ui.ActionBar.k6.h7, org.telegram.ui.ActionBar.k6.f27990j7, org.telegram.ui.ActionBar.k6.f28008k7);
        woVar.setDrawUnchecked(true);
        woVar.a(true, false);
        woVar.setDrawBackgroundAsArc(10);
        woVar.setVisibility(8);
        woVar.setImportantForAccessibility(2);
        boolean z10 = org.telegram.messenger.bd.f21784a0;
        if (z10) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i20 = i14 | 16;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 64.0f;
        }
        if (z10) {
            f11 = 64.0f;
        } else {
            f11 = 0.0f;
        }
        addView(woVar, b8.mf.d(21, 21.0f, i20, f10, 0.0f, f11, 0.0f));
        setFocusable(true);
    }

    public final int a(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s90.a(int):int");
    }

    public final void b(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        if (this.f49447s != z10) {
            this.f49447s = z10;
            org.telegram.ui.Components.wo woVar = this.h;
            Switch r12 = this.f49444f;
            LinearLayout linearLayout = this.f49441b;
            ImageView imageView = this.f49440a;
            float f16 = 1.0f;
            if (z11) {
                ViewPropertyAnimator animate = imageView.animate();
                if (z10) {
                    f13 = 0.5f;
                } else {
                    f13 = 1.0f;
                }
                animate.alpha(f13).setDuration(220L).start();
                ViewPropertyAnimator animate2 = linearLayout.animate();
                if (z10) {
                    f14 = 0.5f;
                } else {
                    f14 = 1.0f;
                }
                animate2.alpha(f14).setDuration(220L).start();
                ViewPropertyAnimator animate3 = r12.animate();
                if (z10) {
                    f15 = 0.5f;
                } else {
                    f15 = 1.0f;
                }
                animate3.alpha(f15).setDuration(220L).start();
                ViewPropertyAnimator animate4 = woVar.animate();
                if (z10) {
                    f16 = 0.5f;
                }
                org.telegram.messenger.camera.q.k(animate4, f16, 220L);
            } else {
                if (z10) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                imageView.setAlpha(f10);
                if (z10) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                linearLayout.setAlpha(f11);
                if (z10) {
                    f12 = 0.5f;
                } else {
                    f12 = 1.0f;
                }
                r12.setAlpha(f12);
                if (z10) {
                    f16 = 0.5f;
                }
                woVar.setAlpha(f16);
            }
            setEnabled(!z10);
        }
    }

    public final void c(o90 o90Var, boolean z10) {
        int d = org.telegram.messenger.lc.d(true);
        int i3 = o90Var.f48238e;
        this.f49449x = a(d & i3);
        this.f49450y = a(i3);
        boolean z11 = false;
        String format = String.format("%d/%d", Integer.valueOf(this.f49449x), Integer.valueOf(this.f49450y));
        if (z10 && !org.telegram.messenger.bd.f21784a0) {
            z11 = true;
        }
        this.d.c(format, z11, true);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        super.onDraw(canvas);
        boolean z10 = org.telegram.messenger.bd.f21784a0;
        ci.ec ecVar = this.f49442c;
        if (z10) {
            if (this.f49446r) {
                float L = org.telegram.messenger.g0.L(75.0f);
                canvas.drawRect(L - org.telegram.messenger.g0.L(0.66f), (getMeasuredHeight() - org.telegram.messenger.g0.L(20.0f)) / 2.0f, L, (org.telegram.messenger.g0.L(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.k6.f28002k0);
            }
            if (this.f49445n) {
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(64.0f);
                if (ecVar.getTranslationX() < 0.0f) {
                    i3 = org.telegram.messenger.g0.L(-32.0f);
                } else {
                    i3 = 0;
                }
                canvas.drawLine(measuredWidth + i3, getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
                return;
            }
            return;
        }
        if (this.f49446r) {
            float measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.g0.L(75.0f);
            canvas.drawRect(measuredWidth2 - org.telegram.messenger.g0.L(0.66f), (getMeasuredHeight() - org.telegram.messenger.g0.L(20.0f)) / 2.0f, measuredWidth2, (org.telegram.messenger.g0.L(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.k6.f28002k0);
        }
        if (this.f49445n) {
            canvas.drawLine(ecVar.getTranslationX() + org.telegram.messenger.g0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.Components.wo woVar = this.h;
        if (woVar.getVisibility() == 0) {
            charSequence = "android.widget.CheckBox";
        } else {
            charSequence = "android.widget.Switch";
        }
        accessibilityNodeInfo.setClassName(charSequence);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        if (woVar.getVisibility() == 0) {
            accessibilityNodeInfo.setChecked(woVar.f40035a.f31334q);
        } else {
            accessibilityNodeInfo.setChecked(this.f49444f.h);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f49442c.getText());
        if (this.f49448w) {
            sb2.append('\n');
            sb2.append(org.telegram.messenger.bd.a0("Of", null, 2131747837, Integer.valueOf(this.f49449x), Integer.valueOf(this.f49450y)));
        }
        accessibilityNodeInfo.setContentDescription(sb2);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }
}

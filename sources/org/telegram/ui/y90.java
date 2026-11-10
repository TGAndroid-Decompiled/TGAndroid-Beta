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
public final class y90 extends FrameLayout {
    public final z90 D;
    public final ImageView f51969a;
    public final LinearLayout f51970b;
    public final bi.md f51971c;
    public final org.telegram.ui.Components.i6 d;
    public final ImageView f51972e;
    public final Switch f51973f;
    public final org.telegram.ui.Components.wo h;
    public boolean f51974n;
    public boolean f51975r;
    public boolean f51976s;
    public boolean f51977w;
    public int f51978x;
    public int f51979y;

    public y90(z90 z90Var, Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        float f11;
        this.D = z90Var;
        setImportantForAccessibility(1);
        ImageView imageView = new ImageView(context);
        this.f51969a = imageView;
        int i15 = org.telegram.ui.ActionBar.m6.f28055m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.s(imageView, i15, null, mode);
        imageView.setVisibility(8);
        if (org.telegram.messenger.id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(imageView, c8.ha.d(24, 24.0f, i7 | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        bi.md mdVar = new bi.md(context, 29);
        this.f51971c = mdVar;
        mdVar.setLines(1);
        mdVar.setSingleLine(true);
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        mdVar.setTextSize(1, 16.0f);
        int i16 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(mdVar, i16, null);
        if (org.telegram.messenger.id.f23161a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        mdVar.setGravity(i10);
        mdVar.setImportantForAccessibility(2);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(context, false, true, true);
        this.d = i6Var;
        i6Var.b(0.35f, 200L, org.telegram.ui.Components.wq.h);
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        i6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.t6.Y(i6Var, i16, null);
        i6Var.setImportantForAccessibility(2);
        ImageView imageView2 = new ImageView(context);
        this.f51972e = imageView2;
        imageView2.setVisibility(8);
        org.telegram.ui.ActionBar.t6.s(imageView2, i16, null, mode);
        imageView2.setImageResource(2131230871);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f51970b = linearLayout;
        linearLayout.setOrientation(0);
        if (org.telegram.messenger.id.f23161a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        linearLayout.setGravity(i11);
        if (org.telegram.messenger.id.f23161a0) {
            linearLayout.addView(imageView2, c8.ha.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(i6Var, c8.ha.q(-2, -2, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(mdVar, c8.ha.p(-2, -2, 1.0f, 16));
        } else {
            linearLayout.addView(mdVar, c8.ha.p(-2, -2, 1.0f, 16));
            linearLayout.addView(i6Var, c8.ha.q(-2, -2, 0.0f, 16, 6, 0, 0, 0));
            linearLayout.addView(imageView2, c8.ha.q(16, 16, 0.0f, 16, 2, 0, 0, 0));
        }
        if (org.telegram.messenger.id.f23161a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(linearLayout, c8.ha.d(-1, -2.0f, i12 | 16, 64.0f, 0.0f, 8.0f, 0.0f));
        Switch r32 = new Switch(context, null);
        this.f51973f = r32;
        r32.setVisibility(8);
        int i17 = org.telegram.ui.ActionBar.m6.M6;
        int i18 = org.telegram.ui.ActionBar.m6.N6;
        int i19 = org.telegram.ui.ActionBar.m6.f27890d6;
        r32.d(i17, i18, i19, i19);
        r32.setImportantForAccessibility(2);
        if (org.telegram.messenger.id.f23161a0) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(r32, c8.ha.d(37, 50.0f, i13 | 16, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.wo woVar = new org.telegram.ui.Components.wo(21, context, null);
        this.h = woVar;
        woVar.b(org.telegram.ui.ActionBar.m6.h7, org.telegram.ui.ActionBar.m6.f28000j7, org.telegram.ui.ActionBar.m6.f28020k7);
        woVar.setDrawUnchecked(true);
        woVar.a(true, false);
        woVar.setDrawBackgroundAsArc(10);
        woVar.setVisibility(8);
        woVar.setImportantForAccessibility(2);
        boolean z9 = org.telegram.messenger.id.f23161a0;
        if (z9) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i20 = i14 | 16;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 64.0f;
        }
        if (z9) {
            f11 = 64.0f;
        } else {
            f11 = 0.0f;
        }
        addView(woVar, c8.ha.d(21, 21.0f, i20, f10, 0.0f, f11, 0.0f));
        setFocusable(true);
    }

    public final int a(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y90.a(int):int");
    }

    public final void b(boolean z9, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        if (this.f51976s != z9) {
            this.f51976s = z9;
            org.telegram.ui.Components.wo woVar = this.h;
            Switch r12 = this.f51973f;
            LinearLayout linearLayout = this.f51970b;
            ImageView imageView = this.f51969a;
            float f16 = 1.0f;
            if (z10) {
                ViewPropertyAnimator animate = imageView.animate();
                if (z9) {
                    f13 = 0.5f;
                } else {
                    f13 = 1.0f;
                }
                animate.alpha(f13).setDuration(220L).start();
                ViewPropertyAnimator animate2 = linearLayout.animate();
                if (z9) {
                    f14 = 0.5f;
                } else {
                    f14 = 1.0f;
                }
                animate2.alpha(f14).setDuration(220L).start();
                ViewPropertyAnimator animate3 = r12.animate();
                if (z9) {
                    f15 = 0.5f;
                } else {
                    f15 = 1.0f;
                }
                animate3.alpha(f15).setDuration(220L).start();
                ViewPropertyAnimator animate4 = woVar.animate();
                if (z9) {
                    f16 = 0.5f;
                }
                org.telegram.messenger.camera.q.k(animate4, f16, 220L);
            } else {
                if (z9) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                imageView.setAlpha(f10);
                if (z9) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                linearLayout.setAlpha(f11);
                if (z9) {
                    f12 = 0.5f;
                } else {
                    f12 = 1.0f;
                }
                r12.setAlpha(f12);
                if (z9) {
                    f16 = 0.5f;
                }
                woVar.setAlpha(f16);
            }
            setEnabled(!z9);
        }
    }

    public final void c(u90 u90Var, boolean z9) {
        int d = org.telegram.messenger.sc.d(true);
        int i7 = u90Var.f50438e;
        this.f51978x = a(d & i7);
        this.f51979y = a(i7);
        boolean z10 = false;
        String format = String.format("%d/%d", Integer.valueOf(this.f51978x), Integer.valueOf(this.f51979y));
        if (z9 && !org.telegram.messenger.id.f23161a0) {
            z10 = true;
        }
        this.d.c(format, z10, true);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        super.onDraw(canvas);
        boolean z9 = org.telegram.messenger.id.f23161a0;
        bi.md mdVar = this.f51971c;
        if (z9) {
            if (this.f51975r) {
                float L = org.telegram.messenger.g0.L(75.0f);
                canvas.drawRect(L - org.telegram.messenger.g0.L(0.66f), (getMeasuredHeight() - org.telegram.messenger.g0.L(20.0f)) / 2.0f, L, (org.telegram.messenger.g0.L(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.m6.f28013k0);
            }
            if (this.f51974n) {
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(64.0f);
                if (mdVar.getTranslationX() < 0.0f) {
                    i7 = org.telegram.messenger.g0.L(-32.0f);
                } else {
                    i7 = 0;
                }
                canvas.drawLine(measuredWidth + i7, getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f28013k0);
                return;
            }
            return;
        }
        if (this.f51975r) {
            float measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.g0.L(75.0f);
            canvas.drawRect(measuredWidth2 - org.telegram.messenger.g0.L(0.66f), (getMeasuredHeight() - org.telegram.messenger.g0.L(20.0f)) / 2.0f, measuredWidth2, (org.telegram.messenger.g0.L(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.m6.f28013k0);
        }
        if (this.f51974n) {
            canvas.drawLine(mdVar.getTranslationX() + org.telegram.messenger.g0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f28013k0);
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
            accessibilityNodeInfo.setChecked(woVar.f40026a.f31279q);
        } else {
            accessibilityNodeInfo.setChecked(this.f51973f.h);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f51971c.getText());
        if (this.f51977w) {
            sb2.append('\n');
            sb2.append(org.telegram.messenger.id.a0("Of", null, 2131747829, Integer.valueOf(this.f51978x), Integer.valueOf(this.f51979y)));
        }
        accessibilityNodeInfo.setContentDescription(sb2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }
}

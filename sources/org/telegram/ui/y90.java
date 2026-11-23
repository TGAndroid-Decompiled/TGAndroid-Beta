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
    public final z90 E;
    public final ImageView f54087a;
    public final LinearLayout f54088b;
    public final di.xb f54089c;
    public final org.telegram.ui.Components.o6 d;
    public final ImageView f54090e;
    public final Switch f54091f;
    public final org.telegram.ui.Components.op h;
    public boolean f54092n;
    public boolean f54093r;
    public boolean f54094s;
    public boolean f54095w;
    public int f54096x;
    public int f54097y;

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
        this.E = z90Var;
        setImportantForAccessibility(1);
        ImageView imageView = new ImageView(context);
        this.f54087a = imageView;
        int i15 = org.telegram.ui.ActionBar.m6.f29546m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.s(imageView, i15, null, mode);
        imageView.setVisibility(8);
        if (org.telegram.messenger.hd.f24444a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(imageView, c8.ma.d(24, 24.0f, i7 | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        di.xb xbVar = new di.xb(context, 29);
        this.f54089c = xbVar;
        xbVar.setLines(1);
        xbVar.setSingleLine(true);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        xbVar.setTextSize(1, 16.0f);
        int i16 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(xbVar, i16, null);
        if (org.telegram.messenger.hd.f24444a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        xbVar.setGravity(i10);
        xbVar.setImportantForAccessibility(2);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, true);
        this.d = o6Var;
        o6Var.b(0.35f, 200L, org.telegram.ui.Components.nr.h);
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        o6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.t6.Y(o6Var, i16, null);
        o6Var.setImportantForAccessibility(2);
        ImageView imageView2 = new ImageView(context);
        this.f54090e = imageView2;
        imageView2.setVisibility(8);
        org.telegram.ui.ActionBar.t6.s(imageView2, i16, null, mode);
        imageView2.setImageResource(2131230871);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f54088b = linearLayout;
        linearLayout.setOrientation(0);
        if (org.telegram.messenger.hd.f24444a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        linearLayout.setGravity(i11);
        if (org.telegram.messenger.hd.f24444a0) {
            linearLayout.addView(imageView2, c8.ma.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(o6Var, c8.ma.q(-2, -2, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(xbVar, c8.ma.p(-2, -2, 1.0f, 16));
        } else {
            linearLayout.addView(xbVar, c8.ma.p(-2, -2, 1.0f, 16));
            linearLayout.addView(o6Var, c8.ma.q(-2, -2, 0.0f, 16, 6, 0, 0, 0));
            linearLayout.addView(imageView2, c8.ma.q(16, 16, 0.0f, 16, 2, 0, 0, 0));
        }
        if (org.telegram.messenger.hd.f24444a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(linearLayout, c8.ma.d(-1, -2.0f, i12 | 16, 64.0f, 0.0f, 8.0f, 0.0f));
        Switch r32 = new Switch(context, null);
        this.f54091f = r32;
        r32.setVisibility(8);
        int i17 = org.telegram.ui.ActionBar.m6.M6;
        int i18 = org.telegram.ui.ActionBar.m6.N6;
        int i19 = org.telegram.ui.ActionBar.m6.f29381d6;
        r32.d(i17, i18, i19, i19);
        r32.setImportantForAccessibility(2);
        if (org.telegram.messenger.hd.f24444a0) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(r32, c8.ma.d(37, 50.0f, i13 | 16, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.op opVar = new org.telegram.ui.Components.op(21, context, null);
        this.h = opVar;
        opVar.b(org.telegram.ui.ActionBar.m6.h7, org.telegram.ui.ActionBar.m6.f29491j7, org.telegram.ui.ActionBar.m6.f29511k7);
        opVar.setDrawUnchecked(true);
        opVar.a(true, false);
        opVar.setDrawBackgroundAsArc(10);
        opVar.setVisibility(8);
        opVar.setImportantForAccessibility(2);
        boolean z10 = org.telegram.messenger.hd.f24444a0;
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
        addView(opVar, c8.ma.d(21, 21.0f, i20, f10, 0.0f, f11, 0.0f));
        setFocusable(true);
    }

    public final int a(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y90.a(int):int");
    }

    public final void b(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        if (this.f54094s != z10) {
            this.f54094s = z10;
            org.telegram.ui.Components.op opVar = this.h;
            Switch r12 = this.f54091f;
            LinearLayout linearLayout = this.f54088b;
            ImageView imageView = this.f54087a;
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
                ViewPropertyAnimator animate4 = opVar.animate();
                if (z10) {
                    f16 = 0.5f;
                }
                org.telegram.messenger.o10.n(animate4, f16, 220L);
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
                opVar.setAlpha(f16);
            }
            setEnabled(!z10);
        }
    }

    public final void c(u90 u90Var, boolean z10) {
        int d = org.telegram.messenger.qc.d(true);
        int i7 = u90Var.f52484e;
        this.f54096x = a(d & i7);
        this.f54097y = a(i7);
        boolean z11 = false;
        String format = String.format("%d/%d", Integer.valueOf(this.f54096x), Integer.valueOf(this.f54097y));
        if (z10 && !org.telegram.messenger.hd.f24444a0) {
            z11 = true;
        }
        this.d.c(format, z11, true);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        super.onDraw(canvas);
        boolean z10 = org.telegram.messenger.hd.f24444a0;
        di.xb xbVar = this.f54089c;
        if (z10) {
            if (this.f54093r) {
                float L = org.telegram.messenger.g0.L(75.0f);
                canvas.drawRect(L - org.telegram.messenger.g0.L(0.66f), (getMeasuredHeight() - org.telegram.messenger.g0.L(20.0f)) / 2.0f, L, (org.telegram.messenger.g0.L(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.m6.f29504k0);
            }
            if (this.f54092n) {
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(64.0f);
                if (xbVar.getTranslationX() < 0.0f) {
                    i7 = org.telegram.messenger.g0.L(-32.0f);
                } else {
                    i7 = 0;
                }
                canvas.drawLine(measuredWidth + i7, getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f29504k0);
                return;
            }
            return;
        }
        if (this.f54093r) {
            float measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.g0.L(75.0f);
            canvas.drawRect(measuredWidth2 - org.telegram.messenger.g0.L(0.66f), (getMeasuredHeight() - org.telegram.messenger.g0.L(20.0f)) / 2.0f, measuredWidth2, (org.telegram.messenger.g0.L(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.m6.f29504k0);
        }
        if (this.f54092n) {
            canvas.drawLine(xbVar.getTranslationX() + org.telegram.messenger.g0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f29504k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.Components.op opVar = this.h;
        if (opVar.getVisibility() == 0) {
            charSequence = "android.widget.CheckBox";
        } else {
            charSequence = "android.widget.Switch";
        }
        accessibilityNodeInfo.setClassName(charSequence);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        if (opVar.getVisibility() == 0) {
            accessibilityNodeInfo.setChecked(opVar.f38320a.f32874q);
        } else {
            accessibilityNodeInfo.setChecked(this.f54091f.h);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f54089c.getText());
        if (this.f54095w) {
            sb2.append('\n');
            sb2.append(org.telegram.messenger.hd.a0("Of", null, 2131747635, Integer.valueOf(this.f54096x), Integer.valueOf(this.f54097y)));
        }
        accessibilityNodeInfo.setContentDescription(sb2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }
}

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
public final class x90 extends FrameLayout {
    public final y90 E;
    public final ImageView f53886a;
    public final LinearLayout f53887b;
    public final di.xb f53888c;
    public final org.telegram.ui.Components.n6 d;
    public final ImageView f53889e;
    public final Switch f53890f;
    public final org.telegram.ui.Components.lp h;
    public boolean f53891n;
    public boolean f53892r;
    public boolean f53893s;
    public boolean f53894w;
    public int f53895x;
    public int f53896y;

    public x90(y90 y90Var, Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        float f11;
        this.E = y90Var;
        setImportantForAccessibility(1);
        ImageView imageView = new ImageView(context);
        this.f53886a = imageView;
        int i15 = org.telegram.ui.ActionBar.n6.f29616m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.s(imageView, i15, null, mode);
        imageView.setVisibility(8);
        if (org.telegram.messenger.gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(imageView, c8.na.d(24, 24.0f, i7 | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        di.xb xbVar = new di.xb(context, 29);
        this.f53888c = xbVar;
        xbVar.setLines(1);
        xbVar.setSingleLine(true);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        xbVar.setTextSize(1, 16.0f);
        int i16 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(xbVar, i16, null);
        if (org.telegram.messenger.gd.f24314a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        xbVar.setGravity(i10);
        xbVar.setImportantForAccessibility(2);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, true, true);
        this.d = n6Var;
        n6Var.b(0.35f, 200L, org.telegram.ui.Components.kr.h);
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        n6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.u6.Y(n6Var, i16, null);
        n6Var.setImportantForAccessibility(2);
        ImageView imageView2 = new ImageView(context);
        this.f53889e = imageView2;
        imageView2.setVisibility(8);
        org.telegram.ui.ActionBar.u6.s(imageView2, i16, null, mode);
        imageView2.setImageResource(2131230871);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f53887b = linearLayout;
        linearLayout.setOrientation(0);
        if (org.telegram.messenger.gd.f24314a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        linearLayout.setGravity(i11);
        if (org.telegram.messenger.gd.f24314a0) {
            linearLayout.addView(imageView2, c8.na.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(n6Var, c8.na.q(-2, -2, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(xbVar, c8.na.p(-2, -2, 1.0f, 16));
        } else {
            linearLayout.addView(xbVar, c8.na.p(-2, -2, 1.0f, 16));
            linearLayout.addView(n6Var, c8.na.q(-2, -2, 0.0f, 16, 6, 0, 0, 0));
            linearLayout.addView(imageView2, c8.na.q(16, 16, 0.0f, 16, 2, 0, 0, 0));
        }
        if (org.telegram.messenger.gd.f24314a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(linearLayout, c8.na.d(-1, -2.0f, i12 | 16, 64.0f, 0.0f, 8.0f, 0.0f));
        Switch r32 = new Switch(context, null);
        this.f53890f = r32;
        r32.setVisibility(8);
        int i17 = org.telegram.ui.ActionBar.n6.M6;
        int i18 = org.telegram.ui.ActionBar.n6.N6;
        int i19 = org.telegram.ui.ActionBar.n6.f29451d6;
        r32.d(i17, i18, i19, i19);
        r32.setImportantForAccessibility(2);
        if (org.telegram.messenger.gd.f24314a0) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(r32, c8.na.d(37, 50.0f, i13 | 16, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(21, context, null);
        this.h = lpVar;
        lpVar.b(org.telegram.ui.ActionBar.n6.h7, org.telegram.ui.ActionBar.n6.f29561j7, org.telegram.ui.ActionBar.n6.f29581k7);
        lpVar.setDrawUnchecked(true);
        lpVar.a(true, false);
        lpVar.setDrawBackgroundAsArc(10);
        lpVar.setVisibility(8);
        lpVar.setImportantForAccessibility(2);
        boolean z10 = org.telegram.messenger.gd.f24314a0;
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
        addView(lpVar, c8.na.d(21, 21.0f, i20, f10, 0.0f, f11, 0.0f));
        setFocusable(true);
    }

    public final int a(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x90.a(int):int");
    }

    public final void b(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        if (this.f53893s != z10) {
            this.f53893s = z10;
            org.telegram.ui.Components.lp lpVar = this.h;
            Switch r12 = this.f53890f;
            LinearLayout linearLayout = this.f53887b;
            ImageView imageView = this.f53886a;
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
                ViewPropertyAnimator animate4 = lpVar.animate();
                if (z10) {
                    f16 = 0.5f;
                }
                org.telegram.messenger.m10.n(animate4, f16, 220L);
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
                lpVar.setAlpha(f16);
            }
            setEnabled(!z10);
        }
    }

    public final void c(t90 t90Var, boolean z10) {
        int d = org.telegram.messenger.pc.d(true);
        int i7 = t90Var.f52315e;
        this.f53895x = a(d & i7);
        this.f53896y = a(i7);
        boolean z11 = false;
        String format = String.format("%d/%d", Integer.valueOf(this.f53895x), Integer.valueOf(this.f53896y));
        if (z10 && !org.telegram.messenger.gd.f24314a0) {
            z11 = true;
        }
        this.d.c(format, z11, true);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        super.onDraw(canvas);
        boolean z10 = org.telegram.messenger.gd.f24314a0;
        di.xb xbVar = this.f53888c;
        if (z10) {
            if (this.f53892r) {
                float L = org.telegram.messenger.g0.L(75.0f);
                canvas.drawRect(L - org.telegram.messenger.g0.L(0.66f), (getMeasuredHeight() - org.telegram.messenger.g0.L(20.0f)) / 2.0f, L, (org.telegram.messenger.g0.L(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.n6.f29574k0);
            }
            if (this.f53891n) {
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(64.0f);
                if (xbVar.getTranslationX() < 0.0f) {
                    i7 = org.telegram.messenger.g0.L(-32.0f);
                } else {
                    i7 = 0;
                }
                canvas.drawLine(measuredWidth + i7, getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29574k0);
                return;
            }
            return;
        }
        if (this.f53892r) {
            float measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.g0.L(75.0f);
            canvas.drawRect(measuredWidth2 - org.telegram.messenger.g0.L(0.66f), (getMeasuredHeight() - org.telegram.messenger.g0.L(20.0f)) / 2.0f, measuredWidth2, (org.telegram.messenger.g0.L(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.n6.f29574k0);
        }
        if (this.f53891n) {
            canvas.drawLine(xbVar.getTranslationX() + org.telegram.messenger.g0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29574k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.Components.lp lpVar = this.h;
        if (lpVar.getVisibility() == 0) {
            charSequence = "android.widget.CheckBox";
        } else {
            charSequence = "android.widget.Switch";
        }
        accessibilityNodeInfo.setClassName(charSequence);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        if (lpVar.getVisibility() == 0) {
            accessibilityNodeInfo.setChecked(lpVar.f37189a.f32938q);
        } else {
            accessibilityNodeInfo.setChecked(this.f53890f.h);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f53888c.getText());
        if (this.f53894w) {
            sb2.append('\n');
            sb2.append(org.telegram.messenger.gd.a0("Of", null, 2131747635, Integer.valueOf(this.f53895x), Integer.valueOf(this.f53896y)));
        }
        accessibilityNodeInfo.setContentDescription(sb2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }
}

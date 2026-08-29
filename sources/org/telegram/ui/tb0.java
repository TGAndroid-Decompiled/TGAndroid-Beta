package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Switch;
public final class tb0 extends FrameLayout {
    public final ImageView f42631a;
    public final LinearLayout f42632b;
    public final eg.r f42633c;
    public final org.telegram.ui.Components.o6 d;
    public final ImageView f42634e;
    public final Switch f42635f;
    public final org.telegram.ui.Components.hp h;
    public boolean f42636n;
    public boolean f42637r;
    public boolean f42638s;
    public boolean v;
    public int f42639w;
    public int f42640x;
    public final ub0 f42641y;

    public tb0(ub0 ub0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f9;
        float f10;
        this.f42641y = ub0Var;
        setImportantForAccessibility(1);
        ImageView imageView = new ImageView(context);
        this.f42631a = imageView;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23223m6, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setVisibility(8);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, i7.f6.d(24, 24.0f, i10 | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        eg.r rVar = new eg.r(context, 26);
        this.f42633c = rVar;
        rVar.setLines(1);
        rVar.setSingleLine(true);
        rVar.setEllipsize(TextUtils.TruncateAt.END);
        rVar.setTextSize(1, 16.0f);
        int i16 = org.telegram.ui.ActionBar.g6.G6;
        rVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        rVar.setGravity(i11);
        rVar.setImportantForAccessibility(2);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, true);
        this.d = o6Var;
        o6Var.b(0.35f, 200L, org.telegram.ui.Components.jr.h);
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        o6Var.setImportantForAccessibility(2);
        ImageView imageView2 = new ImageView(context);
        this.f42634e = imageView2;
        imageView2.setVisibility(8);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i16, false), mode));
        imageView2.setImageResource(R.drawable.arrow_more);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f42632b = linearLayout;
        linearLayout.setOrientation(0);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        linearLayout.setGravity(i12);
        if (LocaleController.isRTL) {
            linearLayout.addView(imageView2, i7.f6.p(16, 16, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(o6Var, i7.f6.p(-2, -2, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(rVar, i7.f6.o(-2, -2, 1.0f, 16));
        } else {
            linearLayout.addView(rVar, i7.f6.o(-2, -2, 1.0f, 16));
            linearLayout.addView(o6Var, i7.f6.p(-2, -2, 0.0f, 16, 6, 0, 0, 0));
            linearLayout.addView(imageView2, i7.f6.p(16, 16, 0.0f, 16, 2, 0, 0, 0));
        }
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(linearLayout, i7.f6.d(-1, -2.0f, i13 | 16, 64.0f, 0.0f, 8.0f, 0.0f));
        Switch r32 = new Switch(context, null);
        this.f42635f = r32;
        r32.setVisibility(8);
        int i17 = org.telegram.ui.ActionBar.g6.M6;
        int i18 = org.telegram.ui.ActionBar.g6.N6;
        int i19 = org.telegram.ui.ActionBar.g6.f23062d6;
        r32.d(i17, i18, i19, i19);
        r32.setImportantForAccessibility(2);
        if (LocaleController.isRTL) {
            i14 = 3;
        } else {
            i14 = 5;
        }
        addView(r32, i7.f6.d(37, 50.0f, i14 | 16, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.hp hpVar = new org.telegram.ui.Components.hp(context, 21, null);
        this.h = hpVar;
        hpVar.b(org.telegram.ui.ActionBar.g6.f23135h7, org.telegram.ui.ActionBar.g6.f23171j7, org.telegram.ui.ActionBar.g6.f23190k7);
        hpVar.setDrawUnchecked(true);
        hpVar.a(true, false);
        hpVar.setDrawBackgroundAsArc(10);
        hpVar.setVisibility(8);
        hpVar.setImportantForAccessibility(2);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        int i20 = i15 | 16;
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = 64.0f;
        }
        if (z10) {
            f10 = 64.0f;
        } else {
            f10 = 0.0f;
        }
        addView(hpVar, i7.f6.d(21, 21.0f, i20, f9, 0.0f, f10, 0.0f));
        setFocusable(true);
    }

    public final int a(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tb0.a(int):int");
    }

    public final void b(boolean z10, boolean z11) {
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        if (this.f42638s != z10) {
            this.f42638s = z10;
            org.telegram.ui.Components.hp hpVar = this.h;
            Switch r12 = this.f42635f;
            LinearLayout linearLayout = this.f42632b;
            ImageView imageView = this.f42631a;
            float f15 = 1.0f;
            if (z11) {
                ViewPropertyAnimator animate = imageView.animate();
                if (z10) {
                    f12 = 0.5f;
                } else {
                    f12 = 1.0f;
                }
                animate.alpha(f12).setDuration(220L).start();
                ViewPropertyAnimator animate2 = linearLayout.animate();
                if (z10) {
                    f13 = 0.5f;
                } else {
                    f13 = 1.0f;
                }
                animate2.alpha(f13).setDuration(220L).start();
                ViewPropertyAnimator animate3 = r12.animate();
                if (z10) {
                    f14 = 0.5f;
                } else {
                    f14 = 1.0f;
                }
                animate3.alpha(f14).setDuration(220L).start();
                ViewPropertyAnimator animate4 = hpVar.animate();
                if (z10) {
                    f15 = 0.5f;
                }
                animate4.alpha(f15).setDuration(220L).start();
            } else {
                if (z10) {
                    f9 = 0.5f;
                } else {
                    f9 = 1.0f;
                }
                imageView.setAlpha(f9);
                if (z10) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                linearLayout.setAlpha(f10);
                if (z10) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                r12.setAlpha(f11);
                if (z10) {
                    f15 = 0.5f;
                }
                hpVar.setAlpha(f15);
            }
            setEnabled(!z10);
        }
    }

    public final void c(ob0 ob0Var, boolean z10) {
        int value = LiteMode.getValue(true);
        int i10 = ob0Var.f41079e;
        this.f42639w = a(value & i10);
        this.f42640x = a(i10);
        boolean z11 = false;
        String format = String.format("%d/%d", Integer.valueOf(this.f42639w), Integer.valueOf(this.f42640x));
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        this.d.c(format, z11, true);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        boolean z10 = LocaleController.isRTL;
        eg.r rVar = this.f42633c;
        if (z10) {
            if (this.f42637r) {
                float dp = AndroidUtilities.dp(75.0f);
                canvas.drawRect(dp - AndroidUtilities.dp(0.66f), (getMeasuredHeight() - AndroidUtilities.dp(20.0f)) / 2.0f, dp, (AndroidUtilities.dp(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.g6.f23183k0);
            }
            if (this.f42636n) {
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(64.0f);
                if (rVar.getTranslationX() < 0.0f) {
                    i10 = AndroidUtilities.dp(-32.0f);
                } else {
                    i10 = 0;
                }
                canvas.drawLine(measuredWidth + i10, getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
                return;
            }
            return;
        }
        if (this.f42637r) {
            float measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(75.0f);
            canvas.drawRect(measuredWidth2 - AndroidUtilities.dp(0.66f), (getMeasuredHeight() - AndroidUtilities.dp(20.0f)) / 2.0f, measuredWidth2, (AndroidUtilities.dp(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.g6.f23183k0);
        }
        if (this.f42636n) {
            canvas.drawLine(rVar.getTranslationX() + AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.Components.hp hpVar = this.h;
        if (hpVar.getVisibility() == 0) {
            charSequence = "android.widget.CheckBox";
        } else {
            charSequence = "android.widget.Switch";
        }
        accessibilityNodeInfo.setClassName(charSequence);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        if (hpVar.getVisibility() == 0) {
            accessibilityNodeInfo.setChecked(hpVar.f29211a.f26324q);
        } else {
            accessibilityNodeInfo.setChecked(this.f42635f.h);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f42633c.getText());
        if (this.v) {
            sb2.append('\n');
            sb2.append(LocaleController.formatString("Of", R.string.Of, Integer.valueOf(this.f42639w), Integer.valueOf(this.f42640x)));
        }
        accessibilityNodeInfo.setContentDescription(sb2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}

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
public final class rb0 extends FrameLayout {
    public final ImageView f42347a;
    public final LinearLayout f42348b;
    public final bg.t f42349c;
    public final org.telegram.ui.Components.j6 d;
    public final ImageView f42350e;
    public final Switch f42351f;
    public final org.telegram.ui.Components.dp h;
    public boolean f42352n;
    public boolean f42353r;
    public boolean f42354s;
    public boolean v;
    public int f42355w;
    public int f42356x;
    public final sb0 f42357y;

    public rb0(sb0 sb0Var, Context context) {
        super(context);
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        float f11;
        this.f42357y = sb0Var;
        setImportantForAccessibility(1);
        ImageView imageView = new ImageView(context);
        this.f42347a = imageView;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23162m6, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setVisibility(8);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        addView(imageView, g7.e6.d(24, 24.0f, i9 | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        bg.t tVar = new bg.t(context, 28);
        this.f42349c = tVar;
        tVar.setLines(1);
        tVar.setSingleLine(true);
        tVar.setEllipsize(TextUtils.TruncateAt.END);
        tVar.setTextSize(1, 16.0f);
        int i15 = org.telegram.ui.ActionBar.f6.G6;
        tVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        tVar.setGravity(i10);
        tVar.setImportantForAccessibility(2);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
        this.d = j6Var;
        j6Var.b(0.35f, 200L, org.telegram.ui.Components.gr.h);
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
        j6Var.setImportantForAccessibility(2);
        ImageView imageView2 = new ImageView(context);
        this.f42350e = imageView2;
        imageView2.setVisibility(8);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i15, false), mode));
        imageView2.setImageResource(R.drawable.arrow_more);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f42348b = linearLayout;
        linearLayout.setOrientation(0);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        linearLayout.setGravity(i11);
        if (LocaleController.isRTL) {
            linearLayout.addView(imageView2, g7.e6.p(16, 16, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(j6Var, g7.e6.p(-2, -2, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(tVar, g7.e6.o(-2, -2, 1.0f, 16));
        } else {
            linearLayout.addView(tVar, g7.e6.o(-2, -2, 1.0f, 16));
            linearLayout.addView(j6Var, g7.e6.p(-2, -2, 0.0f, 16, 6, 0, 0, 0));
            linearLayout.addView(imageView2, g7.e6.p(16, 16, 0.0f, 16, 2, 0, 0, 0));
        }
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(linearLayout, g7.e6.d(-1, -2.0f, i12 | 16, 64.0f, 0.0f, 8.0f, 0.0f));
        Switch r32 = new Switch(context, null);
        this.f42351f = r32;
        r32.setVisibility(8);
        int i16 = org.telegram.ui.ActionBar.f6.M6;
        int i17 = org.telegram.ui.ActionBar.f6.N6;
        int i18 = org.telegram.ui.ActionBar.f6.f23001d6;
        r32.d(i16, i17, i18, i18);
        r32.setImportantForAccessibility(2);
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(r32, g7.e6.d(37, 50.0f, i13 | 16, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.dp dpVar = new org.telegram.ui.Components.dp(context, 21, null);
        this.h = dpVar;
        dpVar.b(org.telegram.ui.ActionBar.f6.f23074h7, org.telegram.ui.ActionBar.f6.f23110j7, org.telegram.ui.ActionBar.f6.f23128k7);
        dpVar.setDrawUnchecked(true);
        dpVar.a(true, false);
        dpVar.setDrawBackgroundAsArc(10);
        dpVar.setVisibility(8);
        dpVar.setImportantForAccessibility(2);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i19 = i14 | 16;
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
        addView(dpVar, g7.e6.d(21, 21.0f, i19, f10, 0.0f, f11, 0.0f));
        setFocusable(true);
    }

    public final int a(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rb0.a(int):int");
    }

    public final void b(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        if (this.f42354s != z10) {
            this.f42354s = z10;
            org.telegram.ui.Components.dp dpVar = this.h;
            Switch r12 = this.f42351f;
            LinearLayout linearLayout = this.f42348b;
            ImageView imageView = this.f42347a;
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
                ViewPropertyAnimator animate4 = dpVar.animate();
                if (z10) {
                    f16 = 0.5f;
                }
                animate4.alpha(f16).setDuration(220L).start();
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
                dpVar.setAlpha(f16);
            }
            setEnabled(!z10);
        }
    }

    public final void c(mb0 mb0Var, boolean z10) {
        int value = LiteMode.getValue(true);
        int i9 = mb0Var.f40376e;
        this.f42355w = a(value & i9);
        this.f42356x = a(i9);
        boolean z11 = false;
        String format = String.format("%d/%d", Integer.valueOf(this.f42355w), Integer.valueOf(this.f42356x));
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        this.d.c(format, z11, true);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        super.onDraw(canvas);
        boolean z10 = LocaleController.isRTL;
        bg.t tVar = this.f42349c;
        if (z10) {
            if (this.f42353r) {
                float dp = AndroidUtilities.dp(75.0f);
                canvas.drawRect(dp - AndroidUtilities.dp(0.66f), (getMeasuredHeight() - AndroidUtilities.dp(20.0f)) / 2.0f, dp, (AndroidUtilities.dp(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.f6.f23121k0);
            }
            if (this.f42352n) {
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(64.0f);
                if (tVar.getTranslationX() < 0.0f) {
                    i9 = AndroidUtilities.dp(-32.0f);
                } else {
                    i9 = 0;
                }
                canvas.drawLine(measuredWidth + i9, getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
                return;
            }
            return;
        }
        if (this.f42353r) {
            float measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(75.0f);
            canvas.drawRect(measuredWidth2 - AndroidUtilities.dp(0.66f), (getMeasuredHeight() - AndroidUtilities.dp(20.0f)) / 2.0f, measuredWidth2, (AndroidUtilities.dp(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.f6.f23121k0);
        }
        if (this.f42352n) {
            canvas.drawLine(tVar.getTranslationX() + AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.Components.dp dpVar = this.h;
        if (dpVar.getVisibility() == 0) {
            charSequence = "android.widget.CheckBox";
        } else {
            charSequence = "android.widget.Switch";
        }
        accessibilityNodeInfo.setClassName(charSequence);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        if (dpVar.getVisibility() == 0) {
            accessibilityNodeInfo.setChecked(dpVar.f27781a.f26313q);
        } else {
            accessibilityNodeInfo.setChecked(this.f42351f.h);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f42349c.getText());
        if (this.v) {
            sb2.append('\n');
            sb2.append(LocaleController.formatString("Of", R.string.Of, Integer.valueOf(this.f42355w), Integer.valueOf(this.f42356x)));
        }
        accessibilityNodeInfo.setContentDescription(sb2);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}

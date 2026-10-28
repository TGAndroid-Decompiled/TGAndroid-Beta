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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Switch;
public final class vb0 extends FrameLayout {
    public final ImageView f44229a;
    public final LinearLayout f44230b;
    public final bi.md f44231c;
    public final org.telegram.ui.Components.s6 d;
    public final ImageView e;
    public final Switch f44232f;
    public final org.telegram.ui.Components.aq h;
    public boolean f44233n;
    public boolean f44234r;
    public boolean f44235s;
    public boolean v;
    public int f44236w;
    public int f44237x;
    public final wb0 f44238y;

    public vb0(wb0 wb0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f7;
        float f10;
        this.f44238y = wb0Var;
        setImportantForAccessibility(1);
        ImageView imageView = new ImageView(context);
        this.f44229a = imageView;
        int i16 = org.telegram.ui.ActionBar.y6.f23521m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.t(imageView, i16, null, mode);
        imageView.setVisibility(8);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, org.telegram.ui.Components.kb1.h(24, 24.0f, i10 | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        bi.md mdVar = new bi.md(context, 27);
        this.f44231c = mdVar;
        mdVar.setLines(1);
        mdVar.setSingleLine(true);
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        mdVar.setTextSize(1, 16.0f);
        int i17 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(mdVar, i17, null);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        mdVar.setGravity(i11);
        mdVar.setImportantForAccessibility(2);
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, true, true);
        this.d = s6Var;
        s6Var.b(0.35f, 200L, org.telegram.ui.Components.ds.h);
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.f7.Z(s6Var, i17, null);
        s6Var.setImportantForAccessibility(2);
        ImageView imageView2 = new ImageView(context);
        this.e = imageView2;
        imageView2.setVisibility(8);
        org.telegram.ui.ActionBar.f7.t(imageView2, i17, null, mode);
        imageView2.setImageResource(R.drawable.arrow_more);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f44230b = linearLayout;
        linearLayout.setOrientation(0);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        linearLayout.setGravity(i12);
        if (LocaleController.isRTL) {
            linearLayout.addView(imageView2, org.telegram.ui.Components.kb1.t(16, 16, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(s6Var, org.telegram.ui.Components.kb1.t(-2, -2, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(mdVar, org.telegram.ui.Components.kb1.s(-2, -2, 1.0f, 16));
        } else {
            linearLayout.addView(mdVar, org.telegram.ui.Components.kb1.s(-2, -2, 1.0f, 16));
            linearLayout.addView(s6Var, org.telegram.ui.Components.kb1.t(-2, -2, 0.0f, 16, 6, 0, 0, 0));
            linearLayout.addView(imageView2, org.telegram.ui.Components.kb1.t(16, 16, 0.0f, 16, 2, 0, 0, 0));
        }
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(linearLayout, org.telegram.ui.Components.kb1.h(-1, -2.0f, i13 | 16, 64.0f, 0.0f, 8.0f, 0.0f));
        Switch r32 = new Switch(context, null);
        this.f44232f = r32;
        r32.setVisibility(8);
        int i18 = org.telegram.ui.ActionBar.y6.M6;
        int i19 = org.telegram.ui.ActionBar.y6.N6;
        int i20 = org.telegram.ui.ActionBar.y6.f23357d6;
        r32.d(i18, i19, i20, i20);
        r32.setImportantForAccessibility(2);
        if (LocaleController.isRTL) {
            i14 = 3;
        } else {
            i14 = 5;
        }
        addView(r32, org.telegram.ui.Components.kb1.h(37, 50.0f, i14 | 16, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(context, 21, null);
        this.h = aqVar;
        aqVar.b(org.telegram.ui.ActionBar.y6.f23430h7, org.telegram.ui.ActionBar.y6.f23467j7, org.telegram.ui.ActionBar.y6.f23486k7);
        aqVar.setDrawUnchecked(true);
        aqVar.a(true, false);
        aqVar.setDrawBackgroundAsArc(10);
        aqVar.setVisibility(8);
        aqVar.setImportantForAccessibility(2);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        int i21 = i15 | 16;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 64.0f;
        }
        if (z10) {
            f10 = 64.0f;
        } else {
            f10 = 0.0f;
        }
        addView(aqVar, org.telegram.ui.Components.kb1.h(21, 21.0f, i21, f7, 0.0f, f10, 0.0f));
        setFocusable(true);
    }

    public final int a(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vb0.a(int):int");
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        if (this.f44235s != z10) {
            this.f44235s = z10;
            org.telegram.ui.Components.aq aqVar = this.h;
            Switch r12 = this.f44232f;
            LinearLayout linearLayout = this.f44230b;
            ImageView imageView = this.f44229a;
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
                ViewPropertyAnimator animate4 = aqVar.animate();
                if (z10) {
                    f15 = 0.5f;
                }
                org.telegram.messenger.wh.p(animate4, f15, 220L);
            } else {
                if (z10) {
                    f7 = 0.5f;
                } else {
                    f7 = 1.0f;
                }
                imageView.setAlpha(f7);
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
                aqVar.setAlpha(f15);
            }
            setEnabled(!z10);
        }
    }

    public final void c(qb0 qb0Var, boolean z10) {
        int value = LiteMode.getValue(true);
        int i10 = qb0Var.e;
        this.f44236w = a(value & i10);
        this.f44237x = a(i10);
        boolean z11 = false;
        String format = String.format("%d/%d", Integer.valueOf(this.f44236w), Integer.valueOf(this.f44237x));
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
        bi.md mdVar = this.f44231c;
        if (z10) {
            if (this.f44234r) {
                float dp = AndroidUtilities.dp(75.0f);
                canvas.drawRect(dp - AndroidUtilities.dp(0.66f), (getMeasuredHeight() - AndroidUtilities.dp(20.0f)) / 2.0f, dp, (AndroidUtilities.dp(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.y6.f23479k0);
            }
            if (this.f44233n) {
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(64.0f);
                if (mdVar.getTranslationX() < 0.0f) {
                    i10 = AndroidUtilities.dp(-32.0f);
                } else {
                    i10 = 0;
                }
                canvas.drawLine(measuredWidth + i10, getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23479k0);
                return;
            }
            return;
        }
        if (this.f44234r) {
            float measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(75.0f);
            canvas.drawRect(measuredWidth2 - AndroidUtilities.dp(0.66f), (getMeasuredHeight() - AndroidUtilities.dp(20.0f)) / 2.0f, measuredWidth2, (AndroidUtilities.dp(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.y6.f23479k0);
        }
        if (this.f44233n) {
            canvas.drawLine(mdVar.getTranslationX() + AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23479k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.Components.aq aqVar = this.h;
        if (aqVar.getVisibility() == 0) {
            charSequence = "android.widget.CheckBox";
        } else {
            charSequence = "android.widget.Switch";
        }
        accessibilityNodeInfo.setClassName(charSequence);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        if (aqVar.getVisibility() == 0) {
            accessibilityNodeInfo.setChecked(aqVar.f26634a.f26091q);
        } else {
            accessibilityNodeInfo.setChecked(this.f44232f.h);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f44231c.getText());
        if (this.v) {
            sb2.append('\n');
            sb2.append(LocaleController.formatString("Of", R.string.Of, Integer.valueOf(this.f44236w), Integer.valueOf(this.f44237x)));
        }
        accessibilityNodeInfo.setContentDescription(sb2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.Switch;

public final class wb0 extends FrameLayout {

    public final ImageView f43687a;

    public final LinearLayout f43688b;

    public final cg.q f43689c;
    public final org.telegram.ui.Components.j6 d;

    public final ImageView f43690e;

    public final Switch f43691f;
    public final org.telegram.ui.Components.bp h;

    public boolean f43692n;

    public boolean f43693r;

    public boolean f43694s;
    public boolean v;

    public int f43695w;

    public int f43696x;

    public final xb0 f43697y;

    public wb0(xb0 xb0Var, Context context) {
        super(context);
        this.f43697y = xb0Var;
        setImportantForAccessibility(1);
        ImageView imageView = new ImageView(context);
        this.f43687a = imageView;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23215m6, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(iW0, mode));
        imageView.setVisibility(8);
        addView(imageView, h7.z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        cg.q qVar = new cg.q(context, 28);
        this.f43689c = qVar;
        qVar.setLines(1);
        qVar.setSingleLine(true);
        qVar.setEllipsize(TextUtils.TruncateAt.END);
        qVar.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        qVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        qVar.setGravity(LocaleController.isRTL ? 5 : 3);
        qVar.setImportantForAccessibility(2);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
        this.d = j6Var;
        j6Var.b(0.35f, 200L, org.telegram.ui.Components.er.h);
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        j6Var.setImportantForAccessibility(2);
        ImageView imageView2 = new ImageView(context);
        this.f43690e = imageView2;
        imageView2.setVisibility(8);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), mode));
        imageView2.setImageResource(R.drawable.arrow_more);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f43688b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(LocaleController.isRTL ? 5 : 3);
        if (LocaleController.isRTL) {
            linearLayout.addView(imageView2, h7.z5.p(16, 16, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(j6Var, h7.z5.p(-2, -2, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(qVar, h7.z5.o(-2, -2, 1.0f, 16));
        } else {
            linearLayout.addView(qVar, h7.z5.o(-2, -2, 1.0f, 16));
            linearLayout.addView(j6Var, h7.z5.p(-2, -2, 0.0f, 16, 6, 0, 0, 0));
            linearLayout.addView(imageView2, h7.z5.p(16, 16, 0.0f, 16, 2, 0, 0, 0));
        }
        addView(linearLayout, h7.z5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 64.0f, 0.0f, 8.0f, 0.0f));
        Switch r10 = new Switch(context, null);
        this.f43691f = r10;
        r10.setVisibility(8);
        int i11 = org.telegram.ui.ActionBar.g6.M6;
        int i12 = org.telegram.ui.ActionBar.g6.N6;
        int i13 = org.telegram.ui.ActionBar.g6.f23053d6;
        r10.d(i11, i12, i13, i13);
        r10.setImportantForAccessibility(2);
        addView(r10, h7.z5.d(37, 50.0f, (LocaleController.isRTL ? 3 : 5) | 16, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.bp bpVar = new org.telegram.ui.Components.bp(context, 21, null);
        this.h = bpVar;
        bpVar.b(org.telegram.ui.ActionBar.g6.f23126h7, org.telegram.ui.ActionBar.g6.f23163j7, org.telegram.ui.ActionBar.g6.f23182k7);
        bpVar.setDrawUnchecked(true);
        bpVar.a(true, false);
        bpVar.setDrawBackgroundAsArc(10);
        bpVar.setVisibility(8);
        bpVar.setImportantForAccessibility(2);
        boolean z10 = LocaleController.isRTL;
        addView(bpVar, h7.z5.d(21, 21.0f, (z10 ? 5 : 3) | 16, z10 ? 0.0f : 64.0f, 0.0f, z10 ? 64.0f : 0.0f, 0.0f));
        setFocusable(true);
    }

    public final int a(int i10) {
        boolean zIsPremium = this.f43697y.getUserConfig().isPremium();
        int iBitCount = Integer.bitCount(i10);
        if (zIsPremium) {
            if ((i10 & 4096) > 0) {
                iBitCount--;
            }
            if ((i10 & 8192) > 0) {
                iBitCount--;
            }
            if ((i10 & 16384) > 0) {
                iBitCount--;
            }
        } else {
            if ((i10 & 16) > 0) {
                iBitCount--;
            }
            if ((i10 & 8) > 0) {
                iBitCount--;
            }
            if ((i10 & 4) > 0) {
                iBitCount--;
            }
        }
        if (SharedConfig.getDevicePerformanceClass() < 1 && (i10 & 256) > 0) {
            iBitCount--;
        }
        if ((Build.VERSION.SDK_INT < 33 || (SharedConfig.getDevicePerformanceClass() < 1 && !BuildVars.DEBUG_PRIVATE_VERSION)) && (262144 & i10) > 0) {
            iBitCount--;
        }
        return (org.telegram.ui.Components.f01.c() || (i10 & 65536) <= 0) ? iBitCount : iBitCount - 1;
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f43694s != z10) {
            this.f43694s = z10;
            org.telegram.ui.Components.bp bpVar = this.h;
            Switch r10 = this.f43691f;
            LinearLayout linearLayout = this.f43688b;
            ImageView imageView = this.f43687a;
            if (z11) {
                imageView.animate().alpha(z10 ? 0.5f : 1.0f).setDuration(220L).start();
                linearLayout.animate().alpha(z10 ? 0.5f : 1.0f).setDuration(220L).start();
                r10.animate().alpha(z10 ? 0.5f : 1.0f).setDuration(220L).start();
                bpVar.animate().alpha(z10 ? 0.5f : 1.0f).setDuration(220L).start();
            } else {
                imageView.setAlpha(z10 ? 0.5f : 1.0f);
                linearLayout.setAlpha(z10 ? 0.5f : 1.0f);
                r10.setAlpha(z10 ? 0.5f : 1.0f);
                bpVar.setAlpha(z10 ? 0.5f : 1.0f);
            }
            setEnabled(!z10);
        }
    }

    public final void c(rb0 rb0Var, boolean z10) {
        int value = LiteMode.getValue(true);
        int i10 = rb0Var.f41894e;
        this.f43695w = a(value & i10);
        this.f43696x = a(i10);
        boolean z11 = false;
        String str = String.format("%d/%d", Integer.valueOf(this.f43695w), Integer.valueOf(this.f43696x));
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        this.d.c(str, z11, true);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z10 = LocaleController.isRTL;
        cg.q qVar = this.f43689c;
        if (z10) {
            if (this.f43693r) {
                float fDp = AndroidUtilities.dp(75.0f);
                canvas.drawRect(fDp - AndroidUtilities.dp(0.66f), (getMeasuredHeight() - AndroidUtilities.dp(20.0f)) / 2.0f, fDp, (AndroidUtilities.dp(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.g6.f23175k0);
            }
            if (this.f43692n) {
                canvas.drawLine((getMeasuredWidth() - AndroidUtilities.dp(64.0f)) + (qVar.getTranslationX() < 0.0f ? AndroidUtilities.dp(-32.0f) : 0), getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
                return;
            }
            return;
        }
        if (this.f43693r) {
            float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(75.0f);
            canvas.drawRect(measuredWidth - AndroidUtilities.dp(0.66f), (getMeasuredHeight() - AndroidUtilities.dp(20.0f)) / 2.0f, measuredWidth, (AndroidUtilities.dp(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.g6.f23175k0);
        }
        if (this.f43692n) {
            canvas.drawLine(qVar.getTranslationX() + AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.Components.bp bpVar = this.h;
        accessibilityNodeInfo.setClassName(bpVar.getVisibility() == 0 ? "android.widget.CheckBox" : "android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        if (bpVar.getVisibility() == 0) {
            accessibilityNodeInfo.setChecked(bpVar.f27188a.f26309q);
        } else {
            accessibilityNodeInfo.setChecked(this.f43691f.h);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f43689c.getText());
        if (this.v) {
            sb2.append('\n');
            sb2.append(LocaleController.formatString("Of", R.string.Of, Integer.valueOf(this.f43695w), Integer.valueOf(this.f43696x)));
        }
        accessibilityNodeInfo.setContentDescription(sb2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}

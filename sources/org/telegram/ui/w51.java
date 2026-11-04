package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class w51 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Cells.z9 f50713a;
    public final org.telegram.ui.Components.pm0 f50714b;
    public final org.telegram.ui.Cells.q8 f50715c;
    public final int d;
    public final int f50716e;
    public final TextPaint f50717f;
    public int h;
    public int f50718n;
    public final ThemeActivity f50719r;

    public w51(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.q4 q4Var;
        this.f50719r = themeActivity;
        this.d = 12;
        this.f50716e = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f50717f = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.pm0 pm0Var = new org.telegram.ui.Components.pm0(context);
        this.f50714b = pm0Var;
        pm0Var.setReportChanges(true);
        pm0Var.setSeparatorsCount(19);
        pm0Var.setDelegate(new mr0(this, 4));
        pm0Var.setImportantForAccessibility(2);
        addView(pm0Var, b8.mf.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        boolean z10 = org.telegram.messenger.r2.f25040a;
        org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
        this.f50715c = q8Var;
        q8Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
        q8Var.f(org.telegram.messenger.bd.M0(2131751832, null), org.telegram.messenger.az.H0, false);
        q8Var.setOnClickListener(new cy0(this, 7));
        q4Var = ((org.telegram.ui.ActionBar.d2) themeActivity).parentLayout;
        org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, q4Var, 0);
        this.f50713a = z9Var;
        z9Var.setImportantForAccessibility(4);
        addView(z9Var, b8.mf.d(-1, -2.0f, 51, 0.0f, 53, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f50713a.invalidate();
        this.f50714b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I6, false);
        TextPaint textPaint = this.f50717f;
        textPaint.setColor(x02);
        canvas.drawText("" + org.telegram.messenger.az.W0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f50714b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        int size = View.MeasureSpec.getSize(i3);
        if (this.h != size) {
            int i11 = org.telegram.messenger.az.W0;
            int i12 = this.d;
            this.f50714b.setProgress((i11 - i12) / (this.f50716e - i12));
            this.h = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        if (!super.performAccessibilityAction(i3, bundle) && !this.f50714b.getSeekBarAccessibilityDelegate().g(this, i3, bundle)) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.pm0 pm0Var = this.f50714b;
        if (pm0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Jj, false);
            if (x02 != this.f50718n) {
                this.f50718n = x02;
                pm0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}

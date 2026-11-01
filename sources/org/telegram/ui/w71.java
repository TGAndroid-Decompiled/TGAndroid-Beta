package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class w71 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Cells.z9 f42716a;
    public final org.telegram.ui.Components.on0 f42717b;
    public final org.telegram.ui.Cells.t8 f42718c;
    public final int d;
    public final int e;
    public final TextPaint f42719f;
    public int h;
    public int f42720n;
    public final ThemeActivity f42721r;

    public w71(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.z4 z4Var;
        this.f42721r = themeActivity;
        this.d = 12;
        this.e = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f42719f = textPaint;
        textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.Components.on0 on0Var = new org.telegram.ui.Components.on0(context);
        this.f42717b = on0Var;
        on0Var.setReportChanges(true);
        on0Var.setSeparatorsCount(19);
        on0Var.setDelegate(new gt0(this, 4));
        on0Var.setImportantForAccessibility(2);
        addView(on0Var, w7.b6.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        boolean z10 = org.telegram.messenger.v2.f18578a;
        org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context);
        this.f42718c = t8Var;
        t8Var.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
        t8Var.f(org.telegram.messenger.dd.L0(2131751832, null), org.telegram.messenger.uz.H0, false);
        t8Var.setOnClickListener(new zz0(this, 7));
        z4Var = ((org.telegram.ui.ActionBar.k2) themeActivity).parentLayout;
        org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, z4Var, 0);
        this.f42716a = z9Var;
        z9Var.setImportantForAccessibility(4);
        addView(z9Var, w7.b6.d(-1, -2.0f, 51, 0.0f, 53, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Jj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f42716a.invalidate();
        this.f42717b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.I6, false);
        TextPaint textPaint = this.f42719f;
        textPaint.setColor(x02);
        canvas.drawText("" + org.telegram.messenger.uz.W0, getMeasuredWidth() - org.telegram.messenger.i0.L(39.0f), org.telegram.messenger.i0.L(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f42717b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.h != size) {
            int i12 = org.telegram.messenger.uz.W0;
            int i13 = this.d;
            this.f42717b.setProgress((i12 - i13) / (this.e - i13));
            this.h = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f42717b.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.on0 on0Var = this.f42717b;
        if (on0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Jj, false);
            if (x02 != this.f42720n) {
                this.f42720n = x02;
                on0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}

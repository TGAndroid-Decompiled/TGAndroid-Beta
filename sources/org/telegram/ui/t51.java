package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class t51 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.qm0 f51385a;
    public final int f51386b;
    public final TextPaint f51387c;
    public int d;
    public final ThemeActivity f51388e;

    public t51(ThemeActivity themeActivity, Context context) {
        super(context);
        this.f51388e = themeActivity;
        this.f51386b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f51387c = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(context);
        this.f51385a = qm0Var;
        qm0Var.setReportChanges(true);
        qm0Var.setSeparatorsCount(18);
        qm0Var.setDelegate(new ur0(this, 3));
        qm0Var.setImportantForAccessibility(2);
        addView(qm0Var, c8.ja.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Mj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f51385a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.I6, false);
        TextPaint textPaint = this.f51387c;
        textPaint.setColor(x02);
        canvas.drawText("" + org.telegram.messenger.gz.Y0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f51385a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
        this.f51385a.setProgress(org.telegram.messenger.gz.Y0 / this.f51386b);
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f51385a.getSeekBarAccessibilityDelegate().g(this, i7, bundle)) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.qm0 qm0Var = this.f51385a;
        if (qm0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Mj, false);
            if (x02 != this.d) {
                this.d = x02;
                qm0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}

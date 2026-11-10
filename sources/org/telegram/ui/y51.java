package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class y51 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.mm0 f51900a;
    public final int f51901b;
    public final TextPaint f51902c;
    public int d;
    public final ThemeActivity f51903e;

    public y51(ThemeActivity themeActivity, Context context) {
        super(context);
        this.f51903e = themeActivity;
        this.f51901b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f51902c = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context);
        this.f51900a = mm0Var;
        mm0Var.setReportChanges(true);
        mm0Var.setSeparatorsCount(18);
        mm0Var.setDelegate(new zr0(this, 3));
        mm0Var.setImportantForAccessibility(2);
        addView(mm0Var, c8.ha.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Jj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f51900a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.I6, false);
        TextPaint textPaint = this.f51902c;
        textPaint.setColor(x02);
        canvas.drawText("" + org.telegram.messenger.iz.Y0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f51900a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
        this.f51900a.setProgress(org.telegram.messenger.iz.Y0 / this.f51901b);
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f51900a.getSeekBarAccessibilityDelegate().g(this, i7, bundle)) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.mm0 mm0Var = this.f51900a;
        if (mm0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Jj, false);
            if (x02 != this.d) {
                this.d = x02;
                mm0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}

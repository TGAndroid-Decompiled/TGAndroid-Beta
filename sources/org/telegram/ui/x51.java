package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class x51 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.an0 f53562a;
    public final int f53563b;
    public final TextPaint f53564c;
    public int d;
    public final ThemeActivity f53565e;

    public x51(ThemeActivity themeActivity, Context context) {
        super(context);
        this.f53565e = themeActivity;
        this.f53563b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f53564c = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.an0 an0Var = new org.telegram.ui.Components.an0(context);
        this.f53562a = an0Var;
        an0Var.setReportChanges(true);
        an0Var.setSeparatorsCount(18);
        an0Var.setDelegate(new yr0(this, 3));
        an0Var.setImportantForAccessibility(2);
        addView(an0Var, c8.na.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Mj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f53562a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.I6, false);
        TextPaint textPaint = this.f53564c;
        textPaint.setColor(x02);
        canvas.drawText("" + org.telegram.messenger.cz.Y0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f53562a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
        this.f53562a.setProgress(org.telegram.messenger.cz.Y0 / this.f53563b);
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f53562a.getSeekBarAccessibilityDelegate().g(this, i7, bundle)) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.an0 an0Var = this.f53562a;
        if (an0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Mj, false);
            if (x02 != this.d) {
                this.d = x02;
                an0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}

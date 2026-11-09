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
    public final org.telegram.ui.Components.nm0 f51554a;
    public final int f51555b;
    public final TextPaint f51556c;
    public int d;
    public final ThemeActivity f51557e;

    public x51(ThemeActivity themeActivity, Context context) {
        super(context);
        this.f51557e = themeActivity;
        this.f51555b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f51556c = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context);
        this.f51554a = nm0Var;
        nm0Var.setReportChanges(true);
        nm0Var.setSeparatorsCount(18);
        nm0Var.setDelegate(new yr0(this, 3));
        nm0Var.setImportantForAccessibility(2);
        addView(nm0Var, c8.ha.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Jj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f51554a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.I6, false);
        TextPaint textPaint = this.f51556c;
        textPaint.setColor(x02);
        canvas.drawText("" + org.telegram.messenger.iz.Y0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f51554a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
        this.f51554a.setProgress(org.telegram.messenger.iz.Y0 / this.f51555b);
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f51554a.getSeekBarAccessibilityDelegate().g(this, i7, bundle)) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.nm0 nm0Var = this.f51554a;
        if (nm0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Jj, false);
            if (x02 != this.d) {
                this.d = x02;
                nm0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}

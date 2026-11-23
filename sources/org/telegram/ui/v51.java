package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class v51 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.an0 f52821a;
    public final int f52822b;
    public final TextPaint f52823c;
    public int d;
    public final ThemeActivity f52824e;

    public v51(ThemeActivity themeActivity, Context context) {
        super(context);
        this.f52824e = themeActivity;
        this.f52822b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f52823c = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.an0 an0Var = new org.telegram.ui.Components.an0(context);
        this.f52821a = an0Var;
        an0Var.setReportChanges(true);
        an0Var.setSeparatorsCount(18);
        an0Var.setDelegate(new wr0(this, 3));
        an0Var.setImportantForAccessibility(2);
        addView(an0Var, c8.na.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Mj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f52821a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.I6, false);
        TextPaint textPaint = this.f52823c;
        textPaint.setColor(x02);
        canvas.drawText("" + org.telegram.messenger.bz.Y0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f52821a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
        this.f52821a.setProgress(org.telegram.messenger.bz.Y0 / this.f52822b);
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f52821a.getSeekBarAccessibilityDelegate().g(this, i7, bundle)) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.an0 an0Var = this.f52821a;
        if (an0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Mj, false);
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

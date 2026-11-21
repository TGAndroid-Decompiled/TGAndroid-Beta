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
    public final org.telegram.ui.Components.bn0 f53636a;
    public final int f53637b;
    public final TextPaint f53638c;
    public int d;
    public final ThemeActivity f53639e;

    public x51(ThemeActivity themeActivity, Context context) {
        super(context);
        this.f53639e = themeActivity;
        this.f53637b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f53638c = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.bn0 bn0Var = new org.telegram.ui.Components.bn0(context);
        this.f53636a = bn0Var;
        bn0Var.setReportChanges(true);
        bn0Var.setSeparatorsCount(18);
        bn0Var.setDelegate(new xr0(this, 3));
        bn0Var.setImportantForAccessibility(2);
        addView(bn0Var, c8.ma.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Mj));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f53636a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.I6, false);
        TextPaint textPaint = this.f53638c;
        textPaint.setColor(x02);
        canvas.drawText("" + org.telegram.messenger.bz.Y0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f53636a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
        this.f53636a.setProgress(org.telegram.messenger.bz.Y0 / this.f53637b);
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f53636a.getSeekBarAccessibilityDelegate().g(this, i7, bundle)) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.bn0 bn0Var = this.f53636a;
        if (bn0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Mj, false);
            if (x02 != this.d) {
                this.d = x02;
                bn0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}

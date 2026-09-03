package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ub1 extends FrameLayout {
    public final org.telegram.ui.Cells.da f38767a;
    public final org.telegram.ui.Components.jo0 f38768b;
    public final int f38769c;
    public final int d;
    public final TextPaint e;
    public int f38770f;
    public final ThemeActivity h;

    public ub1(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e5 e5Var;
        this.h = themeActivity;
        this.f38769c = 12;
        this.d = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.jo0 jo0Var = new org.telegram.ui.Components.jo0(context);
        this.f38768b = jo0Var;
        jo0Var.setReportChanges(true);
        jo0Var.setSeparatorsCount(19);
        jo0Var.setDelegate(new vv0(this, 4));
        jo0Var.setImportantForAccessibility(2);
        addView(jo0Var, k7.b6.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        e5Var = ((org.telegram.ui.ActionBar.p2) themeActivity).parentLayout;
        org.telegram.ui.Cells.da daVar = new org.telegram.ui.Cells.da(context, e5Var, 0);
        this.f38767a = daVar;
        daVar.setImportantForAccessibility(4);
        addView(daVar, k7.b6.d(-1, -2.0f, 51, 0.0f, 53.0f, 0.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f38767a.invalidate();
        this.f38768b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false);
        TextPaint textPaint = this.e;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.fontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f38768b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.f38770f != size) {
            int i12 = SharedConfig.fontSize;
            int i13 = this.f38769c;
            this.f38768b.setProgress((i12 - i13) / (this.d - i13));
            this.f38770f = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f38768b.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}

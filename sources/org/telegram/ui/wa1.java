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

public final class wa1 extends FrameLayout {

    public final org.telegram.ui.Cells.ba f43680a;

    public final org.telegram.ui.Components.qn0 f43681b;

    public final int f43682c;
    public final int d;

    public final TextPaint f43683e;

    public int f43684f;
    public final ThemeActivity h;

    public wa1(ThemeActivity themeActivity, Context context) {
        super(context);
        this.h = themeActivity;
        this.f43682c = 12;
        this.d = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f43683e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.qn0 qn0Var = new org.telegram.ui.Components.qn0(context);
        this.f43681b = qn0Var;
        qn0Var.setReportChanges(true);
        qn0Var.setSeparatorsCount(19);
        qn0Var.setDelegate(new gv0(this, 4));
        qn0Var.setImportantForAccessibility(2);
        addView(qn0Var, h7.z5.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context, ((org.telegram.ui.ActionBar.n2) themeActivity).parentLayout, 0);
        this.f43680a = baVar;
        baVar.setImportantForAccessibility(4);
        addView(baVar, h7.z5.d(-1, -2.0f, 51, 0.0f, 53.0f, 0.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f43680a.invalidate();
        this.f43681b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false);
        TextPaint textPaint = this.f43683e;
        textPaint.setColor(iW0);
        canvas.drawText("" + SharedConfig.fontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f43681b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.f43684f != size) {
            int i12 = SharedConfig.fontSize;
            int i13 = this.f43682c;
            this.f43681b.setProgress((i12 - i13) / (this.d - i13));
            this.f43684f = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return super.performAccessibilityAction(i10, bundle) || this.f43681b.getSeekBarAccessibilityDelegate().g(this, i10, bundle);
    }
}

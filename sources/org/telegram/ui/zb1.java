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
public final class zb1 extends FrameLayout {
    public final org.telegram.ui.Components.qp0 f44708a;
    public final int f44709b;
    public final TextPaint f44710c;
    public final ThemeActivity d;

    public zb1(ThemeActivity themeActivity, Context context) {
        super(context);
        this.d = themeActivity;
        this.f44709b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f44710c = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.qp0 qp0Var = new org.telegram.ui.Components.qp0(context);
        this.f44708a = qp0Var;
        qp0Var.setReportChanges(true);
        qp0Var.setSeparatorsCount(18);
        qp0Var.setDelegate(new lw0(this, 3));
        qp0Var.setImportantForAccessibility(2);
        addView(qp0Var, w7.w5.a(38.0f, 5.0f, 5.0f, 39.0f, 0.0f, -1, 51));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f44708a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I6, false);
        TextPaint textPaint = this.f44710c;
        textPaint.setColor(x02);
        canvas.drawText("" + SharedConfig.bubbleRadius, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f44708a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
        this.f44708a.setProgress(SharedConfig.bubbleRadius / this.f44709b);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f44708a.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}

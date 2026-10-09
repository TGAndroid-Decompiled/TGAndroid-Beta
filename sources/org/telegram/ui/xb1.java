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
public final class xb1 extends FrameLayout {
    public final org.telegram.ui.Components.kp0 f43916a;
    public final int f43917b;
    public final TextPaint f43918c;
    public final ThemeActivity d;

    public xb1(ThemeActivity themeActivity, Context context) {
        super(context);
        this.d = themeActivity;
        this.f43917b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f43918c = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.kp0 kp0Var = new org.telegram.ui.Components.kp0(context);
        this.f43916a = kp0Var;
        kp0Var.setReportChanges(true);
        kp0Var.setSeparatorsCount(18);
        kp0Var.setDelegate(new jw0(this, 3));
        kp0Var.setImportantForAccessibility(2);
        addView(kp0Var, w7.x5.a(38.0f, 5.0f, 5.0f, 39.0f, 0.0f, -1, 51));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f43916a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.I6, false);
        TextPaint textPaint = this.f43918c;
        textPaint.setColor(x02);
        canvas.drawText("" + SharedConfig.bubbleRadius, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f43916a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
        this.f43916a.setProgress(SharedConfig.bubbleRadius / this.f43917b);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f43916a.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}

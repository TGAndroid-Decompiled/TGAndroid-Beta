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
public final class wb1 extends FrameLayout {
    public final org.telegram.ui.Components.fo0 f41894a;
    public final int f41895b;
    public final TextPaint f41896c;
    public final ThemeActivity d;

    public wb1(ThemeActivity themeActivity, Context context) {
        super(context);
        this.d = themeActivity;
        this.f41895b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f41896c = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.fo0 fo0Var = new org.telegram.ui.Components.fo0(context);
        this.f41894a = fo0Var;
        fo0Var.setReportChanges(true);
        fo0Var.setSeparatorsCount(18);
        fo0Var.setDelegate(new iw0(this, 3));
        fo0Var.setImportantForAccessibility(2);
        addView(fo0Var, w7.x5.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f41894a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false);
        TextPaint textPaint = this.f41896c;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.bubbleRadius, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f41894a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
        this.f41894a.setProgress(SharedConfig.bubbleRadius / this.f41895b);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f41894a.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}

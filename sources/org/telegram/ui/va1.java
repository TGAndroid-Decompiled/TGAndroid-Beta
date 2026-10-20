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
public final class va1 extends FrameLayout {
    public final org.telegram.ui.Cells.fa f42156a;
    public final org.telegram.ui.Components.dp0 f42157b;
    public final int f42158c;
    public final int d;
    public final TextPaint e;
    public int f42159f;
    public final ThemeActivity h;

    public va1(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d5 d5Var;
        this.h = themeActivity;
        this.f42158c = 12;
        this.d = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.dp0 dp0Var = new org.telegram.ui.Components.dp0(context);
        this.f42157b = dp0Var;
        dp0Var.setReportChanges(true);
        dp0Var.setSeparatorsCount(19);
        dp0Var.setDelegate(new ko0(this, 5));
        dp0Var.setImportantForAccessibility(2);
        addView(dp0Var, w7.z5.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        d5Var = ((org.telegram.ui.ActionBar.n2) themeActivity).parentLayout;
        org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(context, d5Var, 0);
        this.f42156a = faVar;
        faVar.setImportantForAccessibility(4);
        addView(faVar, w7.z5.d(-1, -2.0f, 51, 0.0f, 53.0f, 0.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f42156a.invalidate();
        this.f42157b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I6, false);
        TextPaint textPaint = this.e;
        textPaint.setColor(x02);
        canvas.drawText("" + SharedConfig.fontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f42157b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.f42159f != size) {
            int i12 = SharedConfig.fontSize;
            int i13 = this.f42158c;
            this.f42157b.setProgress((i12 - i13) / (this.d - i13));
            this.f42159f = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f42157b.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}

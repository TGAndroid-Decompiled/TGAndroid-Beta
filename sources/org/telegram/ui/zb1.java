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
    public final org.telegram.ui.Cells.ia f40440a;
    public final org.telegram.ui.Components.so0 f40441b;
    public final int f40442c;
    public final int d;
    public final TextPaint e;
    public int f40443f;
    public final ThemeActivity h;

    public zb1(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.b5 b5Var;
        this.h = themeActivity;
        this.f40442c = 12;
        this.d = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.so0 so0Var = new org.telegram.ui.Components.so0(context);
        this.f40441b = so0Var;
        so0Var.setReportChanges(true);
        so0Var.setSeparatorsCount(19);
        so0Var.setDelegate(new aw0(this, 4));
        so0Var.setImportantForAccessibility(2);
        addView(so0Var, w7.y5.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        b5Var = ((org.telegram.ui.ActionBar.m2) themeActivity).parentLayout;
        org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(context, b5Var, 0);
        this.f40440a = iaVar;
        iaVar.setImportantForAccessibility(4);
        addView(iaVar, w7.y5.d(-1, -2.0f, 51, 0.0f, 53.0f, 0.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f40440a.invalidate();
        this.f40441b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I6, false);
        TextPaint textPaint = this.e;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.fontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f40441b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.f40443f != size) {
            int i12 = SharedConfig.fontSize;
            int i13 = this.f40442c;
            this.f40441b.setProgress((i12 - i13) / (this.d - i13));
            this.f40443f = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f40441b.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}

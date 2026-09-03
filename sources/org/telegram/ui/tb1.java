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
public final class tb1 extends FrameLayout {
    public final org.telegram.ui.Cells.ea f41497a;
    public final org.telegram.ui.Components.ko0 f41498b;
    public final int f41499c;
    public final int d;
    public final TextPaint f41500e;
    public int f41501f;
    public final ThemeActivity h;

    public tb1(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f5 f5Var;
        this.h = themeActivity;
        this.f41499c = 12;
        this.d = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f41500e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.ko0 ko0Var = new org.telegram.ui.Components.ko0(context);
        this.f41498b = ko0Var;
        ko0Var.setReportChanges(true);
        ko0Var.setSeparatorsCount(19);
        ko0Var.setDelegate(new vv0(this, 4));
        ko0Var.setImportantForAccessibility(2);
        addView(ko0Var, k7.c6.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        f5Var = ((org.telegram.ui.ActionBar.p2) themeActivity).parentLayout;
        org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context, f5Var, 0);
        this.f41497a = eaVar;
        eaVar.setImportantForAccessibility(4);
        addView(eaVar, k7.c6.d(-1, -2.0f, 51, 0.0f, 53.0f, 0.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f41497a.invalidate();
        this.f41498b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I6, false);
        TextPaint textPaint = this.f41500e;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.fontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f41498b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.f41501f != size) {
            int i12 = SharedConfig.fontSize;
            int i13 = this.f41499c;
            this.f41498b.setProgress((i12 - i13) / (this.d - i13));
            this.f41501f = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f41498b.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }
}

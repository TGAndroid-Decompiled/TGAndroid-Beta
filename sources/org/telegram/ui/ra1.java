package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
public final class ra1 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Components.lp0 f43084a;
    public final int f43085b;
    public final TextPaint f43086c;
    public int d;
    public final ThemeActivity e;

    public ra1(ThemeActivity themeActivity, Context context) {
        super(context);
        this.e = themeActivity;
        this.f43085b = 17;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f43086c = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.lp0 lp0Var = new org.telegram.ui.Components.lp0(context);
        this.f43084a = lp0Var;
        lp0Var.setReportChanges(true);
        lp0Var.setSeparatorsCount(18);
        lp0Var.setDelegate(new uv0(this, 3));
        lp0Var.setImportantForAccessibility(2);
        addView(lp0Var, org.telegram.ui.Components.gb1.h(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vi));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f43084a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.I6, false);
        TextPaint textPaint = this.f43086c;
        textPaint.setColor(x02);
        canvas.drawText("" + SharedConfig.bubbleRadius, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f43084a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
        this.f43084a.setProgress(SharedConfig.bubbleRadius / this.f43085b);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f43084a.getSeekBarAccessibilityDelegate().g(this, i10, bundle)) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.lp0 lp0Var = this.f43084a;
        if (lp0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Vi, false);
            if (x02 != this.d) {
                this.d = x02;
                lp0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}

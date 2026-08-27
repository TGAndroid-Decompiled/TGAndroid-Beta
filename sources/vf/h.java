package vf;

import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.l6;
import org.telegram.ui.Components.qn0;

public final class h extends FrameLayout {

    public qn0 f48900a;

    public float f48901b;

    public float f48902c;
    public float d;

    public l6 f48903e;

    public String f48904f;
    public TextPaint h;

    public int f48905n;

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f48900a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.h;
        textPaint.setColor(g6.w0(null, g6.G6, false));
        canvas.drawText(this.f48904f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), textPaint);
        textPaint.setColor(g6.w0(null, g6.I6, false));
        String str = String.format(Locale.ROOT, "%.2f", Float.valueOf(this.d));
        canvas.drawText(str, (getMeasuredWidth() - AndroidUtilities.dp(8.0f)) - textPaint.measureText(str), this.f48900a.getY() + AndroidUtilities.dp(23.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f48900a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.f48905n != size) {
            qn0 qn0Var = this.f48900a;
            float fFloatValue = ((Float) this.f48903e.get(null)).floatValue();
            float f10 = this.f48901b;
            qn0Var.setProgress((fFloatValue - f10) / (this.f48902c - f10));
            this.f48905n = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return super.performAccessibilityAction(i10, bundle) || this.f48900a.getSeekBarAccessibilityDelegate().g(this, i10, bundle);
    }
}

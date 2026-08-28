package uf;

import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l6;
import org.telegram.ui.Components.pn0;
public final class g extends FrameLayout {
    public pn0 f48212a;
    public float f48213b;
    public float f48214c;
    public float d;
    public l6 f48215e;
    public String f48216f;
    public TextPaint h;
    public int f48217n;

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f48212a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.h;
        textPaint.setColor(f6.w0(null, f6.G6, false));
        canvas.drawText(this.f48216f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), textPaint);
        textPaint.setColor(f6.w0(null, f6.I6, false));
        String format = String.format(Locale.ROOT, "%.2f", Float.valueOf(this.d));
        canvas.drawText(format, (getMeasuredWidth() - AndroidUtilities.dp(8.0f)) - textPaint.measureText(format), this.f48212a.getY() + AndroidUtilities.dp(23.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f48212a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int size = View.MeasureSpec.getSize(i9);
        if (this.f48217n != size) {
            pn0 pn0Var = this.f48212a;
            float floatValue = ((Float) this.f48215e.get(null)).floatValue();
            float f10 = this.f48213b;
            pn0Var.setProgress((floatValue - f10) / (this.f48214c - f10));
            this.f48217n = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i9, Bundle bundle) {
        if (!super.performAccessibilityAction(i9, bundle) && !this.f48212a.getSeekBarAccessibilityDelegate().g(this, i9, bundle)) {
            return false;
        }
        return true;
    }
}

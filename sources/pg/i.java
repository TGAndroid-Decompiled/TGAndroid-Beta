package pg;

import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.l6;
import org.telegram.ui.Components.nm0;
public final class i extends FrameLayout {
    public nm0 f53630a;
    public float f53631b;
    public float f53632c;
    public float d;
    public l6 f53633e;
    public String f53634f;
    public TextPaint h;
    public int f53635n;

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f53630a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.h;
        textPaint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G6, false));
        canvas.drawText(this.f53634f, g0.L(24.0f), g0.L(24.0f), textPaint);
        textPaint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.I6, false));
        String format = String.format(Locale.ROOT, "%.2f", Float.valueOf(this.d));
        canvas.drawText(format, (getMeasuredWidth() - g0.L(8.0f)) - textPaint.measureText(format), this.f53630a.getY() + g0.L(23.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f53630a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.f53635n != size) {
            nm0 nm0Var = this.f53630a;
            float floatValue = ((Float) this.f53633e.get(null)).floatValue();
            float f10 = this.f53631b;
            nm0Var.setProgress((floatValue - f10) / (this.f53632c - f10));
            this.f53635n = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f53630a.getSeekBarAccessibilityDelegate().g(this, i7, bundle)) {
            return false;
        }
        return true;
    }
}

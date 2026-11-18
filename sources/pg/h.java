package pg;

import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.ym0;
public final class h extends FrameLayout {
    public ym0 f55610a;
    public float f55611b;
    public float f55612c;
    public float d;
    public p6 f55613e;
    public String f55614f;
    public TextPaint h;
    public int f55615n;

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f55610a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.h;
        textPaint.setColor(n6.x0(null, n6.G6, false));
        canvas.drawText(this.f55614f, g0.L(24.0f), g0.L(24.0f), textPaint);
        textPaint.setColor(n6.x0(null, n6.I6, false));
        String format = String.format(Locale.ROOT, "%.2f", Float.valueOf(this.d));
        canvas.drawText(format, (getMeasuredWidth() - g0.L(8.0f)) - textPaint.measureText(format), this.f55610a.getY() + g0.L(23.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f55610a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.f55615n != size) {
            ym0 ym0Var = this.f55610a;
            float floatValue = ((Float) this.f55613e.get(null)).floatValue();
            float f10 = this.f55611b;
            ym0Var.setProgress((floatValue - f10) / (this.f55612c - f10));
            this.f55615n = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f55610a.getSeekBarAccessibilityDelegate().g(this, i7, bundle)) {
            return false;
        }
        return true;
    }
}

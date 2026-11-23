package pg;

import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.q6;
public final class h extends FrameLayout {
    public bn0 f55655a;
    public float f55656b;
    public float f55657c;
    public float d;
    public q6 f55658e;
    public String f55659f;
    public TextPaint h;
    public int f55660n;

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f55655a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.h;
        textPaint.setColor(m6.x0(null, m6.G6, false));
        canvas.drawText(this.f55659f, g0.L(24.0f), g0.L(24.0f), textPaint);
        textPaint.setColor(m6.x0(null, m6.I6, false));
        String format = String.format(Locale.ROOT, "%.2f", Float.valueOf(this.d));
        canvas.drawText(format, (getMeasuredWidth() - g0.L(8.0f)) - textPaint.measureText(format), this.f55655a.getY() + g0.L(23.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f55655a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.f55660n != size) {
            bn0 bn0Var = this.f55655a;
            float floatValue = ((Float) this.f55658e.get(null)).floatValue();
            float f10 = this.f55656b;
            bn0Var.setProgress((floatValue - f10) / (this.f55657c - f10));
            this.f55660n = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f55655a.getSeekBarAccessibilityDelegate().g(this, i7, bundle)) {
            return false;
        }
        return true;
    }
}

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
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.p6;
public final class h extends FrameLayout {
    public an0 f55733a;
    public float f55734b;
    public float f55735c;
    public float d;
    public p6 f55736e;
    public String f55737f;
    public TextPaint h;
    public int f55738n;

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f55733a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.h;
        textPaint.setColor(n6.x0(null, n6.G6, false));
        canvas.drawText(this.f55737f, g0.L(24.0f), g0.L(24.0f), textPaint);
        textPaint.setColor(n6.x0(null, n6.I6, false));
        String format = String.format(Locale.ROOT, "%.2f", Float.valueOf(this.d));
        canvas.drawText(format, (getMeasuredWidth() - g0.L(8.0f)) - textPaint.measureText(format), this.f55733a.getY() + g0.L(23.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f55733a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.f55738n != size) {
            an0 an0Var = this.f55733a;
            float floatValue = ((Float) this.f55736e.get(null)).floatValue();
            float f10 = this.f55734b;
            an0Var.setProgress((floatValue - f10) / (this.f55735c - f10));
            this.f55738n = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f55733a.getSeekBarAccessibilityDelegate().g(this, i7, bundle)) {
            return false;
        }
        return true;
    }
}

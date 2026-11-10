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
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.mm0;
public final class i extends FrameLayout {
    public mm0 f53629a;
    public float f53630b;
    public float f53631c;
    public float d;
    public k6 f53632e;
    public String f53633f;
    public TextPaint h;
    public int f53634n;

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f53629a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.h;
        textPaint.setColor(m6.x0(null, m6.G6, false));
        canvas.drawText(this.f53633f, g0.L(24.0f), g0.L(24.0f), textPaint);
        textPaint.setColor(m6.x0(null, m6.I6, false));
        String format = String.format(Locale.ROOT, "%.2f", Float.valueOf(this.d));
        canvas.drawText(format, (getMeasuredWidth() - g0.L(8.0f)) - textPaint.measureText(format), this.f53629a.getY() + g0.L(23.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f53629a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.f53634n != size) {
            mm0 mm0Var = this.f53629a;
            float floatValue = ((Float) this.f53632e.get(null)).floatValue();
            float f10 = this.f53630b;
            mm0Var.setProgress((floatValue - f10) / (this.f53631c - f10));
            this.f53634n = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f53629a.getSeekBarAccessibilityDelegate().g(this, i7, bundle)) {
            return false;
        }
        return true;
    }
}

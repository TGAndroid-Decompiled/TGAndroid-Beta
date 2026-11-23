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
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.q6;
public final class h extends FrameLayout {
    public an0 f55620a;
    public float f55621b;
    public float f55622c;
    public float d;
    public q6 f55623e;
    public String f55624f;
    public TextPaint h;
    public int f55625n;

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f55620a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.h;
        textPaint.setColor(m6.x0(null, m6.G6, false));
        canvas.drawText(this.f55624f, g0.L(24.0f), g0.L(24.0f), textPaint);
        textPaint.setColor(m6.x0(null, m6.I6, false));
        String format = String.format(Locale.ROOT, "%.2f", Float.valueOf(this.d));
        canvas.drawText(format, (getMeasuredWidth() - g0.L(8.0f)) - textPaint.measureText(format), this.f55620a.getY() + g0.L(23.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f55620a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.f55625n != size) {
            an0 an0Var = this.f55620a;
            float floatValue = ((Float) this.f55623e.get(null)).floatValue();
            float f10 = this.f55621b;
            an0Var.setProgress((floatValue - f10) / (this.f55622c - f10));
            this.f55625n = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f55620a.getSeekBarAccessibilityDelegate().g(this, i7, bundle)) {
            return false;
        }
        return true;
    }
}

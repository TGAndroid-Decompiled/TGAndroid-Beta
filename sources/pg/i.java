package pg;

import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l6;
import org.telegram.ui.Components.mm0;
public final class i extends FrameLayout {
    public mm0 f53618a;
    public float f53619b;
    public float f53620c;
    public float d;
    public l6 f53621e;
    public String f53622f;
    public TextPaint h;
    public int f53623n;

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f53618a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.h;
        textPaint.setColor(k6.x0(null, k6.G6, false));
        canvas.drawText(this.f53622f, g0.L(24.0f), g0.L(24.0f), textPaint);
        textPaint.setColor(k6.x0(null, k6.I6, false));
        String format = String.format(Locale.ROOT, "%.2f", Float.valueOf(this.d));
        canvas.drawText(format, (getMeasuredWidth() - g0.L(8.0f)) - textPaint.measureText(format), this.f53618a.getY() + g0.L(23.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f53618a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.f53623n != size) {
            mm0 mm0Var = this.f53618a;
            float floatValue = ((Float) this.f53621e.get(null)).floatValue();
            float f10 = this.f53619b;
            mm0Var.setProgress((floatValue - f10) / (this.f53620c - f10));
            this.f53623n = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f53618a.getSeekBarAccessibilityDelegate().g(this, i7, bundle)) {
            return false;
        }
        return true;
    }
}

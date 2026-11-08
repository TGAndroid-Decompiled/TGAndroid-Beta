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
    public mm0 f53617a;
    public float f53618b;
    public float f53619c;
    public float d;
    public l6 f53620e;
    public String f53621f;
    public TextPaint h;
    public int f53622n;

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f53617a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.h;
        textPaint.setColor(k6.x0(null, k6.G6, false));
        canvas.drawText(this.f53621f, g0.L(24.0f), g0.L(24.0f), textPaint);
        textPaint.setColor(k6.x0(null, k6.I6, false));
        String format = String.format(Locale.ROOT, "%.2f", Float.valueOf(this.d));
        canvas.drawText(format, (getMeasuredWidth() - g0.L(8.0f)) - textPaint.measureText(format), this.f53617a.getY() + g0.L(23.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f53617a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.f53622n != size) {
            mm0 mm0Var = this.f53617a;
            float floatValue = ((Float) this.f53620e.get(null)).floatValue();
            float f10 = this.f53618b;
            mm0Var.setProgress((floatValue - f10) / (this.f53619c - f10));
            this.f53622n = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f53617a.getSeekBarAccessibilityDelegate().g(this, i7, bundle)) {
            return false;
        }
        return true;
    }
}

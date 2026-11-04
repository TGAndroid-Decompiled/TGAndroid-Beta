package qg;

import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.pm0;
public final class g extends FrameLayout {
    public pm0 f53924a;
    public float f53925b;
    public float f53926c;
    public float d;
    public j6 f53927e;
    public String f53928f;
    public TextPaint h;
    public int f53929n;

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f53924a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.h;
        textPaint.setColor(k6.x0(null, k6.G6, false));
        canvas.drawText(this.f53928f, g0.L(24.0f), g0.L(24.0f), textPaint);
        textPaint.setColor(k6.x0(null, k6.I6, false));
        String format = String.format(Locale.ROOT, "%.2f", Float.valueOf(this.d));
        canvas.drawText(format, (getMeasuredWidth() - g0.L(8.0f)) - textPaint.measureText(format), this.f53924a.getY() + g0.L(23.0f), textPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f53924a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        int size = View.MeasureSpec.getSize(i3);
        if (this.f53929n != size) {
            pm0 pm0Var = this.f53924a;
            float floatValue = ((Float) this.f53927e.get(null)).floatValue();
            float f10 = this.f53925b;
            pm0Var.setProgress((floatValue - f10) / (this.f53926c - f10));
            this.f53929n = size;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        if (!super.performAccessibilityAction(i3, bundle) && !this.f53924a.getSeekBarAccessibilityDelegate().g(this, i3, bundle)) {
            return false;
        }
        return true;
    }
}

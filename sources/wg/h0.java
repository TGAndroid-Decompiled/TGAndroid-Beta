package wg;

import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m6;
public final class h0 extends View implements c6 {
    public TextPaint f57750a;
    public int f57751b;

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        TextPaint textPaint = this.f57750a;
        canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, textPaint);
        ia.e.d().f(-org.telegram.messenger.g0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(1.5f), ia.e.d().e());
        float descent = textPaint.descent();
        canvas.drawText("+" + this.f57751b, measuredWidth, (int) (measuredHeight - ((textPaint.ascent() + descent) / 2.0f)), textPaint);
    }

    @Override
    public final void updateColors() {
        try {
            this.f57750a.setColor(m6.x0(null, m6.f27834a7, false));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

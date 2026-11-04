package xg;

import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;
public final class h0 extends View implements z5 {
    public TextPaint f58709a;
    public int f58710b;

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        TextPaint textPaint = this.f58709a;
        canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, textPaint);
        ha.e.d().f(-org.telegram.messenger.g0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(1.5f), ha.e.d().e());
        float descent = textPaint.descent();
        canvas.drawText("+" + this.f58710b, measuredWidth, (int) (measuredHeight - ((textPaint.ascent() + descent) / 2.0f)), textPaint);
    }

    @Override
    public final void updateColors() {
        try {
            this.f58709a.setColor(k6.x0(null, k6.f27824a7, false));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

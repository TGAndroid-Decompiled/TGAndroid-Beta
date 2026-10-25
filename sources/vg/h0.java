package vg;

import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.y6;
public final class h0 extends View implements p6 {
    public TextPaint f50177a;
    public int f50178b;

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        TextPaint textPaint = this.f50177a;
        canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, textPaint);
        tg.b1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(1.5f), tg.b1.d().e());
        float descent = textPaint.descent();
        canvas.drawText("+" + this.f50178b, measuredWidth, (int) (measuredHeight - ((textPaint.ascent() + descent) / 2.0f)), textPaint);
    }

    @Override
    public final void updateColors() {
        try {
            this.f50177a.setColor(y6.x0(null, y6.f23297a7, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

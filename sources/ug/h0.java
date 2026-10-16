package ug;

import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h0 extends View {
    public TextPaint f46317a;
    public int f46318b;

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        TextPaint textPaint = this.f46317a;
        canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, textPaint);
        sg.b1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(1.5f), sg.b1.d().e());
        float descent = textPaint.descent();
        canvas.drawText("+" + this.f46318b, measuredWidth, (int) (measuredHeight - ((textPaint.ascent() + descent) / 2.0f)), textPaint);
    }
}

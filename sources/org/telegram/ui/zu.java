package org.telegram.ui;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zu extends View {
    public Path f39442a;
    public Paint f39443b;
    public boolean f39444c;

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestLayout();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f39442a, this.f39443b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(13.0f), 1073741824));
        setTop(this.f39444c);
    }

    public void setTop(boolean z10) {
        Path path = this.f39442a;
        path.rewind();
        this.f39444c = z10;
        if (z10) {
            float dp = AndroidUtilities.dp(14.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, AndroidUtilities.dp(4.0f), getMeasuredWidth(), (getMeasuredHeight() * 2) + AndroidUtilities.dp(4.0f));
            path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
            return;
        }
        float dp2 = AndroidUtilities.dp(8.0f);
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, ((-getMeasuredHeight()) * 2) - AndroidUtilities.dp(4.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(4.0f));
        path.addRoundRect(rectF2, dp2, dp2, Path.Direction.CW);
    }
}

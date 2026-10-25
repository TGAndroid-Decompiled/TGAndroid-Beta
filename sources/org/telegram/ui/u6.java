package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class u6 extends View implements org.telegram.ui.ActionBar.p6 {
    public Paint f44023a;
    public Paint f44024b;
    public float f44025c;
    public org.telegram.ui.Components.h6 d;

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.f44024b);
        rectF.set(0.0f, 0.0f, this.d.d(this.f44025c, false) * getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.f44023a);
    }

    @Override
    public final void updateColors() {
        try {
            Paint paint = this.f44023a;
            int i10 = org.telegram.ui.ActionBar.y6.N6;
            paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
            this.f44024b.setColor(org.telegram.ui.ActionBar.y6.o1(0.2f, org.telegram.ui.ActionBar.y6.x0(null, i10, false)));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

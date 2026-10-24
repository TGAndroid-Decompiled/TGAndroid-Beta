package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class t6 extends View implements org.telegram.ui.ActionBar.b6 {
    public Paint f41887a;
    public Paint f41888b;
    public float f41889c;
    public org.telegram.ui.Components.d6 d;

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.f41888b);
        rectF.set(0.0f, 0.0f, this.d.d(this.f41889c, false) * getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.f41887a);
    }

    @Override
    public final void updateColors() {
        try {
            Paint paint = this.f41887a;
            int i10 = org.telegram.ui.ActionBar.k6.N6;
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            this.f41888b.setColor(org.telegram.ui.ActionBar.k6.o1(0.2f, org.telegram.ui.ActionBar.k6.x0(null, i10, false)));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

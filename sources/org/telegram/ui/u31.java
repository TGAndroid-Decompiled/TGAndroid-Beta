package org.telegram.ui;

import android.graphics.Canvas;
public final class u31 extends org.telegram.ui.Cells.v7 {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
        }
        super.onDraw(canvas);
    }
}

package org.telegram.ui;

import android.graphics.Canvas;
public final class z81 extends org.telegram.ui.Cells.f8 {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false));
        }
        super.onDraw(canvas);
    }
}

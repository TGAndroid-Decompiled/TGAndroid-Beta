package org.telegram.ui;

import android.graphics.Canvas;
public final class w81 extends org.telegram.ui.Cells.y7 {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        }
        super.onDraw(canvas);
    }
}

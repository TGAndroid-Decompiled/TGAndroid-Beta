package org.telegram.ui;

import android.graphics.Canvas;
public final class y81 extends lg.c {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false));
        }
        super.onDraw(canvas);
    }
}

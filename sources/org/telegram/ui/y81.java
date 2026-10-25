package org.telegram.ui;

import android.graphics.Canvas;
public final class y81 extends h91 {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false));
        }
        super.onDraw(canvas);
    }
}

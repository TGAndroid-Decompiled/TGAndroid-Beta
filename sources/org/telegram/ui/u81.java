package org.telegram.ui;

import android.graphics.Canvas;
public final class u81 extends d91 {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        }
        super.onDraw(canvas);
    }
}

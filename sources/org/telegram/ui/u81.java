package org.telegram.ui;

import android.graphics.Canvas;

public final class u81 extends tf.c {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        }
        super.onDraw(canvas);
    }
}

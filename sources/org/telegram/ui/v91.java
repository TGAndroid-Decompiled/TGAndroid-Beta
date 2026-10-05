package org.telegram.ui;

import android.graphics.Canvas;
public final class v91 extends ea1 {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20827d6, false));
        }
        super.onDraw(canvas);
    }
}

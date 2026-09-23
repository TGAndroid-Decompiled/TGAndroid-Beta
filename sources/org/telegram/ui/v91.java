package org.telegram.ui;

import android.graphics.Canvas;
public final class v91 extends kg.c {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
        }
        super.onDraw(canvas);
    }
}

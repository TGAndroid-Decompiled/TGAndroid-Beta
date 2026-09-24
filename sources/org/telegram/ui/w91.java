package org.telegram.ui;

import android.graphics.Canvas;
public final class w91 extends kg.c {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045d6, false));
        }
        super.onDraw(canvas);
    }
}

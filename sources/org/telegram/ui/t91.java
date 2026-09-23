package org.telegram.ui;

import android.graphics.Canvas;
public final class t91 extends ca1 {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
        }
        super.onDraw(canvas);
    }
}

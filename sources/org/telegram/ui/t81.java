package org.telegram.ui;

import android.graphics.Canvas;
public final class t81 extends c91 {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
        }
        super.onDraw(canvas);
    }
}

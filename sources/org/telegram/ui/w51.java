package org.telegram.ui;

import android.graphics.Canvas;
public final class w51 extends f61 {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false));
        }
        super.onDraw(canvas);
    }
}

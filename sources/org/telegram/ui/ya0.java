package org.telegram.ui;

import android.graphics.Canvas;
public final class ya0 extends org.telegram.ui.Cells.t8 {
    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
    }
}

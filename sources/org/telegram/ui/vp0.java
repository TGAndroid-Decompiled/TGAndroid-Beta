package org.telegram.ui;

import android.graphics.Canvas;
public final class vp0 extends org.telegram.ui.Cells.ga {
    public static void b(vp0 vp0Var, Canvas canvas) {
        super.draw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (canvas.isHardwareAccelerated()) {
            super.draw(canvas);
        } else {
            zf.j0.a(canvas, this, new v3(this, 15));
        }
    }
}

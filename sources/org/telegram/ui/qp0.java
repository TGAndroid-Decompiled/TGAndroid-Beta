package org.telegram.ui;

import android.graphics.Canvas;
public final class qp0 extends org.telegram.ui.Cells.ia {
    public static void b(qp0 qp0Var, Canvas canvas) {
        super.draw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (canvas.isHardwareAccelerated()) {
            super.draw(canvas);
        } else {
            yf.j0.a(canvas, this, new t3(this, 12));
        }
    }
}

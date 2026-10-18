package org.telegram.ui;

import android.graphics.Canvas;
public final class zo0 extends org.telegram.ui.Cells.fa {
    public static void b(zo0 zo0Var, Canvas canvas) {
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

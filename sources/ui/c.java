package ui;

import android.graphics.Canvas;
import android.graphics.Paint;
public final class c implements a {
    public final Paint f58998a = new Paint(1);
    public int f58999b;

    public final void a(int i7) {
        if (this.f58999b != i7) {
            this.f58999b = i7;
            this.f58998a.setColor(i7);
        }
    }

    @Override
    public final void o(float f10, float f11, float f12, float f13, Canvas canvas) {
        canvas.drawRect(f10, f11, f12, f13, this.f58998a);
    }
}

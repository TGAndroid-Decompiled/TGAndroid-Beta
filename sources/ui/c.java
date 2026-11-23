package ui;

import android.graphics.Canvas;
import android.graphics.Paint;
public final class c implements a {
    public final Paint f59005a = new Paint(1);
    public int f59006b;

    public final void a(int i7) {
        if (this.f59006b != i7) {
            this.f59006b = i7;
            this.f59005a.setColor(i7);
        }
    }

    @Override
    public final void o(float f10, float f11, float f12, float f13, Canvas canvas) {
        canvas.drawRect(f10, f11, f12, f13, this.f59005a);
    }
}

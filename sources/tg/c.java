package tg;

import android.graphics.Canvas;
import android.graphics.Paint;
public final class c implements a {
    public final Paint f48122a = new Paint(1);

    @Override
    public final void I(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.drawRect(f10, f11, f12, f13, this.f48122a);
    }

    public final void a(int i10) {
        this.f48122a.setColor(i10);
    }

    @Override
    public final qg.b k() {
        return new qg.d(this);
    }

    @Override
    public final void b() {
    }
}

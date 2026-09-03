package sg;

import android.graphics.Canvas;
import android.graphics.Paint;
public final class c implements a {
    public final Paint f44374a = new Paint(1);

    @Override
    public final void H(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.drawRect(f10, f11, f12, f13, this.f44374a);
    }

    public final void a(int i10) {
        this.f44374a.setColor(i10);
    }

    @Override
    public final pg.b k() {
        return new pg.d(this);
    }

    @Override
    public final void b() {
    }
}

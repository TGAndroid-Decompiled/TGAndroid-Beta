package ri;

import android.graphics.Canvas;
import android.graphics.Paint;
public final class c implements a {
    public final Paint f54446a = new Paint(1);
    public int f54447b;

    public final void a(int i7) {
        if (this.f54447b != i7) {
            this.f54447b = i7;
            this.f54446a.setColor(i7);
        }
    }

    @Override
    public final void e(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.drawRect(f10, f11, f12, f13, this.f54446a);
    }
}

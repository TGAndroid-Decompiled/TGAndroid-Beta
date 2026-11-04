package si;

import android.graphics.Canvas;
import android.graphics.Paint;
public final class c implements a {
    public final Paint f54746a = new Paint(1);
    public int f54747b;

    public final void a(int i3) {
        if (this.f54747b != i3) {
            this.f54747b = i3;
            this.f54746a.setColor(i3);
        }
    }

    @Override
    public final void l(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.drawRect(f10, f11, f12, f13, this.f54746a);
    }
}

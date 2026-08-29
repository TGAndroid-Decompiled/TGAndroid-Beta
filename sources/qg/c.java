package qg;

import android.graphics.Canvas;
import android.graphics.Paint;
import ng.f;
public final class c implements a {
    public final Paint f46667a = new Paint(1);

    @Override
    public final void E0(Canvas canvas, float f9, float f10, float f11, float f12) {
        canvas.drawRect(f9, f10, f11, f12, this.f46667a);
    }

    public final void a(int i10) {
        this.f46667a.setColor(i10);
    }

    @Override
    public final ng.d v() {
        return new f(this);
    }

    @Override
    public final void q() {
    }
}

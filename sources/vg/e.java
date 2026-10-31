package vg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import w7.o7;
import w7.u;
public final class e {
    public int d;
    public boolean e;
    public int f50833f;
    public float f50835i;
    public float f50836j;
    public final Rect f50830a = new Rect();
    public final float[] f50831b = new float[8];
    public final float[] f50832c = new float[8];
    public float f50834g = 0.75f;
    public final float h = 1.5f;
    public final Path f50837k = new Path();
    public boolean f50838l = true;
    public final Rect f50839m = new Rect();

    public final void a() {
        this.f50838l = o7.a(this.f50831b);
        Rect rect = this.f50830a;
        Rect rect2 = this.f50839m;
        rect2.set(rect);
        int i10 = this.d;
        rect2.inset(i10, i10);
        Path path = this.f50837k;
        path.rewind();
        path.addRoundRect(rect2.left, rect2.top, rect2.right, rect2.bottom, this.f50831b, Path.Direction.CW);
        path.close();
    }

    public final void b(Canvas canvas, Paint paint) {
        Rect rect;
        if (this.f50838l) {
            float f7 = this.f50839m.bottom;
            float f10 = this.f50831b[0];
            canvas.drawRoundRect(rect.left, rect.top, rect.right, f7, f10, f10, paint);
            return;
        }
        canvas.drawPath(this.f50837k, paint);
    }

    public final void c(Canvas canvas, Paint paint, boolean z10) {
        Rect rect;
        if (z10) {
            float f7 = this.f50839m.top;
            float[] fArr = this.f50831b;
            float a2 = u.a((fArr[0] * 2.0f) + f7, f7, rect.bottom);
            canvas.save();
            Rect rect2 = this.f50830a;
            canvas.clipRect(rect2.left, rect2.top, rect2.right, a2);
            float f10 = fArr[0];
            canvas.drawRoundRect(rect.left, rect.top, rect.right, a2, f10, f10, paint);
            canvas.restore();
            return;
        }
        b(canvas, paint);
    }
}

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
    public int f50848f;
    public float f50850i;
    public float f50851j;
    public final Rect f50845a = new Rect();
    public final float[] f50846b = new float[8];
    public final float[] f50847c = new float[8];
    public float f50849g = 0.75f;
    public final float h = 1.5f;
    public final Path f50852k = new Path();
    public boolean f50853l = true;
    public final Rect f50854m = new Rect();

    public final void a() {
        this.f50853l = o7.a(this.f50846b);
        Rect rect = this.f50845a;
        Rect rect2 = this.f50854m;
        rect2.set(rect);
        int i10 = this.d;
        rect2.inset(i10, i10);
        Path path = this.f50852k;
        path.rewind();
        path.addRoundRect(rect2.left, rect2.top, rect2.right, rect2.bottom, this.f50846b, Path.Direction.CW);
        path.close();
    }

    public final void b(Canvas canvas, Paint paint) {
        Rect rect;
        if (this.f50853l) {
            float f7 = this.f50854m.bottom;
            float f10 = this.f50846b[0];
            canvas.drawRoundRect(rect.left, rect.top, rect.right, f7, f10, f10, paint);
            return;
        }
        canvas.drawPath(this.f50852k, paint);
    }

    public final void c(Canvas canvas, Paint paint, boolean z10) {
        Rect rect;
        if (z10) {
            float f7 = this.f50854m.top;
            float[] fArr = this.f50846b;
            float a2 = u.a((fArr[0] * 2.0f) + f7, f7, rect.bottom);
            canvas.save();
            Rect rect2 = this.f50845a;
            canvas.clipRect(rect2.left, rect2.top, rect2.right, a2);
            float f10 = fArr[0];
            canvas.drawRoundRect(rect.left, rect.top, rect.right, a2, f10, f10, paint);
            canvas.restore();
            return;
        }
        b(canvas, paint);
    }
}

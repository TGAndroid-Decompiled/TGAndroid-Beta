package w4;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
public final class b {
    public final RectF f50835a = new RectF();
    public final Paint f50836b;
    public final Paint f50837c;
    public final Paint d;
    public float e;
    public float f50838f;
    public float f50839g;
    public float h;
    public int[] f50840i;
    public int f50841j;
    public float f50842k;
    public float f50843l;
    public float f50844m;
    public boolean f50845n;
    public Path f50846o;
    public float f50847p;
    public float f50848q;
    public int f50849r;
    public int f50850s;
    public int f50851t;
    public int f50852u;

    public b() {
        Paint paint = new Paint();
        this.f50836b = paint;
        Paint paint2 = new Paint();
        this.f50837c = paint2;
        Paint paint3 = new Paint();
        this.d = paint3;
        this.e = 0.0f;
        this.f50838f = 0.0f;
        this.f50839g = 0.0f;
        this.h = 5.0f;
        this.f50847p = 1.0f;
        this.f50851t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i10) {
        this.f50841j = i10;
        this.f50852u = this.f50840i[i10];
    }
}

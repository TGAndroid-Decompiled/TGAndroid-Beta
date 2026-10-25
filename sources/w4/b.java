package w4;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
public final class b {
    public final RectF f50774a = new RectF();
    public final Paint f50775b;
    public final Paint f50776c;
    public final Paint d;
    public float e;
    public float f50777f;
    public float f50778g;
    public float h;
    public int[] f50779i;
    public int f50780j;
    public float f50781k;
    public float f50782l;
    public float f50783m;
    public boolean f50784n;
    public Path f50785o;
    public float f50786p;
    public float f50787q;
    public int f50788r;
    public int f50789s;
    public int f50790t;
    public int f50791u;

    public b() {
        Paint paint = new Paint();
        this.f50775b = paint;
        Paint paint2 = new Paint();
        this.f50776c = paint2;
        Paint paint3 = new Paint();
        this.d = paint3;
        this.e = 0.0f;
        this.f50777f = 0.0f;
        this.f50778g = 0.0f;
        this.h = 5.0f;
        this.f50786p = 1.0f;
        this.f50790t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i10) {
        this.f50780j = i10;
        this.f50791u = this.f50779i[i10];
    }
}

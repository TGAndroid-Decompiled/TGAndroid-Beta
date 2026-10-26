package w4;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
public final class b {
    public final RectF f50777a = new RectF();
    public final Paint f50778b;
    public final Paint f50779c;
    public final Paint d;
    public float e;
    public float f50780f;
    public float f50781g;
    public float h;
    public int[] f50782i;
    public int f50783j;
    public float f50784k;
    public float f50785l;
    public float f50786m;
    public boolean f50787n;
    public Path f50788o;
    public float f50789p;
    public float f50790q;
    public int f50791r;
    public int f50792s;
    public int f50793t;
    public int f50794u;

    public b() {
        Paint paint = new Paint();
        this.f50778b = paint;
        Paint paint2 = new Paint();
        this.f50779c = paint2;
        Paint paint3 = new Paint();
        this.d = paint3;
        this.e = 0.0f;
        this.f50780f = 0.0f;
        this.f50781g = 0.0f;
        this.h = 5.0f;
        this.f50789p = 1.0f;
        this.f50793t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i10) {
        this.f50783j = i10;
        this.f50794u = this.f50782i[i10];
    }
}

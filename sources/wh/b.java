package wh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import c8.l9;
import org.telegram.messenger.Utilities;
public final class b extends Drawable {
    public final a f59906b;
    public Bitmap f59907c;
    public Canvas d;
    public int f59908e;
    public float f59909f;
    public int f59910g;
    public int h;
    public final Paint f59905a = new Paint(2);
    public int f59911i = 255;

    public b(a aVar) {
        this.f59906b = aVar;
    }

    public final void a(int i7, int i10, float f10, int i11) {
        int i12 = i11 * 2;
        int i13 = (int) ((i7 + i12) / f10);
        int i14 = (int) ((i10 + i12) / f10);
        Bitmap bitmap = this.f59907c;
        if (bitmap != null && bitmap.getWidth() == i13 && this.f59907c.getHeight() == i14) {
            this.f59907c.eraseColor(0);
        } else {
            Bitmap bitmap2 = this.f59907c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.f59907c = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
            this.d = new Canvas(this.f59907c);
        }
        this.f59909f = f10;
        this.f59908e = i11;
        this.d.save();
        float f11 = i11 / f10;
        this.d.translate(f11, f11);
        float f12 = 1.0f / f10;
        this.d.scale(f12, f12);
        this.f59906b.m(this.d, 255);
        Utilities.stackBlurBitmap(this.f59907c, (int) f11);
        this.d.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7 = this.f59911i;
        a aVar = this.f59906b;
        if (i7 == 255) {
            canvas.save();
            canvas.translate(this.f59910g, this.h);
            aVar.m(canvas, 255);
            canvas.restore();
        } else if (i7 != 0) {
            double d = i7 / 255.0d;
            double d2 = d / ((1.0d - d) * 6.0d);
            double d10 = 1.0d + d2;
            double sqrt = ((-d10) + Math.sqrt((d10 * d10) - (((-d2) * 4.0d) * (-d)))) / ((-2.0d) * d2);
            int b10 = l9.b((int) (d2 * sqrt * 255.0d), 0, 255);
            int b11 = l9.b((int) (sqrt * 255.0d), 0, 255);
            if (b11 > 0 && this.f59907c != null) {
                Paint paint = this.f59905a;
                paint.setAlpha(b11);
                canvas.save();
                int i10 = this.f59910g;
                int i11 = this.f59908e;
                canvas.translate(i10 - i11, this.h - i11);
                float f10 = this.f59909f;
                canvas.scale(f10, f10);
                canvas.drawBitmap(this.f59907c, 0.0f, 0.0f, paint);
                canvas.restore();
            }
            if (b10 > 0) {
                canvas.save();
                canvas.translate(this.f59910g, this.h);
                aVar.m(canvas, b10);
                canvas.restore();
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f59911i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f59911i = i7;
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        this.f59910g = i7;
        this.h = i10;
        super.setBounds(i7, i10, i11, i12);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

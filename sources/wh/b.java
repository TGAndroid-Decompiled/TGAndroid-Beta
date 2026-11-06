package wh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import c8.j9;
import org.telegram.messenger.Utilities;
public final class b extends Drawable {
    public final a f57755b;
    public Bitmap f57756c;
    public Canvas d;
    public int f57757e;
    public float f57758f;
    public int f57759g;
    public int h;
    public final Paint f57754a = new Paint(2);
    public int f57760i = 255;

    public b(a aVar) {
        this.f57755b = aVar;
    }

    public final void a(int i7, int i10, float f10, int i11) {
        int i12 = i11 * 2;
        int i13 = (int) ((i7 + i12) / f10);
        int i14 = (int) ((i10 + i12) / f10);
        Bitmap bitmap = this.f57756c;
        if (bitmap != null && bitmap.getWidth() == i13 && this.f57756c.getHeight() == i14) {
            this.f57756c.eraseColor(0);
        } else {
            Bitmap bitmap2 = this.f57756c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.f57756c = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
            this.d = new Canvas(this.f57756c);
        }
        this.f57758f = f10;
        this.f57757e = i11;
        this.d.save();
        float f11 = i11 / f10;
        this.d.translate(f11, f11);
        float f12 = 1.0f / f10;
        this.d.scale(f12, f12);
        this.f57755b.m(this.d, 255);
        Utilities.stackBlurBitmap(this.f57756c, (int) f11);
        this.d.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7 = this.f57760i;
        a aVar = this.f57755b;
        if (i7 == 255) {
            canvas.save();
            canvas.translate(this.f57759g, this.h);
            aVar.m(canvas, 255);
            canvas.restore();
        } else if (i7 != 0) {
            double d = i7 / 255.0d;
            double d2 = d / ((1.0d - d) * 6.0d);
            double d10 = 1.0d + d2;
            double sqrt = ((-d10) + Math.sqrt((d10 * d10) - (((-d2) * 4.0d) * (-d)))) / ((-2.0d) * d2);
            int b10 = j9.b((int) (d2 * sqrt * 255.0d), 0, 255);
            int b11 = j9.b((int) (sqrt * 255.0d), 0, 255);
            if (b11 > 0 && this.f57756c != null) {
                Paint paint = this.f57754a;
                paint.setAlpha(b11);
                canvas.save();
                int i10 = this.f57759g;
                int i11 = this.f57757e;
                canvas.translate(i10 - i11, this.h - i11);
                float f10 = this.f57758f;
                canvas.scale(f10, f10);
                canvas.drawBitmap(this.f57756c, 0.0f, 0.0f, paint);
                canvas.restore();
            }
            if (b10 > 0) {
                canvas.save();
                canvas.translate(this.f57759g, this.h);
                aVar.m(canvas, b10);
                canvas.restore();
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f57760i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f57760i = i7;
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        this.f57759g = i7;
        this.h = i10;
        super.setBounds(i7, i10, i11, i12);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

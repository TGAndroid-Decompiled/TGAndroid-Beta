package wh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import c8.i9;
import org.telegram.messenger.Utilities;
public final class b extends Drawable {
    public final a f59300b;
    public Bitmap f59301c;
    public Canvas d;
    public int f59302e;
    public float f59303f;
    public int f59304g;
    public int h;
    public final Paint f59299a = new Paint(2);
    public int f59305i = 255;

    public b(a aVar) {
        this.f59300b = aVar;
    }

    public final void a(int i7, int i10, float f10, int i11) {
        int i12 = i11 * 2;
        int i13 = (int) ((i7 + i12) / f10);
        int i14 = (int) ((i10 + i12) / f10);
        Bitmap bitmap = this.f59301c;
        if (bitmap != null && bitmap.getWidth() == i13 && this.f59301c.getHeight() == i14) {
            this.f59301c.eraseColor(0);
        } else {
            Bitmap bitmap2 = this.f59301c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.f59301c = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
            this.d = new Canvas(this.f59301c);
        }
        this.f59303f = f10;
        this.f59302e = i11;
        this.d.save();
        float f11 = i11 / f10;
        this.d.translate(f11, f11);
        float f12 = 1.0f / f10;
        this.d.scale(f12, f12);
        this.f59300b.k(this.d, 255);
        Utilities.stackBlurBitmap(this.f59301c, (int) f11);
        this.d.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7 = this.f59305i;
        a aVar = this.f59300b;
        if (i7 == 255) {
            canvas.save();
            canvas.translate(this.f59304g, this.h);
            aVar.k(canvas, 255);
            canvas.restore();
        } else if (i7 != 0) {
            double d = i7 / 255.0d;
            double d2 = d / ((1.0d - d) * 6.0d);
            double d10 = 1.0d + d2;
            double sqrt = ((-d10) + Math.sqrt((d10 * d10) - (((-d2) * 4.0d) * (-d)))) / ((-2.0d) * d2);
            int b10 = i9.b((int) (d2 * sqrt * 255.0d), 0, 255);
            int b11 = i9.b((int) (sqrt * 255.0d), 0, 255);
            if (b11 > 0 && this.f59301c != null) {
                Paint paint = this.f59299a;
                paint.setAlpha(b11);
                canvas.save();
                int i10 = this.f59304g;
                int i11 = this.f59302e;
                canvas.translate(i10 - i11, this.h - i11);
                float f10 = this.f59303f;
                canvas.scale(f10, f10);
                canvas.drawBitmap(this.f59301c, 0.0f, 0.0f, paint);
                canvas.restore();
            }
            if (b10 > 0) {
                canvas.save();
                canvas.translate(this.f59304g, this.h);
                aVar.k(canvas, b10);
                canvas.restore();
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f59305i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f59305i = i7;
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        this.f59304g = i7;
        this.h = i10;
        super.setBounds(i7, i10, i11, i12);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

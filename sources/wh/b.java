package wh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import c8.m9;
import org.telegram.messenger.Utilities;
public final class b extends Drawable {
    public final a f59875b;
    public Bitmap f59876c;
    public Canvas d;
    public int f59877e;
    public float f59878f;
    public int f59879g;
    public int h;
    public final Paint f59874a = new Paint(2);
    public int f59880i = 255;

    public b(a aVar) {
        this.f59875b = aVar;
    }

    public final void a(int i7, int i10, float f10, int i11) {
        int i12 = i11 * 2;
        int i13 = (int) ((i7 + i12) / f10);
        int i14 = (int) ((i10 + i12) / f10);
        Bitmap bitmap = this.f59876c;
        if (bitmap != null && bitmap.getWidth() == i13 && this.f59876c.getHeight() == i14) {
            this.f59876c.eraseColor(0);
        } else {
            Bitmap bitmap2 = this.f59876c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.f59876c = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
            this.d = new Canvas(this.f59876c);
        }
        this.f59878f = f10;
        this.f59877e = i11;
        this.d.save();
        float f11 = i11 / f10;
        this.d.translate(f11, f11);
        float f12 = 1.0f / f10;
        this.d.scale(f12, f12);
        this.f59875b.m(this.d, 255);
        Utilities.stackBlurBitmap(this.f59876c, (int) f11);
        this.d.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7 = this.f59880i;
        a aVar = this.f59875b;
        if (i7 == 255) {
            canvas.save();
            canvas.translate(this.f59879g, this.h);
            aVar.m(canvas, 255);
            canvas.restore();
        } else if (i7 != 0) {
            double d = i7 / 255.0d;
            double d2 = d / ((1.0d - d) * 6.0d);
            double d10 = 1.0d + d2;
            double sqrt = ((-d10) + Math.sqrt((d10 * d10) - (((-d2) * 4.0d) * (-d)))) / ((-2.0d) * d2);
            int b10 = m9.b((int) (d2 * sqrt * 255.0d), 0, 255);
            int b11 = m9.b((int) (sqrt * 255.0d), 0, 255);
            if (b11 > 0 && this.f59876c != null) {
                Paint paint = this.f59874a;
                paint.setAlpha(b11);
                canvas.save();
                int i10 = this.f59879g;
                int i11 = this.f59877e;
                canvas.translate(i10 - i11, this.h - i11);
                float f10 = this.f59878f;
                canvas.scale(f10, f10);
                canvas.drawBitmap(this.f59876c, 0.0f, 0.0f, paint);
                canvas.restore();
            }
            if (b10 > 0) {
                canvas.save();
                canvas.translate(this.f59879g, this.h);
                aVar.m(canvas, b10);
                canvas.restore();
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f59880i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f59880i = i7;
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        this.f59879g = i7;
        this.h = i10;
        super.setBounds(i7, i10, i11, i12);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

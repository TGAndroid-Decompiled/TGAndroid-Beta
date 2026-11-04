package xh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import b8.be;
import org.telegram.messenger.Utilities;
public final class b extends Drawable {
    public final a f58799b;
    public Bitmap f58800c;
    public Canvas d;
    public int f58801e;
    public float f58802f;
    public int f58803g;
    public int h;
    public final Paint f58798a = new Paint(2);
    public int f58804i = 255;

    public b(a aVar) {
        this.f58799b = aVar;
    }

    public final void a(int i3, int i10, float f10, int i11) {
        int i12 = i11 * 2;
        int i13 = (int) ((i3 + i12) / f10);
        int i14 = (int) ((i10 + i12) / f10);
        Bitmap bitmap = this.f58800c;
        if (bitmap != null && bitmap.getWidth() == i13 && this.f58800c.getHeight() == i14) {
            this.f58800c.eraseColor(0);
        } else {
            Bitmap bitmap2 = this.f58800c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.f58800c = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
            this.d = new Canvas(this.f58800c);
        }
        this.f58802f = f10;
        this.f58801e = i11;
        this.d.save();
        float f11 = i11 / f10;
        this.d.translate(f11, f11);
        float f12 = 1.0f / f10;
        this.d.scale(f12, f12);
        this.f58799b.h(this.d, 255);
        Utilities.stackBlurBitmap(this.f58800c, (int) f11);
        this.d.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i3 = this.f58804i;
        a aVar = this.f58799b;
        if (i3 == 255) {
            canvas.save();
            canvas.translate(this.f58803g, this.h);
            aVar.h(canvas, 255);
            canvas.restore();
        } else if (i3 != 0) {
            double d = i3 / 255.0d;
            double d10 = d / ((1.0d - d) * 6.0d);
            double d11 = 1.0d + d10;
            double sqrt = ((-d11) + Math.sqrt((d11 * d11) - (((-d10) * 4.0d) * (-d)))) / ((-2.0d) * d10);
            int b10 = be.b((int) (d10 * sqrt * 255.0d), 0, 255);
            int b11 = be.b((int) (sqrt * 255.0d), 0, 255);
            if (b11 > 0 && this.f58800c != null) {
                Paint paint = this.f58798a;
                paint.setAlpha(b11);
                canvas.save();
                int i10 = this.f58803g;
                int i11 = this.f58801e;
                canvas.translate(i10 - i11, this.h - i11);
                float f10 = this.f58802f;
                canvas.scale(f10, f10);
                canvas.drawBitmap(this.f58800c, 0.0f, 0.0f, paint);
                canvas.restore();
            }
            if (b10 > 0) {
                canvas.save();
                canvas.translate(this.f58803g, this.h);
                aVar.h(canvas, b10);
                canvas.restore();
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f58804i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i3) {
        this.f58804i = i3;
    }

    @Override
    public final void setBounds(int i3, int i10, int i11, int i12) {
        this.f58803g = i3;
        this.h = i10;
        super.setBounds(i3, i10, i11, i12);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

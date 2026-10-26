package wh;

import a8.ee;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.Utilities;
public final class b extends Drawable {
    public final a f51206b;
    public Bitmap f51207c;
    public Canvas d;
    public int e;
    public float f51208f;
    public int f51209g;
    public int h;
    public final Paint f51205a = new Paint(2);
    public int f51210i = 255;

    public b(a aVar) {
        this.f51206b = aVar;
    }

    public final void a() {
        Bitmap bitmap = this.f51207c;
        if (bitmap != null) {
            bitmap.recycle();
            this.f51207c = null;
        }
    }

    public final void b(int i10, int i11, float f7, int i12) {
        int i13 = i12 * 2;
        int i14 = (int) ((i10 + i13) / f7);
        int i15 = (int) ((i11 + i13) / f7);
        Bitmap bitmap = this.f51207c;
        if (bitmap != null && bitmap.getWidth() == i14 && this.f51207c.getHeight() == i15) {
            this.f51207c.eraseColor(0);
        } else {
            Bitmap bitmap2 = this.f51207c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.f51207c = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
            this.d = new Canvas(this.f51207c);
        }
        this.f51208f = f7;
        this.e = i12;
        this.d.save();
        float f10 = i12 / f7;
        this.d.translate(f10, f10);
        float f11 = 1.0f / f7;
        this.d.scale(f11, f11);
        this.f51206b.p(this.d, 255);
        Utilities.stackBlurBitmap(this.f51207c, (int) f10);
        this.d.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = this.f51210i;
        a aVar = this.f51206b;
        if (i10 == 255) {
            canvas.save();
            canvas.translate(this.f51209g, this.h);
            aVar.p(canvas, 255);
            canvas.restore();
        } else if (i10 != 0) {
            double d = i10 / 255.0d;
            double d10 = d / ((1.0d - d) * 6.0d);
            double d11 = 1.0d + d10;
            double sqrt = ((-d11) + Math.sqrt((d11 * d11) - (((-d10) * 4.0d) * (-d)))) / ((-2.0d) * d10);
            int b10 = ee.b((int) (d10 * sqrt * 255.0d), 0, 255);
            int b11 = ee.b((int) (sqrt * 255.0d), 0, 255);
            if (b11 > 0 && this.f51207c != null) {
                Paint paint = this.f51205a;
                paint.setAlpha(b11);
                canvas.save();
                int i11 = this.f51209g;
                int i12 = this.e;
                canvas.translate(i11 - i12, this.h - i12);
                float f7 = this.f51208f;
                canvas.scale(f7, f7);
                canvas.drawBitmap(this.f51207c, 0.0f, 0.0f, paint);
                canvas.restore();
            }
            if (b10 > 0) {
                canvas.save();
                canvas.translate(this.f51209g, this.h);
                aVar.p(canvas, b10);
                canvas.restore();
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f51210i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f51210i = i10;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        this.f51209g = i10;
        this.h = i11;
        super.setBounds(i10, i11, i12, i13);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

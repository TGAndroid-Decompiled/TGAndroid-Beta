package th;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.Utilities;
import w7.q;
public final class b extends Drawable {
    public final a f42179b;
    public Bitmap f42180c;
    public Canvas d;
    public int e;
    public float f42181f;
    public int f42182g;
    public int h;
    public final Paint f42178a = new Paint(2);
    public int f42183i = 255;

    public b(a aVar) {
        this.f42179b = aVar;
    }

    public final void a(int i10, int i11, float f7, int i12) {
        int i13 = i12 * 2;
        int i14 = (int) ((i10 + i13) / f7);
        int i15 = (int) ((i11 + i13) / f7);
        Bitmap bitmap = this.f42180c;
        if (bitmap != null && bitmap.getWidth() == i14 && this.f42180c.getHeight() == i15) {
            this.f42180c.eraseColor(0);
        } else {
            Bitmap bitmap2 = this.f42180c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.f42180c = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
            this.d = new Canvas(this.f42180c);
        }
        this.f42181f = f7;
        this.e = i12;
        this.d.save();
        float f10 = i12 / f7;
        this.d.translate(f10, f10);
        float f11 = 1.0f / f7;
        this.d.scale(f11, f11);
        this.f42179b.p(this.d, 255);
        Utilities.stackBlurBitmap(this.f42180c, (int) f10);
        this.d.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = this.f42183i;
        a aVar = this.f42179b;
        if (i10 == 255) {
            canvas.save();
            canvas.translate(this.f42182g, this.h);
            aVar.p(canvas, 255);
            canvas.restore();
        } else if (i10 != 0) {
            double d = i10 / 255.0d;
            double d10 = d / ((1.0d - d) * 6.0d);
            double d11 = 1.0d + d10;
            double sqrt = ((-d11) + Math.sqrt((d11 * d11) - (((-d10) * 4.0d) * (-d)))) / ((-2.0d) * d10);
            int b10 = q.b((int) (d10 * sqrt * 255.0d), 0, 255);
            int b11 = q.b((int) (sqrt * 255.0d), 0, 255);
            if (b11 > 0 && this.f42180c != null) {
                Paint paint = this.f42178a;
                paint.setAlpha(b11);
                canvas.save();
                int i11 = this.f42182g;
                int i12 = this.e;
                canvas.translate(i11 - i12, this.h - i12);
                float f7 = this.f42181f;
                canvas.scale(f7, f7);
                canvas.drawBitmap(this.f42180c, 0.0f, 0.0f, paint);
                canvas.restore();
            }
            if (b10 > 0) {
                canvas.save();
                canvas.translate(this.f42182g, this.h);
                aVar.p(canvas, b10);
                canvas.restore();
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f42183i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f42183i = i10;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        this.f42182g = i10;
        this.h = i11;
        super.setBounds(i10, i11, i12, i13);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

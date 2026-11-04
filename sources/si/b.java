package si;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
public final class b implements a {
    public final Paint f54740a;
    public final Matrix f54741b;
    public BitmapShader f54742c;
    public Bitmap d;
    public final Matrix f54743e;
    public Bitmap f54744f;
    public int h;
    public int f54745n;

    public b() {
        Paint paint = new Paint(3);
        this.f54740a = paint;
        this.f54741b = new Matrix();
        this.f54743e = new Matrix();
        paint.setFilterBitmap(true);
    }

    public final void a(Bitmap bitmap) {
        if (this.d != bitmap) {
            this.d = bitmap;
            Paint paint = this.f54740a;
            paint.setShader(null);
            this.f54742c = null;
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f54742c = bitmapShader;
                paint.setShader(bitmapShader);
                c();
            }
        }
    }

    public final void b(int i3, int i10) {
        if (this.h == i3 && this.f54745n == i10) {
            return;
        }
        this.h = i3;
        this.f54745n = i10;
        c();
    }

    public final void c() {
        Bitmap bitmap = this.d;
        Matrix matrix = this.f54741b;
        if (bitmap == null) {
            matrix.reset();
            return;
        }
        int width = bitmap.getWidth();
        int height = this.d.getHeight();
        int i3 = this.h;
        int i10 = this.f54745n;
        matrix.reset();
        if (width > 0 && height > 0 && i3 > 0 && i10 > 0) {
            float f10 = i3;
            float f11 = width;
            float f12 = i10;
            float f13 = height;
            float max = Math.max(f10 / f11, f12 / f13);
            matrix.setScale(max, max);
            matrix.postTranslate((f10 - (f11 * max)) * 0.5f, ((f12 - (f13 * max)) * 0.5f) + 0);
        }
    }

    @Override
    public final void l(Canvas canvas, float f10, float f11, float f12, float f13) {
        Bitmap bitmap = this.d;
        if (bitmap != null && !bitmap.isRecycled() && this.f54742c != null) {
            Matrix matrix = this.f54743e;
            Matrix matrix2 = this.f54741b;
            matrix.set(matrix2);
            matrix.postTranslate(f10, f11);
            this.f54742c.setLocalMatrix(matrix2);
            canvas.drawRect(f10, f11, f12, f13, this.f54740a);
        }
    }
}

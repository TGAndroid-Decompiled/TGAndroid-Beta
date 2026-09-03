package tg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
public final class b implements a {
    public final Paint f48116a;
    public final Matrix f48117b;
    public BitmapShader f48118c;
    public Bitmap d;
    public final Matrix f48119e;
    public Bitmap f48120f;
    public int h;
    public int f48121n;

    public b() {
        Paint paint = new Paint(3);
        this.f48116a = paint;
        this.f48117b = new Matrix();
        this.f48119e = new Matrix();
        paint.setFilterBitmap(true);
    }

    @Override
    public final void I(Canvas canvas, float f10, float f11, float f12, float f13) {
        Bitmap bitmap = this.d;
        if (bitmap != null && !bitmap.isRecycled() && this.f48118c != null) {
            Matrix matrix = this.f48119e;
            Matrix matrix2 = this.f48117b;
            matrix.set(matrix2);
            matrix.postTranslate(f10, f11);
            this.f48118c.setLocalMatrix(matrix2);
            canvas.drawRect(f10, f11, f12, f13, this.f48116a);
        }
    }

    public final void a(Bitmap bitmap) {
        if (this.d != bitmap) {
            this.d = bitmap;
            Paint paint = this.f48116a;
            paint.setShader(null);
            this.f48118c = null;
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f48118c = bitmapShader;
                paint.setShader(bitmapShader);
                d();
            }
        }
    }

    public final void c(int i10, int i11) {
        if (this.h == i10 && this.f48121n == i11) {
            return;
        }
        this.h = i10;
        this.f48121n = i11;
        d();
    }

    public final void d() {
        Bitmap bitmap = this.d;
        Matrix matrix = this.f48117b;
        if (bitmap == null) {
            matrix.reset();
            return;
        }
        int width = bitmap.getWidth();
        int height = this.d.getHeight();
        int i10 = this.h;
        int i11 = this.f48121n;
        matrix.reset();
        if (width > 0 && height > 0 && i10 > 0 && i11 > 0) {
            float f10 = i10;
            float f11 = width;
            float f12 = i11;
            float f13 = height;
            float max = Math.max(f10 / f11, f12 / f13);
            matrix.setScale(max, max);
            matrix.postTranslate((f10 - (f11 * max)) * 0.5f, ((f12 - (f13 * max)) * 0.5f) + 0);
        }
    }

    @Override
    public final qg.b k() {
        return new qg.d(this);
    }

    @Override
    public final void b() {
    }
}

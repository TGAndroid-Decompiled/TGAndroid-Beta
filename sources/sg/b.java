package sg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
public final class b implements a {
    public final Paint f44304a;
    public final Matrix f44305b;
    public BitmapShader f44306c;
    public Bitmap d;
    public final Matrix e;
    public Bitmap f44307f;
    public int h;
    public int f44308n;

    public b() {
        Paint paint = new Paint(3);
        this.f44304a = paint;
        this.f44305b = new Matrix();
        this.e = new Matrix();
        paint.setFilterBitmap(true);
    }

    @Override
    public final void X(Canvas canvas, float f10, float f11, float f12, float f13) {
        Bitmap bitmap = this.d;
        if (bitmap != null && !bitmap.isRecycled() && this.f44306c != null) {
            Matrix matrix = this.e;
            Matrix matrix2 = this.f44305b;
            matrix.set(matrix2);
            matrix.postTranslate(f10, f11);
            this.f44306c.setLocalMatrix(matrix2);
            canvas.drawRect(f10, f11, f12, f13, this.f44304a);
        }
    }

    public final void a(Bitmap bitmap) {
        if (this.d != bitmap) {
            this.d = bitmap;
            Paint paint = this.f44304a;
            paint.setShader(null);
            this.f44306c = null;
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f44306c = bitmapShader;
                paint.setShader(bitmapShader);
                c();
            }
        }
    }

    public final void b(int i10, int i11) {
        if (this.h == i10 && this.f44308n == i11) {
            return;
        }
        this.h = i10;
        this.f44308n = i11;
        c();
    }

    public final void c() {
        Bitmap bitmap = this.d;
        Matrix matrix = this.f44305b;
        if (bitmap == null) {
            matrix.reset();
            return;
        }
        int width = bitmap.getWidth();
        int height = this.d.getHeight();
        int i10 = this.h;
        int i11 = this.f44308n;
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
    public final pg.b k() {
        return new pg.d(this);
    }

    @Override
    public final void f() {
    }
}

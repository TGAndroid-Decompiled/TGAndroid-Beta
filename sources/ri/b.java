package ri;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
public final class b implements a {
    public final Paint f54568a;
    public final Matrix f54569b;
    public BitmapShader f54570c;
    public Bitmap d;
    public final Matrix f54571e;
    public Bitmap f54572f;
    public int h;
    public int f54573n;

    public b() {
        Paint paint = new Paint(3);
        this.f54568a = paint;
        this.f54569b = new Matrix();
        this.f54571e = new Matrix();
        paint.setFilterBitmap(true);
    }

    public final void a(Bitmap bitmap) {
        if (this.d != bitmap) {
            this.d = bitmap;
            Paint paint = this.f54568a;
            paint.setShader(null);
            this.f54570c = null;
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f54570c = bitmapShader;
                paint.setShader(bitmapShader);
                c();
            }
        }
    }

    public final void b(int i7, int i10) {
        if (this.h == i7 && this.f54573n == i10) {
            return;
        }
        this.h = i7;
        this.f54573n = i10;
        c();
    }

    public final void c() {
        Bitmap bitmap = this.d;
        Matrix matrix = this.f54569b;
        if (bitmap == null) {
            matrix.reset();
            return;
        }
        int width = bitmap.getWidth();
        int height = this.d.getHeight();
        int i7 = this.h;
        int i10 = this.f54573n;
        matrix.reset();
        if (width > 0 && height > 0 && i7 > 0 && i10 > 0) {
            float f10 = i7;
            float f11 = width;
            float f12 = i10;
            float f13 = height;
            float max = Math.max(f10 / f11, f12 / f13);
            matrix.setScale(max, max);
            matrix.postTranslate((f10 - (f11 * max)) * 0.5f, ((f12 - (f13 * max)) * 0.5f) + 0);
        }
    }

    @Override
    public final void e(Canvas canvas, float f10, float f11, float f12, float f13) {
        Bitmap bitmap = this.d;
        if (bitmap != null && !bitmap.isRecycled() && this.f54570c != null) {
            Matrix matrix = this.f54571e;
            Matrix matrix2 = this.f54569b;
            matrix.set(matrix2);
            matrix.postTranslate(f10, f11);
            this.f54570c.setLocalMatrix(matrix2);
            canvas.drawRect(f10, f11, f12, f13, this.f54568a);
        }
    }
}

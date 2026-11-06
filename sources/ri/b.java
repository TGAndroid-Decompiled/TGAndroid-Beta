package ri;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
public final class b implements a {
    public final Paint f54465a;
    public final Matrix f54466b;
    public BitmapShader f54467c;
    public Bitmap d;
    public final Matrix f54468e;
    public Bitmap f54469f;
    public int h;
    public int f54470n;

    public b() {
        Paint paint = new Paint(3);
        this.f54465a = paint;
        this.f54466b = new Matrix();
        this.f54468e = new Matrix();
        paint.setFilterBitmap(true);
    }

    public final void a(Bitmap bitmap) {
        if (this.d != bitmap) {
            this.d = bitmap;
            Paint paint = this.f54465a;
            paint.setShader(null);
            this.f54467c = null;
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f54467c = bitmapShader;
                paint.setShader(bitmapShader);
                c();
            }
        }
    }

    public final void b(int i7, int i10) {
        if (this.h == i7 && this.f54470n == i10) {
            return;
        }
        this.h = i7;
        this.f54470n = i10;
        c();
    }

    public final void c() {
        Bitmap bitmap = this.d;
        Matrix matrix = this.f54466b;
        if (bitmap == null) {
            matrix.reset();
            return;
        }
        int width = bitmap.getWidth();
        int height = this.d.getHeight();
        int i7 = this.h;
        int i10 = this.f54470n;
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
        if (bitmap != null && !bitmap.isRecycled() && this.f54467c != null) {
            Matrix matrix = this.f54468e;
            Matrix matrix2 = this.f54466b;
            matrix.set(matrix2);
            matrix.postTranslate(f10, f11);
            this.f54467c.setLocalMatrix(matrix2);
            canvas.drawRect(f10, f11, f12, f13, this.f54465a);
        }
    }
}

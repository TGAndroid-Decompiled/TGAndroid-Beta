package qg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import ng.f;
public final class b implements a {
    public final Paint f46661a;
    public final Matrix f46662b;
    public BitmapShader f46663c;
    public Bitmap d;
    public final Matrix f46664e;
    public Bitmap f46665f;
    public int h;
    public int f46666n;

    public b() {
        Paint paint = new Paint(3);
        this.f46661a = paint;
        this.f46662b = new Matrix();
        this.f46664e = new Matrix();
        paint.setFilterBitmap(true);
    }

    @Override
    public final void E0(Canvas canvas, float f9, float f10, float f11, float f12) {
        Bitmap bitmap = this.d;
        if (bitmap != null && !bitmap.isRecycled() && this.f46663c != null) {
            Matrix matrix = this.f46664e;
            Matrix matrix2 = this.f46662b;
            matrix.set(matrix2);
            matrix.postTranslate(f9, f10);
            this.f46663c.setLocalMatrix(matrix2);
            canvas.drawRect(f9, f10, f11, f12, this.f46661a);
        }
    }

    public final void a(Bitmap bitmap) {
        if (this.d != bitmap) {
            this.d = bitmap;
            Paint paint = this.f46661a;
            paint.setShader(null);
            this.f46663c = null;
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f46663c = bitmapShader;
                paint.setShader(bitmapShader);
                c();
            }
        }
    }

    public final void b(int i10, int i11) {
        if (this.h == i10 && this.f46666n == i11) {
            return;
        }
        this.h = i10;
        this.f46666n = i11;
        c();
    }

    public final void c() {
        Bitmap bitmap = this.d;
        Matrix matrix = this.f46662b;
        if (bitmap == null) {
            matrix.reset();
            return;
        }
        int width = bitmap.getWidth();
        int height = this.d.getHeight();
        int i10 = this.h;
        int i11 = this.f46666n;
        matrix.reset();
        if (width > 0 && height > 0 && i10 > 0 && i11 > 0) {
            float f9 = i10;
            float f10 = width;
            float f11 = i11;
            float f12 = height;
            float max = Math.max(f9 / f10, f11 / f12);
            matrix.setScale(max, max);
            matrix.postTranslate((f9 - (f10 * max)) * 0.5f, ((f11 - (f12 * max)) * 0.5f) + 0);
        }
    }

    @Override
    public final ng.d v() {
        return new f(this);
    }

    @Override
    public final void q() {
    }
}

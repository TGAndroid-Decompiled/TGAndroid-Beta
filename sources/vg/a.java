package vg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import java.lang.ref.WeakReference;
import org.telegram.ui.ActionBar.t6;
import w7.k8;
public final class a extends k8 {
    public final Paint f50813a;
    public final Paint f50814b;
    public final Matrix f50815c;
    public WeakReference d;
    public BitmapShader e;
    public final f f50816f;

    public a(f fVar) {
        this.f50816f = fVar;
        Paint paint = new Paint(1);
        this.f50813a = paint;
        this.f50814b = new Paint(1);
        this.f50815c = new Matrix();
        this.d = new WeakReference(null);
        paint.setFilterBitmap(true);
    }

    @Override
    public final void b(Canvas canvas, hi.a aVar) {
        hi.b bVar = (hi.b) f.u(aVar);
        f fVar = this.f50816f;
        int i10 = fVar.f6649c;
        Bitmap bitmap = bVar.d;
        Object obj = this.d.get();
        Paint paint = this.f50813a;
        if (bitmap != obj) {
            this.d = new WeakReference(bitmap);
            if (bitmap != null && !bitmap.isRecycled()) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.e = bitmapShader;
                paint.setShader(bitmapShader);
            } else {
                this.e = null;
                paint.setShader(null);
            }
        }
        if (Color.alpha(fVar.f50845r) > 0) {
            fVar.Y.c(canvas, 0);
        }
        if (this.e != null && bitmap != null && !bitmap.isRecycled() && i10 > 0) {
            Matrix matrix = bVar.f7706b;
            Matrix matrix2 = this.f50815c;
            matrix2.set(matrix);
            matrix2.postTranslate(-fVar.d, -fVar.e);
            this.e.setLocalMatrix(matrix2);
            paint.setAlpha(i10);
            fVar.M.b(canvas, paint);
        }
        int r12 = t6.r1(i10 / 255.0f, fVar.f50846s);
        if (Color.alpha(r12) > 0) {
            Paint paint2 = this.f50814b;
            paint2.setColor(r12);
            fVar.M.b(canvas, paint2);
        }
    }
}

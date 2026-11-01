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
    public final Paint f50827a;
    public final Paint f50828b;
    public final Matrix f50829c;
    public WeakReference d;
    public BitmapShader e;
    public final f f50830f;

    public a(f fVar) {
        this.f50830f = fVar;
        Paint paint = new Paint(1);
        this.f50827a = paint;
        this.f50828b = new Paint(1);
        this.f50829c = new Matrix();
        this.d = new WeakReference(null);
        paint.setFilterBitmap(true);
    }

    @Override
    public final void b(Canvas canvas, hi.a aVar) {
        hi.b bVar = (hi.b) f.u(aVar);
        f fVar = this.f50830f;
        int i10 = fVar.f6650c;
        Bitmap bitmap = bVar.d;
        Object obj = this.d.get();
        Paint paint = this.f50827a;
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
        if (Color.alpha(fVar.f50866x) > 0) {
            fVar.f50857b0.c(canvas, 0);
        }
        if (this.e != null && bitmap != null && !bitmap.isRecycled() && i10 > 0) {
            Matrix matrix = bVar.f7707b;
            Matrix matrix2 = this.f50829c;
            matrix2.set(matrix);
            matrix2.postTranslate(-fVar.d, -fVar.e);
            this.e.setLocalMatrix(matrix2);
            paint.setAlpha(i10);
            fVar.P.b(canvas, paint);
        }
        int r12 = t6.r1(i10 / 255.0f, fVar.f50867y);
        if (Color.alpha(r12) > 0) {
            Paint paint2 = this.f50828b;
            paint2.setColor(r12);
            fVar.P.b(canvas, paint2);
        }
    }
}

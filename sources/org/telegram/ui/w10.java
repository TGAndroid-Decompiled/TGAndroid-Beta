package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
public final class w10 {
    public LinearGradient f44942b;
    public final Paint[] f44941a = new Paint[4];
    public final Matrix f44943c = new Matrix();

    public final void a(Canvas canvas, RectF rectF, float f7) {
        Paint[] paintArr = this.f44941a;
        if (paintArr[0] == null) {
            Paint paint = new Paint(1);
            paintArr[0] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[0].setShader(this.f44942b);
        paintArr[0].setAlpha((int) (f7 * 255.0f));
        canvas.drawRect(rectF, paintArr[0]);
    }

    public final void b(Canvas canvas, RectF rectF, int i10, float f7) {
        if (f7 <= 0.0f) {
            return;
        }
        if (this.f44942b == null) {
            this.f44942b = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-65536, 16711680}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        Paint[] paintArr = this.f44941a;
        if (paintArr[i10] == null) {
            paintArr[i10] = new Paint(1);
            paintArr[i10].setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i10].setShader(this.f44942b);
        Matrix matrix = this.f44943c;
        matrix.reset();
        if (i10 == 0) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(-90.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i10 == 1) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i10 == 2) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(90.0f);
            matrix.postTranslate(rectF.right, rectF.top);
        } else if (i10 == 3) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postScale(1.0f, -1.0f);
            matrix.postTranslate(rectF.left, rectF.bottom);
        }
        this.f44942b.setLocalMatrix(matrix);
        paintArr[i10].setAlpha((int) (f7 * 255.0f));
        canvas.drawRect(rectF, paintArr[i10]);
    }

    public final Paint c(float f7, int i10) {
        Paint[] paintArr = this.f44941a;
        if (paintArr[i10] == null) {
            Paint paint = new Paint(1);
            paintArr[i10] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i10].setShader(null);
        paintArr[i10].setColor(-65536);
        paintArr[i10].setAlpha((int) (f7 * 255.0f));
        return paintArr[i10];
    }
}

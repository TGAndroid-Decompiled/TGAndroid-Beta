package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.is;
public final class p2 extends View {
    public final Paint f53113a;
    public final Paint f53114b;
    public final Paint f53115c;
    public final RadialGradient[] d;
    public final Matrix f53116e;
    public final org.telegram.ui.Components.g6 f53117f;
    public final RadialGradient h;
    public final Path f53118n;
    public int f53119r;
    public int f53120s;

    public p2(Context context) {
        super(context);
        this.f53113a = new Paint(1);
        this.f53114b = new Paint(1);
        Paint paint = new Paint(1);
        this.f53115c = paint;
        this.d = new RadialGradient[2];
        this.f53116e = new Matrix();
        this.f53117f = new org.telegram.ui.Components.g6(1.0f, this, 0L, 420L, is.h);
        this.h = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{0, -1, -1, 0}, new float[]{0.15f, 0.35f, 0.65f, 0.88f}, Shader.TileMode.CLAMP);
        this.f53118n = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public final void a(int i10, int i11) {
        if (this.f53119r == i10 && this.f53120s == i11) {
            return;
        }
        RadialGradient[] radialGradientArr = this.d;
        radialGradientArr[0] = radialGradientArr[1];
        this.f53119r = i10;
        this.f53120s = i11;
        radialGradientArr[1] = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f53117f.d(0.0f, true);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        Paint paint;
        float f10 = 1.0f;
        int i10 = 0;
        float d = this.f53117f.d(1.0f, false);
        float currentTimeMillis = (((float) (System.currentTimeMillis() % 15000)) / 15000.0f) * 360.0f;
        float f11 = 0.0f;
        if (getAlpha() > 0.0f) {
            invalidate();
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint2 = this.f53114b;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        Path path = this.f53118n;
        path.rewind();
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float min = Math.min(getWidth(), getHeight()) / 2.0f;
        int i11 = 0;
        while (i11 < 6) {
            float d10 = sc.v.d(i11, 60.0f, 12.5f, currentTimeMillis);
            path.moveTo(width, height);
            double d11 = ((d10 - 12.5f) / 180.0f) * 3.141592653589793d;
            path.lineTo((((float) Math.cos(d11)) * min) + width, (((float) Math.sin(d11)) * min) + height);
            double d12 = ((d10 + 12.5f) / 180.0f) * 3.141592653589793d;
            path.lineTo((((float) Math.cos(d12)) * min) + width, (((float) Math.sin(d12)) * min) + height);
            path.lineTo(width, height);
            i11++;
            f10 = f10;
        }
        float f12 = f10;
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        while (true) {
            RadialGradient[] radialGradientArr = this.d;
            int length = radialGradientArr.length;
            Matrix matrix = this.f53116e;
            if (i10 < length) {
                if (radialGradientArr[i10] == null) {
                    f7 = f11;
                    paint = paint2;
                } else {
                    f7 = f11;
                    paint = paint2;
                    float pow = (float) Math.pow(f12 - Math.abs(i10 - d), 0.5d);
                    if (pow > f7) {
                        matrix.reset();
                        float f13 = min / 100.0f;
                        matrix.postScale(f13, f13);
                        matrix.postTranslate(width, height);
                        radialGradientArr[i10].setLocalMatrix(matrix);
                        RadialGradient radialGradient = radialGradientArr[i10];
                        Paint paint3 = this.f53113a;
                        paint3.setShader(radialGradient);
                        float f14 = pow * 255.0f;
                        paint3.setAlpha((int) (0.3f * f14));
                        paint.setShader(radialGradientArr[i10]);
                        paint.setAlpha((int) f14);
                        canvas.drawPath(path, paint3);
                        canvas.drawPath(path, paint);
                    }
                }
                i10++;
                f11 = f7;
                paint2 = paint;
            } else {
                matrix.reset();
                float f15 = min / 100.0f;
                matrix.postScale(f15, f15);
                matrix.postTranslate(width, height);
                RadialGradient radialGradient2 = this.h;
                radialGradient2.setLocalMatrix(matrix);
                Paint paint4 = this.f53115c;
                paint4.setShader(radialGradient2);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint4);
                canvas.restore();
                return;
            }
        }
    }
}

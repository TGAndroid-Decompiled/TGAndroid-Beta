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
import org.telegram.ui.Components.tr;
public final class t2 extends View {
    public final Paint f51996a;
    public final Paint f51997b;
    public final Paint f51998c;
    public final RadialGradient[] d;
    public final Matrix f51999e;
    public final org.telegram.ui.Components.e6 f52000f;
    public final RadialGradient h;
    public final Path f52001n;
    public int f52002r;
    public int f52003s;

    public t2(Context context) {
        super(context);
        this.f51996a = new Paint(1);
        this.f51997b = new Paint(1);
        Paint paint = new Paint(1);
        this.f51998c = paint;
        this.d = new RadialGradient[2];
        this.f51999e = new Matrix();
        this.f52000f = new org.telegram.ui.Components.e6(1.0f, this, 0L, 420L, tr.h);
        this.h = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{0, -1, -1, 0}, new float[]{0.15f, 0.35f, 0.65f, 0.88f}, Shader.TileMode.CLAMP);
        this.f52001n = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public final void a(int i10, int i11) {
        if (this.f52002r == i10 && this.f52003s == i11) {
            return;
        }
        RadialGradient[] radialGradientArr = this.d;
        radialGradientArr[0] = radialGradientArr[1];
        this.f52002r = i10;
        this.f52003s = i11;
        radialGradientArr[1] = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f52000f.d(0.0f, true);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        int i10 = 0;
        float d = this.f52000f.d(1.0f, false);
        float currentTimeMillis = (((float) (System.currentTimeMillis() % 15000)) / 15000.0f) * 360.0f;
        if (getAlpha() > 0.0f) {
            invalidate();
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint2 = this.f51997b;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        Path path = this.f52001n;
        path.rewind();
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float min = Math.min(getWidth(), getHeight()) / 2.0f;
        for (int i11 = 0; i11 < 6; i11++) {
            float d10 = t8.b.d(i11, 60.0f, 12.5f, currentTimeMillis);
            path.moveTo(width, height);
            double d11 = ((d10 - 12.5f) / 180.0f) * 3.141592653589793d;
            path.lineTo((((float) Math.cos(d11)) * min) + width, (((float) Math.sin(d11)) * min) + height);
            double d12 = ((d10 + 12.5f) / 180.0f) * 3.141592653589793d;
            path.lineTo((((float) Math.cos(d12)) * min) + width, (((float) Math.sin(d12)) * min) + height);
            path.lineTo(width, height);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        while (true) {
            RadialGradient[] radialGradientArr = this.d;
            int length = radialGradientArr.length;
            Matrix matrix = this.f51999e;
            if (i10 < length) {
                if (radialGradientArr[i10] == null) {
                    paint = paint2;
                } else {
                    paint = paint2;
                    float pow = (float) Math.pow(1.0f - Math.abs(i10 - d), 0.5d);
                    if (pow > 0.0f) {
                        matrix.reset();
                        float f7 = min / 100.0f;
                        matrix.postScale(f7, f7);
                        matrix.postTranslate(width, height);
                        radialGradientArr[i10].setLocalMatrix(matrix);
                        RadialGradient radialGradient = radialGradientArr[i10];
                        Paint paint3 = this.f51996a;
                        paint3.setShader(radialGradient);
                        float f10 = pow * 255.0f;
                        paint3.setAlpha((int) (0.3f * f10));
                        paint.setShader(radialGradientArr[i10]);
                        paint.setAlpha((int) f10);
                        canvas.drawPath(path, paint3);
                        canvas.drawPath(path, paint);
                    }
                }
                i10++;
                paint2 = paint;
            } else {
                matrix.reset();
                float f11 = min / 100.0f;
                matrix.postScale(f11, f11);
                matrix.postTranslate(width, height);
                RadialGradient radialGradient2 = this.h;
                radialGradient2.setLocalMatrix(matrix);
                Paint paint4 = this.f51998c;
                paint4.setShader(radialGradient2);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint4);
                canvas.restore();
                return;
            }
        }
    }
}

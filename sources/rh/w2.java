package rh;

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
import org.telegram.ui.Components.gr;
public final class w2 extends View {
    public final Paint f47625a;
    public final Paint f47626b;
    public final Paint f47627c;
    public final RadialGradient[] d;
    public final Matrix e;
    public final org.telegram.ui.Components.t5 f47628f;
    public final RadialGradient h;
    public final Path f47629n;
    public int f47630r;
    public int f47631s;

    public w2(Context context) {
        super(context);
        this.f47625a = new Paint(1);
        this.f47626b = new Paint(1);
        Paint paint = new Paint(1);
        this.f47627c = paint;
        this.d = new RadialGradient[2];
        this.e = new Matrix();
        this.f47628f = new org.telegram.ui.Components.t5(1.0f, this, 0L, 420L, gr.h);
        this.h = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{0, -1, -1, 0}, new float[]{0.15f, 0.35f, 0.65f, 0.88f}, Shader.TileMode.CLAMP);
        this.f47629n = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public final void a(int i10, int i11) {
        if (this.f47630r == i10 && this.f47631s == i11) {
            return;
        }
        RadialGradient[] radialGradientArr = this.d;
        radialGradientArr[0] = radialGradientArr[1];
        this.f47630r = i10;
        this.f47631s = i11;
        radialGradientArr[1] = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f47628f.e(true, 0.0f);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10 = 1.0f;
        float e = this.f47628f.e(false, 1.0f);
        float currentTimeMillis = (((float) (System.currentTimeMillis() % 15000)) / 15000.0f) * 360.0f;
        if (getAlpha() > 0.0f) {
            invalidate();
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f47626b;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        Path path = this.f47629n;
        path.rewind();
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float min = Math.min(getWidth(), getHeight()) / 2.0f;
        for (int i10 = 0; i10 < 6; i10++) {
            float d = sc.e.d(i10, 60.0f, 12.5f, currentTimeMillis);
            path.moveTo(width, height);
            double d10 = ((d - 12.5f) / 180.0f) * 3.141592653589793d;
            path.lineTo((((float) Math.cos(d10)) * min) + width, (((float) Math.sin(d10)) * min) + height);
            double d11 = ((d + 12.5f) / 180.0f) * 3.141592653589793d;
            path.lineTo((((float) Math.cos(d11)) * min) + width, (((float) Math.sin(d11)) * min) + height);
            path.lineTo(width, height);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        int i11 = 0;
        while (true) {
            RadialGradient[] radialGradientArr = this.d;
            int length = radialGradientArr.length;
            Matrix matrix = this.e;
            if (i11 < length) {
                if (radialGradientArr[i11] == null) {
                    f7 = e;
                } else {
                    f7 = e;
                    float pow = (float) Math.pow(f10 - Math.abs(i11 - e), 0.5d);
                    if (pow > 0.0f) {
                        matrix.reset();
                        float f11 = min / 100.0f;
                        matrix.postScale(f11, f11);
                        matrix.postTranslate(width, height);
                        radialGradientArr[i11].setLocalMatrix(matrix);
                        RadialGradient radialGradient = radialGradientArr[i11];
                        Paint paint2 = this.f47625a;
                        paint2.setShader(radialGradient);
                        float f12 = pow * 255.0f;
                        paint2.setAlpha((int) (0.3f * f12));
                        paint.setShader(radialGradientArr[i11]);
                        paint.setAlpha((int) f12);
                        canvas.drawPath(path, paint2);
                        canvas.drawPath(path, paint);
                    }
                }
                i11++;
                e = f7;
                f10 = 1.0f;
            } else {
                matrix.reset();
                float f13 = min / 100.0f;
                matrix.postScale(f13, f13);
                matrix.postTranslate(width, height);
                RadialGradient radialGradient2 = this.h;
                radialGradient2.setLocalMatrix(matrix);
                Paint paint3 = this.f47627c;
                paint3.setShader(radialGradient2);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint3);
                canvas.restore();
                return;
            }
        }
    }
}

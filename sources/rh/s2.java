package rh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.gr;
public final class s2 extends Drawable {
    public final Paint f47451a;
    public final LinearGradient[] f47452b;
    public final Matrix f47453c;
    public final org.telegram.ui.Components.t5 d;
    public final Path e;
    public final s8 f47454f;
    public int f47455g;
    public int h;

    public s2() {
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f47451a = new Paint(1);
        this.f47452b = new LinearGradient[2];
        this.f47453c = new Matrix();
        this.d = new org.telegram.ui.Components.t5(1.0f, new ph.x1(this, 17), 0L, 420L, gr.h);
        this.e = new Path();
        this.f47454f = new s8(1, 45);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(117440511);
        paint.setStrokeWidth(org.telegram.messenger.i0.N(1.0f));
        paint2.setStyle(style);
        paint2.setColor(301989887);
        paint2.setStrokeWidth(org.telegram.messenger.i0.N(0.6666667f));
    }

    public final void a(int i10, int i11) {
        if (this.f47455g == i10 && this.h == i11) {
            return;
        }
        LinearGradient[] linearGradientArr = this.f47452b;
        linearGradientArr[0] = linearGradientArr[1];
        this.f47455g = i10;
        this.h = i11;
        linearGradientArr[1] = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d.e(true, 0.0f);
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        org.telegram.messenger.i0.P.set(getBounds());
        float L = org.telegram.messenger.i0.L(24.0f);
        int i10 = 0;
        float e = this.d.e(false, 1.0f);
        while (true) {
            LinearGradient[] linearGradientArr = this.f47452b;
            if (i10 < linearGradientArr.length) {
                if (linearGradientArr[i10] != null) {
                    float pow = (float) Math.pow(1.0f - Math.abs(i10 - e), 0.5d);
                    if (pow > 0.0f) {
                        Matrix matrix = this.f47453c;
                        matrix.reset();
                        RectF rectF = org.telegram.messenger.i0.P;
                        matrix.postScale(rectF.width() / 100.0f, 1.0f);
                        linearGradientArr[i10].setLocalMatrix(matrix);
                        LinearGradient linearGradient = linearGradientArr[i10];
                        Paint paint = this.f47451a;
                        paint.setShader(linearGradient);
                        paint.setAlpha((int) (pow * 255.0f));
                        canvas.drawRoundRect(rectF, L, L, paint);
                    }
                }
                i10++;
            } else {
                Path path = this.e;
                path.rewind();
                RectF rectF2 = org.telegram.messenger.i0.P;
                path.addRoundRect(rectF2, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                s8 s8Var = this.f47454f;
                s8Var.g(rectF2);
                s8Var.h = 30.0f;
                s8Var.d();
                s8Var.a(canvas, org.telegram.ui.ActionBar.t6.r1(0.6f, -1));
                invalidateSelf();
                canvas.restore();
                org.telegram.messenger.i0.P(canvas, rectF2, L);
                return;
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

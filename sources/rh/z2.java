package rh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.gr;
public final class z2 extends Drawable {
    public Drawable f47795g;
    public int h;
    public int f47796i;
    public final Paint f47792b = new Paint(1);
    public final Shader[] f47793c = new Shader[2];
    public final Matrix d = new Matrix();
    public final org.telegram.ui.Components.t5 e = new org.telegram.ui.Components.t5(1.0f, new ph.x1(this, 20), 0, 420, gr.h);
    public final RectF f47794f = new RectF();
    public final int f47791a = 1;

    public final void a(int i10, int i11) {
        if (this.h == i10 && this.f47796i == i11) {
            return;
        }
        Shader[] shaderArr = this.f47793c;
        shaderArr[0] = shaderArr[1];
        if (this.f47791a == 0) {
            this.h = i10;
            this.f47796i = i11;
            shaderArr[1] = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.h = i10;
            this.f47796i = i11;
            shaderArr[1] = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(340.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.e.e(true, 0.0f);
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f47794f;
        rectF.set(bounds);
        rectF.right = rectF.width() + rectF.left;
        int i10 = 0;
        float e = this.e.e(false, 1.0f);
        while (true) {
            Shader[] shaderArr = this.f47793c;
            if (i10 >= shaderArr.length) {
                break;
            }
            if (shaderArr[i10] != null) {
                float pow = (float) Math.pow(1.0f - Math.abs(i10 - e), 0.25d);
                if (pow > 0.0f) {
                    Matrix matrix = this.d;
                    matrix.reset();
                    if (this.f47791a == 1) {
                        matrix.postTranslate(rectF.centerX(), org.telegram.messenger.i0.L(145.0f));
                    } else {
                        matrix.postScale(getBounds().width() / 100.0f, 1.0f);
                    }
                    shaderArr[i10].setLocalMatrix(matrix);
                    Shader shader = shaderArr[i10];
                    Paint paint = this.f47792b;
                    paint.setShader(shader);
                    paint.setAlpha((int) (pow * 255.0f));
                    canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
                }
            }
            i10++;
        }
        if (this.f47795g != null) {
            canvas.save();
            canvas.translate(rectF.centerX(), org.telegram.messenger.i0.L(145.0f));
            j0.a(canvas, 0, this.f47795g, rectF.width(), org.telegram.messenger.i0.L(290.0f), 2.0f, 1.0f);
            canvas.restore();
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

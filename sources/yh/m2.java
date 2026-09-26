package yh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sr;
public final class m2 extends Drawable {
    public final Paint f47705a;
    public final LinearGradient[] f47706b;
    public final Matrix f47707c;
    public final org.telegram.ui.Components.e6 d;
    public final Path e;
    public final i8 f47708f;
    public int f47709g;
    public int h;

    public m2() {
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f47705a = new Paint(1);
        this.f47706b = new LinearGradient[2];
        this.f47707c = new Matrix();
        this.d = new org.telegram.ui.Components.e6(1.0f, new rg.q1(this, 28), 0L, 420L, sr.h);
        this.e = new Path();
        this.f47708f = new i8(1, 45);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(117440511);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        paint2.setStyle(style);
        paint2.setColor(301989887);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    public final void a(int i10, int i11) {
        if (this.f47709g == i10 && this.h == i11) {
            return;
        }
        LinearGradient[] linearGradientArr = this.f47706b;
        linearGradientArr[0] = linearGradientArr[1];
        this.f47709g = i10;
        this.h = i11;
        linearGradientArr[1] = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d.d(0.0f, true);
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        AndroidUtilities.rectTmp.set(getBounds());
        float dp = AndroidUtilities.dp(24.0f);
        int i10 = 0;
        float d = this.d.d(1.0f, false);
        while (true) {
            LinearGradient[] linearGradientArr = this.f47706b;
            if (i10 < linearGradientArr.length) {
                if (linearGradientArr[i10] != null) {
                    float pow = (float) Math.pow(1.0f - Math.abs(i10 - d), 0.5d);
                    if (pow > 0.0f) {
                        Matrix matrix = this.f47707c;
                        matrix.reset();
                        RectF rectF = AndroidUtilities.rectTmp;
                        matrix.postScale(rectF.width() / 100.0f, 1.0f);
                        linearGradientArr[i10].setLocalMatrix(matrix);
                        LinearGradient linearGradient = linearGradientArr[i10];
                        Paint paint = this.f47705a;
                        paint.setShader(linearGradient);
                        paint.setAlpha((int) (pow * 255.0f));
                        canvas.drawRoundRect(rectF, dp, dp, paint);
                    }
                }
                i10++;
            } else {
                Path path = this.e;
                path.rewind();
                RectF rectF2 = AndroidUtilities.rectTmp;
                path.addRoundRect(rectF2, dp, dp, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                i8 i8Var = this.f47708f;
                i8Var.g(rectF2);
                i8Var.h = 30.0f;
                i8Var.d();
                i8Var.a(canvas, org.telegram.ui.ActionBar.h6.l1(0.6f, -1));
                invalidateSelf();
                canvas.restore();
                AndroidUtilities.drawStroke(canvas, rectF2, dp);
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
